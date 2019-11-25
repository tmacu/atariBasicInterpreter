// Generated from /home/fatjoker/IdeaProjects/AtariBasic/novisitor/Atari.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtariLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		F_PRINT=1, F_NEW=2, F_RUN=3, F_LIST=4, F_GOTO=5, F_INTPUT=6, F_TRAP=7, 
		F_IF=8, F_THEN=9, F_END=10, F_REM=11, F_INT=12, F_SGN=13, F_SQR=14, F_ABS=15, 
		F_CLOG=16, F_LOG=17, F_EXP=18, F_SIN=19, F_COS=20, F_DEG=21, F_RAD=22, 
		NOT=23, AND=24, OR=25, VAR=26, NUMBER=27, DOUBLE_QUOTE=28, COLON=29, SEMICOLON=30, 
		COMMA=31, COMMENT=32, STRING=33, ASS=34, BROP=35, BRCL=36, POW=37, MUL=38, 
		DIV=39, MINUS=40, PLUS=41, NOT_EQ=42, GRT_THN_EQ=43, LES_THN_EQ=44, GRT_THN=45, 
		LES_THN=46, NL=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"F_PRINT", "F_NEW", "F_RUN", "F_LIST", "F_GOTO", "F_INTPUT", "F_TRAP", 
			"F_IF", "F_THEN", "F_END", "F_REM", "F_INT", "F_SGN", "F_SQR", "F_ABS", 
			"F_CLOG", "F_LOG", "F_EXP", "F_SIN", "F_COS", "F_DEG", "F_RAD", "NOT", 
			"AND", "OR", "VAR", "NUMBER", "DIGIT", "EUL", "DOUBLE_QUOTE", "COLON", 
			"SEMICOLON", "COMMA", "COMMENT", "STRING", "ASS", "BROP", "BRCL", "POW", 
			"MUL", "DIV", "MINUS", "PLUS", "NOT_EQ", "GRT_THN_EQ", "LES_THN_EQ", 
			"GRT_THN", "LES_THN", "NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PRINT'", "'NEW'", "'RUN'", "'LIST'", "'GOTO'", "'INPUT'", "'TRAP'", 
			"'IF'", "'THEN'", "'END'", "'REM'", "'INT'", "'SGN'", "'SQR'", "'ABS'", 
			"'CLOG'", "'LOG'", "'EXP'", "'SIN'", "'COS'", "'DEG'", "'RAD'", "'NOT'", 
			"'AND'", "'OR'", null, null, "'\"'", "':'", "';'", "','", null, null, 
			"'='", "'('", "')'", "'^'", "'*'", "'/'", "'-'", "'+'", "'<>'", "'>='", 
			"'<='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "F_PRINT", "F_NEW", "F_RUN", "F_LIST", "F_GOTO", "F_INTPUT", "F_TRAP", 
			"F_IF", "F_THEN", "F_END", "F_REM", "F_INT", "F_SGN", "F_SQR", "F_ABS", 
			"F_CLOG", "F_LOG", "F_EXP", "F_SIN", "F_COS", "F_DEG", "F_RAD", "NOT", 
			"AND", "OR", "VAR", "NUMBER", "DOUBLE_QUOTE", "COLON", "SEMICOLON", "COMMA", 
			"COMMENT", "STRING", "ASS", "BROP", "BRCL", "POW", "MUL", "DIV", "MINUS", 
			"PLUS", "NOT_EQ", "GRT_THN_EQ", "LES_THN_EQ", "GRT_THN", "LES_THN", "NL", 
			"WS"
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


	public AtariLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Atari.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\6\33"+
		"\u00d4\n\33\r\33\16\33\u00d5\3\34\6\34\u00d9\n\34\r\34\16\34\u00da\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u00eb\n#\f#\16"+
		"#\u00ee\13#\3#\3#\3$\3$\7$\u00f4\n$\f$\16$\u00f7\13$\3$\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\5\62\u011a\n\62\3\62\3\62\3\63\6\63\u011f\n"+
		"\63\r\63\16\63\u0120\3\63\3\63\3\u00f5\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\36?\37A C!E\"G#I$K%M&O\'Q("+
		"S)U*W+Y,[-]._/a\60c\61e\62\3\2\6\3\2C\\\3\2\62;\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\2\u0127\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5m\3\2\2\2\7q\3\2\2\2\tu\3\2\2\2\13"+
		"z\3\2\2\2\r\177\3\2\2\2\17\u0085\3\2\2\2\21\u008a\3\2\2\2\23\u008d\3\2"+
		"\2\2\25\u0092\3\2\2\2\27\u0096\3\2\2\2\31\u009a\3\2\2\2\33\u009e\3\2\2"+
		"\2\35\u00a2\3\2\2\2\37\u00a6\3\2\2\2!\u00aa\3\2\2\2#\u00af\3\2\2\2%\u00b3"+
		"\3\2\2\2\'\u00b7\3\2\2\2)\u00bb\3\2\2\2+\u00bf\3\2\2\2-\u00c3\3\2\2\2"+
		"/\u00c7\3\2\2\2\61\u00cb\3\2\2\2\63\u00cf\3\2\2\2\65\u00d3\3\2\2\2\67"+
		"\u00d8\3\2\2\29\u00dc\3\2\2\2;\u00de\3\2\2\2=\u00e0\3\2\2\2?\u00e2\3\2"+
		"\2\2A\u00e4\3\2\2\2C\u00e6\3\2\2\2E\u00e8\3\2\2\2G\u00f1\3\2\2\2I\u00fb"+
		"\3\2\2\2K\u00fd\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S"+
		"\u0105\3\2\2\2U\u0107\3\2\2\2W\u0109\3\2\2\2Y\u010b\3\2\2\2[\u010e\3\2"+
		"\2\2]\u0111\3\2\2\2_\u0114\3\2\2\2a\u0116\3\2\2\2c\u0119\3\2\2\2e\u011e"+
		"\3\2\2\2gh\7R\2\2hi\7T\2\2ij\7K\2\2jk\7P\2\2kl\7V\2\2l\4\3\2\2\2mn\7P"+
		"\2\2no\7G\2\2op\7Y\2\2p\6\3\2\2\2qr\7T\2\2rs\7W\2\2st\7P\2\2t\b\3\2\2"+
		"\2uv\7N\2\2vw\7K\2\2wx\7U\2\2xy\7V\2\2y\n\3\2\2\2z{\7I\2\2{|\7Q\2\2|}"+
		"\7V\2\2}~\7Q\2\2~\f\3\2\2\2\177\u0080\7K\2\2\u0080\u0081\7P\2\2\u0081"+
		"\u0082\7R\2\2\u0082\u0083\7W\2\2\u0083\u0084\7V\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\7V\2\2\u0086\u0087\7T\2\2\u0087\u0088\7C\2\2\u0088\u0089\7R\2\2"+
		"\u0089\20\3\2\2\2\u008a\u008b\7K\2\2\u008b\u008c\7H\2\2\u008c\22\3\2\2"+
		"\2\u008d\u008e\7V\2\2\u008e\u008f\7J\2\2\u008f\u0090\7G\2\2\u0090\u0091"+
		"\7P\2\2\u0091\24\3\2\2\2\u0092\u0093\7G\2\2\u0093\u0094\7P\2\2\u0094\u0095"+
		"\7F\2\2\u0095\26\3\2\2\2\u0096\u0097\7T\2\2\u0097\u0098\7G\2\2\u0098\u0099"+
		"\7O\2\2\u0099\30\3\2\2\2\u009a\u009b\7K\2\2\u009b\u009c\7P\2\2\u009c\u009d"+
		"\7V\2\2\u009d\32\3\2\2\2\u009e\u009f\7U\2\2\u009f\u00a0\7I\2\2\u00a0\u00a1"+
		"\7P\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7S\2\2\u00a4\u00a5"+
		"\7T\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9"+
		"\7U\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad"+
		"\7Q\2\2\u00ad\u00ae\7I\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7N\2\2\u00b0\u00b1"+
		"\7Q\2\2\u00b1\u00b2\7I\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5"+
		"\7Z\2\2\u00b5\u00b6\7R\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9"+
		"\7K\2\2\u00b9\u00ba\7P\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd"+
		"\7Q\2\2\u00bd\u00be\7U\2\2\u00be*\3\2\2\2\u00bf\u00c0\7F\2\2\u00c0\u00c1"+
		"\7G\2\2\u00c1\u00c2\7I\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5"+
		"\7C\2\2\u00c5\u00c6\7F\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7P\2\2\u00c8\u00c9"+
		"\7Q\2\2\u00c9\u00ca\7V\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd"+
		"\7P\2\2\u00cd\u00ce\7F\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1"+
		"\7T\2\2\u00d1\64\3\2\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\66\3\2\2"+
		"\2\u00d7\u00d9\59\35\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db8\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd"+
		":\3\2\2\2\u00de\u00df\7G\2\2\u00df<\3\2\2\2\u00e0\u00e1\7$\2\2\u00e1>"+
		"\3\2\2\2\u00e2\u00e3\7<\2\2\u00e3@\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5B\3"+
		"\2\2\2\u00e6\u00e7\7.\2\2\u00e7D\3\2\2\2\u00e8\u00ec\5\27\f\2\u00e9\u00eb"+
		"\n\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\b#"+
		"\2\2\u00f0F\3\2\2\2\u00f1\u00f5\7$\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\b$\3"+
		"\2\u00faH\3\2\2\2\u00fb\u00fc\7?\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7*\2\2"+
		"\u00feL\3\2\2\2\u00ff\u0100\7+\2\2\u0100N\3\2\2\2\u0101\u0102\7`\2\2\u0102"+
		"P\3\2\2\2\u0103\u0104\7,\2\2\u0104R\3\2\2\2\u0105\u0106\7\61\2\2\u0106"+
		"T\3\2\2\2\u0107\u0108\7/\2\2\u0108V\3\2\2\2\u0109\u010a\7-\2\2\u010aX"+
		"\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d\7@\2\2\u010dZ\3\2\2\2\u010e\u010f"+
		"\7@\2\2\u010f\u0110\7?\2\2\u0110\\\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113"+
		"\7?\2\2\u0113^\3\2\2\2\u0114\u0115\7@\2\2\u0115`\3\2\2\2\u0116\u0117\7"+
		">\2\2\u0117b\3\2\2\2\u0118\u011a\7\17\2\2\u0119\u0118\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\f\2\2\u011cd\3\2\2\2\u011d"+
		"\u011f\t\5\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\63\2\2\u0123"+
		"f\3\2\2\2\t\2\u00d5\u00da\u00ec\u00f5\u0119\u0120\4\b\2\2\3$\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}