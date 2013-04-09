// Generated from /home/kenny/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 
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
		BEGIN=1, END=2, TRUE=3, FALSE=4, NULL=5, HEX_LITERAL=6, DECIMAL_LITERAL=7, 
		OCTAL_LITERAL=8, EXPONENT=9, CHARACTER_LITERAL=10, STRING_LITERAL=11, 
		WS=12, COMMENT=13;
	public static final String[] tokenNames = {
		"<INVALID>", "BEGIN", "END", "TRUE", "FALSE", "NULL", "HEX_LITERAL", "DECIMAL_LITERAL", 
		"OCTAL_LITERAL", "EXPONENT", "CHARACTER_LITERAL", "STRING_LITERAL", "WS", 
		"COMMENT"
	};
	public static final int
		RULE_expr = 0, RULE_literal = 1;
	public static final String[] ruleNames = {
		"expr", "literal"
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(GrammarParser.COMMENT, 0); }
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
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(6);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NULL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4); literal();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(5); match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode OCTAL_LITERAL() { return getToken(GrammarParser.OCTAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(GrammarParser.HEX_LITERAL, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(GrammarParser.DECIMAL_LITERAL, 0); }
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
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << HEX_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << OCTAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
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
		"\2\3\17\r\4\2\t\2\4\3\t\3\3\2\3\2\5\2\t\n\2\3\3\3\3\3\3\2\4\2\4\2\3\4"+
		"\5\n\f\r\13\2\b\3\2\2\2\4\n\3\2\2\2\6\t\5\4\3\2\7\t\7\17\2\2\b\6\3\2\2"+
		"\2\b\7\3\2\2\2\t\3\3\2\2\2\n\13\t\2\2\2\13\5\3\2\2\2\3\b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}