// Generated from /home/victor/Coding/misc/prolang/Mu.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CONST=8, LET=9, 
		OP_PLUS=10, OP_MINUS=11, OP_MULT=12, OP_DIV=13, OP_MOD=14, OP_NEQ=15, 
		OP_IDIV=16, OP_EXP=17, OP_ASSING=18, OP_VALEQ=19, OP_REFEQ=20, OP_GT=21, 
		OP_LT=22, OP_GEQ=23, OP_LEQ=24, IG=25, WS=26, COLON=27, SEMI=28, COMMA=29, 
		QSMARK=30, PPMARK=31, DOT=32, LKEY=33, RKEY=34, LPAREN=35, RPAREN=36, 
		LBRACK=37, RBRACK=38, DQUOT=39, TYPELIST=40, STR_LIT=41, FLOAT_LIT=42, 
		RANGE_LIT=43, INT_LIT=44, ID=45, COMMENT=46;
	public static final int
		RULE_unit = 0, RULE_command = 1, RULE_assignables = 2, RULE_gen_attr = 3, 
		RULE_expr_block = 4, RULE_type = 5, RULE_fun_decl = 6, RULE_fun_call = 7, 
		RULE_for_loop = 8, RULE_match_cond = 9, RULE_match_branch = 10, RULE_ret_call = 11, 
		RULE_expr = 12, RULE_expr_atom = 13, RULE_comp = 14, RULE_arith_op = 15, 
		RULE_compar_op = 16, RULE_binary_op = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"unit", "command", "assignables", "gen_attr", "expr_block", "type", "fun_decl", 
			"fun_call", "for_loop", "match_cond", "match_branch", "ret_call", "expr", 
			"expr_atom", "comp", "arith_op", "compar_op", "binary_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fn'", "'for'", "'in'", "'match'", "'as'", "'default'", "'ret'", 
			"'const'", "'let'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!='", "'//'", 
			"'**'", "'='", "'=='", "'==='", "'>'", "'<'", "'>='", "'<='", null, "' '", 
			"':'", "';'", "','", "'?'", "'|'", "'.'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CONST", "LET", "OP_PLUS", 
			"OP_MINUS", "OP_MULT", "OP_DIV", "OP_MOD", "OP_NEQ", "OP_IDIV", "OP_EXP", 
			"OP_ASSING", "OP_VALEQ", "OP_REFEQ", "OP_GT", "OP_LT", "OP_GEQ", "OP_LEQ", 
			"IG", "WS", "COLON", "SEMI", "COMMA", "QSMARK", "PPMARK", "DOT", "LKEY", 
			"RKEY", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DQUOT", "TYPELIST", 
			"STR_LIT", "FLOAT_LIT", "RANGE_LIT", "INT_LIT", "ID", "COMMENT"
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
		public List<Gen_attrContext> gen_attr() {
			return getRuleContexts(Gen_attrContext.class);
		}
		public Gen_attrContext gen_attr(int i) {
			return getRuleContext(Gen_attrContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MuParser.EOF, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					gen_attr();
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(EOF);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MuParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Fun_callContext fun_call() {
			return getRuleContext(Fun_callContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Match_condContext match_cond() {
			return getRuleContext(Match_condContext.class,0);
		}
		public Ret_callContext ret_call() {
			return getRuleContext(Ret_callContext.class,0);
		}
		public Gen_attrContext gen_attr() {
			return getRuleContext(Gen_attrContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(44);
					expr();
					}
					break;
				case 2:
					{
					setState(45);
					fun_call();
					}
					break;
				case 3:
					{
					setState(46);
					for_loop();
					}
					break;
				case 4:
					{
					setState(47);
					match_cond();
					}
					break;
				case 5:
					{
					setState(48);
					ret_call();
					}
					break;
				}
				setState(51);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				gen_attr();
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

	public static class AssignablesContext extends ParserRuleContext {
		public Match_condContext match_cond() {
			return getRuleContext(Match_condContext.class,0);
		}
		public Fun_callContext fun_call() {
			return getRuleContext(Fun_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_blockContext expr_block() {
			return getRuleContext(Expr_blockContext.class,0);
		}
		public AssignablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignables; }
	}

	public final AssignablesContext assignables() throws RecognitionException {
		AssignablesContext _localctx = new AssignablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignables);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				fun_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				expr_block();
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

	public static class Gen_attrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode OP_ASSING() { return getToken(MuParser.OP_ASSING, 0); }
		public AssignablesContext assignables() {
			return getRuleContext(AssignablesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MuParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Gen_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_attr; }
	}

	public final Gen_attrContext gen_attr() throws RecognitionException {
		Gen_attrContext _localctx = new Gen_attrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gen_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(COLON);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LBRACK) | (1L << TYPELIST))) != 0)) {
				{
				setState(64);
				type();
				}
			}

			setState(67);
			match(OP_ASSING);
			setState(68);
			assignables();
			setState(69);
			match(SEMI);
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

	public static class Expr_blockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode LKEY() { return getToken(MuParser.LKEY, 0); }
		public TerminalNode RKEY() { return getToken(MuParser.RKEY, 0); }
		public Expr_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_block; }
	}

	public final Expr_blockContext expr_block() throws RecognitionException {
		Expr_blockContext _localctx = new Expr_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_block);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__6:
			case STR_LIT:
			case FLOAT_LIT:
			case INT_LIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				command();
				}
				break;
			case LKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(LKEY);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					command();
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << STR_LIT) | (1L << FLOAT_LIT) | (1L << INT_LIT) | (1L << ID))) != 0) );
				setState(78);
				match(RKEY);
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

	public static class TypeContext extends ParserRuleContext {
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(MuParser.LBRACK, 0); }
		public TerminalNode TYPELIST() { return getToken(MuParser.TYPELIST, 0); }
		public TerminalNode RBRACK() { return getToken(MuParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				fun_decl();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LBRACK);
				setState(84);
				match(TYPELIST);
				setState(85);
				match(RBRACK);
				}
				break;
			case TYPELIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(TYPELIST);
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

	public static class Fun_declContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MuParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MuParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(MuParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MuParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(MuParser.COMMA, 0); }
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fun_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__0);
			setState(90);
			match(LPAREN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(91);
				match(ID);
				setState(92);
				match(COLON);
				setState(93);
				type();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(94);
					match(COMMA);
					setState(95);
					match(ID);
					setState(96);
					match(COLON);
					setState(97);
					type();
					}
				}

				}
			}

			setState(102);
			match(RPAREN);
			setState(103);
			match(COLON);
			setState(104);
			type();
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

	public static class Fun_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MuParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MuParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(MuParser.COMMA, 0); }
		public Fun_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_call; }
	}

	public final Fun_callContext fun_call() throws RecognitionException {
		Fun_callContext _localctx = new Fun_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fun_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(LPAREN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108);
				match(ID);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(109);
					match(COMMA);
					setState(110);
					match(ID);
					}
				}

				}
			}

			setState(115);
			match(RPAREN);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MuParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MuParser.RPAREN, 0); }
		public Expr_blockContext expr_block() {
			return getRuleContext(Expr_blockContext.class,0);
		}
		public TerminalNode RANGE_LIT() { return getToken(MuParser.RANGE_LIT, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__1);
			setState(118);
			match(LPAREN);
			setState(119);
			match(ID);
			setState(120);
			match(COLON);
			setState(121);
			type();
			setState(122);
			match(T__2);
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==RANGE_LIT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			match(RPAREN);
			setState(125);
			expr_block();
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

	public static class Match_condContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MuParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(MuParser.RPAREN, 0); }
		public TerminalNode LKEY() { return getToken(MuParser.LKEY, 0); }
		public TerminalNode RKEY() { return getToken(MuParser.RKEY, 0); }
		public List<Match_branchContext> match_branch() {
			return getRuleContexts(Match_branchContext.class);
		}
		public Match_branchContext match_branch(int i) {
			return getRuleContext(Match_branchContext.class,i);
		}
		public Match_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_cond; }
	}

	public final Match_condContext match_cond() throws RecognitionException {
		Match_condContext _localctx = new Match_condContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_match_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__3);
			setState(128);
			match(LPAREN);
			setState(129);
			match(ID);
			setState(130);
			match(RPAREN);
			setState(131);
			match(LKEY);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match_branch();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==T__5 );
			setState(137);
			match(RKEY);
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

	public static class Match_branchContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MuParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MuParser.RPAREN, 0); }
		public TerminalNode OP_ASSING() { return getToken(MuParser.OP_ASSING, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Match_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_branch; }
	}

	public final Match_branchContext match_branch() throws RecognitionException {
		Match_branchContext _localctx = new Match_branchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match_branch);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__4);
				setState(140);
				match(LPAREN);
				{
				setState(141);
				comp();
				}
				setState(142);
				match(RPAREN);
				setState(143);
				match(OP_ASSING);
				setState(144);
				command();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__5);
				setState(147);
				match(OP_ASSING);
				setState(148);
				command();
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

	public static class Ret_callContext extends ParserRuleContext {
		public AssignablesContext assignables() {
			return getRuleContext(AssignablesContext.class,0);
		}
		public Ret_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_call; }
	}

	public final Ret_callContext ret_call() throws RecognitionException {
		Ret_callContext _localctx = new Ret_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ret_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__6);
			setState(152);
			assignables();
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
		public Expr_atomContext lhs;
		public Binary_opContext op;
		public Expr_atomContext rhs;
		public List<Expr_atomContext> expr_atom() {
			return getRuleContexts(Expr_atomContext.class);
		}
		public Expr_atomContext expr_atom(int i) {
			return getRuleContext(Expr_atomContext.class,i);
		}
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((ExprContext)_localctx).lhs = expr_atom();
				setState(155);
				((ExprContext)_localctx).op = binary_op();
				setState(156);
				((ExprContext)_localctx).rhs = expr_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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

	public static class Expr_atomContext extends ParserRuleContext {
		public TerminalNode STR_LIT() { return getToken(MuParser.STR_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(MuParser.FLOAT_LIT, 0); }
		public TerminalNode INT_LIT() { return getToken(MuParser.INT_LIT, 0); }
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR_LIT) | (1L << FLOAT_LIT) | (1L << INT_LIT) | (1L << ID))) != 0)) ) {
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

	public static class CompContext extends ParserRuleContext {
		public ExprContext lhs;
		public Compar_opContext op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Compar_opContext compar_op() {
			return getRuleContext(Compar_opContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((CompContext)_localctx).lhs = expr();
			setState(164);
			((CompContext)_localctx).op = compar_op();
			setState(165);
			((CompContext)_localctx).rhs = expr();
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

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode OP_PLUS() { return getToken(MuParser.OP_PLUS, 0); }
		public TerminalNode OP_MINUS() { return getToken(MuParser.OP_MINUS, 0); }
		public TerminalNode OP_MULT() { return getToken(MuParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(MuParser.OP_DIV, 0); }
		public TerminalNode OP_EXP() { return getToken(MuParser.OP_EXP, 0); }
		public TerminalNode OP_IDIV() { return getToken(MuParser.OP_IDIV, 0); }
		public TerminalNode OP_MOD() { return getToken(MuParser.OP_MOD, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PLUS) | (1L << OP_MINUS) | (1L << OP_MULT) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_IDIV) | (1L << OP_EXP))) != 0)) ) {
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

	public static class Compar_opContext extends ParserRuleContext {
		public TerminalNode OP_VALEQ() { return getToken(MuParser.OP_VALEQ, 0); }
		public TerminalNode OP_REFEQ() { return getToken(MuParser.OP_REFEQ, 0); }
		public TerminalNode OP_GT() { return getToken(MuParser.OP_GT, 0); }
		public TerminalNode OP_LT() { return getToken(MuParser.OP_LT, 0); }
		public TerminalNode OP_GEQ() { return getToken(MuParser.OP_GEQ, 0); }
		public TerminalNode OP_LEQ() { return getToken(MuParser.OP_LEQ, 0); }
		public TerminalNode OP_NEQ() { return getToken(MuParser.OP_NEQ, 0); }
		public Compar_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compar_op; }
	}

	public final Compar_opContext compar_op() throws RecognitionException {
		Compar_opContext _localctx = new Compar_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compar_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_NEQ) | (1L << OP_VALEQ) | (1L << OP_REFEQ) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_GEQ) | (1L << OP_LEQ))) != 0)) ) {
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

	public static class Binary_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Compar_opContext compar_op() {
			return getRuleContext(Compar_opContext.class,0);
		}
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binary_op);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PLUS:
			case OP_MINUS:
			case OP_MULT:
			case OP_DIV:
			case OP_MOD:
			case OP_IDIV:
			case OP_EXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				arith_op();
				}
				break;
			case OP_NEQ:
			case OP_VALEQ:
			case OP_REFEQ:
			case OP_GT:
			case OP_LT:
			case OP_GEQ:
			case OP_LEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				compar_op();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\5\5"+
		"D\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6M\n\6\r\6\16\6N\3\6\3\6\5\6S\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"e\n\b\5\bg\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\5\tt\n\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\6\13\u0088\n\13\r\13\16\13\u0089\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00a2\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\5\23\u00b0\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\6\4\2--//\4\2+,./\4\2\f\20\22\23\4\2\21\21\25\32\2\u00b6\2,"+
		"\3\2\2\2\48\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nR\3\2\2\2\fY\3\2\2\2\16[\3"+
		"\2\2\2\20l\3\2\2\2\22w\3\2\2\2\24\u0081\3\2\2\2\26\u0097\3\2\2\2\30\u0099"+
		"\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 \u00a9\3\2"+
		"\2\2\"\u00ab\3\2\2\2$\u00af\3\2\2\2&(\5\b\5\2\'&\3\2\2\2()\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*-\3\2\2\2+-\7\2\2\3,\'\3\2\2\2,+\3\2\2\2-\3\3\2\2\2"+
		".\64\5\32\16\2/\64\5\20\t\2\60\64\5\22\n\2\61\64\5\24\13\2\62\64\5\30"+
		"\r\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\66\7\36\2\2\669\3\2\2\2\679\5\b\5\28\63\3\2\2\28\67"+
		"\3\2\2\29\5\3\2\2\2:?\5\24\13\2;?\5\20\t\2<?\5\32\16\2=?\5\n\6\2>:\3\2"+
		"\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7/\2\2AC\7\35\2\2BD\5"+
		"\f\7\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\24\2\2FG\5\6\4\2GH\7\36\2\2H"+
		"\t\3\2\2\2IS\5\4\3\2JL\7#\2\2KM\5\4\3\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OP\3\2\2\2PQ\7$\2\2QS\3\2\2\2RI\3\2\2\2RJ\3\2\2\2S\13\3\2\2"+
		"\2TZ\5\16\b\2UV\7\'\2\2VW\7*\2\2WZ\7(\2\2XZ\7*\2\2YT\3\2\2\2YU\3\2\2\2"+
		"YX\3\2\2\2Z\r\3\2\2\2[\\\7\3\2\2\\f\7%\2\2]^\7/\2\2^_\7\35\2\2_d\5\f\7"+
		"\2`a\7\37\2\2ab\7/\2\2bc\7\35\2\2ce\5\f\7\2d`\3\2\2\2de\3\2\2\2eg\3\2"+
		"\2\2f]\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7&\2\2ij\7\35\2\2jk\5\f\7\2k\17\3"+
		"\2\2\2lm\7/\2\2ms\7%\2\2nq\7/\2\2op\7\37\2\2pr\7/\2\2qo\3\2\2\2qr\3\2"+
		"\2\2rt\3\2\2\2sn\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7&\2\2v\21\3\2\2\2wx\7"+
		"\4\2\2xy\7%\2\2yz\7/\2\2z{\7\35\2\2{|\5\f\7\2|}\7\5\2\2}~\t\2\2\2~\177"+
		"\7&\2\2\177\u0080\5\n\6\2\u0080\23\3\2\2\2\u0081\u0082\7\6\2\2\u0082\u0083"+
		"\7%\2\2\u0083\u0084\7/\2\2\u0084\u0085\7&\2\2\u0085\u0087\7#\2\2\u0086"+
		"\u0088\5\26\f\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7$\2\2\u008c"+
		"\25\3\2\2\2\u008d\u008e\7\7\2\2\u008e\u008f\7%\2\2\u008f\u0090\5\36\20"+
		"\2\u0090\u0091\7&\2\2\u0091\u0092\7\24\2\2\u0092\u0093\5\4\3\2\u0093\u0098"+
		"\3\2\2\2\u0094\u0095\7\b\2\2\u0095\u0096\7\24\2\2\u0096\u0098\5\4\3\2"+
		"\u0097\u008d\3\2\2\2\u0097\u0094\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a"+
		"\7\t\2\2\u009a\u009b\5\6\4\2\u009b\31\3\2\2\2\u009c\u009d\5\34\17\2\u009d"+
		"\u009e\5$\23\2\u009e\u009f\5\34\17\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\5"+
		"\34\17\2\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\33\3\2\2\2\u00a3"+
		"\u00a4\t\3\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\5\""+
		"\22\2\u00a7\u00a8\5\32\16\2\u00a8\37\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa"+
		"!\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac#\3\2\2\2\u00ad\u00b0\5 \21\2\u00ae"+
		"\u00b0\5\"\22\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0%\3\2\2\2"+
		"\23),\638>CNRYdfqs\u0089\u0097\u00a1\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}