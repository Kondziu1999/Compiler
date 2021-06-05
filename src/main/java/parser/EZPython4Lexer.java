// Generated from EZPython4.g4 by ANTLR 4.7.2
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
		PLUS_T=1, MINUS_T=2, MUL_T=3, DIV_T=4, RBRACKET_T=5, LBRACKET_T=6, ASSIGN_T=7, 
		TRUE_T=8, FALSE_T=9, OR_T=10, NOT_T=11, AND_T=12, END_LINE_T=13, NL_T=14, 
		INT_TYPE_T=15, BOOL_TYPE_T=16, WHILE_T=17, LBRACE_T=18, RBRACE_T=19, INT_T=20, 
		VARIABLE_T=21, WHITESPACE_T=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS_T", "MINUS_T", "MUL_T", "DIV_T", "RBRACKET_T", "LBRACKET_T", "ASSIGN_T", 
			"TRUE_T", "FALSE_T", "OR_T", "NOT_T", "AND_T", "END_LINE_T", "NL_T", 
			"INT_TYPE_T", "BOOL_TYPE_T", "WHILE_T", "LBRACE_T", "RBRACE_T", "INT_T", 
			"VARIABLE_T", "WHITESPACE_T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "')'", "'('", "'='", "'true'", "'false'", 
			"'or'", "'not'", "'and'", "';'", "'\n'", "'int'", "'bool'", "'while'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS_T", "MINUS_T", "MUL_T", "DIV_T", "RBRACKET_T", "LBRACKET_T", 
			"ASSIGN_T", "TRUE_T", "FALSE_T", "OR_T", "NOT_T", "AND_T", "END_LINE_T", 
			"NL_T", "INT_TYPE_T", "BOOL_TYPE_T", "WHILE_T", "LBRACE_T", "RBRACE_T", 
			"INT_T", "VARIABLE_T", "WHITESPACE_T"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25m\n\25\f\25\16\25"+
		"p\13\25\3\25\5\25s\n\25\3\26\3\26\7\26w\n\26\f\26\16\26z\13\26\3\27\6"+
		"\27}\n\27\r\27\16\27~\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\7\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u0085\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3"+
		"/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2"+
		"\2\2\17;\3\2\2\2\21=\3\2\2\2\23B\3\2\2\2\25H\3\2\2\2\27K\3\2\2\2\31O\3"+
		"\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2![\3\2\2\2#`\3\2\2\2%f\3\2\2"+
		"\2\'h\3\2\2\2)r\3\2\2\2+t\3\2\2\2-|\3\2\2\2/\60\7-\2\2\60\4\3\2\2\2\61"+
		"\62\7/\2\2\62\6\3\2\2\2\63\64\7,\2\2\64\b\3\2\2\2\65\66\7\61\2\2\66\n"+
		"\3\2\2\2\678\7+\2\28\f\3\2\2\29:\7*\2\2:\16\3\2\2\2;<\7?\2\2<\20\3\2\2"+
		"\2=>\7v\2\2>?\7t\2\2?@\7w\2\2@A\7g\2\2A\22\3\2\2\2BC\7h\2\2CD\7c\2\2D"+
		"E\7n\2\2EF\7u\2\2FG\7g\2\2G\24\3\2\2\2HI\7q\2\2IJ\7t\2\2J\26\3\2\2\2K"+
		"L\7p\2\2LM\7q\2\2MN\7v\2\2N\30\3\2\2\2OP\7c\2\2PQ\7p\2\2QR\7f\2\2R\32"+
		"\3\2\2\2ST\7=\2\2T\34\3\2\2\2UV\7\f\2\2V\36\3\2\2\2WX\7k\2\2XY\7p\2\2"+
		"YZ\7v\2\2Z \3\2\2\2[\\\7d\2\2\\]\7q\2\2]^\7q\2\2^_\7n\2\2_\"\3\2\2\2`"+
		"a\7y\2\2ab\7j\2\2bc\7k\2\2cd\7n\2\2de\7g\2\2e$\3\2\2\2fg\7}\2\2g&\3\2"+
		"\2\2hi\7\177\2\2i(\3\2\2\2jn\t\2\2\2km\t\3\2\2lk\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2os\3\2\2\2pn\3\2\2\2qs\7\62\2\2rj\3\2\2\2rq\3\2\2\2s*"+
		"\3\2\2\2tx\t\4\2\2uw\t\5\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y"+
		",\3\2\2\2zx\3\2\2\2{}\t\6\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\b\27\2\2\u0081.\3\2\2\2\7\2nrx~\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}