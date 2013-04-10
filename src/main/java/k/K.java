package k;

import grammar.TokenMapper;
import grammar.gen.GrammarLexer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import k.memory.IStorable;
import k.memory.MemoryBank;
import k.types.KBoolean;
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

	private List<Token> tokens;
	
	private Iterator<Token> iter;
	
	private Token currentToken;
	
	private MemoryBank memory;
	
	private boolean logging ;
	
	private static final Logger LOGGER = Logger.getLogger(K.class);
	
	public K() {
		memory = new MemoryBank();
		tokens = new LinkedList<Token>();
		logging = false;
	}
	
	public void logging(boolean logging) {
		this.logging = logging;
	}
	
	private void printTokens() {
		StringBuffer sb = new StringBuffer();
		for(Token token : tokens) {
			sb.append(mapper.type(token.getType()) + " [" + token.getText() + "], ");
		}
		sb.append("\n");
		log(sb);
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
		tokens = tokenStream.getTokens();
		printTokens();
	}
	
	public void execute(String code) {
		compile(code);
	}
	
	public void run() {
		iter = tokens.iterator();
		while(iter.hasNext()) {
			currentToken = iter.next();
			switch(currentToken.getType()) {
				case GrammarLexer.VARIABLE:
					handleVariable();
					break;
				case GrammarLexer.PRINT:
					handlePrint();
					break;
				case GrammarLexer.LOGON:
					logging = true;
					log("Logging turned on");
					break;
				case GrammarLexer.LOGOFF:
					log("Logging turned off");
					logging = false;
					break;	
				case GrammarLexer.DUMP:
					dump();
					break;
			}
		}
	}
	
	private void handlePrint() {
		String printable = "";
		currentToken = iter.next();
		log("printing " + mapper.type(currentToken.getType()) + " => " + currentToken.getText());
		switch(currentToken.getType()) {
			case GrammarLexer.VARIABLE:
				IStorable<?> storable = memory.read(currentToken.getText());
				if(storable != null) {
					printable = storable.toString();
				}
				break;
			case GrammarLexer.CHARACTER_LITERAL:
			case GrammarLexer.STRING_LITERAL:
			case GrammarLexer.BINARY_LITERAL:
			case GrammarLexer.INTEGER_LITERAL:
			case GrammarLexer.HEX_LITERAL:
			case GrammarLexer.TRUE:
			case GrammarLexer.FALSE:
			case GrammarLexer.NULL:
				printable = currentToken.getText();
				break;
		}	
		System.out.println(printable);
	}
	
	private void handleVariable() {
		String varName = currentToken.getText();
		currentToken = iter.next();
		switch(currentToken.getType()) {
			case GrammarLexer.INC:
				add(varName, 1);
				break;
			case GrammarLexer.DEC:
				add(varName, -1);
				break;
			case GrammarLexer.ASSIGN:
				assign(varName);
				break;
			case GrammarLexer.ADD_ASSIGN:
				addAssign(varName);
				break;
		}
	}
	
	private void addAssign(String varName) {
		
	}
	
	private void assign(String varName) {
		currentToken = iter.next();
		memory.write(varName, parseTokenToStorable(currentToken));
		log("assigning value " + currentToken.getText() + " to " + varName);	
	}
	
	private IStorable<?> parseTokenToStorable(Token token) {
		switch(token.getType()) {
			case GrammarLexer.VARIABLE:
				return memory.read(token.getText());

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
	
		}
		return null;
	}

	private void add(String varName, double amount) {
		log("adding " + amount + " to " + varName);
		IStorable<?> storable = memory.read(varName);
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
		memory.write(varName, storable);
		log("variable " + varName + " after adding: " + memory.read(varName));
	}
	
	private void dump() {
		System.out.println(memory);
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
