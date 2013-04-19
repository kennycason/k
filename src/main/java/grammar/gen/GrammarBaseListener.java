// Generated from /home/kenny/workspace/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package grammar.gen; 

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GrammarBaseListener implements GrammarListener {
	@Override public void enterAssign(GrammarParser.AssignContext ctx) { }
	@Override public void exitAssign(GrammarParser.AssignContext ctx) { }

	@Override public void enterStart(GrammarParser.StartContext ctx) { }
	@Override public void exitStart(GrammarParser.StartContext ctx) { }

	@Override public void enterExpr(GrammarParser.ExprContext ctx) { }
	@Override public void exitExpr(GrammarParser.ExprContext ctx) { }

	@Override public void enterLiteral(GrammarParser.LiteralContext ctx) { }
	@Override public void exitLiteral(GrammarParser.LiteralContext ctx) { }

	@Override public void enterFunction(GrammarParser.FunctionContext ctx) { }
	@Override public void exitFunction(GrammarParser.FunctionContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}