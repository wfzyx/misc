// Generated from Mu.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, FLOAT=2, INT=3, BINARY_OP=4, COMPAR_OP=5, PLUS=6, MINUS=7, MULT=8, 
		DIV=9, IDIV=10, EXP=11, ATTR=12, EQ=13, NEQ=14, GT=15, LT=16, GEQ=17, 
		LEQ=18, WS=19, NL=20, SC=21, QSMARK=22, PPMARK=23;
	public static final int
		RULE_unit = 0, RULE_cmd = 1, RULE_attr = 2, RULE_expr = 3, RULE_comp = 4, 
		RULE_expr_atom = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"unit", "cmd", "attr", "expr", "comp", "expr_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'//'", 
			"'**'", "'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", null, null, 
			"';'", "'?'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "FLOAT", "INT", "BINARY_OP", "COMPAR_OP", "PLUS", "MINUS", 
			"MULT", "DIV", "IDIV", "EXP", "ATTR", "EQ", "NEQ", "GT", "LT", "GEQ", 
			"LEQ", "WS", "NL", "SC", "QSMARK", "PPMARK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UnitContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(MuParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MuParser.NL, i);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				cmd();
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(13);
					match(NL);
					}
				}

				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << INT))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(MuParser.SC, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				expr();
				setState(21);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				comp();
				setState(24);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				attr();
				setState(27);
				match(SC);
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(MuParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ID);
			setState(32);
			match(ATTR);
			setState(33);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode BINARY_OP() { return getToken(MuParser.BINARY_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MuParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MuParser.WS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				expr_atom();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(36);
					match(WS);
					}
				}

				setState(39);
				match(BINARY_OP);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(40);
					match(WS);
					}
				}

				setState(43);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				expr_atom();
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

	public static class CompContext extends ParserRuleContext {
		public List<Expr_atomContext> expr_atom() {
			return getRuleContexts(Expr_atomContext.class);
		}
		public Expr_atomContext expr_atom(int i) {
			return getRuleContext(Expr_atomContext.class,i);
		}
		public TerminalNode COMPAR_OP() { return getToken(MuParser.COMPAR_OP, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			expr_atom();
			setState(49);
			match(COMPAR_OP);
			setState(50);
			expr_atom();
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

	public static class Expr_atomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MuParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MuParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MuListener ) ((MuListener)listener).exitExpr_atom(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\319\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\6\2\23\n\2\r\2\16"+
		"\2\24\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\5\5(\n\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\3\5\29\2\22\3\2\2\2\4\37\3\2\2"+
		"\2\6!\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f\66\3\2\2\2\16\20\5\4\3\2\17"+
		"\21\7\26\2\2\20\17\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\16\3\2\2\2\23"+
		"\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\27\5\b\5\2\27"+
		"\30\7\27\2\2\30 \3\2\2\2\31\32\5\n\6\2\32\33\7\27\2\2\33 \3\2\2\2\34\35"+
		"\5\6\4\2\35\36\7\27\2\2\36 \3\2\2\2\37\26\3\2\2\2\37\31\3\2\2\2\37\34"+
		"\3\2\2\2 \5\3\2\2\2!\"\7\3\2\2\"#\7\16\2\2#$\5\b\5\2$\7\3\2\2\2%\'\5\f"+
		"\7\2&(\7\25\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)+\7\6\2\2*,\7\25\2\2+"+
		"*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5\b\5\2.\61\3\2\2\2/\61\5\f\7\2\60%\3"+
		"\2\2\2\60/\3\2\2\2\61\t\3\2\2\2\62\63\5\f\7\2\63\64\7\7\2\2\64\65\5\f"+
		"\7\2\65\13\3\2\2\2\66\67\t\2\2\2\67\r\3\2\2\2\b\20\24\37\'+\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}