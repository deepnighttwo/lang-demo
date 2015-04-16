// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otl\OTL.g4 by ANTLR 4.5
package com.deepnighttwo.otl.grammar.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OTLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HexLiteral=1, DecimalLiteral=2, OctalLiteral=3, FloatingPointLiteral=4, 
		CharacterLiteral=5, StringLiteral=6, EQUALS=7, BIGGER=8, SMALLER=9, BIGGEROREQ=10, 
		SMALLEROREQ=11, NOTEQUAL=12, NOT=13, AND=14, OR=15, SELECT=16, COMMA=17, 
		FROM=18, WHERE=19, AS=20, LPAREN=21, RPAREN=22, DOT=23, LBRACK=24, RBRACK=25, 
		TRUE=26, FALSE=27, NULL=28, MUL=29, DIV=30, ADD=31, SUB=32, ID=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HexLiteral", "DecimalLiteral", "OctalLiteral", "HexDigit", "IntegerTypeSuffix", 
		"FloatingPointLiteral", "Exponent", "FloatTypeSuffix", "CharacterLiteral", 
		"StringLiteral", "EscapeSequence", "OctalEscape", "UnicodeEscape", "EQUALS", 
		"BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", "NOT", "AND", 
		"OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN", "RPAREN", "DOT", 
		"LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV", "ADD", "SUB", 
		"ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'='", "'>'", "'<'", "'>='", 
		"'<='", "'!='", "'not'", "'and'", "'or'", "'select'", "','", "'from'", 
		"'where'", "'as'", "'('", "')'", "'.'", "'['", "']'", "'true'", "'false'", 
		"'null'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HexLiteral", "DecimalLiteral", "OctalLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", 
		"SMALLEROREQ", "NOTEQUAL", "NOT", "AND", "OR", "SELECT", "COMMA", "FROM", 
		"WHERE", "AS", "LPAREN", "RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", 
		"FALSE", "NULL", "MUL", "DIV", "ADD", "SUB", "ID", "WS"
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


	public OTLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\6\2Y\n\2\r\2\16\2Z\3\2\5\2^\n\2\3\3\3\3\3\3\7\3c\n\3\f\3\16\3f\13"+
		"\3\5\3h\n\3\3\3\5\3k\n\3\3\4\3\4\6\4o\n\4\r\4\16\4p\3\4\5\4t\n\4\3\5\3"+
		"\5\3\6\3\6\3\7\6\7{\n\7\r\7\16\7|\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084"+
		"\13\7\3\7\5\7\u0087\n\7\3\7\5\7\u008a\n\7\3\7\3\7\6\7\u008e\n\7\r\7\16"+
		"\7\u008f\3\7\5\7\u0093\n\7\3\7\5\7\u0096\n\7\3\7\6\7\u0099\n\7\r\7\16"+
		"\7\u009a\3\7\3\7\5\7\u009f\n\7\3\7\6\7\u00a2\n\7\r\7\16\7\u00a3\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00ab\n\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7"+
		"\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\5\7\u00ba\n\7\3\7\3\7\5\7\u00be"+
		"\n\7\3\7\6\7\u00c1\n\7\r\7\16\7\u00c2\3\7\5\7\u00c6\n\7\5\7\u00c8\n\7"+
		"\3\b\3\b\5\b\u00cc\n\b\3\b\6\b\u00cf\n\b\r\b\16\b\u00d0\3\t\3\t\3\n\3"+
		"\n\3\n\5\n\u00d8\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u00df\n\13\f\13\16\13"+
		"\u00e2\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00ea\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\7)\u0153\n)\f)\16)\u0156\13)\3*\6*\u0159\n*\r*\16"+
		"*\u015a\3*\3*\2\2+\3\3\5\4\7\5\t\2\13\2\r\6\17\2\21\2\23\7\25\b\27\2\31"+
		"\2\33\2\35\t\37\n!\13#\f%\r\'\16)\17+\20-\21/\22\61\23\63\24\65\25\67"+
		"\269\27;\30=\31?\32A\33C\34E\35G\36I\37K M!O\"Q#S$\3\2\17\4\2ZZzz\5\2"+
		"\62;CHch\4\2NNnn\4\2RRrr\4\2--//\4\2GGgg\6\2FFHHffhh\4\2))^^\4\2$$^^\n"+
		"\2$$))^^ddhhppttvv\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u017d\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5g\3\2\2\2\7l\3"+
		"\2\2\2\tu\3\2\2\2\13w\3\2\2\2\r\u00c7\3\2\2\2\17\u00c9\3\2\2\2\21\u00d2"+
		"\3\2\2\2\23\u00d4\3\2\2\2\25\u00db\3\2\2\2\27\u00e9\3\2\2\2\31\u00f4\3"+
		"\2\2\2\33\u00f6\3\2\2\2\35\u00fd\3\2\2\2\37\u00ff\3\2\2\2!\u0101\3\2\2"+
		"\2#\u0103\3\2\2\2%\u0106\3\2\2\2\'\u0109\3\2\2\2)\u010c\3\2\2\2+\u0110"+
		"\3\2\2\2-\u0114\3\2\2\2/\u0117\3\2\2\2\61\u011e\3\2\2\2\63\u0120\3\2\2"+
		"\2\65\u0125\3\2\2\2\67\u012b\3\2\2\29\u012e\3\2\2\2;\u0130\3\2\2\2=\u0132"+
		"\3\2\2\2?\u0134\3\2\2\2A\u0136\3\2\2\2C\u0138\3\2\2\2E\u013d\3\2\2\2G"+
		"\u0143\3\2\2\2I\u0148\3\2\2\2K\u014a\3\2\2\2M\u014c\3\2\2\2O\u014e\3\2"+
		"\2\2Q\u0150\3\2\2\2S\u0158\3\2\2\2UV\7\62\2\2VX\t\2\2\2WY\5\t\5\2XW\3"+
		"\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\13\6\2]\\\3\2\2\2"+
		"]^\3\2\2\2^\4\3\2\2\2_h\7\62\2\2`d\4\63;\2ac\4\62;\2ba\3\2\2\2cf\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2\2\2g_\3\2\2\2g`\3\2\2\2hj\3\2\2"+
		"\2ik\5\13\6\2ji\3\2\2\2jk\3\2\2\2k\6\3\2\2\2ln\7\62\2\2mo\4\629\2nm\3"+
		"\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\13\6\2sr\3\2\2\2st"+
		"\3\2\2\2t\b\3\2\2\2uv\t\3\2\2v\n\3\2\2\2wx\t\4\2\2x\f\3\2\2\2y{\4\62;"+
		"\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0082\7\60\2\2\177"+
		"\u0081\4\62;\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087"+
		"\5\17\b\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u008a\5\21\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00c8"+
		"\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008e\4\62;\2\u008d\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u0093\5\17\b\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0095\3\2\2\2\u0094\u0096\5\21\t\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u00c8\3\2\2\2\u0097\u0099\4\62;\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\5\17\b\2\u009d\u009f\5\21\t\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00c8\3\2\2\2\u00a0\u00a2\4\62;\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00c8\5\21\t\2\u00a6\u00a7\7\62\2\2\u00a7\u00ab\7"+
		"z\2\2\u00a8\u00a9\7\62\2\2\u00a9\u00ab\7Z\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\5\t\5\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b9\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\7\60\2\2\u00b3\u00b5\5"+
		"\t\5\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b2\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\t\5\2\2\u00bc"+
		"\u00be\t\6\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00c1\4\62;\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\21"+
		"\t\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"z\3\2\2\2\u00c7\u008b\3\2\2\2\u00c7\u0098\3\2\2\2\u00c7\u00a1\3\2\2\2"+
		"\u00c7\u00aa\3\2\2\2\u00c8\16\3\2\2\2\u00c9\u00cb\t\7\2\2\u00ca\u00cc"+
		"\t\6\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cf\4\62;\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\20\3\2\2\2\u00d2\u00d3\t\b\2\2\u00d3\22"+
		"\3\2\2\2\u00d4\u00d7\7)\2\2\u00d5\u00d8\5\27\f\2\u00d6\u00d8\n\t\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7)"+
		"\2\2\u00da\24\3\2\2\2\u00db\u00e0\7$\2\2\u00dc\u00df\5\27\f\2\u00dd\u00df"+
		"\n\n\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\7$\2\2\u00e4\26\3\2\2\2\u00e5\u00e6\7^\2\2\u00e6\u00ea"+
		"\t\13\2\2\u00e7\u00ea\5\33\16\2\u00e8\u00ea\5\31\r\2\u00e9\u00e5\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\30\3\2\2\2\u00eb\u00ec"+
		"\7^\2\2\u00ec\u00ed\4\62\65\2\u00ed\u00ee\4\629\2\u00ee\u00f5\4\629\2"+
		"\u00ef\u00f0\7^\2\2\u00f0\u00f1\4\629\2\u00f1\u00f5\4\629\2\u00f2\u00f3"+
		"\7^\2\2\u00f3\u00f5\4\629\2\u00f4\u00eb\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\32\3\2\2\2\u00f6\u00f7\7^\2\2\u00f7\u00f8\7w\2\2"+
		"\u00f8\u00f9\5\t\5\2\u00f9\u00fa\5\t\5\2\u00fa\u00fb\5\t\5\2\u00fb\u00fc"+
		"\5\t\5\2\u00fc\34\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe\36\3\2\2\2\u00ff\u0100"+
		"\7@\2\2\u0100 \3\2\2\2\u0101\u0102\7>\2\2\u0102\"\3\2\2\2\u0103\u0104"+
		"\7@\2\2\u0104\u0105\7?\2\2\u0105$\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108"+
		"\7?\2\2\u0108&\3\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\7?\2\2\u010b(\3"+
		"\2\2\2\u010c\u010d\7p\2\2\u010d\u010e\7q\2\2\u010e\u010f\7v\2\2\u010f"+
		"*\3\2\2\2\u0110\u0111\7c\2\2\u0111\u0112\7p\2\2\u0112\u0113\7f\2\2\u0113"+
		",\3\2\2\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116.\3\2\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7g\2\2\u0119\u011a\7n\2\2\u011a\u011b\7g\2\2\u011b"+
		"\u011c\7e\2\2\u011c\u011d\7v\2\2\u011d\60\3\2\2\2\u011e\u011f\7.\2\2\u011f"+
		"\62\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7t\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0124\7o\2\2\u0124\64\3\2\2\2\u0125\u0126\7y\2\2\u0126\u0127\7j\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\66\3\2\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7u\2\2\u012d8\3\2\2\2\u012e\u012f\7*\2\2\u012f"+
		":\3\2\2\2\u0130\u0131\7+\2\2\u0131<\3\2\2\2\u0132\u0133\7\60\2\2\u0133"+
		">\3\2\2\2\u0134\u0135\7]\2\2\u0135@\3\2\2\2\u0136\u0137\7_\2\2\u0137B"+
		"\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7w\2\2\u013b"+
		"\u013c\7g\2\2\u013cD\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u0142\7g\2\2\u0142F\3\2\2\2\u0143"+
		"\u0144\7p\2\2\u0144\u0145\7w\2\2\u0145\u0146\7n\2\2\u0146\u0147\7n\2\2"+
		"\u0147H\3\2\2\2\u0148\u0149\7,\2\2\u0149J\3\2\2\2\u014a\u014b\7\61\2\2"+
		"\u014bL\3\2\2\2\u014c\u014d\7-\2\2\u014dN\3\2\2\2\u014e\u014f\7/\2\2\u014f"+
		"P\3\2\2\2\u0150\u0154\t\f\2\2\u0151\u0153\t\r\2\2\u0152\u0151\3\2\2\2"+
		"\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155R\3"+
		"\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\t\16\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\b*\2\2\u015dT\3\2\2\2%\2Z]dgjps|\u0082\u0086\u0089\u008f"+
		"\u0092\u0095\u009a\u009e\u00a3\u00aa\u00af\u00b6\u00b9\u00bd\u00c2\u00c5"+
		"\u00c7\u00cb\u00d0\u00d7\u00de\u00e0\u00e9\u00f4\u0154\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}