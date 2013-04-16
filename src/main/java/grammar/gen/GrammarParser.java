// Generated from /home/destructo/workspace/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package grammar.gen; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKENS=1, PARAM=2, DELETE=3, LOGON=4, LOGOFF=5, DUMP=6, PRINT=7, FUNC=8, 
		IF=9, ELSE=10, ELSEIF=11, LOOP=12, BREAK=13, BEGIN=14, END=15, TRUE=16, 
		FALSE=17, NULL=18, SEMICOLON=19, ASSIGN=20, INC=21, DEC=22, ADD=23, ADD_ASSIGN=24, 
		SUB=25, SUB_ASSIGN=26, DIV=27, DIV_ASSIGN=28, MUL=29, MUL_ASSIGN=30, EXPONENT=31, 
		EXPONENT_ASSIGN=32, MODULUS=33, MODULUS_ASSIGN=34, VARIABLE=35, HEX_LITERAL=36, 
		BINARY_LITERAL=37, NUMBER_LITERAL=38, CHARACTER_LITERAL=39, STRING_LITERAL=40, 
		ACTION=41, SYMBOL=42, NL=43, WS=44, BLOCK_COMMENT=45, LINE_COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "TOKENS", "PARAM", "DELETE", "LOGON", "LOGOFF", "DUMP", "PRINT", 
		"FUNC", "IF", "ELSE", "ELSEIF", "LOOP", "BREAK", "BEGIN", "END", "TRUE", 
		"FALSE", "NULL", "SEMICOLON", "ASSIGN", "INC", "DEC", "ADD", "ADD_ASSIGN", 
		"SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", "MUL", "MUL_ASSIGN", "EXPONENT", 
		"EXPONENT_ASSIGN", "MODULUS", "MODULUS_ASSIGN", "VARIABLE", "HEX_LITERAL", 
		"BINARY_LITERAL", "NUMBER_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", 
		"ACTION", "SYMBOL", "NL", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_function = 1, RULE_expr = 2, RULE_assign = 3, RULE_literal = 4;
	public static final String[] ruleNames = {
		"start", "function", "expr", "assign", "literal"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(BEGIN);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << VARIABLE) | (1L << HEX_LITERAL) | (1L << BINARY_LITERAL) | (1L << NUMBER_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << NL))) != 0)) {
				{
				{
				setState(11); expr();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(GrammarParser.VARIABLE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode FUNC() { return getToken(GrammarParser.FUNC, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(FUNC);
			setState(20); match(VARIABLE);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << VARIABLE) | (1L << HEX_LITERAL) | (1L << BINARY_LITERAL) | (1L << NUMBER_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << NL))) != 0)) {
				{
				{
				setState(21); expr();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GrammarParser.NL); }
		public TerminalNode VARIABLE() { return getToken(GrammarParser.VARIABLE, 0); }
		public TerminalNode NL(int i) {
			return getToken(GrammarParser.NL, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(29); literal();
				}
				break;

			case 2:
				{
				setState(30); assign();
				}
				break;

			case 3:
				{
				setState(31); match(VARIABLE);
				}
				break;

			case 4:
				{
				setState(32); match(NL);
				}
				break;
			}
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(35); match(NL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(GrammarParser.VARIABLE); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode VARIABLE(int i) {
			return getToken(GrammarParser.VARIABLE, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(VARIABLE);
			setState(39); match(ASSIGN);
			setState(42);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(40); match(VARIABLE);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case HEX_LITERAL:
			case BINARY_LITERAL:
			case NUMBER_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				{
				setState(41); literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(GrammarParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(GrammarParser.HEX_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(GrammarParser.BINARY_LITERAL, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(GrammarParser.NUMBER_LITERAL, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode NULL() { return getToken(GrammarParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << HEX_LITERAL) | (1L << BINARY_LITERAL) | (1L << NUMBER_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\60\61\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2"+
		"\f\2\16\2\22\13\2\3\2\3\2\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4$\n\4\3\4\5\4\'\n\4\3\5\3\5\3\5\3\5\5\5-\n\5\3"+
		"\6\3\6\3\6\2\7\2\4\6\b\n\2\3\4\22\24&*\62\2\f\3\2\2\2\4\25\3\2\2\2\6#"+
		"\3\2\2\2\b(\3\2\2\2\n.\3\2\2\2\f\20\7\20\2\2\r\17\5\6\4\2\16\r\3\2\2\2"+
		"\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2"+
		"\23\24\7\21\2\2\24\3\3\2\2\2\25\26\7\n\2\2\26\32\7%\2\2\27\31\5\6\4\2"+
		"\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2"+
		"\34\32\3\2\2\2\35\36\7\21\2\2\36\5\3\2\2\2\37$\5\n\6\2 $\5\b\5\2!$\7%"+
		"\2\2\"$\7-\2\2#\37\3\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$&\3\2\2\2%\'"+
		"\7-\2\2&%\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2()\7%\2\2),\7\26\2\2*-\7%\2\2"+
		"+-\5\n\6\2,*\3\2\2\2,+\3\2\2\2-\t\3\2\2\2./\t\2\2\2/\13\3\2\2\2\7\20\32"+
		"#&,";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}