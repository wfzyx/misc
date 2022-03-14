// Generated from Mu.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CONST", "LET", 
			"OP_PLUS", "OP_MINUS", "OP_MULT", "OP_DIV", "OP_MOD", "OP_NEQ", "OP_IDIV", 
			"OP_EXP", "OP_ASSING", "OP_VALEQ", "OP_REFEQ", "OP_GT", "OP_LT", "OP_GEQ", 
			"OP_LEQ", "IG", "WS", "COLON", "SEMI", "COMMA", "QSMARK", "PPMARK", "DOT", 
			"LKEY", "RKEY", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DQUOT", "TYPELIST", 
			"STR_LIT", "FLOAT_LIT", "RANGE_LIT", "INT_LIT", "ID", "COMMENT"
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


	public MuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u011c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u00e2\n)\3*\3*\7*\u00e6\n*\f*\16*\u00e9\13*\3*\3*\3+\6+\u00ee"+
		"\n+\r+\16+\u00ef\3+\3+\6+\u00f4\n+\r+\16+\u00f5\3+\3+\6+\u00fa\n+\r+\16"+
		"+\u00fb\5+\u00fe\n+\3,\3,\3,\3,\3,\3,\3-\6-\u0107\n-\r-\16-\u0108\3.\6"+
		".\u010c\n.\r.\16.\u010d\3/\3/\3/\7/\u0113\n/\f/\16/\u0116\13/\3/\3/\3"+
		"/\3/\3/\4\u00e7\u0114\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\5"+
		"\4\2\13\f\17\17\3\2\62;\5\2C\\aac|\2\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5b\3\2\2\2\7f\3\2\2\2\ti\3\2\2\2"+
		"\13o\3\2\2\2\rr\3\2\2\2\17z\3\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2\25\u0088"+
		"\3\2\2\2\27\u008a\3\2\2\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2\35\u0090\3"+
		"\2\2\2\37\u0092\3\2\2\2!\u0095\3\2\2\2#\u0098\3\2\2\2%\u009b\3\2\2\2\'"+
		"\u009d\3\2\2\2)\u00a0\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3\2"+
		"\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2\2\65\u00b2\3\2\2\2\67\u00b6\3\2\2"+
		"\29\u00b8\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2?\u00be\3\2\2\2A\u00c0"+
		"\3\2\2\2C\u00c2\3\2\2\2E\u00c4\3\2\2\2G\u00c6\3\2\2\2I\u00c8\3\2\2\2K"+
		"\u00ca\3\2\2\2M\u00cc\3\2\2\2O\u00ce\3\2\2\2Q\u00e1\3\2\2\2S\u00e3\3\2"+
		"\2\2U\u00fd\3\2\2\2W\u00ff\3\2\2\2Y\u0106\3\2\2\2[\u010b\3\2\2\2]\u010f"+
		"\3\2\2\2_`\7h\2\2`a\7p\2\2a\4\3\2\2\2bc\7h\2\2cd\7q\2\2de\7t\2\2e\6\3"+
		"\2\2\2fg\7k\2\2gh\7p\2\2h\b\3\2\2\2ij\7o\2\2jk\7c\2\2kl\7v\2\2lm\7e\2"+
		"\2mn\7j\2\2n\n\3\2\2\2op\7c\2\2pq\7u\2\2q\f\3\2\2\2rs\7f\2\2st\7g\2\2"+
		"tu\7h\2\2uv\7c\2\2vw\7w\2\2wx\7n\2\2xy\7v\2\2y\16\3\2\2\2z{\7t\2\2{|\7"+
		"g\2\2|}\7v\2\2}\20\3\2\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081\7"+
		"p\2\2\u0081\u0082\7u\2\2\u0082\u0083\7v\2\2\u0083\22\3\2\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087\24\3\2\2\2\u0088\u0089"+
		"\7-\2\2\u0089\26\3\2\2\2\u008a\u008b\7/\2\2\u008b\30\3\2\2\2\u008c\u008d"+
		"\7,\2\2\u008d\32\3\2\2\2\u008e\u008f\7\61\2\2\u008f\34\3\2\2\2\u0090\u0091"+
		"\7\'\2\2\u0091\36\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094\7?\2\2\u0094"+
		" \3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7\61\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\7,\2\2\u0099\u009a\7,\2\2\u009a$\3\2\2\2\u009b\u009c\7?\2\2\u009c"+
		"&\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f\7?\2\2\u009f(\3\2\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\u00a2\7?\2\2\u00a2\u00a3\7?\2\2\u00a3*\3\2\2\2\u00a4\u00a5"+
		"\7@\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7"+
		"@\2\2\u00a9\u00aa\7?\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\62\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\b\32\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\u00b5\b\33\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7<\2\2\u00b78\3\2"+
		"\2\2\u00b8\u00b9\7=\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb<\3\2\2"+
		"\2\u00bc\u00bd\7A\2\2\u00bd>\3\2\2\2\u00be\u00bf\7~\2\2\u00bf@\3\2\2\2"+
		"\u00c0\u00c1\7\60\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3D\3\2\2\2"+
		"\u00c4\u00c5\7\177\2\2\u00c5F\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7H\3\2\2"+
		"\2\u00c8\u00c9\7+\2\2\u00c9J\3\2\2\2\u00ca\u00cb\7]\2\2\u00cbL\3\2\2\2"+
		"\u00cc\u00cd\7_\2\2\u00cdN\3\2\2\2\u00ce\u00cf\7$\2\2\u00cfP\3\2\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\78\2\2\u00d2\u00e2\7\66\2\2\u00d3\u00d4\7t\2"+
		"\2\u00d4\u00d5\7\65\2\2\u00d5\u00e2\7\64\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7\63\2\2\u00d8\u00e2\78\2\2\u00d9\u00da\7t\2\2\u00da\u00e2\7:\2"+
		"\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd\u00e2\7o\2\2\u00de\u00df"+
		"\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e2\7t\2\2\u00e1\u00d0\3\2\2\2\u00e1"+
		"\u00d3\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3\2"+
		"\2\2\u00e1\u00de\3\2\2\2\u00e2R\3\2\2\2\u00e3\u00e7\5O(\2\u00e4\u00e6"+
		"\13\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb"+
		"\5O(\2\u00ebT\3\2\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\5A!\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fe\3\2\2\2\u00f7\u00f9"+
		"\5A!\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ed\3\2"+
		"\2\2\u00fd\u00f7\3\2\2\2\u00feV\3\2\2\2\u00ff\u0100\5Y-\2\u0100\u0101"+
		"\7\60\2\2\u0101\u0102\7\60\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5Y-\2\u0104"+
		"X\3\2\2\2\u0105\u0107\t\3\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109Z\3\2\2\2\u010a\u010c\t"+
		"\4\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\\\3\2\2\2\u010f\u0110\5\33\16\2\u0110\u0114\5\31"+
		"\r\2\u0111\u0113\13\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0118\5\31\r\2\u0118\u0119\5\33\16\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\b/\2\2\u011b^\3\2\2\2\f\2\u00e1\u00e7\u00ef\u00f5\u00fb\u00fd\u0108"+
		"\u010d\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}