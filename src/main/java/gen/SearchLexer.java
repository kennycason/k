// Generated from /home/kenny/k/src/main/java/grammar/grammar.g4 by ANTLR 4.0
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
public class SearchLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, T=2, C=3, G=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'A'", "'T'", "'C'", "'G'"
	};
	public static final String[] ruleNames = {
		"A", "T", "C", "G"
	};


	public SearchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\6\23\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\2\6\3\3\1\5\4\1\7\5\1\t\6\1\3\2\2\22\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\r\3\2\2\2\7\17\3\2\2\2\t\21\3"+
		"\2\2\2\13\f\7C\2\2\f\4\3\2\2\2\r\16\7V\2\2\16\6\3\2\2\2\17\20\7E\2\2\20"+
		"\b\3\2\2\2\21\22\7I\2\2\22\n\3\2\2\2\3\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}