package grammar;
import grammar.gen.GrammarLexer;
import grammar.gen.GrammarParser;

import java.util.List;

import lib.FileUtils;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;


public class GrammarTest {

	private TokenMapper mapper = new TokenMapper(FileUtils.pwd() + "src/main/java/grammar/gen/Grammar.tokens");
	
	@Test
	public void test() {
		
		tokenize("0xffff");
		tokenize("0xff");
		tokenize("0x0f");
		tokenize(" 0");
		tokenize("0x0f ");
		tokenize("0o235");
		tokenize("123452");
		tokenize("123452");
		tokenize("true");
		tokenize("false");
		tokenize("\"I am a String\"");
		tokenize("'A'");
		tokenize("@test");
		
		tokenize(
				"begin name \n" +
				"	@v = 1\n" +
				"	@v++ // increment @v\n" +
				"	@c = @v\n" +
				"	@d = 0xff\n" +
				"	@d -= 0x55\n" +
				"end");
		
		
		
	}

	private void printTokens(CommonTokenStream tokenStream) {
		List<Token> tokens = tokenStream.getTokens();
		// System.out.println("parsed: " + tokens.size() + " tokens");
		for(Token token : tokens) {
			// mapper.type(token.getType())
			System.out.print(mapper.type(token.getType()) + " [" + token.getText() + "], ");
		}
		System.out.println();
	}
	
	private List<Token> tokenize(String expr) {
		CharStream stream = new ANTLRInputStream(expr);
		GrammarLexer lexer = new GrammarLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tokens.fill();
		printTokens(tokens);
		return tokens.getTokens();
	}
	
	private GrammarParser getParser(String expr) {
		CharStream stream = new ANTLRInputStream(expr);
		GrammarLexer lexer = new GrammarLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tokens.fill();
		printTokens(tokens);
		GrammarParser parser = new GrammarParser(tokens);
		parser.setErrorHandler(new BailErrorStrategy());
		return parser;
	}

	public boolean expr(String expr) {
		try {
			getParser(expr).expr();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(expr + ": FALSE");
			return false;
		}
		System.out.println(expr + ": TRUE");
		return true;
	}
	
}
