package k;

import grammar.TokenMapper;
import grammar.gen.GrammarLexer;

import java.util.LinkedList;
import java.util.List;

import k.memory.IStorable;
import k.types.KBoolean;
import k.types.KFunction;
import k.types.KNumber;
import k.types.KString;
import lib.FileUtils;
import lib.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.apache.log4j.Logger;

public class K {
	
	private TokenMapper mapper = new TokenMapper(FileUtils.pwd() + "src/main/java/grammar/gen/Grammar.tokens");

	private LinkedList<Token> tokens;
	
	private KFunction begin;
	
	private boolean logging;
	
	private static final Logger LOGGER = Logger.getLogger(K.class);
	
	public K() {
		tokens = new LinkedList<Token>();
		logging = false;
	}
	
	public void logging(boolean logging) {
		this.logging = logging;
	}
	
	private void printTokens(List<Token> tokens) {
		StringBuffer sb = new StringBuffer();
		for(Token token : tokens) {
			sb.append(mapper.type(token.getType()) + " [" + token.getText() + "], ");
		}
		sb.append("\n");
		System.out.println(sb);
	}
	
	public void compileFromFile(String file) {
		FileReader reader = new FileReader(file);
		compile(reader.getContent());
	}

	public void compile(String code) {
		CharStream stream = new ANTLRInputStream(code);
		GrammarLexer lexer = new GrammarLexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		tokenStream.fill();
		printTokens(tokenStream.getTokens());
		tokens.addAll(tokenStream.getTokens());
		parseFunctions();
	}
	
	// find entry point begin function
	private void parseFunctions() {
		
		while(!tokens.isEmpty()) {
			Token token = tokens.poll();
			switch(token.getType()) {
				case GrammarLexer.BEGIN:
					begin = new KFunction();
					if(tokens.peek().getType() == GrammarLexer.SYMBOL) { // optional for begin/end block
						tokens.poll();
					}
					parseFunctionHelper(begin);
					break;
					
				case GrammarLexer.END:
					return;
			}
		}
	}
	
	private void parseFunctionHelper(KFunction function) {
		while(!tokens.isEmpty()) {
			Token token = tokens.poll();
			switch(token.getType()) {
				case GrammarLexer.FUNC:
					KFunction fn = new KFunction();
					if(tokens.peek().getType() == GrammarLexer.VARIABLE) { // optional for begin/end block
						function.memory().write(tokens.poll().getText(), fn);
					}
					parseFunctionHelper(fn);
					break;
					
				case GrammarLexer.END:
					return;
					
				default:
					function.addToken(token);
					break;
			}
		}
	}

	public void run() {
		run(begin);
	}
		
	private void run(KFunction fn) {
		Token token;
		while(fn.hasTokens()) {
			token = fn.nextToken();
			switch(token.getType()) {
				case GrammarLexer.VARIABLE:
					handleVariable(fn);
					break;
				case GrammarLexer.PRINT:
					handlePrint(fn);
					break;
				case GrammarLexer.LOGON:
					logging = true;
					System.out.println("Logging turned on");
					break;
				case GrammarLexer.LOGOFF:
					System.out.println("Logging turned off");
					logging = false;
					break;	
				case GrammarLexer.DUMP:
					dump();
					break;
			}
		}
	}
	
	private void handlePrint(KFunction fn) {
		StringBuilder sb = new StringBuilder();
		Token token;
		do {
			String printable = "";
			token = fn.nextToken();
			log("printing " + mapper.type(token.getType()) + " => " + token.getText());
			switch(token.getType()) {
				case GrammarLexer.VARIABLE:
					IStorable<?> storable = fn.memory().read(token.getText());
					if(storable != null) {
						printable = storable.toString();
					}
					break;
					
				case GrammarLexer.CHARACTER_LITERAL:
				case GrammarLexer.STRING_LITERAL:
					printable = token.getText().substring(1, token.getText().length() - 1);
					break;
					
				case GrammarLexer.BINARY_LITERAL:
				case GrammarLexer.INTEGER_LITERAL:
				case GrammarLexer.HEX_LITERAL:
				case GrammarLexer.TRUE:
				case GrammarLexer.FALSE:
				case GrammarLexer.NULL:
					printable = token.getText();
					break;
			}	
			sb.append(printable);
		} while(token != null && token.getType() != GrammarLexer.NEWLINE);
		System.out.println(sb);
	}
	
