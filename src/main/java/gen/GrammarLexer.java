// Generated from /home/kenny/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, TRUE=3, FALSE=4, NULL=5, HEX_LITERAL=6, DECIMAL_LITERAL=7, 
		OCTAL_LITERAL=8, EXPONENT=9, CHARACTER_LITERAL=10, STRING_LITERAL=11, 
		WS=12, COMMENT=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BEGIN", "END", "TRUE", "FALSE", "NULL", "HEX_LITERAL", "DECIMAL_LITERAL", 
		"OCTAL_LITERAL", "EXPONENT", "CHARACTER_LITERAL", "STRING_LITERAL", "WS", 
		"COMMENT"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "TRUE", "FALSE", "NULL", "HEX_LITERAL", "DECIMAL_LITERAL", 
		"OCTAL_LITERAL", "HEX_DIGIT", "INT_DIGIT", "EXPONENT", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "WS", "COMMENT"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;

		case 16: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\17\u00a0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\6\7D\n\7\r\7\16\7E\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\5\bP\n\b"+
		"\3\t\3\t\3\t\3\t\6\tV\n\t\r\t\16\tW\3\n\3\n\3\13\3\13\3\f\3\f\5\f`\n\f"+
		"\3\f\6\fc\n\f\r\f\16\fd\3\r\3\r\3\r\5\rj\n\r\3\r\3\r\3\16\3\16\3\16\7"+
		"\16q\n\16\f\16\16\16t\13\16\3\16\3\16\3\17\3\17\3\17\5\17{\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21\u0085\n\21\r\21\16\21\u0086\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22\u008f\n\22\f\22\16\22\u0092\13\22\3\22"+
		"\7\22\u0095\n\22\f\22\16\22\u0098\13\22\3\22\5\22\u009b\n\22\3\22\3\22"+
		"\3\22\3\22\2\23\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\2\1\25\2\1\27\13\1\31\f\1\33\r\1\35\2\1\37\2\1!\16\2#\17\3\3\2\t\5\62"+
		";CHch\4--//\4))^^\4$$^^\n$$))^^ddhhppttvv\b\13\f\17\17\"\"\62\62EEww\4"+
		"\f\f\17\17\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2\7/\3\2\2\2"+
		"\t\64\3\2\2\2\13:\3\2\2\2\r?\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23Y\3\2\2"+
		"\2\25[\3\2\2\2\27]\3\2\2\2\31f\3\2\2\2\33m\3\2\2\2\35z\3\2\2\2\37|\3\2"+
		"\2\2!\u0084\3\2\2\2#\u008a\3\2\2\2%&\7d\2\2&\'\7g\2\2\'(\7i\2\2()\7k\2"+
		"\2)*\7p\2\2*\4\3\2\2\2+,\7g\2\2,-\7p\2\2-.\7f\2\2.\6\3\2\2\2/\60\7v\2"+
		"\2\60\61\7t\2\2\61\62\7w\2\2\62\63\7g\2\2\63\b\3\2\2\2\64\65\7h\2\2\65"+
		"\66\7c\2\2\66\67\7n\2\2\678\7u\2\289\7g\2\29\n\3\2\2\2:;\7p\2\2;<\7w\2"+
		"\2<=\7n\2\2=>\7n\2\2>\f\3\2\2\2?@\7\62\2\2@A\7z\2\2AC\3\2\2\2BD\5\23\n"+
		"\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\16\3\2\2\2GP\7\62\2\2HL\5"+
		"\25\13\2IK\5\25\13\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2"+
		"NL\3\2\2\2OG\3\2\2\2OH\3\2\2\2P\20\3\2\2\2QR\7\62\2\2RS\7q\2\2SU\3\2\2"+
		"\2TV\4\629\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\22\3\2\2\2YZ\t\2"+
		"\2\2Z\24\3\2\2\2[\\\4\62;\2\\\26\3\2\2\2]_\7`\2\2^`\t\3\2\2_^\3\2\2\2"+
		"_`\3\2\2\2`b\3\2\2\2ac\5\25\13\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e\30\3\2\2\2fi\7)\2\2gj\5\35\17\2hj\n\4\2\2ig\3\2\2\2ih\3\2\2\2jk\3"+
		"\2\2\2kl\7)\2\2l\32\3\2\2\2mr\7$\2\2nq\5\35\17\2oq\n\5\2\2pn\3\2\2\2p"+
		"o\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7$\2\2v"+
		"\34\3\2\2\2wx\7^\2\2x{\t\6\2\2y{\5\37\20\2zw\3\2\2\2zy\3\2\2\2{\36\3\2"+
		"\2\2|}\7^\2\2}~\7w\2\2~\177\5\23\n\2\177\u0080\5\23\n\2\u0080\u0081\5"+
		"\23\n\2\u0081\u0082\5\23\n\2\u0082 \3\2\2\2\u0083\u0085\t\7\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\21\2\2\u0089\"\3\2\2\2\u008a\u008b"+
		"\7\61\2\2\u008b\u008c\7\61\2\2\u008c\u0090\3\2\2\2\u008d\u008f\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\n\b\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\17\2\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\f"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\22\3\2\u009f$\3\2\2\2\21\2ELOW"+
		"_diprz\u0086\u0090\u0096\u009a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}