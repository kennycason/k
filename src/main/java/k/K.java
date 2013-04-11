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

	private List<Token> rawTokens;
	
	private KFunction begin;
	
	private boolean logging;
	
	private static final Logger LOGGER = Logger.getLogger(K.class);
	
	public K() {
		rawTokens = new LinkedList<Token>();
		logging = true;
	}
	
	public void logging(boolean logging) {
		this.logging = logging;
	}
	
	private void printTokens() {
		StringBuffer sb = new StringBuffer();
		for(Token token : rawTokens) {
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
		rawTokens.addAll(tokenStream.getTokens());
		LinkedList<Token> consumableTokens = new LinkedList<Token>();
		consumableTokens.addAll(tokenStream.getTokens());
		parseFunctions(consumableTokens);
	}
	
	// find entry point begin function
	private void parseFunctions(LinkedList<Token> tokens) {
		
		while(!tokens.isEmpty()) {
			Token token = tokens.poll();
			switch(token.getType()) {
				case GrammarLexer.BEGIN:
					begin = new KFunction();
					if(tokens.peek().getType() == GrammarLexer.SYMBOL) { // optional for begin/end block
						tokens.poll();
					}
					parseFunctionHelper(begin, tokens);
					break;
					
				case GrammarLexer.END:
					return;
			}
		}
	}
	
	private void parseFunctionHelper(KFunction function, LinkedList<Token> tokens) {
		while(!tokens.isEmpty()) {
			Token token = tokens.poll();
			switch(token.getType()) {
				case GrammarLexer.FUNC:
					KFunction fn = new KFunction();
					if(tokens.peek().getType() == GrammarLexer.VARIABLE) { // optional for begin/end block
						function.memory().write(tokens.poll().getText(), fn);
					}
					parseFunctionHelper(fn, tokens);
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
					
				case GrammarLexer.DELETE:
					delete(fn);
					break;
					
				case GrammarLexer.PRINT:
					print(fn);
					break;
					
				case GrammarLexer.LOGON:
					logging = true;
					System.out.println("Logging turned on");
					break;
					
				case GrammarLexer.LOGOFF:
					System.out.println("Logging turned off");
					logging = false;
					break;	
					
				case GrammarLexer.TOKENS:
					printTokens();
					break;
					
				case GrammarLexer.DUMP:
					dump();
					break;
			}
		}
	}
	
	private void delete(KFunction fn) {
		Token token;
		do {
			token = fn.nextToken();
			trace("deleting " + token.getText());
			switch(token.getType()) {
				case GrammarLexer.VARIABLE:
					fn.memory().delete(token.getText());
					break;
					
				default:
					warn("trying to delete non var: " + token.getText());
					break;
			}	
		} while(token != null && token.getType() != GrammarLexer.NEWLINE);
	}
	
	private void print(KFunction fn) {
		StringBuilder sb = new StringBuilder();
		Token token;
		do {
			String printable = "";
			token = fn.nextToken();
			trace("printing " + mapper.type(token.getType()) + " => " + token.getText());
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
				case GrammarLexer.NUMBER_LITERAL:
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
					
				case GrammarLexer.ADD:
				case GrammarLexer.ADD_ASSIGN:
					addAssign(fn, var);
					break;
					
				case GrammarLexer.SUB:
				case GrammarLexer.SUB_ASSIGN:
					subAssign(fn, var);
					break;
						
				case GrammarLexer.MUL:
				case GrammarLexer.MUL_ASSIGN:
					mulAssign(fn, var);
					break;
					
				case GrammarLexer.DIV:
				case GrammarLexer.DIV_ASSIGN:
					divAssign(fn, var);
					break;
					
				case GrammarLexer.EXPONENT:
				case GrammarLexer.EXPONENT_ASSIGN:
					exponentAssign(fn, var);
					break;		
					
				case GrammarLexer.MODULUS:
				case GrammarLexer.MODULUS_ASSIGN:
					modulusAssign(fn, var);
					break;	
					
			}
		}
	}
	
	private void addAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		trace("adding " + assignFrom + " to " + varName);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = add(((KNumber)assignTo), ((KNumber)assignFrom));
			} else if(assignTo instanceof KString && assignFrom instanceof KString) {
				assignTo = add(((KString)assignTo), ((KString)assignFrom));
			} else {
				error("Can not add non-number/string ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
	}
	
	private void subAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		trace("subtracting " + assignFrom + " to " + varName);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = sub(((KNumber)assignTo), ((KNumber)assignFrom));
			} else {
				error("Can not subtract non-numbers ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
	}
	
	private void mulAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		trace("multiplying " + assignFrom + " and " + varName);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = mul(((KNumber)assignTo), ((KNumber)assignFrom));
			} else {
				error("Can not multiply non-numbers ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
	}
	
	private void divAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		trace("dividing " + varName + " into " + assignFrom);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = div(((KNumber)assignTo), ((KNumber)assignFrom));
			} else {
				error("Can not divide non-numbers ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
	}
	
	private void exponentAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		trace("raising " + varName + " to the " + assignFrom + " power");
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = exponent(((KNumber)assignTo), ((KNumber)assignFrom));
			} else {
				error("Can not apply exponent non-numbers ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
	}
	
	private void modulusAssign(KFunction fn, Token var) {
		String varName = var.getText();
		Token token = fn.nextToken();
		IStorable<?> assignFrom = parseTokenToStorable(fn, token);
		
		trace(varName + " modulus " + assignFrom);
		IStorable<?> assignTo = fn.memory().read(varName);
		if(assignTo == null) {
			assignTo = assignFrom;
		} else {
			if(assignTo instanceof KNumber && assignFrom instanceof KNumber) {
				assignTo = modulus(((KNumber)assignTo), ((KNumber)assignFrom));
			} else {
				error("Can not apply modulus non-numbers ");
				return;
			}
		}
		fn.memory().write(varName, assignTo);
	}
	
	private KNumber modulus(KNumber assignTo, KNumber assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KNumber)assignTo).value(
							((KNumber)assignTo).value() % 
							((KNumber)assignFrom).value()
							);
		}
		return assignTo;
	}
	
	private KNumber exponent(KNumber assignTo, KNumber assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KNumber)assignTo).value(
					Math.pow(
							((KNumber)assignTo).value(), 
							((KNumber)assignFrom).value()
							));
		}
		return assignTo;
	}
	
	private KNumber mul(KNumber assignTo, KNumber assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KNumber)assignTo).value(
					((KNumber)assignTo).value() * 
					((KNumber)assignFrom).value());
		}
		return assignTo;
	}
	
	private KNumber div(KNumber assignTo, KNumber assignFrom) {
		if(assignTo.value() == null) {
			assignTo = assignFrom;
		} else {
			((KNumber)assignTo).value(
					((KNumber)assignTo).value() / 
					((KNumber)assignFrom).value());
		}
		return assignTo;
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
		trace("assigning value " + token.getText() + " to " + var.getText());	
	}
	
	private IStorable<?> parseTokenToStorable(KFunction fn, Token token) {
		switch(token.getType()) {
			case GrammarLexer.VARIABLE:
				if(fn.memory().read(token.getText()) == null) {
					warn("Variable " + token.getText() + " undefined, defaulting to 0.0");
					fn.memory().write(token.getText(), new KNumber(0));
				}
				return fn.memory().read(token.getText()).copy();
			
			case GrammarLexer.CHARACTER_LITERAL:
			case GrammarLexer.STRING_LITERAL:
				return new KString(trimEnds(token.getText()));

			case GrammarLexer.BINARY_LITERAL:
				return new KNumber(Integer.parseInt(token.getText().substring(2), 2));

			case GrammarLexer.NUMBER_LITERAL:
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
		trace("adding " + amount + " to " + varName);
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
		trace("variable " + varName + " after adding: " + fn.memory().read(varName));
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
	
	private void error(Object msg) {
		if(logging) {
			LOGGER.error(msg);
		}
	}
	
	private void warn(Object msg) {
		if(logging) {
			LOGGER.warn(msg);
		}
	}
	
	private void info(Object msg) {
		if(logging) {
			LOGGER.info(msg);
		}
	}
	
	private void trace(Object msg) {
		if(logging) {
			LOGGER.trace(msg);
		}
	}

}
