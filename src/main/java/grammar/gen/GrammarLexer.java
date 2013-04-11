// Generated from /home/destructo/workspace/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
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
		TOKENS=1, PARAM=2, LOGON=3, LOGOFF=4, DUMP=5, PRINT=6, FUNC=7, IF=8, ELSE=9, 
		ELSEIF=10, LOOP=11, BREAK=12, BEGIN=13, END=14, TRUE=15, FALSE=16, NULL=17, 
		ASSIGN=18, INC=19, DEC=20, ADD=21, ADD_ASSIGN=22, SUB=23, SUB_ASSIGN=24, 
		DIV=25, DIV_ASSIGN=26, MUL=27, MUL_ASSIGN=28, VARIABLE=29, HEX_LITERAL=30, 
		BINARY_LITERAL=31, INTEGER_LITERAL=32, EXPONENT=33, CHARACTER_LITERAL=34, 
		STRING_LITERAL=35, ACTION=36, SYMBOL=37, NEWLINE=38, WS=39, BLOCK_COMMENT=40, 
		LINE_COMMENT=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TOKENS", "PARAM", "LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", "IF", "ELSE", 
		"ELSEIF", "LOOP", "BREAK", "BEGIN", "END", "TRUE", "FALSE", "NULL", "ASSIGN", 
		"INC", "DEC", "ADD", "ADD_ASSIGN", "SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", 
		"MUL", "MUL_ASSIGN", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", "INTEGER_LITERAL", 
		"EXPONENT", "CHARACTER_LITERAL", "STRING_LITERAL", "ACTION", "SYMBOL", 
		"NEWLINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"TOKENS", "PARAM", "LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", "IF", "ELSE", 
		"ELSEIF", "LOOP", "BREAK", "BEGIN", "END", "TRUE", "FALSE", "NULL", "ASSIGN", 
		"INC", "DEC", "ADD", "ADD_ASSIGN", "SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", 
		"MUL", "MUL_ASSIGN", "CHAR", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", 
		"INTEGER_LITERAL", "HEX_DIGIT", "INT_DIGIT", "EXPONENT", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "ACTION", "SYMBOL", 
		"NEWLINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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
		case 43: WS_action((RuleContext)_localctx, actionIndex); break;

		case 44: BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 45: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4+\u016b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\6\37\u00e8\n\37\r\37\16\37\u00e9\3\37\3\37\7\37"+
		"\u00ee\n\37\f\37\16\37\u00f1\13\37\3 \3 \3 \3 \6 \u00f7\n \r \16 \u00f8"+
		"\3!\3!\3!\3!\6!\u00ff\n!\r!\16!\u0100\3\"\3\"\3\"\7\"\u0106\n\"\f\"\16"+
		"\"\u0109\13\"\5\"\u010b\n\"\3#\5#\u010e\n#\3$\3$\3%\3%\5%\u0114\n%\3%"+
		"\6%\u0117\n%\r%\16%\u0118\3&\3&\3&\5&\u011e\n&\3&\3&\3\'\3\'\3\'\7\'\u0125"+
		"\n\'\f\'\16\'\u0128\13\'\3\'\3\'\3(\3(\3(\5(\u012f\n(\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\7*\u013b\n*\f*\16*\u013e\13*\3*\3*\3+\6+\u0143\n+\r+\16"+
		"+\u0144\3,\5,\u0148\n,\3,\3,\3-\6-\u014d\n-\r-\16-\u014e\3-\3-\3.\3.\3"+
		".\3.\7.\u0157\n.\f.\16.\u015a\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u0165"+
		"\n/\f/\16/\u0168\13/\3/\3/\3\u0158\60\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\2\1=\37\1? \1A!\1C\"\1E\2\1G\2\1I#\1K$\1M%\1O\2\1"+
		"Q\2\1S&\1U\'\1W(\1Y)\2[*\3]+\4\3\2\r\5C\\aac|\3\62\63\5\62;CHch\3\62;"+
		"\4--//\4))^^\4$$^^\n$$))^^ddhhppttvv\4}}\177\177\5\13\13\16\16\"\"\4\f"+
		"\f\17\17\u0179\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\3_\3\2\2\2\5f\3\2\2\2\7l\3\2\2\2\tw\3\2\2\2\13\u0083\3\2"+
		"\2\2\r\u0088\3\2\2\2\17\u008e\3\2\2\2\21\u0097\3\2\2\2\23\u009a\3\2\2"+
		"\2\25\u009f\3\2\2\2\27\u00a2\3\2\2\2\31\u00a7\3\2\2\2\33\u00ad\3\2\2\2"+
		"\35\u00b3\3\2\2\2\37\u00b7\3\2\2\2!\u00bc\3\2\2\2#\u00c2\3\2\2\2%\u00c7"+
		"\3\2\2\2\'\u00c9\3\2\2\2)\u00cc\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2"+
		"/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2\2\2\67"+
		"\u00de\3\2\2\29\u00e0\3\2\2\2;\u00e3\3\2\2\2=\u00e5\3\2\2\2?\u00f2\3\2"+
		"\2\2A\u00fa\3\2\2\2C\u010a\3\2\2\2E\u010d\3\2\2\2G\u010f\3\2\2\2I\u0111"+
		"\3\2\2\2K\u011a\3\2\2\2M\u0121\3\2\2\2O\u012e\3\2\2\2Q\u0130\3\2\2\2S"+
		"\u0137\3\2\2\2U\u0142\3\2\2\2W\u0147\3\2\2\2Y\u014c\3\2\2\2[\u0152\3\2"+
		"\2\2]\u0160\3\2\2\2_`\7v\2\2`a\7q\2\2ab\7m\2\2bc\7g\2\2cd\7p\2\2de\7u"+
		"\2\2e\4\3\2\2\2fg\7r\2\2gh\7c\2\2hi\7t\2\2ij\7c\2\2jk\7o\2\2k\6\3\2\2"+
		"\2lm\7n\2\2mn\7q\2\2no\7i\2\2op\7i\2\2pq\7k\2\2qr\7p\2\2rs\7i\2\2st\7"+
		"\"\2\2tu\7q\2\2uv\7p\2\2v\b\3\2\2\2wx\7n\2\2xy\7q\2\2yz\7i\2\2z{\7i\2"+
		"\2{|\7k\2\2|}\7p\2\2}~\7i\2\2~\177\7\"\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7h\2\2\u0081\u0082\7h\2\2\u0082\n\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085"+
		"\7w\2\2\u0085\u0086\7o\2\2\u0086\u0087\7r\2\2\u0087\f\3\2\2\2\u0088\u0089"+
		"\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7v\2\2\u008d\16\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\20\3\2\2\2\u0097\u0098\7"+
		"k\2\2\u0098\u0099\7h\2\2\u0099\22\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\24\3\2\2\2\u009f\u00a0"+
		"\5\23\n\2\u00a0\u00a1\5\21\t\2\u00a1\26\3\2\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7r\2\2\u00a6\30\3\2\2\2\u00a7"+
		"\u00a8\7d\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7m\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7"+
		"g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\34"+
		"\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		"\36\3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7w\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb \3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\"\3\2\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7n\2\2"+
		"\u00c6$\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca"+
		"\u00cb\7-\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7/\2\2\u00ce"+
		"*\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\60\3\2\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7\u00d8\7?\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7\61\2\2\u00da"+
		"\64\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\7?\2\2\u00dd\66\3\2\2\2\u00de"+
		"\u00df\7,\2\2\u00df8\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1\u00e2\7?\2\2\u00e2"+
		":\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4<\3\2\2\2\u00e5\u00e7\7B\2\2\u00e6"+
		"\u00e8\5;\36\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ef\3\2\2\2\u00eb\u00ee\5;\36\2\u00ec"+
		"\u00ee\5G$\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0>\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f3\7\62\2\2\u00f3\u00f4\7z\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f7\5E#\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2"+
		"\2\u00f8\u00f9\3\2\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7\62\2\2\u00fb\u00fc"+
		"\7d\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101B\3\2\2\2"+
		"\u0102\u010b\7\62\2\2\u0103\u0107\5G$\2\u0104\u0106\5G$\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0103\3\2"+
		"\2\2\u010bD\3\2\2\2\u010c\u010e\t\4\2\2\u010d\u010c\3\2\2\2\u010eF\3\2"+
		"\2\2\u010f\u0110\t\5\2\2\u0110H\3\2\2\2\u0111\u0113\7`\2\2\u0112\u0114"+
		"\t\6\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0117\5G$\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119J\3\2\2\2\u011a\u011d\7)\2\2\u011b\u011e\5"+
		"O(\2\u011c\u011e\n\7\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7)\2\2\u0120L\3\2\2\2\u0121\u0126\7$\2\2\u0122"+
		"\u0125\5O(\2\u0123\u0125\n\b\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2"+
		"\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$\2\2\u012aN\3\2\2\2\u012b\u012c"+
		"\7^\2\2\u012c\u012f\t\t\2\2\u012d\u012f\5Q)\2\u012e\u012b\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012fP\3\2\2\2\u0130\u0131\7^\2\2\u0131\u0132\7w\2\2\u0132"+
		"\u0133\5E#\2\u0133\u0134\5E#\2\u0134\u0135\5E#\2\u0135\u0136\5E#\2\u0136"+
		"R\3\2\2\2\u0137\u013c\7}\2\2\u0138\u013b\5S*\2\u0139\u013b\n\n\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\7\177\2\2\u0140T\3\2\2\2\u0141\u0143\5;\36\2\u0142\u0141\3\2\2"+
		"\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145V"+
		"\3\2\2\2\u0146\u0148\7\17\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\7\f\2\2\u014aX\3\2\2\2\u014b\u014d\t"+
		"\13\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b-\2\2\u0151Z\3\2\2\2\u0152"+
		"\u0153\7\61\2\2\u0153\u0154\7,\2\2\u0154\u0158\3\2\2\2\u0155\u0157\13"+
		"\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0159\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7,"+
		"\2\2\u015c\u015d\7\61\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b.\3\2\u015f"+
		"\\\3\2\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7\61\2\2\u0162\u0166\3\2\2"+
		"\2\u0163\u0165\n\f\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\b/\4\2\u016a^\3\2\2\2\30\2\u00e9\u00ed\u00ef\u00f8\u0100\u0107"+
		"\u010a\u010d\u0113\u0118\u011d\u0124\u0126\u012e\u013a\u013c\u0144\u0147"+
		"\u014e\u0158\u0166";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}