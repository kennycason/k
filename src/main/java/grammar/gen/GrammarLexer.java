// Generated from /home/kenny/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package grammar.gen; 
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
		LOGON=1, LOGOFF=2, DUMP=3, PRINT=4, FUNC=5, IF=6, ELSE=7, ELSEIF=8, LOOP=9, 
		BREAK=10, BEGIN=11, END=12, TRUE=13, FALSE=14, NULL=15, ASSIGN=16, INC=17, 
		DEC=18, ADD=19, ADD_ASSIGN=20, SUB=21, SUB_ASSIGN=22, DIV=23, DIV_ASSIGN=24, 
		MUL=25, MUL_ASSIGN=26, VARIABLE=27, HEX_LITERAL=28, BINARY_LITERAL=29, 
		INTEGER_LITERAL=30, EXPONENT=31, CHARACTER_LITERAL=32, STRING_LITERAL=33, 
		ACTION=34, SYMBOL=35, WS=36, BLOCK_COMMENT=37, LINE_COMMENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", "IF", "ELSE", "ELSEIF", "LOOP", 
		"BREAK", "BEGIN", "END", "TRUE", "FALSE", "NULL", "ASSIGN", "INC", "DEC", 
		"ADD", "ADD_ASSIGN", "SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", "MUL", 
		"MUL_ASSIGN", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", "INTEGER_LITERAL", 
		"EXPONENT", "CHARACTER_LITERAL", "STRING_LITERAL", "ACTION", "SYMBOL", 
		"WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", "IF", "ELSE", "ELSEIF", "LOOP", 
		"BREAK", "BEGIN", "END", "TRUE", "FALSE", "NULL", "ASSIGN", "INC", "DEC", 
		"ADD", "ADD_ASSIGN", "SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", "MUL", 
		"MUL_ASSIGN", "CHAR", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", "INTEGER_LITERAL", 
		"HEX_DIGIT", "INT_DIGIT", "EXPONENT", "CHARACTER_LITERAL", "STRING_LITERAL", 
		"ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "ACTION", "SYMBOL", "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT"
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
		case 40: WS_action((RuleContext)_localctx, actionIndex); break;

		case 41: BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 42: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void BLOCK_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4(\u0153\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\6\35\u00d5\n\35\r\35\16\35\u00d6\3\35\3\35\7\35\u00db"+
		"\n\35\f\35\16\35\u00de\13\35\3\36\3\36\3\36\3\36\6\36\u00e4\n\36\r\36"+
		"\16\36\u00e5\3\37\3\37\3\37\3\37\6\37\u00ec\n\37\r\37\16\37\u00ed\3 \3"+
		" \3 \7 \u00f3\n \f \16 \u00f6\13 \5 \u00f8\n \3!\5!\u00fb\n!\3\"\3\"\3"+
		"#\3#\5#\u0101\n#\3#\6#\u0104\n#\r#\16#\u0105\3$\3$\3$\5$\u010b\n$\3$\3"+
		"$\3%\3%\3%\7%\u0112\n%\f%\16%\u0115\13%\3%\3%\3&\3&\3&\5&\u011c\n&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0128\n(\f(\16(\u012b\13(\3(\3(\3"+
		")\6)\u0130\n)\r)\16)\u0131\3*\6*\u0135\n*\r*\16*\u0136\3*\3*\3+\3+\3+"+
		"\3+\7+\u013f\n+\f+\16+\u0142\13+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u014d\n"+
		",\f,\16,\u0150\13,\3,\3,\3\u0140-\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\2\19\35\1;\36\1=\37\1? \1A\2\1C\2\1E!\1G\"\1I#\1K\2\1M\2\1O$\1Q"+
		"%\1S&\2U\'\3W(\4\3\2\r\5C\\aac|\3\62\63\5\62;CHch\3\62;\4--//\4))^^\4"+
		"$$^^\n$$))^^ddhhppttvv\4}}\177\177\5\13\f\16\17\"\"\4\f\f\17\17\u0160"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5d\3\2\2\2\7p\3\2\2\2\tu"+
		"\3\2\2\2\13{\3\2\2\2\r\u0084\3\2\2\2\17\u0087\3\2\2\2\21\u008c\3\2\2\2"+
		"\23\u008f\3\2\2\2\25\u0094\3\2\2\2\27\u009a\3\2\2\2\31\u00a0\3\2\2\2\33"+
		"\u00a4\3\2\2\2\35\u00a9\3\2\2\2\37\u00af\3\2\2\2!\u00b4\3\2\2\2#\u00b6"+
		"\3\2\2\2%\u00b9\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c1\3\2\2\2"+
		"-\u00c3\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2\63\u00cb\3\2\2\2\65\u00cd"+
		"\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00df\3\2\2\2=\u00e7\3\2\2\2"+
		"?\u00f7\3\2\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0107\3"+
		"\2\2\2I\u010e\3\2\2\2K\u011b\3\2\2\2M\u011d\3\2\2\2O\u0124\3\2\2\2Q\u012f"+
		"\3\2\2\2S\u0134\3\2\2\2U\u013a\3\2\2\2W\u0148\3\2\2\2YZ\7n\2\2Z[\7q\2"+
		"\2[\\\7i\2\2\\]\7i\2\2]^\7k\2\2^_\7p\2\2_`\7i\2\2`a\7\"\2\2ab\7q\2\2b"+
		"c\7p\2\2c\4\3\2\2\2de\7n\2\2ef\7q\2\2fg\7i\2\2gh\7i\2\2hi\7k\2\2ij\7p"+
		"\2\2jk\7i\2\2kl\7\"\2\2lm\7q\2\2mn\7h\2\2no\7h\2\2o\6\3\2\2\2pq\7f\2\2"+
		"qr\7w\2\2rs\7o\2\2st\7r\2\2t\b\3\2\2\2uv\7r\2\2vw\7t\2\2wx\7k\2\2xy\7"+
		"p\2\2yz\7v\2\2z\n\3\2\2\2{|\7h\2\2|}\7w\2\2}~\7p\2\2~\177\7e\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7k\2\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083"+
		"\f\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2"+
		"\u008b\20\3\2\2\2\u008c\u008d\5\17\b\2\u008d\u008e\5\r\7\2\u008e\22\3"+
		"\2\2\2\u008f\u0090\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7r\2\2\u0093\24\3\2\2\2\u0094\u0095\7d\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098\u0099\7m\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7d\2\2\u009b\u009c\7g\2\2\u009c\u009d\7i\2\2\u009d\u009e\7k\2\2"+
		"\u009e\u009f\7p\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7"+
		"p\2\2\u00a2\u00a3\7f\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7g\2\2\u00a8\34\3\2\2\2\u00a9\u00aa"+
		"\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7n\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7?\2\2\u00b5"+
		"\"\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7\u00b8\7-\2\2\u00b8$\3\2\2\2\u00b9"+
		"\u00ba\7/\2\2\u00ba\u00bb\7/\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd"+
		"(\3\2\2\2\u00be\u00bf\7-\2\2\u00bf\u00c0\7?\2\2\u00c0*\3\2\2\2\u00c1\u00c2"+
		"\7/\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7?\2\2\u00c5.\3"+
		"\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca\62\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc\64\3\2\2\2\u00cd"+
		"\u00ce\7,\2\2\u00ce\u00cf\7?\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\t\2\2\2"+
		"\u00d18\3\2\2\2\u00d2\u00d4\7B\2\2\u00d3\u00d5\5\67\34\2\u00d4\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00dc\3\2\2\2\u00d8\u00db\5\67\34\2\u00d9\u00db\5C\"\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd:\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\62\2\2"+
		"\u00e0\u00e1\7z\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5A!\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"<\3\2\2\2\u00e7\u00e8\7\62\2\2\u00e8\u00e9\7d\2\2\u00e9\u00eb\3\2\2\2"+
		"\u00ea\u00ec\t\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee>\3\2\2\2\u00ef\u00f8\7\62\2\2\u00f0"+
		"\u00f4\5C\"\2\u00f1\u00f3\5C\"\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f8@\3\2\2\2\u00f9"+
		"\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fbB\3\2\2\2\u00fc\u00fd\t\5\2\2"+
		"\u00fdD\3\2\2\2\u00fe\u0100\7`\2\2\u00ff\u0101\t\6\2\2\u0100\u00ff\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5C\"\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106F\3\2\2\2\u0107\u010a\7)\2\2\u0108\u010b\5K&\2\u0109\u010b\n"+
		"\7\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\7)\2\2\u010dH\3\2\2\2\u010e\u0113\7$\2\2\u010f\u0112\5K&\2\u0110"+
		"\u0112\n\b\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\7$\2\2\u0117J\3\2\2\2\u0118\u0119\7^\2\2\u0119"+
		"\u011c\t\t\2\2\u011a\u011c\5M\'\2\u011b\u0118\3\2\2\2\u011b\u011a\3\2"+
		"\2\2\u011cL\3\2\2\2\u011d\u011e\7^\2\2\u011e\u011f\7w\2\2\u011f\u0120"+
		"\5A!\2\u0120\u0121\5A!\2\u0121\u0122\5A!\2\u0122\u0123\5A!\2\u0123N\3"+
		"\2\2\2\u0124\u0129\7}\2\2\u0125\u0128\5O(\2\u0126\u0128\n\n\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7\177\2\2\u012dP\3\2\2\2\u012e\u0130\5\67\34\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"R\3\2\2\2\u0133\u0135\t\13\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\b*\2\2\u0139T\3\2\2\2\u013a\u013b\7\61\2\2\u013b\u013c\7,\2\2\u013c\u0140"+
		"\3\2\2\2\u013d\u013f\13\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0144\7,\2\2\u0144\u0145\7\61\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\b+\3\2\u0147V\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a\7\61\2\2"+
		"\u014a\u014e\3\2\2\2\u014b\u014d\n\f\2\2\u014c\u014b\3\2\2\2\u014d\u0150"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\b,\4\2\u0152X\3\2\2\2\27\2\u00d6\u00da\u00dc"+
		"\u00e5\u00ed\u00f4\u00f7\u00fa\u0100\u0105\u010a\u0111\u0113\u011b\u0127"+
		"\u0129\u0131\u0136\u0140\u014e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}