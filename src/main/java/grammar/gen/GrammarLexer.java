// Generated from /home/kenny/workspace/k/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
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
		TOKENS=1, PARAM=2, DELETE=3, LOGON=4, LOGOFF=5, DUMP=6, PRINT=7, FUNC=8, 
		IF=9, ELSE=10, ELSEIF=11, LOOP=12, BREAK=13, BEGIN=14, END=15, TRUE=16, 
		FALSE=17, NULL=18, SEMICOLON=19, ASSIGN=20, INC=21, DEC=22, ADD=23, ADD_ASSIGN=24, 
		SUB=25, SUB_ASSIGN=26, DIV=27, DIV_ASSIGN=28, MUL=29, MUL_ASSIGN=30, EXPONENT=31, 
		EXPONENT_ASSIGN=32, MODULUS=33, MODULUS_ASSIGN=34, VARIABLE=35, HEX_LITERAL=36, 
		BINARY_LITERAL=37, NUMBER_LITERAL=38, CHARACTER_LITERAL=39, STRING_LITERAL=40, 
		ACTION=41, SYMBOL=42, NL=43, WS=44, BLOCK_COMMENT=45, LINE_COMMENT=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TOKENS", "PARAM", "DELETE", "LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", 
		"IF", "ELSE", "ELSEIF", "LOOP", "BREAK", "BEGIN", "END", "TRUE", "FALSE", 
		"NULL", "SEMICOLON", "ASSIGN", "INC", "DEC", "ADD", "ADD_ASSIGN", "SUB", 
		"SUB_ASSIGN", "DIV", "DIV_ASSIGN", "MUL", "MUL_ASSIGN", "EXPONENT", "EXPONENT_ASSIGN", 
		"MODULUS", "MODULUS_ASSIGN", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", 
		"NUMBER_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "ACTION", "SYMBOL", 
		"NL", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"TOKENS", "PARAM", "DELETE", "LOGON", "LOGOFF", "DUMP", "PRINT", "FUNC", 
		"IF", "ELSE", "ELSEIF", "LOOP", "BREAK", "BEGIN", "END", "TRUE", "FALSE", 
		"NULL", "SEMICOLON", "ASSIGN", "INC", "DEC", "ADD", "ADD_ASSIGN", "SUB", 
		"SUB_ASSIGN", "DIV", "DIV_ASSIGN", "MUL", "MUL_ASSIGN", "EXPONENT", "EXPONENT_ASSIGN", 
		"MODULUS", "MODULUS_ASSIGN", "CHAR", "VARIABLE", "HEX_LITERAL", "BINARY_LITERAL", 
		"NUMBER_LITERAL", "INTEGER", "HEX_DIGIT", "INT_DIGIT", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "ACTION", "SYMBOL", 
		"NL", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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
		case 49: WS_action((RuleContext)_localctx, actionIndex); break;

		case 50: BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 51: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\60\u0194\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\6%\u010c\n%\r%\16"+
		"%\u010d\3%\3%\7%\u0112\n%\f%\16%\u0115\13%\3&\3&\3&\3&\6&\u011b\n&\r&"+
		"\16&\u011c\3\'\3\'\3\'\3\'\6\'\u0123\n\'\r\'\16\'\u0124\3(\6(\u0128\n"+
		"(\r(\16(\u0129\3(\5(\u012d\n(\3(\7(\u0130\n(\f(\16(\u0133\13(\3)\3)\3"+
		")\7)\u0138\n)\f)\16)\u013b\13)\5)\u013d\n)\3*\5*\u0140\n*\3+\3+\3,\3,"+
		"\3,\5,\u0147\n,\3,\3,\3-\3-\3-\7-\u014e\n-\f-\16-\u0151\13-\3-\3-\3.\3"+
		".\3.\5.\u0158\n.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u0164\n\60\f"+
		"\60\16\60\u0167\13\60\3\60\3\60\3\61\6\61\u016c\n\61\r\61\16\61\u016d"+
		"\3\62\5\62\u0171\n\62\3\62\3\62\3\63\6\63\u0176\n\63\r\63\16\63\u0177"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0180\n\64\f\64\16\64\u0183\13\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u018e\n\65\f\65\16"+
		"\65\u0191\13\65\3\65\3\65\3\u0181\66\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G\2\1I%\1K&\1M\'\1O(\1Q"+
		"\2\1S\2\1U\2\1W)\1Y*\1[\2\1]\2\1_+\1a,\1c-\1e.\2g/\3i\60\4\3\2\f\5C\\"+
		"aac|\3\62\63\5\62;CHch\3\62;\4))^^\4$$^^\n$$))^^ddhhppttvv\4}}\177\177"+
		"\5\13\13\16\16\"\"\4\f\f\17\17\u01a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g"+
		"\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5r\3\2\2\2\7x\3\2\2\2\t\177\3\2\2\2\13"+
		"\u008a\3\2\2\2\r\u0096\3\2\2\2\17\u009b\3\2\2\2\21\u00a1\3\2\2\2\23\u00aa"+
		"\3\2\2\2\25\u00ad\3\2\2\2\27\u00b2\3\2\2\2\31\u00b5\3\2\2\2\33\u00ba\3"+
		"\2\2\2\35\u00c0\3\2\2\2\37\u00c9\3\2\2\2!\u00d0\3\2\2\2#\u00d5\3\2\2\2"+
		"%\u00db\3\2\2\2\'\u00e0\3\2\2\2)\u00e2\3\2\2\2+\u00e4\3\2\2\2-\u00e7\3"+
		"\2\2\2/\u00ea\3\2\2\2\61\u00ec\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2"+
		"\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f9\3\2\2\2=\u00fb\3\2\2\2?\u00fe"+
		"\3\2\2\2A\u0100\3\2\2\2C\u0103\3\2\2\2E\u0105\3\2\2\2G\u0108\3\2\2\2I"+
		"\u010b\3\2\2\2K\u0116\3\2\2\2M\u011e\3\2\2\2O\u0127\3\2\2\2Q\u013c\3\2"+
		"\2\2S\u013f\3\2\2\2U\u0141\3\2\2\2W\u0143\3\2\2\2Y\u014a\3\2\2\2[\u0157"+
		"\3\2\2\2]\u0159\3\2\2\2_\u0160\3\2\2\2a\u016b\3\2\2\2c\u0170\3\2\2\2e"+
		"\u0175\3\2\2\2g\u017b\3\2\2\2i\u0189\3\2\2\2kl\7v\2\2lm\7q\2\2mn\7m\2"+
		"\2no\7g\2\2op\7p\2\2pq\7u\2\2q\4\3\2\2\2rs\7r\2\2st\7c\2\2tu\7t\2\2uv"+
		"\7c\2\2vw\7o\2\2w\6\3\2\2\2xy\7f\2\2yz\7g\2\2z{\7n\2\2{|\7g\2\2|}\7v\2"+
		"\2}~\7g\2\2~\b\3\2\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081\u0082"+
		"\7i\2\2\u0082\u0083\7i\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7i\2\2\u0086\u0087\7\"\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2"+
		"\2\u0089\n\3\2\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d\7"+
		"i\2\2\u008d\u008e\7i\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7i\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7q\2\2\u0093\u0094\7h\2\2\u0094"+
		"\u0095\7h\2\2\u0095\f\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7o\2\2\u0099\u009a\7r\2\2\u009a\16\3\2\2\2\u009b\u009c\7r\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\20\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7"+
		"p\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7h\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\5\25\13\2\u00b3"+
		"\u00b4\5\23\n\2\u00b4\30\3\2\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7q\2\2"+
		"\u00b7\u00b8\7q\2\2\u00b8\u00b9\7r\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7"+
		"d\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be\u00bf"+
		"\7m\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7i\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c8\5c\62\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\36\3\2\2"+
		"\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7f\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00cf\5c\62\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		" \3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da$\3\2\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7n\2\2"+
		"\u00df&\3\2\2\2\u00e0\u00e1\7=\2\2\u00e1(\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3"+
		"*\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\u00e6\7-\2\2\u00e6,\3\2\2\2\u00e7\u00e8"+
		"\7/\2\2\u00e8\u00e9\7/\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb\60"+
		"\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed\u00ee\7?\2\2\u00ee\62\3\2\2\2\u00ef"+
		"\u00f0\7/\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7?\2\2\u00f3"+
		"\66\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f58\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7"+
		"\u00f8\7?\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa<\3\2\2\2\u00fb\u00fc"+
		"\7,\2\2\u00fc\u00fd\7?\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7`\2\2\u00ff@\3"+
		"\2\2\2\u0100\u0101\7`\2\2\u0101\u0102\7?\2\2\u0102B\3\2\2\2\u0103\u0104"+
		"\7\'\2\2\u0104D\3\2\2\2\u0105\u0106\7\'\2\2\u0106\u0107\7?\2\2\u0107F"+
		"\3\2\2\2\u0108\u0109\t\2\2\2\u0109H\3\2\2\2\u010a\u010c\5G$\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0113\3\2\2\2\u010f\u0112\5G$\2\u0110\u0112\5U+\2\u0111\u010f\3\2\2\2"+
		"\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114J\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\62\2\2\u0117"+
		"\u0118\7z\2\2\u0118\u011a\3\2\2\2\u0119\u011b\5S*\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dL"+
		"\3\2\2\2\u011e\u011f\7\62\2\2\u011f\u0120\7d\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u0123\t\3\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125N\3\2\2\2\u0126\u0128\5Q)\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u012d\7\60\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\5Q)\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132P\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0134\u013d\7\62\2\2\u0135\u0139\5U+\2\u0136\u0138"+
		"\5U+\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0134\3\2"+
		"\2\2\u013c\u0135\3\2\2\2\u013dR\3\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e"+
		"\3\2\2\2\u0140T\3\2\2\2\u0141\u0142\t\5\2\2\u0142V\3\2\2\2\u0143\u0146"+
		"\7)\2\2\u0144\u0147\5[.\2\u0145\u0147\n\6\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7)\2\2\u0149X\3\2\2\2\u014a"+
		"\u014f\7$\2\2\u014b\u014e\5[.\2\u014c\u014e\n\7\2\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7$\2\2\u0153"+
		"Z\3\2\2\2\u0154\u0155\7^\2\2\u0155\u0158\t\b\2\2\u0156\u0158\5]/\2\u0157"+
		"\u0154\3\2\2\2\u0157\u0156\3\2\2\2\u0158\\\3\2\2\2\u0159\u015a\7^\2\2"+
		"\u015a\u015b\7w\2\2\u015b\u015c\5S*\2\u015c\u015d\5S*\2\u015d\u015e\5"+
		"S*\2\u015e\u015f\5S*\2\u015f^\3\2\2\2\u0160\u0165\7}\2\2\u0161\u0164\5"+
		"_\60\2\u0162\u0164\n\t\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\177\2\2\u0169`\3\2\2\2\u016a\u016c"+
		"\5G$\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016eb\3\2\2\2\u016f\u0171\7\17\2\2\u0170\u016f\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\f\2\2\u0173d\3"+
		"\2\2\2\u0174\u0176\t\n\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b\63"+
		"\2\2\u017af\3\2\2\2\u017b\u017c\7\61\2\2\u017c\u017d\7,\2\2\u017d\u0181"+
		"\3\2\2\2\u017e\u0180\13\2\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\u0185\7,\2\2\u0185\u0186\7\61\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\b\64\3\2\u0188h\3\2\2\2\u0189\u018a\7\61\2\2\u018a\u018b\7\61\2"+
		"\2\u018b\u018f\3\2\2\2\u018c\u018e\n\13\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0193\b\65\4\2\u0193j\3\2\2\2\33\2\u00c7"+
		"\u00ce\u010d\u0111\u0113\u011c\u0124\u0129\u012c\u0131\u0139\u013c\u013f"+
		"\u0146\u014d\u014f\u0157\u0163\u0165\u016d\u0170\u0177\u0181\u018f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}