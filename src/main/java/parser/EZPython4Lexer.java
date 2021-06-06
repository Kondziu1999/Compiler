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
		STRING_TYPE_T=23, QUOTE_T=24, WHILE_T=25, LBRACE_T=26, RBRACE_T=27, INT_T=28, 
		STRING_T=29, VARIABLE_T=30, WHITESPACE_T=31;
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
			"STRING_TYPE_T", "QUOTE_T", "WHILE_T", "LBRACE_T", "RBRACE_T", "INT_T", 
			"STRING_T", "VARIABLE_T", "WHITESPACE_T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'\u00E2\u2030\u00A0'", "'<='", "'>='", "'>'", "'<'", "'+'", 
			"'-'", "'*'", "'/'", "')'", "'('", "'='", "'true'", "'false'", "'or'", 
			"'not'", "'and'", "';'", "'\n'", "'int'", "'bool'", "'string'", "'\"'", 
			"'while'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "NEQ", "LTE", "GTE", "GT", "LT", "PLUS_T", "MINUS_T", "MUL_T", 
			"DIV_T", "RBRACKET_T", "LBRACKET_T", "ASSIGN_T", "TRUE_T", "FALSE_T", 
			"OR_T", "NOT_T", "AND_T", "END_LINE_T", "NL_T", "INT_TYPE_T", "BOOL_TYPE_T", 
			"STRING_TYPE_T", "QUOTE_T", "WHILE_T", "LBRACE_T", "RBRACE_T", "INT_T", 
			"STRING_T", "VARIABLE_T", "WHITESPACE_T"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0099\n\35"+
		"\f\35\16\35\u009c\13\35\3\35\5\35\u009f\n\35\3\36\3\36\7\36\u00a3\n\36"+
		"\f\36\16\36\u00a6\13\36\3\36\3\36\3\37\3\37\7\37\u00ac\n\37\f\37\16\37"+
		"\u00af\13\37\3 \6 \u00b2\n \r \16 \u00b3\3 \3 \2\2!\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\7\3\2\63;"+
		"\3\2\62;\6\2\62;C\\aac|\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u00bb\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5D\3\2\2\2\7H\3\2\2\2\tK\3\2\2\2\13N\3"+
		"\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27Z"+
		"\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37e\3\2\2\2!k\3\2\2\2#n"+
		"\3\2\2\2%r\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-~\3\2\2\2/\u0083\3\2"+
		"\2\2\61\u008a\3\2\2\2\63\u008c\3\2\2\2\65\u0092\3\2\2\2\67\u0094\3\2\2"+
		"\29\u009e\3\2\2\2;\u00a0\3\2\2\2=\u00a9\3\2\2\2?\u00b1\3\2\2\2AB\7?\2"+
		"\2BC\7?\2\2C\4\3\2\2\2DE\7\u00e4\2\2EF\7\u2032\2\2FG\7\u00a2\2\2G\6\3"+
		"\2\2\2HI\7>\2\2IJ\7?\2\2J\b\3\2\2\2KL\7@\2\2LM\7?\2\2M\n\3\2\2\2NO\7@"+
		"\2\2O\f\3\2\2\2PQ\7>\2\2Q\16\3\2\2\2RS\7-\2\2S\20\3\2\2\2TU\7/\2\2U\22"+
		"\3\2\2\2VW\7,\2\2W\24\3\2\2\2XY\7\61\2\2Y\26\3\2\2\2Z[\7+\2\2[\30\3\2"+
		"\2\2\\]\7*\2\2]\32\3\2\2\2^_\7?\2\2_\34\3\2\2\2`a\7v\2\2ab\7t\2\2bc\7"+
		"w\2\2cd\7g\2\2d\36\3\2\2\2ef\7h\2\2fg\7c\2\2gh\7n\2\2hi\7u\2\2ij\7g\2"+
		"\2j \3\2\2\2kl\7q\2\2lm\7t\2\2m\"\3\2\2\2no\7p\2\2op\7q\2\2pq\7v\2\2q"+
		"$\3\2\2\2rs\7c\2\2st\7p\2\2tu\7f\2\2u&\3\2\2\2vw\7=\2\2w(\3\2\2\2xy\7"+
		"\f\2\2y*\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2},\3\2\2\2~\177\7d\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081\u0082\7n\2\2\u0082.\3\2\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u0085\7v\2\2\u0085\u0086\7t\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089\60\3\2\2\2\u008a\u008b\7"+
		"$\2\2\u008b\62\3\2\2\2\u008c\u008d\7y\2\2\u008d\u008e\7j\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\64\3\2\2\2\u0092\u0093"+
		"\7}\2\2\u0093\66\3\2\2\2\u0094\u0095\7\177\2\2\u00958\3\2\2\2\u0096\u009a"+
		"\t\2\2\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\7\62\2\2\u009e\u0096\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		":\3\2\2\2\u00a0\u00a4\5\61\31\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5\61\31\2\u00a8<\3\2\2\2\u00a9"+
		"\u00ad\t\5\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae>\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b2\t\6\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b "+
		"\2\2\u00b6@\3\2\2\2\b\2\u009a\u009e\u00a4\u00ad\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}