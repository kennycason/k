// Generated from /home/kenny/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterExpr(GrammarParser.ExprContext ctx);
	void exitExpr(GrammarParser.ExprContext ctx);

	void enterLiteral(GrammarParser.LiteralContext ctx);
	void exitLiteral(GrammarParser.LiteralContext ctx);
}