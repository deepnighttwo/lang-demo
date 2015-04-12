// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTFQLGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OTFQLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CompareOprt=1, BoolOprt=2, EQUALS=3, BIGGER=4, SMALLER=5, BIGGEROREQ=6, 
		SMALLEROREQ=7, NOTEQUAL=8, NOT=9, AND=10, OR=11, SELECT=12, COMMA=13, 
		FROM=14, WHERE=15, AS=16, LPAREN=17, RPAREN=18, DOT=19, LBRACK=20, RBRACK=21, 
		INT=22, LiteralVar=23, ID=24, WS=25;
	public static final int
		RULE_ql = 0, RULE_select = 1, RULE_from = 2, RULE_where = 3, RULE_propsSel = 4, 
		RULE_propVar = 5, RULE_propFullName = 6, RULE_propName = 7, RULE_boolExprs = 8, 
		RULE_boolExpr = 9, RULE_t = 10, RULE_ttt = 11;
	public static final String[] ruleNames = {
		"ql", "select", "from", "where", "propsSel", "propVar", "propFullName", 
		"propName", "boolExprs", "boolExpr", "t", "ttt"
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
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterQl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitQl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitQl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QlContext ql() throws RecognitionException {
		QlContext _localctx = new QlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			select();
			setState(25); 
			from();
			setState(27);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(26); 
				where();
				}
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OTFQLGrammarParser.SELECT, 0); }
		public List<PropsSelContext> propsSel() {
			return getRuleContexts(PropsSelContext.class);
		}
		public PropsSelContext propsSel(int i) {
			return getRuleContext(PropsSelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OTFQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OTFQLGrammarParser.COMMA, i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitSelect(this);
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
			setState(29); 
			match(SELECT);
			setState(30); 
			propsSel();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(31); 
				match(COMMA);
				setState(32); 
				propsSel();
				}
				}
				setState(37);
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
		public TerminalNode FROM() { return getToken(OTFQLGrammarParser.FROM, 0); }
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			match(FROM);
			setState(39); 
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
		public TerminalNode WHERE() { return getToken(OTFQLGrammarParser.WHERE, 0); }
		public BoolExprsContext boolExprs() {
			return getRuleContext(BoolExprsContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			match(WHERE);
			setState(42); 
			boolExprs();
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
		public PropVarContext propVar() {
			return getRuleContext(PropVarContext.class,0);
		}
		public TerminalNode AS() { return getToken(OTFQLGrammarParser.AS, 0); }
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public PropsSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterPropsSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitPropsSel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitPropsSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsSelContext propsSel() throws RecognitionException {
		PropsSelContext _localctx = new PropsSelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propsSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			propVar();
			setState(45); 
			match(AS);
			setState(46); 
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

	public static class PropVarContext extends ParserRuleContext {
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(OTFQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OTFQLGrammarParser.RPAREN, 0); }
		public PropVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterPropVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitPropVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitPropVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropVarContext propVar() throws RecognitionException {
		PropVarContext _localctx = new PropVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propVar);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); 
				propFullName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); 
				match(ID);
				setState(50); 
				match(LPAREN);
				setState(51); 
				propFullName();
				setState(52); 
				match(RPAREN);
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

	public static class PropFullNameContext extends ParserRuleContext {
		public List<PropNameContext> propName() {
			return getRuleContexts(PropNameContext.class);
		}
		public PropNameContext propName(int i) {
			return getRuleContext(PropNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OTFQLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OTFQLGrammarParser.DOT, i);
		}
		public PropFullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propFullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterPropFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitPropFullName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitPropFullName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropFullNameContext propFullName() throws RecognitionException {
		PropFullNameContext _localctx = new PropFullNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propFullName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			propName();
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); 
					match(DOT);
					setState(58); 
					propName();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
	 
		public PropNameContext() { }
		public void copyFrom(PropNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayPropContext extends PropNameContext {
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(OTFQLGrammarParser.LBRACK, 0); }
		public TerminalNode INT() { return getToken(OTFQLGrammarParser.INT, 0); }
		public TerminalNode RBRACK() { return getToken(OTFQLGrammarParser.RBRACK, 0); }
		public ArrayPropContext(PropNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterArrayProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitArrayProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitArrayProp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropContext extends PropNameContext {
		public TerminalNode ID() { return getToken(OTFQLGrammarParser.ID, 0); }
		public PropContext(PropNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propName);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64); 
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayPropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65); 
				match(ID);
				setState(66); 
				match(LBRACK);
				setState(67); 
				match(INT);
				setState(68); 
				match(RBRACK);
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

	public static class BoolExprsContext extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<TerminalNode> BoolOprt() { return getTokens(OTFQLGrammarParser.BoolOprt); }
		public TerminalNode BoolOprt(int i) {
			return getToken(OTFQLGrammarParser.BoolOprt, i);
		}
		public BoolExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterBoolExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitBoolExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitBoolExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprsContext boolExprs() throws RecognitionException {
		BoolExprsContext _localctx = new BoolExprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			boolExpr(0);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BoolOprt) {
				{
				{
				setState(72); 
				match(BoolOprt);
				setState(73); 
				boolExpr(0);
				}
				}
				setState(78);
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
		public List<TerminalNode> LiteralVar() { return getTokens(OTFQLGrammarParser.LiteralVar); }
		public TerminalNode LiteralVar(int i) {
			return getToken(OTFQLGrammarParser.LiteralVar, i);
		}
		public TerminalNode BoolOprt() { return getToken(OTFQLGrammarParser.BoolOprt, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitBoolExpr(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(80); 
				match(NOT);
				setState(81); 
				boolExpr(3);
				}
				break;
			case 2:
				{
				setState(82); 
				propFullName();
				setState(83); 
				match(CompareOprt);
				setState(84); 
				propFullName();
				}
				break;
			case 3:
				{
				setState(86); 
				match(LiteralVar);
				setState(87); 
				match(CompareOprt);
				setState(88); 
				propFullName();
				}
				break;
			case 4:
				{
				setState(89); 
				propFullName();
				setState(90); 
				match(CompareOprt);
				setState(91); 
				match(LiteralVar);
				}
				break;
			case 5:
				{
				setState(93); 
				match(LiteralVar);
				setState(94); 
				match(CompareOprt);
				setState(95); 
				match(LiteralVar);
				}
				break;
			case 6:
				{
				setState(96); 
				match(LPAREN);
				setState(97); 
				boolExpr(0);
				setState(98); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103); 
					match(BoolOprt);
					setState(104); 
					boolExpr(2);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode LiteralVar() { return getToken(OTFQLGrammarParser.LiteralVar, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			match(LiteralVar);
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

	public static class TttContext extends ParserRuleContext {
		public TerminalNode LiteralVar() { return getToken(OTFQLGrammarParser.LiteralVar, 0); }
		public TttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).enterTtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTFQLGrammarListener ) ((OTFQLGrammarListener)listener).exitTtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTFQLGrammarVisitor ) return ((OTFQLGrammarVisitor<? extends T>)visitor).visitTtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TttContext ttt() throws RecognitionException {
		TttContext _localctx = new TttContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ttt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			match(LiteralVar);
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
		case 9: 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16"+
		"\3\'\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\79\n\7\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\tH\n\t\3\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13g\n\13\3\13\3\13\3\13\7\13l\n\13\f\13\16\13o\13\13\3\f"+
		"\3\f\3\r\3\r\3\r\2\3\24\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2t\2\32\3\2"+
		"\2\2\4\37\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n.\3\2\2\2\f8\3\2\2\2\16:\3\2"+
		"\2\2\20G\3\2\2\2\22I\3\2\2\2\24f\3\2\2\2\26p\3\2\2\2\30r\3\2\2\2\32\33"+
		"\5\4\3\2\33\35\5\6\4\2\34\36\5\b\5\2\35\34\3\2\2\2\35\36\3\2\2\2\36\3"+
		"\3\2\2\2\37 \7\16\2\2 %\5\n\6\2!\"\7\17\2\2\"$\5\n\6\2#!\3\2\2\2$\'\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2()\7\20\2\2)*\7\32\2\2"+
		"*\7\3\2\2\2+,\7\21\2\2,-\5\22\n\2-\t\3\2\2\2./\5\f\7\2/\60\7\22\2\2\60"+
		"\61\7\32\2\2\61\13\3\2\2\2\629\5\16\b\2\63\64\7\32\2\2\64\65\7\23\2\2"+
		"\65\66\5\16\b\2\66\67\7\24\2\2\679\3\2\2\28\62\3\2\2\28\63\3\2\2\29\r"+
		"\3\2\2\2:?\5\20\t\2;<\7\25\2\2<>\5\20\t\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@\17\3\2\2\2A?\3\2\2\2BH\7\32\2\2CD\7\32\2\2DE\7\26\2\2EF"+
		"\7\30\2\2FH\7\27\2\2GB\3\2\2\2GC\3\2\2\2H\21\3\2\2\2IN\5\24\13\2JK\7\4"+
		"\2\2KM\5\24\13\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\23\3\2\2\2P"+
		"N\3\2\2\2QR\b\13\1\2RS\7\13\2\2Sg\5\24\13\5TU\5\16\b\2UV\7\3\2\2VW\5\16"+
		"\b\2Wg\3\2\2\2XY\7\31\2\2YZ\7\3\2\2Zg\5\16\b\2[\\\5\16\b\2\\]\7\3\2\2"+
		"]^\7\31\2\2^g\3\2\2\2_`\7\31\2\2`a\7\3\2\2ag\7\31\2\2bc\7\23\2\2cd\5\24"+
		"\13\2de\7\24\2\2eg\3\2\2\2fQ\3\2\2\2fT\3\2\2\2fX\3\2\2\2f[\3\2\2\2f_\3"+
		"\2\2\2fb\3\2\2\2gm\3\2\2\2hi\f\3\2\2ij\7\4\2\2jl\5\24\13\4kh\3\2\2\2l"+
		"o\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\25\3\2\2\2om\3\2\2\2pq\7\31\2\2q\27\3\2"+
		"\2\2rs\7\31\2\2s\31\3\2\2\2\n\35%8?GNfm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}