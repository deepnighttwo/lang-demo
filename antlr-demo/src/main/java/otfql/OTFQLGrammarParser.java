package otfql;// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTFQLGrammar.g4 by ANTLR 4.5

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OTFQLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, INT=13, CompareOprt=14, EQUALS=15, BIGGER=16, 
		SMALLER=17, BIGGEROREQ=18, SMALLEROREQ=19, NOTEQUAL=20, NOT=21, AND=22, 
		OR=23, WS=24;
	public static final int
		RULE_ql = 0, RULE_select = 1, RULE_from = 2, RULE_where = 3, RULE_propsSel = 4, 
		RULE_propFullName = 5, RULE_propName = 6, RULE_test = 7, RULE_literalStr = 8, 
		RULE_boolExprs = 9, RULE_boolExpr = 10, RULE_tttt = 11, RULE_boolOprt = 12;
	public static final String[] ruleNames = {
		"ql", "select", "from", "where", "propsSel", "propFullName", "propName", 
		"test", "literalStr", "boolExprs", "boolExpr", "tttt", "boolOprt"
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

	@Override
	public String getGrammarFileName() { return "OTFQLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OTFQLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QlContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public QlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterQl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitQl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitQl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QlContext ql() throws RecognitionException {
		QlContext _localctx = new QlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			select();
			setState(27); 
			from();
			setState(28); 
			where();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public List<PropsSelContext> propsSel() {
			return getRuleContexts(PropsSelContext.class);
		}
		public PropsSelContext propsSel(int i) {
			return getRuleContext(PropsSelContext.class,i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			match(T__0);
			setState(31); 
			propsSel();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32); 
				match(T__1);
				setState(33); 
				propsSel();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			match(T__2);
			setState(40); 
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			match(T__3);
			setState(43); 
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropsSelContext extends ParserRuleContext {
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public PropsSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterPropsSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitPropsSel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitPropsSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsSelContext propsSel() throws RecognitionException {
		PropsSelContext _localctx = new PropsSelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propsSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			propFullName();
			setState(46); 
			match(T__4);
			setState(47); 
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropFullNameContext extends ParserRuleContext {
		public List<PropNameContext> propName() {
			return getRuleContexts(PropNameContext.class);
		}
		public PropNameContext propName(int i) {
			return getRuleContext(PropNameContext.class,i);
		}
		public PropFullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propFullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterPropFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitPropFullName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitPropFullName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropFullNameContext propFullName() throws RecognitionException {
		PropFullNameContext _localctx = new PropFullNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propFullName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			propName();
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					match(T__5);
					setState(51);
					propName();
					}
					}
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public TerminalNode INT() { return getToken(OTFQLGrammarParser.INT, 0); }
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterPropName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitPropName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitPropName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propName);
		int _la;
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					match(T__6);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(64);
				match(INT);
				setState(65);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralStrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public LiteralStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterLiteralStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitLiteralStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitLiteralStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralStrContext literalStr() throws RecognitionException {
		LiteralStrContext _localctx = new LiteralStrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literalStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__8);
			setState(71);
			match(ID);
			setState(72);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprsContext extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolOprtContext> boolOprt() {
			return getRuleContexts(BoolOprtContext.class);
		}
		public BoolOprtContext boolOprt(int i) {
			return getRuleContext(BoolOprtContext.class,i);
		}
		public BoolExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterBoolExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitBoolExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitBoolExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprsContext boolExprs() throws RecognitionException {
		BoolExprsContext _localctx = new BoolExprsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			boolExpr(0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(75);
				boolOprt();
				setState(76);
				boolExpr(0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(OTFQLGrammarParser.NOT, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<PropFullNameContext> propFullName() {
			return getRuleContexts(PropFullNameContext.class);
		}
		public PropFullNameContext propFullName(int i) {
			return getRuleContext(PropFullNameContext.class,i);
		}
		public TerminalNode CompareOprt() { return getToken(OTFQLGrammarParser.CompareOprt, 0); }
		public List<LiteralStrContext> literalStr() {
			return getRuleContexts(LiteralStrContext.class);
		}
		public LiteralStrContext literalStr(int i) {
			return getRuleContext(LiteralStrContext.class,i);
		}
		public BoolOprtContext boolOprt() {
			return getRuleContext(BoolOprtContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(84);
				match(NOT);
				setState(85);
				boolExpr(3);
				}
				break;
			case 2:
				{
				setState(86);
				propFullName();
				setState(87);
				match(CompareOprt);
				setState(88);
				propFullName();
				}
				break;
			case 3:
				{
				setState(90);
				literalStr();
				setState(91);
				match(CompareOprt);
				setState(92);
				propFullName();
				}
				break;
			case 4:
				{
				setState(94);
				propFullName();
				setState(95);
				match(CompareOprt);
				setState(96);
				literalStr();
				}
				break;
			case 5:
				{
				setState(98);
				literalStr();
				setState(99);
				match(CompareOprt);
				setState(100);
				literalStr();
				}
				break;
			case 6:
				{
				setState(102);
				match(T__9);
				setState(103);
				boolExpr(0);
				setState(104);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(108);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(109); 
					boolOprt();
					setState(110); 
					boolExpr(2);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TtttContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OTFQLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OTFQLGrammarParser.ID, i);
		}
		public BoolOprtContext boolOprt() {
			return getRuleContext(BoolOprtContext.class,0);
		}
		public TtttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tttt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterTttt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitTttt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitTttt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtttContext tttt() throws RecognitionException {
		TtttContext _localctx = new TtttContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tttt);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); 
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); 
				match(ID);
				setState(119); 
				boolOprt();
				setState(120); 
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOprtContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(OTFQLGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(OTFQLGrammarParser.OR, 0); }
		public BoolOprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOprt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).enterBoolOprt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener) ((OTFQLGrammarListener)listener).exitBoolOprt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitBoolOprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOprtContext boolOprt() throws RecognitionException {
		BoolOprtContext _localctx = new BoolOprtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolOprt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: 
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3%\n"+
		"\3\f\3\16\3(\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\7\7\67\n\7\f\7\16\7:\13\7\3\b\3\b\3\b\6\b?\n\b\r\b\16\b@\3\b\3\b\5\b"+
		"E\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13Q\n\13\f\13\16\13"+
		"T\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\f\3\f\3\f\3\f\7\fs\n\f\f\f\16"+
		"\fv\13\f\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\2\3\26\17\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\2\3\3\2\30\31\177\2\34\3\2\2\2\4 \3\2\2\2\6"+
		")\3\2\2\2\b,\3\2\2\2\n/\3\2\2\2\f\63\3\2\2\2\16D\3\2\2\2\20F\3\2\2\2\22"+
		"H\3\2\2\2\24L\3\2\2\2\26l\3\2\2\2\30|\3\2\2\2\32~\3\2\2\2\34\35\5\4\3"+
		"\2\35\36\5\6\4\2\36\37\5\b\5\2\37\3\3\2\2\2 !\7\3\2\2!&\5\n\6\2\"#\7\4"+
		"\2\2#%\5\n\6\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2("+
		"&\3\2\2\2)*\7\5\2\2*+\7\16\2\2+\7\3\2\2\2,-\7\6\2\2-.\5\26\f\2.\t\3\2"+
		"\2\2/\60\5\f\7\2\60\61\7\7\2\2\61\62\7\16\2\2\62\13\3\2\2\2\638\5\16\b"+
		"\2\64\65\7\b\2\2\65\67\5\16\b\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29\r\3\2\2\2:8\3\2\2\2;E\7\16\2\2<>\7\16\2\2=?\7\t\2\2>=\3\2"+
		"\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\17\2\2CE\7\n\2\2D;\3"+
		"\2\2\2D<\3\2\2\2E\17\3\2\2\2FG\7\16\2\2G\21\3\2\2\2HI\7\13\2\2IJ\7\16"+
		"\2\2JK\7\13\2\2K\23\3\2\2\2LR\5\26\f\2MN\5\32\16\2NO\5\26\f\2OQ\3\2\2"+
		"\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\25\3\2\2\2TR\3\2\2\2UV\b\f"+
		"\1\2VW\7\27\2\2Wm\5\26\f\5XY\5\f\7\2YZ\7\20\2\2Z[\5\f\7\2[m\3\2\2\2\\"+
		"]\5\22\n\2]^\7\20\2\2^_\5\f\7\2_m\3\2\2\2`a\5\f\7\2ab\7\20\2\2bc\5\22"+
		"\n\2cm\3\2\2\2de\5\22\n\2ef\7\20\2\2fg\5\22\n\2gm\3\2\2\2hi\7\f\2\2ij"+
		"\5\26\f\2jk\7\r\2\2km\3\2\2\2lU\3\2\2\2lX\3\2\2\2l\\\3\2\2\2l`\3\2\2\2"+
		"ld\3\2\2\2lh\3\2\2\2mt\3\2\2\2no\f\3\2\2op\5\32\16\2pq\5\26\f\4qs\3\2"+
		"\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vt\3\2\2\2w}\7"+
		"\16\2\2xy\7\16\2\2yz\5\32\16\2z{\7\16\2\2{}\3\2\2\2|w\3\2\2\2|x\3\2\2"+
		"\2}\31\3\2\2\2~\177\t\2\2\2\177\33\3\2\2\2\n&8@DRlt|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}