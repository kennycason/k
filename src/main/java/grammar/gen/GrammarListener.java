// Generated from /home/destructo/workspace/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package grammar.gen; 
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterAssign(GrammarParser.AssignContext ctx);
	void exitAssign(GrammarParser.AssignContext ctx);

	void enterExpr(GrammarParser.ExprContext ctx);
	void exitExpr(GrammarParser.ExprContext ctx);

	void enterLiteral(GrammarParser.LiteralContext ctx);
	void exitLiteral(GrammarParser.LiteralContext ctx);
}