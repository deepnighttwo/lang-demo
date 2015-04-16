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
		CompareOprt=1, BoolOprt=2, HexLiteral=3, DecimalLiteral=4, OctalLiteral=5, 
		FloatingPointLiteral=6, CharacterLiteral=7, StringLiteral=8, EQUALS=9, 
		BIGGER=10, SMALLER=11, BIGGEROREQ=12, SMALLEROREQ=13, NOTEQUAL=14, NOT=15, 
		AND=16, OR=17, SELECT=18, COMMA=19, FROM=20, WHERE=21, AS=22, LPAREN=23, 
		RPAREN=24, DOT=25, LBRACK=26, RBRACK=27, TRUE=28, FALSE=29, NULL=30, MUL=31, 
		DIV=32, ADD=33, SUB=34, ID=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CompareOprt", "BoolOprt", "HexLiteral", "DecimalLiteral", "OctalLiteral", 
		"HexDigit", "IntegerTypeSuffix", "FloatingPointLiteral", "Exponent", "FloatTypeSuffix", 
		"CharacterLiteral", "StringLiteral", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape", "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", 
		"NOTEQUAL", "NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", 
		"LPAREN", "RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", 
		"MUL", "DIV", "ADD", "SUB", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'='", "'>'", "'<'", 
		"'>='", "'<='", "'!='", "'not'", "'and'", "'or'", "'select'", "','", "'from'", 
		"'where'", "'as'", "'('", "')'", "'.'", "'['", "']'", "'true'", "'false'", 
		"'null'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CompareOprt", "BoolOprt", "HexLiteral", "DecimalLiteral", "OctalLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "EQUALS", 
		"BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", "NOT", "AND", 
		"OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN", "RPAREN", "DOT", 
		"LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV", "ADD", "SUB", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\3\3\3\3\5\3d\n\3\3\4\3\4\3\4\6\4"+
		"i\n\4\r\4\16\4j\3\4\5\4n\n\4\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5\5\5x"+
		"\n\5\3\5\5\5{\n\5\3\6\3\6\6\6\177\n\6\r\6\16\6\u0080\3\6\5\6\u0084\n\6"+
		"\3\7\3\7\3\b\3\b\3\t\6\t\u008b\n\t\r\t\16\t\u008c\3\t\3\t\7\t\u0091\n"+
		"\t\f\t\16\t\u0094\13\t\3\t\5\t\u0097\n\t\3\t\5\t\u009a\n\t\3\t\3\t\6\t"+
		"\u009e\n\t\r\t\16\t\u009f\3\t\5\t\u00a3\n\t\3\t\5\t\u00a6\n\t\3\t\6\t"+
		"\u00a9\n\t\r\t\16\t\u00aa\3\t\3\t\5\t\u00af\n\t\3\t\6\t\u00b2\n\t\r\t"+
		"\16\t\u00b3\3\t\3\t\3\t\3\t\3\t\5\t\u00bb\n\t\3\t\7\t\u00be\n\t\f\t\16"+
		"\t\u00c1\13\t\3\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8\13\t\5\t\u00ca\n\t"+
		"\3\t\3\t\5\t\u00ce\n\t\3\t\6\t\u00d1\n\t\r\t\16\t\u00d2\3\t\5\t\u00d6"+
		"\n\t\5\t\u00d8\n\t\3\n\3\n\5\n\u00dc\n\n\3\n\6\n\u00df\n\n\r\n\16\n\u00e0"+
		"\3\13\3\13\3\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ef\n\r"+
		"\f\r\16\r\u00f2\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00fa\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\7+\u0163\n+\f+\16+\u0166\13+\3,\6,\u0169"+
		"\n,\r,\16,\u016a\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\23\2\25"+
		"\2\27\t\31\n\33\2\35\2\37\2!\13#\f%\r\'\16)\17+\20-\21/\22\61\23\63\24"+
		"\65\25\67\269\27;\30=\31?\32A\33C\34E\35G\36I\37K M!O\"Q#S$U%W&\3\2\17"+
		"\4\2ZZzz\5\2\62;CHch\4\2NNnn\4\2RRrr\4\2--//\4\2GGgg\6\2FFHHffhh\4\2)"+
		")^^\4\2$$^^\n\2$$))^^ddhhppttvv\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\""+
		"\"\u0193\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\21\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\3_\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tw\3\2\2\2\13|\3\2\2\2\r\u0085"+
		"\3\2\2\2\17\u0087\3\2\2\2\21\u00d7\3\2\2\2\23\u00d9\3\2\2\2\25\u00e2\3"+
		"\2\2\2\27\u00e4\3\2\2\2\31\u00eb\3\2\2\2\33\u00f9\3\2\2\2\35\u0104\3\2"+
		"\2\2\37\u0106\3\2\2\2!\u010d\3\2\2\2#\u010f\3\2\2\2%\u0111\3\2\2\2\'\u0113"+
		"\3\2\2\2)\u0116\3\2\2\2+\u0119\3\2\2\2-\u011c\3\2\2\2/\u0120\3\2\2\2\61"+
		"\u0124\3\2\2\2\63\u0127\3\2\2\2\65\u012e\3\2\2\2\67\u0130\3\2\2\29\u0135"+
		"\3\2\2\2;\u013b\3\2\2\2=\u013e\3\2\2\2?\u0140\3\2\2\2A\u0142\3\2\2\2C"+
		"\u0144\3\2\2\2E\u0146\3\2\2\2G\u0148\3\2\2\2I\u014d\3\2\2\2K\u0153\3\2"+
		"\2\2M\u0158\3\2\2\2O\u015a\3\2\2\2Q\u015c\3\2\2\2S\u015e\3\2\2\2U\u0160"+
		"\3\2\2\2W\u0168\3\2\2\2Y`\5!\21\2Z`\5#\22\2[`\5%\23\2\\`\5\'\24\2]`\5"+
		")\25\2^`\5+\26\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^"+
		"\3\2\2\2`\4\3\2\2\2ad\5/\30\2bd\5\61\31\2ca\3\2\2\2cb\3\2\2\2d\6\3\2\2"+
		"\2ef\7\62\2\2fh\t\2\2\2gi\5\r\7\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2km\3\2\2\2ln\5\17\b\2ml\3\2\2\2mn\3\2\2\2n\b\3\2\2\2ox\7\62\2\2pt"+
		"\4\63;\2qs\4\62;\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2wo\3\2\2\2wp\3\2\2\2xz\3\2\2\2y{\5\17\b\2zy\3\2\2\2z{\3\2\2\2"+
		"{\n\3\2\2\2|~\7\62\2\2}\177\4\629\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\17\b\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\f\3\2\2\2\u0085\u0086\t"+
		"\3\2\2\u0086\16\3\2\2\2\u0087\u0088\t\4\2\2\u0088\20\3\2\2\2\u0089\u008b"+
		"\4\62;\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\7\60\2\2\u008f\u0091\4"+
		"\62;\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\5\23"+
		"\n\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u009a\5\25\13\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00d8\3"+
		"\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\4\62;\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u00a3\5\23\n\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\5\25\13\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00d8\3\2\2\2\u00a7\u00a9\4\62;\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\5\23\n\2\u00ad\u00af\5\25\13\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00d8\3\2\2\2\u00b0\u00b2\4\62;\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00d8\5\25\13\2\u00b6\u00b7\7\62\2\2\u00b7\u00bb"+
		"\7z\2\2\u00b8\u00b9\7\62\2\2\u00b9\u00bb\7Z\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00be\5\r\7\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c9\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c6\7\60\2\2\u00c3\u00c5\5"+
		"\r\7\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c2\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\t\5\2\2\u00cc"+
		"\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00d1\4\62;\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5\25"+
		"\13\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u008a\3\2\2\2\u00d7\u009b\3\2\2\2\u00d7\u00a8\3\2\2\2\u00d7\u00b1\3\2"+
		"\2\2\u00d7\u00ba\3\2\2\2\u00d8\22\3\2\2\2\u00d9\u00db\t\7\2\2\u00da\u00dc"+
		"\t\6\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00df\4\62;\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\24\3\2\2\2\u00e2\u00e3\t\b\2\2\u00e3\26"+
		"\3\2\2\2\u00e4\u00e7\7)\2\2\u00e5\u00e8\5\33\16\2\u00e6\u00e8\n\t\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\7)\2\2\u00ea\30\3\2\2\2\u00eb\u00f0\7$\2\2\u00ec\u00ef\5\33\16\2\u00ed"+
		"\u00ef\n\n\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\32\3\2\2\2\u00f5\u00f6\7^\2\2"+
		"\u00f6\u00fa\t\13\2\2\u00f7\u00fa\5\37\20\2\u00f8\u00fa\5\35\17\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\34\3\2\2"+
		"\2\u00fb\u00fc\7^\2\2\u00fc\u00fd\4\62\65\2\u00fd\u00fe\4\629\2\u00fe"+
		"\u0105\4\629\2\u00ff\u0100\7^\2\2\u0100\u0101\4\629\2\u0101\u0105\4\62"+
		"9\2\u0102\u0103\7^\2\2\u0103\u0105\4\629\2\u0104\u00fb\3\2\2\2\u0104\u00ff"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\36\3\2\2\2\u0106\u0107\7^\2\2\u0107"+
		"\u0108\7w\2\2\u0108\u0109\5\r\7\2\u0109\u010a\5\r\7\2\u010a\u010b\5\r"+
		"\7\2\u010b\u010c\5\r\7\2\u010c \3\2\2\2\u010d\u010e\7?\2\2\u010e\"\3\2"+
		"\2\2\u010f\u0110\7@\2\2\u0110$\3\2\2\2\u0111\u0112\7>\2\2\u0112&\3\2\2"+
		"\2\u0113\u0114\7@\2\2\u0114\u0115\7?\2\2\u0115(\3\2\2\2\u0116\u0117\7"+
		">\2\2\u0117\u0118\7?\2\2\u0118*\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b"+
		"\7?\2\2\u011b,\3\2\2\2\u011c\u011d\7p\2\2\u011d\u011e\7q\2\2\u011e\u011f"+
		"\7v\2\2\u011f.\3\2\2\2\u0120\u0121\7c\2\2\u0121\u0122\7p\2\2\u0122\u0123"+
		"\7f\2\2\u0123\60\3\2\2\2\u0124\u0125\7q\2\2\u0125\u0126\7t\2\2\u0126\62"+
		"\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129\7g\2\2\u0129\u012a\7n\2\2\u012a"+
		"\u012b\7g\2\2\u012b\u012c\7e\2\2\u012c\u012d\7v\2\2\u012d\64\3\2\2\2\u012e"+
		"\u012f\7.\2\2\u012f\66\3\2\2\2\u0130\u0131\7h\2\2\u0131\u0132\7t\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0134\7o\2\2\u01348\3\2\2\2\u0135\u0136\7y\2\2\u0136"+
		"\u0137\7j\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2"+
		"\u013a:\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d<\3\2\2\2\u013e"+
		"\u013f\7*\2\2\u013f>\3\2\2\2\u0140\u0141\7+\2\2\u0141@\3\2\2\2\u0142\u0143"+
		"\7\60\2\2\u0143B\3\2\2\2\u0144\u0145\7]\2\2\u0145D\3\2\2\2\u0146\u0147"+
		"\7_\2\2\u0147F\3\2\2\2\u0148\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a\u014b"+
		"\7w\2\2\u014b\u014c\7g\2\2\u014cH\3\2\2\2\u014d\u014e\7h\2\2\u014e\u014f"+
		"\7c\2\2\u014f\u0150\7n\2\2\u0150\u0151\7u\2\2\u0151\u0152\7g\2\2\u0152"+
		"J\3\2\2\2\u0153\u0154\7p\2\2\u0154\u0155\7w\2\2\u0155\u0156\7n\2\2\u0156"+
		"\u0157\7n\2\2\u0157L\3\2\2\2\u0158\u0159\7,\2\2\u0159N\3\2\2\2\u015a\u015b"+
		"\7\61\2\2\u015bP\3\2\2\2\u015c\u015d\7-\2\2\u015dR\3\2\2\2\u015e\u015f"+
		"\7/\2\2\u015fT\3\2\2\2\u0160\u0164\t\f\2\2\u0161\u0163\t\r\2\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"V\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\t\16\2\2\u0168\u0167\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\b,\2\2\u016dX\3\2\2\2\'\2_cjmtwz\u0080\u0083\u008c"+
		"\u0092\u0096\u0099\u009f\u00a2\u00a5\u00aa\u00ae\u00b3\u00ba\u00bf\u00c6"+
		"\u00c9\u00cd\u00d2\u00d5\u00d7\u00db\u00e0\u00e7\u00ee\u00f0\u00f9\u0104"+
		"\u0164\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}