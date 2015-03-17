// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/other\list.g4 by ANTLR 4.5

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class listParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGL=1, ENDL=2, SEP=3, NUM=4, WS=5;
	public static final int
		RULE_list = 0, RULE_elems = 1, RULE_elem = 2;
	public static final String[] ruleNames = {
		"list", "elems", "elem"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGL", "ENDL", "SEP", "NUM", "WS"
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
	public String getGrammarFileName() { return "list.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public listParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ListContext extends ParserRuleContext {
		public ElemsContext elems;
		public TerminalNode BEGL() { return getToken(listParser.BEGL, 0); }
		public TerminalNode ENDL() { return getToken(listParser.ENDL, 0); }
		public ElemsContext elems() {
			return getRuleContext(ElemsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listListener ) ((listListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listListener ) ((listListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listVisitor ) return ((listVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); 
			match(BEGL);
			setState(8);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(7); 
				((ListContext)_localctx).elems = elems(new ArrayList<Integer>());
				}
			}

			setState(10); 
			match(ENDL);

			            int sum = 0;
			            if((((ListContext)_localctx).elems!=null?_input.getText(((ListContext)_localctx).elems.start,((ListContext)_localctx).elems.stop):null) != null)
			                for(Integer i : ((ListContext)_localctx).elems.listOut)
			                    sum += i;
			            System.out.println("List Sum: " + sum);
			        
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

	public static class ElemsContext extends ParserRuleContext {
		public List<Integer> listIn;
		public List<Integer> listOut;
		public ElemContext a;
		public ElemContext b;
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(listParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(listParser.SEP, i);
		}
		public ElemsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElemsContext(ParserRuleContext parent, int invokingState, List<Integer> listIn) {
			super(parent, invokingState);
			this.listIn = listIn;
		}
		@Override public int getRuleIndex() { return RULE_elems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listListener ) ((listListener)listener).enterElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listListener ) ((listListener)listener).exitElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listVisitor ) return ((listVisitor<? extends T>)visitor).visitElems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemsContext elems(List<Integer> listIn) throws RecognitionException {
		ElemsContext _localctx = new ElemsContext(_ctx, getState(), listIn);
		enterRule(_localctx, 2, RULE_elems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			((ElemsContext)_localctx).a = elem();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(14); 
				match(SEP);
				setState(15); 
				((ElemsContext)_localctx).b = elem();
				 listIn.add(((ElemsContext)_localctx).b.value); 
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                listIn.add(((ElemsContext)_localctx).a.value);
			                ((ElemsContext)_localctx).listOut =  _localctx.listIn;
			            
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

	public static class ElemContext extends ParserRuleContext {
		public int value;
		public Token NUM;
		public TerminalNode NUM() { return getToken(listParser.NUM, 0); }
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listListener ) ((listListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listListener ) ((listListener)listener).exitElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listVisitor ) return ((listVisitor<? extends T>)visitor).visitElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			((ElemContext)_localctx).NUM = match(NUM);
			 ((ElemContext)_localctx).value =  (((ElemContext)_localctx).NUM!=null?Integer.valueOf(((ElemContext)_localctx).NUM.getText()):0); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\3\3\3\3\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\35\2\b\3"+
		"\2\2\2\4\17\3\2\2\2\6\33\3\2\2\2\b\n\7\3\2\2\t\13\5\4\3\2\n\t\3\2\2\2"+
		"\n\13\3\2\2\2\13\f\3\2\2\2\f\r\7\4\2\2\r\16\b\2\1\2\16\3\3\2\2\2\17\26"+
		"\5\6\4\2\20\21\7\5\2\2\21\22\5\6\4\2\22\23\b\3\1\2\23\25\3\2\2\2\24\20"+
		"\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26"+
		"\3\2\2\2\31\32\b\3\1\2\32\5\3\2\2\2\33\34\7\6\2\2\34\35\b\4\1\2\35\7\3"+
		"\2\2\2\4\n\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}