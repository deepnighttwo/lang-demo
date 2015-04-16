// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otl\OTL.g4 by ANTLR 4.5
package com.deepnighttwo.otl.grammar.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OTLParser extends Parser {
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
	public static final int
		RULE_ql = 0, RULE_select = 1, RULE_from = 2, RULE_where = 3, RULE_propsSel = 4, 
		RULE_propVar = 5, RULE_propFullName = 6, RULE_propName = 7, RULE_boolExprs = 8, 
		RULE_boolExpr = 9, RULE_literal = 10, RULE_integerLiteral = 11, RULE_numberLiteral = 12, 
		RULE_booleanLiteral = 13;
	public static final String[] ruleNames = {
		"ql", "select", "from", "where", "propsSel", "propVar", "propFullName", 
		"propName", "boolExprs", "boolExpr", "literal", "integerLiteral", "numberLiteral", 
		"booleanLiteral"
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

	@Override
	public String getGrammarFileName() { return "OTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OTLParser(TokenStream input) {
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
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterQl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitQl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitQl(this);
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
			setState(28); 
			select();
			setState(29); 
			from();
			setState(31);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(30); 
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
		public TerminalNode SELECT() { return getToken(OTLParser.SELECT, 0); }
		public List<PropsSelContext> propsSel() {
			return getRuleContexts(PropsSelContext.class);
		}
		public PropsSelContext propsSel(int i) {
			return getRuleContext(PropsSelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OTLParser.COMMA, i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitSelect(this);
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
			setState(33); 
			match(SELECT);
			setState(34); 
			propsSel();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(35); 
				match(COMMA);
				setState(36); 
				propsSel();
				}
				}
				setState(41);
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
		public TerminalNode FROM() { return getToken(OTLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(OTLParser.ID, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			match(FROM);
			setState(43); 
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
		public TerminalNode WHERE() { return getToken(OTLParser.WHERE, 0); }
		public BoolExprsContext boolExprs() {
			return getRuleContext(BoolExprsContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			match(WHERE);
			setState(46); 
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
		public TerminalNode AS() { return getToken(OTLParser.AS, 0); }
		public TerminalNode ID() { return getToken(OTLParser.ID, 0); }
		public PropsSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterPropsSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitPropsSel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitPropsSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsSelContext propsSel() throws RecognitionException {
		PropsSelContext _localctx = new PropsSelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propsSel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			propVar(0);
			setState(51);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(49); 
				match(AS);
				setState(50); 
				match(ID);
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

	public static class PropVarContext extends ParserRuleContext {
		public PropVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propVar; }
	 
		public PropVarContext() { }
		public void copyFrom(PropVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatVarContext extends PropVarContext {
		public TerminalNode FloatingPointLiteral() { return getToken(OTLParser.FloatingPointLiteral, 0); }
		public FloatVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterFloatVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitFloatVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitFloatVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullVarContext extends PropVarContext {
		public TerminalNode NULL() { return getToken(OTLParser.NULL, 0); }
		public NullVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterNullVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitNullVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitNullVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharVarContext extends PropVarContext {
		public TerminalNode CharacterLiteral() { return getToken(OTLParser.CharacterLiteral, 0); }
		public CharVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterCharVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitCharVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitCharVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncVarContext extends PropVarContext {
		public TerminalNode ID() { return getToken(OTLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(OTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OTLParser.RPAREN, 0); }
		public List<PropFullNameContext> propFullName() {
			return getRuleContexts(PropFullNameContext.class);
		}
		public PropFullNameContext propFullName(int i) {
			return getRuleContext(PropFullNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OTLParser.COMMA, i);
		}
		public FuncVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterFuncVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitFuncVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitFuncVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends PropVarContext {
		public Token op;
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public TerminalNode MUL() { return getToken(OTLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(OTLParser.DIV, 0); }
		public MulDivContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends PropVarContext {
		public Token op;
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public TerminalNode ADD() { return getToken(OTLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(OTLParser.SUB, 0); }
		public AddSubContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends PropVarContext {
		public TerminalNode LPAREN() { return getToken(OTLParser.LPAREN, 0); }
		public PropVarContext propVar() {
			return getRuleContext(PropVarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OTLParser.RPAREN, 0); }
		public ParensContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectPropVarContext extends PropVarContext {
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public DirectPropVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterDirectPropVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitDirectPropVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitDirectPropVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVarContext extends PropVarContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public IntVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterIntVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitIntVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitIntVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVarContext extends PropVarContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterBooleanVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitBooleanVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitBooleanVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVarContext extends PropVarContext {
		public TerminalNode StringLiteral() { return getToken(OTLParser.StringLiteral, 0); }
		public StringVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterStringVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitStringVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitStringVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropVarContext propVar() throws RecognitionException {
		return propVar(0);
	}

	private PropVarContext propVar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropVarContext _localctx = new PropVarContext(_ctx, _parentState);
		PropVarContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_propVar, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new DirectPropVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54); 
				propFullName();
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); 
				match(LPAREN);
				setState(56); 
				propVar(0);
				setState(57); 
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new IntVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); 
				integerLiteral();
				}
				break;
			case 4:
				{
				_localctx = new FloatVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); 
				match(FloatingPointLiteral);
				}
				break;
			case 5:
				{
				_localctx = new CharVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61); 
				match(CharacterLiteral);
				}
				break;
			case 6:
				{
				_localctx = new StringVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62); 
				match(StringLiteral);
				}
				break;
			case 7:
				{
				_localctx = new BooleanVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); 
				booleanLiteral();
				}
				break;
			case 8:
				{
				_localctx = new NullVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64); 
				match(NULL);
				}
				break;
			case 9:
				{
				_localctx = new FuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65); 
				match(ID);
				setState(66); 
				match(LPAREN);
				setState(68);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(67); 
					propFullName();
					}
				}

				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(70); 
					match(COMMA);
					setState(71); 
					propFullName();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new PropVarContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propVar);
						setState(80);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(81);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(82); 
						propVar(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new PropVarContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propVar);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(84);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(85); 
						propVar(9);
						}
						break;
					}
					} 
				}
				setState(90);
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

	public static class PropFullNameContext extends ParserRuleContext {
		public List<PropNameContext> propName() {
			return getRuleContexts(PropNameContext.class);
		}
		public PropNameContext propName(int i) {
			return getRuleContext(PropNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OTLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OTLParser.DOT, i);
		}
		public PropFullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propFullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterPropFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitPropFullName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitPropFullName(this);
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
			setState(91); 
			propName();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92); 
					match(DOT);
					setState(93); 
					propName();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TerminalNode ID() { return getToken(OTLParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(OTLParser.LBRACK, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(OTLParser.RBRACK, 0); }
		public ArrayPropContext(PropNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterArrayProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitArrayProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitArrayProp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropContext extends PropNameContext {
		public TerminalNode ID() { return getToken(OTLParser.ID, 0); }
		public PropContext(PropNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propName);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99); 
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayPropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100); 
				match(ID);
				setState(101); 
				match(LBRACK);
				setState(102); 
				integerLiteral();
				setState(103); 
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
		public List<TerminalNode> BoolOprt() { return getTokens(OTLParser.BoolOprt); }
		public TerminalNode BoolOprt(int i) {
			return getToken(OTLParser.BoolOprt, i);
		}
		public BoolExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterBoolExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitBoolExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitBoolExprs(this);
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
			setState(107); 
			boolExpr(0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BoolOprt) {
				{
				{
				setState(108); 
				match(BoolOprt);
				setState(109); 
				boolExpr(0);
				}
				}
				setState(114);
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
		public TerminalNode NOT() { return getToken(OTLParser.NOT, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public TerminalNode CompareOprt() { return getToken(OTLParser.CompareOprt, 0); }
		public TerminalNode LPAREN() { return getToken(OTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OTLParser.RPAREN, 0); }
		public TerminalNode BoolOprt() { return getToken(OTLParser.BoolOprt, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitBoolExpr(this);
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
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(116); 
				match(NOT);
				setState(117); 
				boolExpr(3);
				}
				break;
			case 2:
				{
				setState(118); 
				propVar(0);
				setState(119); 
				match(CompareOprt);
				setState(120); 
				propVar(0);
				}
				break;
			case 3:
				{
				setState(122); 
				match(LPAREN);
				setState(123); 
				boolExpr(0);
				setState(124); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(129); 
					match(BoolOprt);
					setState(130); 
					boolExpr(2);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(OTLParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(OTLParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(OTLParser.StringLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode NULL() { return getToken(OTLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); 
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); 
				match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(138); 
				match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); 
				match(StringLiteral);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); 
				booleanLiteral();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); 
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(OTLParser.HexLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(OTLParser.OctalLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(OTLParser.DecimalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral))) != 0)) ) {
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(OTLParser.FloatingPointLiteral, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numberLiteral);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); 
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); 
				match(FloatingPointLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(OTLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OTLParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		case 5: 
			return propVar_sempred((PropVarContext)_localctx, predIndex);
		case 9: 
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean propVar_sempred(PropVarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 9);
		case 1: 
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\5\2\"\n\2\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5"+
		"\6\66\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7G\n\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\5\7Q\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13"+
		"\3\13\3\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0091\n\f\3\r\3\r\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17"+
		"\2\4\f\24\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\3\2!\"\3\2#$\3\2"+
		"\5\7\3\2\36\37\u00a7\2\36\3\2\2\2\4#\3\2\2\2\6,\3\2\2\2\b/\3\2\2\2\n\62"+
		"\3\2\2\2\fP\3\2\2\2\16]\3\2\2\2\20k\3\2\2\2\22m\3\2\2\2\24\u0080\3\2\2"+
		"\2\26\u0090\3\2\2\2\30\u0092\3\2\2\2\32\u0096\3\2\2\2\34\u0098\3\2\2\2"+
		"\36\37\5\4\3\2\37!\5\6\4\2 \"\5\b\5\2! \3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2"+
		"#$\7\24\2\2$)\5\n\6\2%&\7\25\2\2&(\5\n\6\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2"+
		"\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\7\26\2\2-.\7%\2\2.\7\3\2\2\2/\60"+
		"\7\27\2\2\60\61\5\22\n\2\61\t\3\2\2\2\62\65\5\f\7\2\63\64\7\30\2\2\64"+
		"\66\7%\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2\678\b\7\1\28Q\5\16"+
		"\b\29:\7\31\2\2:;\5\f\7\2;<\7\32\2\2<Q\3\2\2\2=Q\5\30\r\2>Q\7\b\2\2?Q"+
		"\7\t\2\2@Q\7\n\2\2AQ\5\34\17\2BQ\7 \2\2CD\7%\2\2DF\7\31\2\2EG\5\16\b\2"+
		"FE\3\2\2\2FG\3\2\2\2GL\3\2\2\2HI\7\25\2\2IK\5\16\b\2JH\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OQ\7\32\2\2P\67\3\2\2\2P9\3"+
		"\2\2\2P=\3\2\2\2P>\3\2\2\2P?\3\2\2\2P@\3\2\2\2PA\3\2\2\2PB\3\2\2\2PC\3"+
		"\2\2\2QZ\3\2\2\2RS\f\13\2\2ST\t\2\2\2TY\5\f\7\fUV\f\n\2\2VW\t\3\2\2WY"+
		"\5\f\7\13XR\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\r\3\2\2"+
		"\2\\Z\3\2\2\2]b\5\20\t\2^_\7\33\2\2_a\5\20\t\2`^\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2el\7%\2\2fg\7%\2\2gh\7\34\2\2hi"+
		"\5\30\r\2ij\7\35\2\2jl\3\2\2\2ke\3\2\2\2kf\3\2\2\2l\21\3\2\2\2mr\5\24"+
		"\13\2no\7\4\2\2oq\5\24\13\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23"+
		"\3\2\2\2tr\3\2\2\2uv\b\13\1\2vw\7\21\2\2w\u0081\5\24\13\5xy\5\f\7\2yz"+
		"\7\3\2\2z{\5\f\7\2{\u0081\3\2\2\2|}\7\31\2\2}~\5\24\13\2~\177\7\32\2\2"+
		"\177\u0081\3\2\2\2\u0080u\3\2\2\2\u0080x\3\2\2\2\u0080|\3\2\2\2\u0081"+
		"\u0087\3\2\2\2\u0082\u0083\f\3\2\2\u0083\u0084\7\4\2\2\u0084\u0086\5\24"+
		"\13\4\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0091\5\30\r"+
		"\2\u008b\u0091\7\b\2\2\u008c\u0091\7\t\2\2\u008d\u0091\7\n\2\2\u008e\u0091"+
		"\5\34\17\2\u008f\u0091\7 \2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2"+
		"\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093\t\4\2\2\u0093\31\3\2\2\2\u0094\u0097"+
		"\5\30\r\2\u0095\u0097\7\b\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\33\3\2\2\2\u0098\u0099\t\5\2\2\u0099\35\3\2\2\2\21!)\65FLPXZbk"+
		"r\u0080\u0087\u0090\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}