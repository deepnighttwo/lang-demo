// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTL.g4 by ANTLR 4.5
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
		RULE_ql = 0, RULE_select = 1, RULE_from = 2, RULE_where = 3, RULE_numExpr = 4, 
		RULE_propsSel = 5, RULE_propVar = 6, RULE_propFullName = 7, RULE_propName = 8, 
		RULE_boolExprs = 9, RULE_boolExpr = 10, RULE_literal = 11, RULE_integerLiteral = 12, 
		RULE_numberLiteral = 13, RULE_booleanLiteral = 14;
	public static final String[] ruleNames = {
		"ql", "select", "from", "where", "numExpr", "propsSel", "propVar", "propFullName", 
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
			setState(30); 
			select();
			setState(31); 
			from();
			setState(33);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(32); 
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
			setState(35); 
			match(SELECT);
			setState(36); 
			propsSel();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(37); 
				match(COMMA);
				setState(38); 
				propsSel();
				}
				}
				setState(43);
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
			setState(44); 
			match(FROM);
			setState(45); 
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
			setState(47); 
			match(WHERE);
			setState(48); 
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

	public static class NumExprContext extends ParserRuleContext {
		public NumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpr; }
	 
		public NumExprContext() { }
		public void copyFrom(NumExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarPropContext extends NumExprContext {
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public VarPropContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterVarProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitVarProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitVarProp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends NumExprContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public NumberContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends NumExprContext {
		public Token op;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(OTLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(OTLParser.DIV, 0); }
		public MulDivContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class AddSubContext extends NumExprContext {
		public Token op;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(OTLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(OTLParser.SUB, 0); }
		public AddSubContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class ParensContext extends NumExprContext {
		public TerminalNode LPAREN() { return getToken(OTLParser.LPAREN, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OTLParser.RPAREN, 0); }
		public ParensContext(NumExprContext ctx) { copyFrom(ctx); }
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

	public final NumExprContext numExpr() throws RecognitionException {
		return numExpr(0);
	}

	private NumExprContext numExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExprContext _localctx = new NumExprContext(_ctx, _parentState);
		NumExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_numExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51); 
				match(LPAREN);
				setState(52); 
				numExpr(0);
				setState(53); 
				match(RPAREN);
				}
				break;
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); 
				numberLiteral();
				}
				break;
			case ID:
				{
				_localctx = new VarPropContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); 
				propFullName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(61); 
						numExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(64); 
						numExpr(4);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 10, RULE_propsSel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			propVar();
			setState(73);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(71); 
				match(AS);
				setState(72); 
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
	public static class LiteralVarContext extends PropVarContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterLiteralVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitLiteralVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitLiteralVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncVarContext extends PropVarContext {
		public TerminalNode ID() { return getToken(OTLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(OTLParser.LPAREN, 0); }
		public List<PropFullNameContext> propFullName() {
			return getRuleContexts(PropFullNameContext.class);
		}
		public PropFullNameContext propFullName(int i) {
			return getRuleContext(PropFullNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(OTLParser.RPAREN, 0); }
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
	public static class NumExprVarContext extends PropVarContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public NumExprVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).enterNumExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OTLListener ) ((OTLListener)listener).exitNumExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OTLVisitor ) return ((OTLVisitor<? extends T>)visitor).visitNumExprVar(this);
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

	public final PropVarContext propVar() throws RecognitionException {
		PropVarContext _localctx = new PropVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propVar);
		int _la;
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DirectPropVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75); 
				propFullName();
				}
				break;
			case 2:
				_localctx = new NumExprVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76); 
				numExpr(0);
				}
				break;
			case 3:
				_localctx = new LiteralVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77); 
				literal();
				}
				break;
			case 4:
				_localctx = new FuncVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78); 
				match(ID);
				setState(79); 
				match(LPAREN);
				setState(80); 
				propFullName();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(81); 
					match(COMMA);
					setState(82); 
					propFullName();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88); 
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
		enterRule(_localctx, 14, RULE_propFullName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			propName();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93); 
					match(DOT);
					setState(94); 
					propName();
					}
					} 
				}
				setState(99);
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
		enterRule(_localctx, 16, RULE_propName);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100); 
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayPropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101); 
				match(ID);
				setState(102); 
				match(LBRACK);
				setState(103); 
				integerLiteral();
				setState(104); 
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
		enterRule(_localctx, 18, RULE_boolExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			boolExpr(0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BoolOprt) {
				{
				{
				setState(109); 
				match(BoolOprt);
				setState(110); 
				boolExpr(0);
				}
				}
				setState(115);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(117); 
				match(NOT);
				setState(118); 
				boolExpr(3);
				}
				break;
			case 2:
				{
				setState(119); 
				propVar();
				setState(120); 
				match(CompareOprt);
				setState(121); 
				propVar();
				}
				break;
			case 3:
				{
				setState(123); 
				match(LPAREN);
				setState(124); 
				boolExpr(0);
				setState(125); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
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
					setState(129);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(130); 
					match(BoolOprt);
					setState(131); 
					boolExpr(2);
					}
					} 
				}
				setState(136);
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
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); 
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); 
				match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); 
				match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); 
				match(StringLiteral);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(141); 
				booleanLiteral();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(142); 
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
		enterRule(_localctx, 24, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 26, RULE_numberLiteral);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); 
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); 
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
		enterRule(_localctx, 28, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		case 4: 
			return numExpr_sempred((NumExprContext)_localctx, predIndex);
		case 10: 
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 4);
		case 1: 
			return precpred(_ctx, 3);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u009c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\5\2$\n\2"+
		"\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6D\n\6\f\6\16"+
		"\6G\13\6\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bV\n\b"+
		"\f\b\16\bY\13\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\7\tb\n\t\f\t\16\te\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\13\7\13r\n\13\f\13\16\13u"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\f\3"+
		"\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0092"+
		"\n\r\3\16\3\16\3\17\3\17\5\17\u0098\n\17\3\20\3\20\3\20\2\4\n\26\21\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\2!\"\3\2#$\3\2\5\7\3\2\36"+
		"\37\u00a3\2 \3\2\2\2\4%\3\2\2\2\6.\3\2\2\2\b\61\3\2\2\2\n;\3\2\2\2\fH"+
		"\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22l\3\2\2\2\24n\3\2\2\2\26\u0081\3\2"+
		"\2\2\30\u0091\3\2\2\2\32\u0093\3\2\2\2\34\u0097\3\2\2\2\36\u0099\3\2\2"+
		"\2 !\5\4\3\2!#\5\6\4\2\"$\5\b\5\2#\"\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%&\7"+
		"\24\2\2&+\5\f\7\2\'(\7\25\2\2(*\5\f\7\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,\5\3\2\2\2-+\3\2\2\2./\7\26\2\2/\60\7%\2\2\60\7\3\2\2\2\61"+
		"\62\7\27\2\2\62\63\5\24\13\2\63\t\3\2\2\2\64\65\b\6\1\2\65\66\7\31\2\2"+
		"\66\67\5\n\6\2\678\7\32\2\28<\3\2\2\29<\5\34\17\2:<\5\20\t\2;\64\3\2\2"+
		"\2;9\3\2\2\2;:\3\2\2\2<E\3\2\2\2=>\f\6\2\2>?\t\2\2\2?D\5\n\6\7@A\f\5\2"+
		"\2AB\t\3\2\2BD\5\n\6\6C=\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2F\13\3\2\2\2GE\3\2\2\2HK\5\16\b\2IJ\7\30\2\2JL\7%\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\r\3\2\2\2M]\5\20\t\2N]\5\n\6\2O]\5\30\r\2PQ\7%\2\2QR\7\31\2\2"+
		"RW\5\20\t\2ST\7\25\2\2TV\5\20\t\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\32\2\2[]\3\2\2\2\\M\3\2\2\2\\N\3\2\2\2\\"+
		"O\3\2\2\2\\P\3\2\2\2]\17\3\2\2\2^c\5\22\n\2_`\7\33\2\2`b\5\22\n\2a_\3"+
		"\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\21\3\2\2\2ec\3\2\2\2fm\7%\2\2gh"+
		"\7%\2\2hi\7\34\2\2ij\5\32\16\2jk\7\35\2\2km\3\2\2\2lf\3\2\2\2lg\3\2\2"+
		"\2m\23\3\2\2\2ns\5\26\f\2op\7\4\2\2pr\5\26\f\2qo\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2t\25\3\2\2\2us\3\2\2\2vw\b\f\1\2wx\7\21\2\2x\u0082\5\26"+
		"\f\5yz\5\16\b\2z{\7\3\2\2{|\5\16\b\2|\u0082\3\2\2\2}~\7\31\2\2~\177\5"+
		"\26\f\2\177\u0080\7\32\2\2\u0080\u0082\3\2\2\2\u0081v\3\2\2\2\u0081y\3"+
		"\2\2\2\u0081}\3\2\2\2\u0082\u0088\3\2\2\2\u0083\u0084\f\3\2\2\u0084\u0085"+
		"\7\4\2\2\u0085\u0087\5\26\f\4\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\27\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u0092\5\32\16\2\u008c\u0092\7\b\2\2\u008d\u0092\7\t\2\2"+
		"\u008e\u0092\7\n\2\2\u008f\u0092\5\36\20\2\u0090\u0092\7 \2\2\u0091\u008b"+
		"\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094\t\4\2"+
		"\2\u0094\33\3\2\2\2\u0095\u0098\5\32\16\2\u0096\u0098\7\b\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\35\3\2\2\2\u0099\u009a\t\5\2\2\u009a"+
		"\37\3\2\2\2\21#+;CEKW\\cls\u0081\u0088\u0091\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}