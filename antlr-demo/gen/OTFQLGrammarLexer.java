// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTFQLGrammar.g4 by ANTLR 4.5
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
		CompareOprt=1, BoolOprt=2, EQUALS=3, BIGGER=4, SMALLER=5, BIGGEROREQ=6, 
		SMALLEROREQ=7, NOTEQUAL=8, NOT=9, AND=10, OR=11, SELECT=12, COMMA=13, 
		FROM=14, WHERE=15, AS=16, LPAREN=17, RPAREN=18, DOT=19, LBRACK=20, RBRACK=21, 
		INT=22, LiteralVar=23, ID=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CompareOprt", "BoolOprt", "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", 
		"SMALLEROREQ", "NOTEQUAL", "NOT", "AND", "OR", "SELECT", "COMMA", "FROM", 
		"WHERE", "AS", "LPAREN", "RPAREN", "DOT", "LBRACK", "RBRACK", "INT", "CHAR", 
		"LiteralVar", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'not'", 
		"'and'", "'or'", "'select'", "','", "'from'", "'where'", "'as'", "'('", 
		"')'", "'.'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CompareOprt", "BoolOprt", "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", 
		"SMALLEROREQ", "NOTEQUAL", "NOT", "AND", "OR", "SELECT", "COMMA", "FROM", 
		"WHERE", "AS", "LPAREN", "RPAREN", "DOT", "LBRACK", "RBRACK", "INT", "LiteralVar", 
		"ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\5\2>\n\2\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6"+
		"\27\u0080\n\27\r\27\16\27\u0081\3\30\7\30\u0085\n\30\f\30\16\30\u0088"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\5\31\u008f\n\31\3\32\3\32\7\32\u0093\n"+
		"\32\f\32\16\32\u0096\13\32\3\33\6\33\u0099\n\33\r\33\16\33\u009a\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\31\63\32\65\33\3"+
		"\2\6\3\2\62;\5\2\62;C\\c|\4\2C\\c|\5\2\13\f\17\17\"\"\u00a7\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3"+
		"\2\2\2\rI\3\2\2\2\17L\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25V\3\2\2\2\27Z"+
		"\3\2\2\2\31]\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37k\3\2\2\2!q\3\2\2\2#t\3"+
		"\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2\2\2-\177\3\2\2\2/\u0086\3"+
		"\2\2\2\61\u008e\3\2\2\2\63\u0090\3\2\2\2\65\u0098\3\2\2\2\67>\5\7\4\2"+
		"8>\5\t\5\29>\5\13\6\2:>\5\r\7\2;>\5\17\b\2<>\5\21\t\2=\67\3\2\2\2=8\3"+
		"\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\4\3\2\2\2?B\5\25\13\2"+
		"@B\5\27\f\2A?\3\2\2\2A@\3\2\2\2B\6\3\2\2\2CD\7?\2\2D\b\3\2\2\2EF\7@\2"+
		"\2F\n\3\2\2\2GH\7>\2\2H\f\3\2\2\2IJ\7@\2\2JK\7?\2\2K\16\3\2\2\2LM\7>\2"+
		"\2MN\7?\2\2N\20\3\2\2\2OP\7#\2\2PQ\7?\2\2Q\22\3\2\2\2RS\7p\2\2ST\7q\2"+
		"\2TU\7v\2\2U\24\3\2\2\2VW\7c\2\2WX\7p\2\2XY\7f\2\2Y\26\3\2\2\2Z[\7q\2"+
		"\2[\\\7t\2\2\\\30\3\2\2\2]^\7u\2\2^_\7g\2\2_`\7n\2\2`a\7g\2\2ab\7e\2\2"+
		"bc\7v\2\2c\32\3\2\2\2de\7.\2\2e\34\3\2\2\2fg\7h\2\2gh\7t\2\2hi\7q\2\2"+
		"ij\7o\2\2j\36\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7g\2\2no\7t\2\2op\7g\2\2p \3"+
		"\2\2\2qr\7c\2\2rs\7u\2\2s\"\3\2\2\2tu\7*\2\2u$\3\2\2\2vw\7+\2\2w&\3\2"+
		"\2\2xy\7\60\2\2y(\3\2\2\2z{\7]\2\2{*\3\2\2\2|}\7_\2\2},\3\2\2\2~\u0080"+
		"\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082.\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\60\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008a\7$\2\2\u008a\u008b\5/\30\2\u008b\u008c"+
		"\7$\2\2\u008c\u008f\3\2\2\2\u008d\u008f\5-\27\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\62\3\2\2\2\u0090\u0094\t\4\2\2\u0091\u0093\t\3\2"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\64\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\t\5\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\33\2\2\u009d\66\3\2\2\2\n\2=A\u0081"+
		"\u0086\u008e\u0094\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}