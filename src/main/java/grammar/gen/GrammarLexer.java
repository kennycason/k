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
		PARAM=1, LOGON=2, LOGOFF=3, DUMP=4, PRINT=5, FUNC=6, IF=7, ELSE=8, ELSEIF=9, 
		LOOP=10, BREAK=11, BEGIN=12, END=13, TRUE=14, FALSE=15, NULL=16, ASSIGN=17, 
		INC=18, DEC=19, ADD=20, ADD_ASSIGN=21, SUB=22, SUB_ASSIGN=23, DIV=24, 
		DIV_ASSIGN=25, MUL=26, MUL_ASSIGN=27, VARIABLE=28, HEX_LITERAL=29, BINARY_LITERAL=30, 
		INTEGER_LITERAL=31, EXPONENT=32, CHARACTER_LITERAL=33, STRING_LITERAL=34, 
		ACTION=35, SYMBOL=36, NEWLINE=37, WS=38, BLOCK_COMMENT=39, LINE_COMMENT=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"PARAM", "LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", "IF", "ELSE", "ELSEIF", 
		"LOOP", "BREAK", "BEGIN", "END", "TRUE", "FALSE", "NULL", "ASSIGN", "INC", 
		"DEC", "ADD", "ADD_ASSIGN", "SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", 
		"MUL", "MUL_ASSIGN", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", "INTEGER_LITERAL", 
		"EXPONENT", "CHARACTER_LITERAL", "STRING_LITERAL", "ACTION", "SYMBOL", 
		"NEWLINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"PARAM", "LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", "IF", "ELSE", "ELSEIF", 
		"LOOP", "BREAK", "BEGIN", "END", "TRUE", "FALSE", "NULL", "ASSIGN", "INC", 
		"DEC", "ADD", "ADD_ASSIGN", "SUB", "SUB_ASSIGN", "DIV", "DIV_ASSIGN", 
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
		case 42: WS_action((RuleContext)_localctx, actionIndex); break;

		case 43: BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 44: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4*\u0162\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\6\36\u00df\n\36"+
		"\r\36\16\36\u00e0\3\36\3\36\7\36\u00e5\n\36\f\36\16\36\u00e8\13\36\3\37"+
		"\3\37\3\37\3\37\6\37\u00ee\n\37\r\37\16\37\u00ef\3 \3 \3 \3 \6 \u00f6"+
		"\n \r \16 \u00f7\3!\3!\3!\7!\u00fd\n!\f!\16!\u0100\13!\5!\u0102\n!\3\""+
		"\5\"\u0105\n\"\3#\3#\3$\3$\5$\u010b\n$\3$\6$\u010e\n$\r$\16$\u010f\3%"+
		"\3%\3%\5%\u0115\n%\3%\3%\3&\3&\3&\7&\u011c\n&\f&\16&\u011f\13&\3&\3&\3"+
		"\'\3\'\3\'\5\'\u0126\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\7)\u0132\n)\f)"+
		"\16)\u0135\13)\3)\3)\3*\6*\u013a\n*\r*\16*\u013b\3+\5+\u013f\n+\3+\3+"+
		"\3,\6,\u0144\n,\r,\16,\u0145\3,\3,\3-\3-\3-\3-\7-\u014e\n-\f-\16-\u0151"+
		"\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u015c\n.\f.\16.\u015f\13.\3.\3.\3\u014f"+
		"/\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\2\1;\36\1=\37\1? \1A!"+
		"\1C\2\1E\2\1G\"\1I#\1K$\1M\2\1O\2\1Q%\1S&\1U\'\1W(\2Y)\3[*\4\3\2\r\5C"+
		"\\aac|\3\62\63\5\62;CHch\3\62;\4--//\4))^^\4$$^^\n$$))^^ddhhppttvv\4}"+
		"}\177\177\5\13\13\16\16\"\"\4\f\f\17\17\u0170\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5c\3\2\2\2\7n\3\2\2\2\tz"+
		"\3\2\2\2\13\177\3\2\2\2\r\u0085\3\2\2\2\17\u008e\3\2\2\2\21\u0091\3\2"+
		"\2\2\23\u0096\3\2\2\2\25\u0099\3\2\2\2\27\u009e\3\2\2\2\31\u00a4\3\2\2"+
		"\2\33\u00aa\3\2\2\2\35\u00ae\3\2\2\2\37\u00b3\3\2\2\2!\u00b9\3\2\2\2#"+
		"\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c3\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3"+
		"\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2"+
		"\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00da\3\2\2\2;\u00dc\3\2\2\2=\u00e9"+
		"\3\2\2\2?\u00f1\3\2\2\2A\u0101\3\2\2\2C\u0104\3\2\2\2E\u0106\3\2\2\2G"+
		"\u0108\3\2\2\2I\u0111\3\2\2\2K\u0118\3\2\2\2M\u0125\3\2\2\2O\u0127\3\2"+
		"\2\2Q\u012e\3\2\2\2S\u0139\3\2\2\2U\u013e\3\2\2\2W\u0143\3\2\2\2Y\u0149"+
		"\3\2\2\2[\u0157\3\2\2\2]^\7r\2\2^_\7c\2\2_`\7t\2\2`a\7c\2\2ab\7o\2\2b"+
		"\4\3\2\2\2cd\7n\2\2de\7q\2\2ef\7i\2\2fg\7i\2\2gh\7k\2\2hi\7p\2\2ij\7i"+
		"\2\2jk\7\"\2\2kl\7q\2\2lm\7p\2\2m\6\3\2\2\2no\7n\2\2op\7q\2\2pq\7i\2\2"+
		"qr\7i\2\2rs\7k\2\2st\7p\2\2tu\7i\2\2uv\7\"\2\2vw\7q\2\2wx\7h\2\2xy\7h"+
		"\2\2y\b\3\2\2\2z{\7f\2\2{|\7w\2\2|}\7o\2\2}~\7r\2\2~\n\3\2\2\2\177\u0080"+
		"\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7v\2\2\u0084\f\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7e\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2"+
		"\u008b\u008c\7q\2\2\u008c\u008d\7p\2\2\u008d\16\3\2\2\2\u008e\u008f\7"+
		"k\2\2\u008f\u0090\7h\2\2\u0090\20\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\22\3\2\2\2\u0096\u0097"+
		"\5\21\t\2\u0097\u0098\5\17\b\2\u0098\24\3\2\2\2\u0099\u009a\7n\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7q\2\2\u009c\u009d\7r\2\2\u009d\26\3\2\2\2\u009e"+
		"\u009f\7d\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2\u00a3\7m\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7"+
		"g\2\2\u00a6\u00a7\7i\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\32"+
		"\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		"\34\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8 \3\2\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\"\3\2\2\2\u00be\u00bf\7?\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7-\2\2"+
		"\u00c1\u00c2\7-\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7/\2"+
		"\2\u00c5(\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7-\2\2"+
		"\u00c9\u00ca\7?\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc.\3\2\2\2\u00cd"+
		"\u00ce\7/\2\2\u00ce\u00cf\7?\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7\61\2\2"+
		"\u00d1\62\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2"+
		"\2\2\u00d5\u00d6\7,\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d98\3\2\2\2\u00da\u00db\t\2\2\2\u00db:\3\2\2\2\u00dc\u00de"+
		"\7B\2\2\u00dd\u00df\59\35\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e5\59"+
		"\35\2\u00e3\u00e5\5E#\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7<\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\62\2\2\u00ea\u00eb\7z\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00ee\5C\"\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7\62\2\2"+
		"\u00f2\u00f3\7d\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"@\3\2\2\2\u00f9\u0102\7\62\2\2\u00fa\u00fe\5E#\2\u00fb\u00fd\5E#\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00f9\3\2\2\2\u0101"+
		"\u00fa\3\2\2\2\u0102B\3\2\2\2\u0103\u0105\t\4\2\2\u0104\u0103\3\2\2\2"+
		"\u0105D\3\2\2\2\u0106\u0107\t\5\2\2\u0107F\3\2\2\2\u0108\u010a\7`\2\2"+
		"\u0109\u010b\t\6\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d"+
		"\3\2\2\2\u010c\u010e\5E#\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110H\3\2\2\2\u0111\u0114\7)\2\2\u0112"+
		"\u0115\5M\'\2\u0113\u0115\n\7\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7)\2\2\u0117J\3\2\2\2\u0118\u011d"+
		"\7$\2\2\u0119\u011c\5M\'\2\u011a\u011c\n\b\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7$\2\2\u0121"+
		"L\3\2\2\2\u0122\u0123\7^\2\2\u0123\u0126\t\t\2\2\u0124\u0126\5O(\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0126N\3\2\2\2\u0127\u0128\7^\2\2\u0128"+
		"\u0129\7w\2\2\u0129\u012a\5C\"\2\u012a\u012b\5C\"\2\u012b\u012c\5C\"\2"+
		"\u012c\u012d\5C\"\2\u012dP\3\2\2\2\u012e\u0133\7}\2\2\u012f\u0132\5Q)"+
		"\2\u0130\u0132\n\n\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7\177\2\2\u0137R\3\2\2\2\u0138\u013a\59\35"+
		"\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013cT\3\2\2\2\u013d\u013f\7\17\2\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\f\2\2\u0141V\3\2\2\2"+
		"\u0142\u0144\t\13\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b,\2\2\u0148"+
		"X\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b\7,\2\2\u014b\u014f\3\2\2\2"+
		"\u014c\u014e\13\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\7,\2\2\u0153\u0154\7\61\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b-"+
		"\3\2\u0156Z\3\2\2\2\u0157\u0158\7\61\2\2\u0158\u0159\7\61\2\2\u0159\u015d"+
		"\3\2\2\2\u015a\u015c\n\f\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\b.\4\2\u0161\\\3\2\2\2\30\2\u00e0\u00e4\u00e6\u00ef\u00f7"+
		"\u00fe\u0101\u0104\u010a\u010f\u0114\u011b\u011d\u0125\u0131\u0133\u013b"+
		"\u013e\u0145\u014f\u015d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}