	private void handleVariable(KFunction fn) {
		Token var = fn.currentToken();
		if(fn.memory().read(var.getText()) instanceof KFunction) {
			KFunction gn = ((KFunction)fn.memory().read(var.getText()));
			Token token;
			do {
				token = fn.nextToken();
				if(token.getType() != GrammarLexer.NEWLINE) {
					gn.addParameter(token);
				}
			} while(token != null && token.getType() != GrammarLexer.NEWLINE);
			run(gn);
			
		} else {
			switch(fn.nextToken().getType()) {
				case GrammarLexer.INC:
					add(fn, var, 1);
					break;
					
				case GrammarLexer.DEC:
					add(fn, var, -1);
					break;
					
				case GrammarLexer.ASSIGN:
					assign(fn, var);
					break;
					
				case GrammarLexer.ADD_ASSIGN:
					addAssign(fn, var);
					break;
					
				case GrammarLexer.SUB_ASSIGN:
					subAssign(fn, var);
					break;
			}
		}
	}
	
	private void addAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		log("adding " + assignFrom + " to " + varName);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = add(((KNumber)assignTo), ((KNumber)assignFrom));
			} if(assignTo instanceof KString && assignFrom instanceof KString) {
				assignTo = add(((KString)assignTo), ((KString)assignFrom));
			} else {
				log("Can not add non-number/string ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
		log("variable " + varName + " after adding: " + fn.memory().read(varName));
	}
	
	private KString add(KString assignTo, KString assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KString)assignTo).value(
					((KString)assignTo).value() + 
					((KString)assignFrom).value());
		}
		return assignTo;
	}
	
	private KNumber add(KNumber assignTo, KNumber assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KNumber)assignTo).value(
					((KNumber)assignTo).value() + 
					((KNumber)assignFrom).value());
		}
		return assignTo;
	}
	
	private void subAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		log("subtracting " + assignFrom + " to " + varName);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = sub(((KNumber)assignTo), ((KNumber)assignFrom));
			} else {
				log("Can not subtract non-numbers ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
		log("variable " + varName + " after subtracting: " + fn.memory().read(varName));
	}
	
	private KNumber sub(KNumber assignTo, KNumber assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KNumber)assignTo).value(
					((KNumber)assignTo).value() - 
					((KNumber)assignFrom).value());
		}
		return assignTo;
	}
	
	private void assign(KFunction fn, Token var) {
		Token token = fn.nextToken();
		fn.memory().write(var.getText(), parseTokenToStorable(fn, token));
		log("assigning value " + token.getText() + " to " + var.getText());	
	}
	
	private IStorable<?> parseTokenToStorable(KFunction fn, Token token) {
		switch(token.getType()) {
			case GrammarLexer.VARIABLE:
				return fn.memory().read(token.getText()).copy();
			
			case GrammarLexer.CHARACTER_LITERAL:
			case GrammarLexer.STRING_LITERAL:
				return new KString(trimEnds(token.getText()));

			case GrammarLexer.BINARY_LITERAL:
				return new KNumber(Integer.parseInt(token.getText().substring(2), 2));

			case GrammarLexer.INTEGER_LITERAL:
				return new KNumber(Double.parseDouble(token.getText()));
	
			case GrammarLexer.HEX_LITERAL:
				return new KNumber(Integer.parseInt(token.getText().substring(2), 16));
				
			case GrammarLexer.TRUE:
			case GrammarLexer.FALSE:
				return new KBoolean(Boolean.parseBoolean(token.getText()));
				
			case GrammarLexer.PARAM:
				int paramNumber = Integer.parseInt(fn.nextToken().getText());
				return parseTokenToStorable(fn, fn.getParameter(paramNumber));
				
		}
		return null;
	}

	private void add(KFunction fn, Token var, double amount) {
		String varName = var.getText();
		log("adding " + amount + " to " + varName);
		IStorable<?> storable = fn.memory().read(varName);
		if(storable == null) {
			storable = new KNumber(amount);
		} else {
			if(!(storable instanceof KNumber)) {
				return;
			}
			if(storable.value() == null) {
				storable = new KNumber(amount); // set to 0, then add amount
			} else {
				if(storable instanceof KNumber) {
					KNumber number = (KNumber) storable;
					number.value(number.value() + amount);
				}
			}
		}
		// update storable
		fn.memory().write(varName, storable);
		log("variable " + varName + " after adding: " + fn.memory().read(varName));
	}
	
	private void dump() {
		System.out.println(begin);
	}
	
	private String trimEnds(String string) {
		if(string == null || "".equals(string)) {
			return string;
		}
		return string.substring(1, string.length() - 1);
	}
	
	private void log(Object msg) {
		if(logging) {
			LOGGER.trace(msg);
		}
	}

}
