// Generated from src\main\java\parser\EZPython4.g4 by ANTLR 4.7.2
 package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EZPython4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, NEQ=2, LTE=3, GTE=4, GT=5, LT=6, PLUS_T=7, MINUS_T=8, MUL_T=9, DIV_T=10, 
		RBRACKET_T=11, LBRACKET_T=12, ASSIGN_T=13, TRUE_T=14, FALSE_T=15, OR_T=16, 
		NOT_T=17, AND_T=18, END_LINE_T=19, NL_T=20, INT_TYPE_T=21, BOOL_TYPE_T=22, 
		WHILE_T=23, LBRACE_T=24, RBRACE_T=25, INT_T=26, VARIABLE_T=27, WHITESPACE_T=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQ", "NEQ", "LTE", "GTE", "GT", "LT", "PLUS_T", "MINUS_T", "MUL_T", 
			"DIV_T", "RBRACKET_T", "LBRACKET_T", "ASSIGN_T", "TRUE_T", "FALSE_T", 
			"OR_T", "NOT_T", "AND_T", "END_LINE_T", "NL_T", "INT_TYPE_T", "BOOL_TYPE_T", 
			"WHILE_T", "LBRACE_T", "RBRACE_T", "INT_T", "VARIABLE_T", "WHITESPACE_T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'\u00E2\u2030\u00A0'", "'<='", "'>='", "'>'", "'<'", "'+'", 
			"'-'", "'*'", "'/'", "')'", "'('", "'='", "'true'", "'false'", "'or'", 
			"'not'", "'and'", "';'", "'\n'", "'int'", "'bool'", "'while'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "NEQ", "LTE", "GTE", "GT", "LT", "PLUS_T", "MINUS_T", "MUL_T", 
			"DIV_T", "RBRACKET_T", "LBRACKET_T", "ASSIGN_T", "TRUE_T", "FALSE_T", 
			"OR_T", "NOT_T", "AND_T", "END_LINE_T", "NL_T", "INT_TYPE_T", "BOOL_TYPE_T", 
			"WHILE_T", "LBRACE_T", "RBRACE_T", "INT_T", "VARIABLE_T", "WHITESPACE_T"
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


	public EZPython4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EZPython4.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u008a"+
		"\n\33\f\33\16\33\u008d\13\33\3\33\5\33\u0090\n\33\3\34\3\34\7\34\u0094"+
		"\n\34\f\34\16\34\u0097\13\34\3\35\6\35\u009a\n\35\r\35\16\35\u009b\3\35"+
		"\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36\3\2\7\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\3;\3\2\2\2\5>\3\2\2\2\7B\3\2\2\2\tE\3\2\2\2\13H\3\2\2\2\rJ\3"+
		"\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31"+
		"V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37_\3\2\2\2!e\3\2\2\2#h\3\2\2\2%l\3"+
		"\2\2\2\'p\3\2\2\2)r\3\2\2\2+t\3\2\2\2-x\3\2\2\2/}\3\2\2\2\61\u0083\3\2"+
		"\2\2\63\u0085\3\2\2\2\65\u008f\3\2\2\2\67\u0091\3\2\2\29\u0099\3\2\2\2"+
		";<\7?\2\2<=\7?\2\2=\4\3\2\2\2>?\7\u00e4\2\2?@\7\u2032\2\2@A\7\u00a2\2"+
		"\2A\6\3\2\2\2BC\7>\2\2CD\7?\2\2D\b\3\2\2\2EF\7@\2\2FG\7?\2\2G\n\3\2\2"+
		"\2HI\7@\2\2I\f\3\2\2\2JK\7>\2\2K\16\3\2\2\2LM\7-\2\2M\20\3\2\2\2NO\7/"+
		"\2\2O\22\3\2\2\2PQ\7,\2\2Q\24\3\2\2\2RS\7\61\2\2S\26\3\2\2\2TU\7+\2\2"+
		"U\30\3\2\2\2VW\7*\2\2W\32\3\2\2\2XY\7?\2\2Y\34\3\2\2\2Z[\7v\2\2[\\\7t"+
		"\2\2\\]\7w\2\2]^\7g\2\2^\36\3\2\2\2_`\7h\2\2`a\7c\2\2ab\7n\2\2bc\7u\2"+
		"\2cd\7g\2\2d \3\2\2\2ef\7q\2\2fg\7t\2\2g\"\3\2\2\2hi\7p\2\2ij\7q\2\2j"+
		"k\7v\2\2k$\3\2\2\2lm\7c\2\2mn\7p\2\2no\7f\2\2o&\3\2\2\2pq\7=\2\2q(\3\2"+
		"\2\2rs\7\f\2\2s*\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w,\3\2\2\2xy\7d\2\2"+
		"yz\7q\2\2z{\7q\2\2{|\7n\2\2|.\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7"+
		"k\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\60\3\2\2\2\u0083\u0084"+
		"\7}\2\2\u0084\62\3\2\2\2\u0085\u0086\7\177\2\2\u0086\64\3\2\2\2\u0087"+
		"\u008b\t\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0090\7\62\2\2\u008f\u0087\3\2\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\66\3\2\2\2\u0091\u0095\t\4\2\2\u0092\u0094\t\5\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u00968\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\t\6\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\35\2\2\u009e:\3\2\2\2\7\2\u008b\u008f\u0095"+
		"\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}