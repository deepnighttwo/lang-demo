// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTFQLGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OTFQLGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, INT=13, CompareOprt=14, EQUALS=15, BIGGER=16, 
		SMALLER=17, BIGGEROREQ=18, SMALLEROREQ=19, NOTEQUAL=20, NOT=21, AND=22, 
		OR=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ID", "INT", "CompareOprt", "EQUALS", "BIGGER", "SMALLER", 
		"BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", "NOT", "AND", "OR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'select'", "','", "'from'", "'where'", "'as'", "'.'", "'['", "']'", 
		"'\"'", "'('", "')'", null, null, null, "'='", "'>'", "'<'", "'>='", "'<='", 
		"'!='", "'!'", "'&'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "INT", "CompareOprt", "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", 
		"SMALLEROREQ", "NOTEQUAL", "NOT", "AND", "OR", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public OTFQLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OTFQLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\7\rY\n\r\f\r\16\r\\\13\r\3\16\6\16_\n\16\r\16\16\16`"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17i\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\6\31\u0081\n\31\r\31\16\31\u0082\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5:\3\2\2\2\7<\3\2"+
		"\2\2\tA\3\2\2\2\13G\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2"+
		"\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33^\3\2\2\2\35h\3\2\2\2\37j\3"+
		"\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'s\3\2\2\2)v\3\2\2\2+y\3\2\2\2-{"+
		"\3\2\2\2/}\3\2\2\2\61\u0080\3\2\2\2\63\64\7u\2\2\64\65\7g\2\2\65\66\7"+
		"n\2\2\66\67\7g\2\2\678\7e\2\289\7v\2\29\4\3\2\2\2:;\7.\2\2;\6\3\2\2\2"+
		"<=\7h\2\2=>\7t\2\2>?\7q\2\2?@\7o\2\2@\b\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7"+
		"g\2\2DE\7t\2\2EF\7g\2\2F\n\3\2\2\2GH\7c\2\2HI\7u\2\2I\f\3\2\2\2JK\7\60"+
		"\2\2K\16\3\2\2\2LM\7]\2\2M\20\3\2\2\2NO\7_\2\2O\22\3\2\2\2PQ\7$\2\2Q\24"+
		"\3\2\2\2RS\7*\2\2S\26\3\2\2\2TU\7+\2\2U\30\3\2\2\2VZ\t\2\2\2WY\t\3\2\2"+
		"XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\32\3\2\2\2\\Z\3\2\2\2]_\t\4"+
		"\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\34\3\2\2\2bi\5\37\20\2c"+
		"i\5!\21\2di\5#\22\2ei\5%\23\2fi\5\'\24\2gi\5)\25\2hb\3\2\2\2hc\3\2\2\2"+
		"hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\36\3\2\2\2jk\7?\2\2k \3\2\2"+
		"\2lm\7@\2\2m\"\3\2\2\2no\7>\2\2o$\3\2\2\2pq\7@\2\2qr\7?\2\2r&\3\2\2\2"+
		"st\7>\2\2tu\7?\2\2u(\3\2\2\2vw\7#\2\2wx\7?\2\2x*\3\2\2\2yz\7#\2\2z,\3"+
		"\2\2\2{|\7(\2\2|.\3\2\2\2}~\7~\2\2~\60\3\2\2\2\177\u0081\t\5\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\b\31\2\2\u0085\62\3\2\2\2\7\2Z`h\u0082"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}