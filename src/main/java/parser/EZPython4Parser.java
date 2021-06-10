// Generated from src\main\java\parser\EZPython4.g4 by ANTLR 4.7.2
 package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EZPython4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, NEQ=2, LTE=3, GTE=4, GT=5, LT=6, PLUS_T=7, MINUS_T=8, MUL_T=9, DIV_T=10, 
		RBRACKET_T=11, LBRACKET_T=12, ASSIGN_T=13, TRUE_T=14, FALSE_T=15, OR_T=16, 
		NOT_T=17, AND_T=18, END_LINE_T=19, NL_T=20, DOUBLE_TYPE_T=21, INT_TYPE_T=22, 
		BOOL_TYPE_T=23, STRING_TYPE_T=24, QUOTE_T=25, FUNCTION_T=26, IF_T=27, 
		WHILE_T=28, LBRACE_T=29, RBRACE_T=30, PRINT_T=31, COMMA_T=32, DOT_T=33, 
		DOUBLE_T=34, INT_T=35, STRING_T=36, VARIABLE_T=37, WHITESPACE_T=38;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2, RULE_arithmExpr = 3, RULE_term = 4, 
		RULE_variableStmt = 5, RULE_variableReAssignStmt = 6, RULE_value = 7, 
		RULE_logicalVal = 8, RULE_logicExpr = 9, RULE_logicalOR = 10, RULE_logicalAND = 11, 
		RULE_logicalTerm = 12, RULE_number = 13, RULE_type = 14, RULE_numberType = 15, 
		RULE_ifStmt = 16, RULE_codeSection = 17, RULE_whileStmt = 18, RULE_funcStmt = 19, 
		RULE_funcCall = 20, RULE_printFunc = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr", "arithmExpr", "term", "variableStmt", "variableReAssignStmt", 
			"value", "logicalVal", "logicExpr", "logicalOR", "logicalAND", "logicalTerm", 
			"number", "type", "numberType", "ifStmt", "codeSection", "whileStmt", 
			"funcStmt", "funcCall", "printFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'\u00E2\u2030\u00A0'", "'<='", "'>='", "'>'", "'<'", "'+'", 
			"'-'", "'*'", "'/'", "')'", "'('", "'='", "'true'", "'false'", "'or'", 
			"'not'", "'and'", "';'", "'\n'", "'double'", "'int'", "'bool'", "'string'", 
			"'\"'", "'function'", "'if'", "'while'", "'{'", "'}'", "'print'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "NEQ", "LTE", "GTE", "GT", "LT", "PLUS_T", "MINUS_T", "MUL_T", 
			"DIV_T", "RBRACKET_T", "LBRACKET_T", "ASSIGN_T", "TRUE_T", "FALSE_T", 
			"OR_T", "NOT_T", "AND_T", "END_LINE_T", "NL_T", "DOUBLE_TYPE_T", "INT_TYPE_T", 
			"BOOL_TYPE_T", "STRING_TYPE_T", "QUOTE_T", "FUNCTION_T", "IF_T", "WHILE_T", 
			"LBRACE_T", "RBRACE_T", "PRINT_T", "COMMA_T", "DOT_T", "DOUBLE_T", "INT_T", 
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

	@Override
	public String getGrammarFileName() { return "EZPython4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EZPython4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EZPython4Parser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL_T() { return getTokens(EZPython4Parser.NL_T); }
		public TerminalNode NL_T(int i) {
			return getToken(EZPython4Parser.NL_T, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET_T) | (1L << NL_T) | (1L << DOUBLE_TYPE_T) | (1L << INT_TYPE_T) | (1L << BOOL_TYPE_T) | (1L << STRING_TYPE_T) | (1L << FUNCTION_T) | (1L << IF_T) | (1L << WHILE_T) | (1L << PRINT_T) | (1L << DOUBLE_T) | (1L << INT_T) | (1L << VARIABLE_T))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET_T:
				case DOUBLE_TYPE_T:
				case INT_TYPE_T:
				case BOOL_TYPE_T:
				case STRING_TYPE_T:
				case FUNCTION_T:
				case IF_T:
				case WHILE_T:
				case PRINT_T:
				case DOUBLE_T:
				case INT_T:
				case VARIABLE_T:
					{
					setState(44);
					stmt();
					}
					break;
				case NL_T:
					{
					setState(45);
					match(NL_T);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(EOF);
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public FuncStmtContext funcStmt() {
			return getRuleContext(FuncStmtContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public VariableReAssignStmtContext variableReAssignStmt() {
			return getRuleContext(VariableReAssignStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(53);
				expr();
				}
				break;
			case 2:
				{
				setState(54);
				variableStmt();
				}
				break;
			case 3:
				{
				setState(55);
				whileStmt();
				}
				break;
			case 4:
				{
				setState(56);
				ifStmt();
				}
				break;
			case 5:
				{
				setState(57);
				funcStmt();
				}
				break;
			case 6:
				{
				setState(58);
				funcCall();
				}
				break;
			case 7:
				{
				setState(59);
				printFunc();
				}
				break;
			case 8:
				{
				setState(60);
				variableReAssignStmt();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ArithmExprContext arithmExpr() {
			return getRuleContext(ArithmExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			arithmExpr(0);
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

	public static class ArithmExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ArithmExprContext> arithmExpr() {
			return getRuleContexts(ArithmExprContext.class);
		}
		public ArithmExprContext arithmExpr(int i) {
			return getRuleContext(ArithmExprContext.class,i);
		}
		public TerminalNode PLUS_T() { return getToken(EZPython4Parser.PLUS_T, 0); }
		public TerminalNode MINUS_T() { return getToken(EZPython4Parser.MINUS_T, 0); }
		public ArithmExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterArithmExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitArithmExpr(this);
		}
	}

	public final ArithmExprContext arithmExpr() throws RecognitionException {
		return arithmExpr(0);
	}

	private ArithmExprContext arithmExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmExprContext _localctx = new ArithmExprContext(_ctx, _parentState);
		ArithmExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_arithmExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmExpr);
					setState(68);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69);
					_la = _input.LA(1);
					if ( !(_la==PLUS_T || _la==MINUS_T) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(70);
					arithmExpr(3);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode LBRACKET_T() { return getToken(EZPython4Parser.LBRACKET_T, 0); }
		public ArithmExprContext arithmExpr() {
			return getRuleContext(ArithmExprContext.class,0);
		}
		public TerminalNode RBRACKET_T() { return getToken(EZPython4Parser.RBRACKET_T, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MUL_T() { return getToken(EZPython4Parser.MUL_T, 0); }
		public TerminalNode DIV_T() { return getToken(EZPython4Parser.DIV_T, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET_T:
				{
				setState(77);
				match(LBRACKET_T);
				setState(78);
				arithmExpr(0);
				setState(79);
				match(RBRACKET_T);
				}
				break;
			case DOUBLE_T:
			case INT_T:
			case VARIABLE_T:
				{
				setState(81);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(84);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==MUL_T || _la==DIV_T) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(86);
					term(4);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class VariableStmtContext extends ParserRuleContext {
		public TerminalNode BOOL_TYPE_T() { return getToken(EZPython4Parser.BOOL_TYPE_T, 0); }
		public TerminalNode VARIABLE_T() { return getToken(EZPython4Parser.VARIABLE_T, 0); }
		public TerminalNode ASSIGN_T() { return getToken(EZPython4Parser.ASSIGN_T, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode END_LINE_T() { return getToken(EZPython4Parser.END_LINE_T, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithmExprContext arithmExpr() {
			return getRuleContext(ArithmExprContext.class,0);
		}
		public TerminalNode STRING_TYPE_T() { return getToken(EZPython4Parser.STRING_TYPE_T, 0); }
		public TerminalNode STRING_T() { return getToken(EZPython4Parser.STRING_T, 0); }
		public VariableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterVariableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitVariableStmt(this);
		}
	}

	public final VariableStmtContext variableStmt() throws RecognitionException {
		VariableStmtContext _localctx = new VariableStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableStmt);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(BOOL_TYPE_T);
				setState(93);
				match(VARIABLE_T);
				setState(94);
				match(ASSIGN_T);
				setState(95);
				logicExpr();
				setState(96);
				match(END_LINE_T);
				}
				break;
			case DOUBLE_TYPE_T:
			case INT_TYPE_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				type();
				setState(99);
				match(VARIABLE_T);
				setState(100);
				match(ASSIGN_T);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(101);
					value();
					}
					break;
				case 2:
					{
					setState(102);
					arithmExpr(0);
					}
					break;
				}
				setState(105);
				match(END_LINE_T);
				}
				break;
			case STRING_TYPE_T:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(STRING_TYPE_T);
				setState(108);
				match(VARIABLE_T);
				setState(109);
				match(ASSIGN_T);
				setState(110);
				match(STRING_T);
				setState(111);
				match(END_LINE_T);
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

	public static class VariableReAssignStmtContext extends ParserRuleContext {
		public TerminalNode VARIABLE_T() { return getToken(EZPython4Parser.VARIABLE_T, 0); }
		public TerminalNode ASSIGN_T() { return getToken(EZPython4Parser.ASSIGN_T, 0); }
		public TerminalNode END_LINE_T() { return getToken(EZPython4Parser.END_LINE_T, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode STRING_T() { return getToken(EZPython4Parser.STRING_T, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithmExprContext arithmExpr() {
			return getRuleContext(ArithmExprContext.class,0);
		}
		public VariableReAssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReAssignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterVariableReAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitVariableReAssignStmt(this);
		}
	}

	public final VariableReAssignStmtContext variableReAssignStmt() throws RecognitionException {
		VariableReAssignStmtContext _localctx = new VariableReAssignStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableReAssignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(VARIABLE_T);
			setState(115);
			match(ASSIGN_T);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(116);
					value();
					}
					break;
				case 2:
					{
					setState(117);
					arithmExpr(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(120);
				logicExpr();
				}
				break;
			case 3:
				{
				setState(121);
				match(STRING_T);
				}
				break;
			}
			setState(124);
			match(END_LINE_T);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VARIABLE_T() { return getToken(EZPython4Parser.VARIABLE_T, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(VARIABLE_T);
				}
				break;
			case DOUBLE_T:
			case INT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				number();
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

	public static class LogicalValContext extends ParserRuleContext {
		public TerminalNode TRUE_T() { return getToken(EZPython4Parser.TRUE_T, 0); }
		public TerminalNode FALSE_T() { return getToken(EZPython4Parser.FALSE_T, 0); }
		public LogicalValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterLogicalVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitLogicalVal(this);
		}
	}

	public final LogicalValContext logicalVal() throws RecognitionException {
		LogicalValContext _localctx = new LogicalValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==TRUE_T || _la==FALSE_T) ) {
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

	public static class LogicExprContext extends ParserRuleContext {
		public LogicalANDContext logicalAND() {
			return getRuleContext(LogicalANDContext.class,0);
		}
		public LogicalORContext logicalOR() {
			return getRuleContext(LogicalORContext.class,0);
		}
		public LogicalTermContext logicalTerm() {
			return getRuleContext(LogicalTermContext.class,0);
		}
		public LogicalValContext logicalVal() {
			return getRuleContext(LogicalValContext.class,0);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitLogicExpr(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicExpr);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				logicalAND();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				logicalOR();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				logicalTerm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				logicalVal();
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

	public static class LogicalORContext extends ParserRuleContext {
		public List<LogicalValContext> logicalVal() {
			return getRuleContexts(LogicalValContext.class);
		}
		public LogicalValContext logicalVal(int i) {
			return getRuleContext(LogicalValContext.class,i);
		}
		public TerminalNode OR_T() { return getToken(EZPython4Parser.OR_T, 0); }
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public LogicalORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterLogicalOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitLogicalOR(this);
		}
	}

	public final LogicalORContext logicalOR() throws RecognitionException {
		LogicalORContext _localctx = new LogicalORContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicalOR);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				logicalVal();
				setState(139);
				match(OR_T);
				setState(140);
				logicalVal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				logicalTerm();
				setState(143);
				match(OR_T);
				setState(144);
				logicalTerm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				logicalTerm();
				setState(147);
				match(OR_T);
				setState(148);
				logicalVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				logicalVal();
				setState(151);
				match(OR_T);
				setState(152);
				logicalTerm();
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

	public static class LogicalANDContext extends ParserRuleContext {
		public List<LogicalValContext> logicalVal() {
			return getRuleContexts(LogicalValContext.class);
		}
		public LogicalValContext logicalVal(int i) {
			return getRuleContext(LogicalValContext.class,i);
		}
		public TerminalNode AND_T() { return getToken(EZPython4Parser.AND_T, 0); }
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public LogicalANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterLogicalAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitLogicalAND(this);
		}
	}

	public final LogicalANDContext logicalAND() throws RecognitionException {
		LogicalANDContext _localctx = new LogicalANDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalAND);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				logicalVal();
				setState(157);
				match(AND_T);
				setState(158);
				logicalVal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				logicalTerm();
				setState(161);
				match(AND_T);
				setState(162);
				logicalTerm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				logicalTerm();
				setState(165);
				match(AND_T);
				setState(166);
				logicalVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				logicalVal();
				setState(169);
				match(AND_T);
				setState(170);
				logicalTerm();
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

	public static class LogicalTermContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode EQ() { return getToken(EZPython4Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(EZPython4Parser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(EZPython4Parser.GTE, 0); }
		public TerminalNode LTE() { return getToken(EZPython4Parser.LTE, 0); }
		public TerminalNode GT() { return getToken(EZPython4Parser.GT, 0); }
		public TerminalNode LT() { return getToken(EZPython4Parser.LT, 0); }
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitLogicalTerm(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalTerm);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				value();
				setState(175);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LTE) | (1L << GTE) | (1L << GT) | (1L << LT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				value();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(EZPython4Parser.INT_T, 0); }
		public TerminalNode DOUBLE_T() { return getToken(EZPython4Parser.DOUBLE_T, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_T || _la==INT_T) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public NumberTypeContext numberType() {
			return getRuleContext(NumberTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			numberType();
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

	public static class NumberTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE_T() { return getToken(EZPython4Parser.INT_TYPE_T, 0); }
		public TerminalNode DOUBLE_TYPE_T() { return getToken(EZPython4Parser.DOUBLE_TYPE_T, 0); }
		public NumberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterNumberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitNumberType(this);
		}
	}

	public final NumberTypeContext numberType() throws RecognitionException {
		NumberTypeContext _localctx = new NumberTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numberType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_TYPE_T || _la==INT_TYPE_T) ) {
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF_T() { return getToken(EZPython4Parser.IF_T, 0); }
		public TerminalNode LBRACKET_T() { return getToken(EZPython4Parser.LBRACKET_T, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode RBRACKET_T() { return getToken(EZPython4Parser.RBRACKET_T, 0); }
		public TerminalNode LBRACE_T() { return getToken(EZPython4Parser.LBRACE_T, 0); }
		public CodeSectionContext codeSection() {
			return getRuleContext(CodeSectionContext.class,0);
		}
		public TerminalNode RBRACE_T() { return getToken(EZPython4Parser.RBRACE_T, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IF_T);
			setState(188);
			match(LBRACKET_T);
			setState(189);
			logicExpr();
			setState(190);
			match(RBRACKET_T);
			setState(191);
			match(LBRACE_T);
			setState(192);
			codeSection();
			setState(193);
			match(RBRACE_T);
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

	public static class CodeSectionContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL_T() { return getTokens(EZPython4Parser.NL_T); }
		public TerminalNode NL_T(int i) {
			return getToken(EZPython4Parser.NL_T, i);
		}
		public CodeSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterCodeSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitCodeSection(this);
		}
	}

	public final CodeSectionContext codeSection() throws RecognitionException {
		CodeSectionContext _localctx = new CodeSectionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_codeSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET_T) | (1L << NL_T) | (1L << DOUBLE_TYPE_T) | (1L << INT_TYPE_T) | (1L << BOOL_TYPE_T) | (1L << STRING_TYPE_T) | (1L << FUNCTION_T) | (1L << IF_T) | (1L << WHILE_T) | (1L << PRINT_T) | (1L << DOUBLE_T) | (1L << INT_T) | (1L << VARIABLE_T))) != 0)) {
				{
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET_T:
				case DOUBLE_TYPE_T:
				case INT_TYPE_T:
				case BOOL_TYPE_T:
				case STRING_TYPE_T:
				case FUNCTION_T:
				case IF_T:
				case WHILE_T:
				case PRINT_T:
				case DOUBLE_T:
				case INT_T:
				case VARIABLE_T:
					{
					setState(195);
					stmt();
					}
					break;
				case NL_T:
					{
					setState(196);
					match(NL_T);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE_T() { return getToken(EZPython4Parser.WHILE_T, 0); }
		public TerminalNode LBRACKET_T() { return getToken(EZPython4Parser.LBRACKET_T, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode RBRACKET_T() { return getToken(EZPython4Parser.RBRACKET_T, 0); }
		public TerminalNode LBRACE_T() { return getToken(EZPython4Parser.LBRACE_T, 0); }
		public CodeSectionContext codeSection() {
			return getRuleContext(CodeSectionContext.class,0);
		}
		public TerminalNode RBRACE_T() { return getToken(EZPython4Parser.RBRACE_T, 0); }
		public List<TerminalNode> NL_T() { return getTokens(EZPython4Parser.NL_T); }
		public TerminalNode NL_T(int i) {
			return getToken(EZPython4Parser.NL_T, i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(WHILE_T);
			setState(203);
			match(LBRACKET_T);
			setState(204);
			logicExpr();
			setState(205);
			match(RBRACKET_T);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL_T) {
				{
				{
				setState(206);
				match(NL_T);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(LBRACE_T);
			setState(213);
			codeSection();
			setState(214);
			match(RBRACE_T);
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

	public static class FuncStmtContext extends ParserRuleContext {
		public TerminalNode FUNCTION_T() { return getToken(EZPython4Parser.FUNCTION_T, 0); }
		public TerminalNode VARIABLE_T() { return getToken(EZPython4Parser.VARIABLE_T, 0); }
		public TerminalNode LBRACKET_T() { return getToken(EZPython4Parser.LBRACKET_T, 0); }
		public TerminalNode RBRACKET_T() { return getToken(EZPython4Parser.RBRACKET_T, 0); }
		public TerminalNode LBRACE_T() { return getToken(EZPython4Parser.LBRACE_T, 0); }
		public CodeSectionContext codeSection() {
			return getRuleContext(CodeSectionContext.class,0);
		}
		public TerminalNode RBRACE_T() { return getToken(EZPython4Parser.RBRACE_T, 0); }
		public List<TerminalNode> NL_T() { return getTokens(EZPython4Parser.NL_T); }
		public TerminalNode NL_T(int i) {
			return getToken(EZPython4Parser.NL_T, i);
		}
		public FuncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterFuncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitFuncStmt(this);
		}
	}

	public final FuncStmtContext funcStmt() throws RecognitionException {
		FuncStmtContext _localctx = new FuncStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FUNCTION_T);
			setState(217);
			match(VARIABLE_T);
			setState(218);
			match(LBRACKET_T);
			setState(219);
			match(RBRACKET_T);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL_T) {
				{
				{
				setState(220);
				match(NL_T);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(LBRACE_T);
			setState(227);
			codeSection();
			setState(228);
			match(RBRACE_T);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode VARIABLE_T() { return getToken(EZPython4Parser.VARIABLE_T, 0); }
		public TerminalNode LBRACKET_T() { return getToken(EZPython4Parser.LBRACKET_T, 0); }
		public TerminalNode RBRACKET_T() { return getToken(EZPython4Parser.RBRACKET_T, 0); }
		public TerminalNode END_LINE_T() { return getToken(EZPython4Parser.END_LINE_T, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(VARIABLE_T);
			setState(231);
			match(LBRACKET_T);
			setState(232);
			match(RBRACKET_T);
			setState(233);
			match(END_LINE_T);
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

	public static class PrintFuncContext extends ParserRuleContext {
		public TerminalNode PRINT_T() { return getToken(EZPython4Parser.PRINT_T, 0); }
		public TerminalNode LBRACKET_T() { return getToken(EZPython4Parser.LBRACKET_T, 0); }
		public TerminalNode RBRACKET_T() { return getToken(EZPython4Parser.RBRACKET_T, 0); }
		public TerminalNode END_LINE_T() { return getToken(EZPython4Parser.END_LINE_T, 0); }
		public TerminalNode STRING_T() { return getToken(EZPython4Parser.STRING_T, 0); }
		public TerminalNode VARIABLE_T() { return getToken(EZPython4Parser.VARIABLE_T, 0); }
		public TerminalNode COMMA_T() { return getToken(EZPython4Parser.COMMA_T, 0); }
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterPrintFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitPrintFunc(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PRINT_T);
			setState(236);
			match(LBRACKET_T);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(237);
				match(STRING_T);
				}
				break;
			case 2:
				{
				{
				setState(238);
				match(STRING_T);
				setState(239);
				match(COMMA_T);
				setState(240);
				match(VARIABLE_T);
				}
				}
				break;
			case 3:
				{
				setState(241);
				match(VARIABLE_T);
				}
				break;
			}
			setState(244);
			match(RBRACKET_T);
			setState(245);
			match(END_LINE_T);
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
		case 3:
			return arithmExpr_sempred((ArithmExprContext)_localctx, predIndex);
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmExpr_sempred(ArithmExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6U\n\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n"+
		"\7\3\b\3\b\3\b\3\b\5\by\n\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\t\3\t\5\t\u0083"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00c8\n\23\f\23\16"+
		"\23\u00cb\13\23\3\24\3\24\3\24\3\24\3\24\7\24\u00d2\n\24\f\24\16\24\u00d5"+
		"\13\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00e0\n\25\f"+
		"\25\16\25\u00e3\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f5\n\27\3\27\3\27\3\27\3\27\2\4"+
		"\b\n\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\b\3\2\t\n\3\2"+
		"\13\f\3\2\20\21\3\2\3\b\3\2$%\3\2\27\30\2\u0106\2\62\3\2\2\2\4?\3\2\2"+
		"\2\6A\3\2\2\2\bC\3\2\2\2\nT\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20\u0082\3"+
		"\2\2\2\22\u0084\3\2\2\2\24\u008a\3\2\2\2\26\u009c\3\2\2\2\30\u00ae\3\2"+
		"\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3\2\2\2 \u00bb\3\2\2\2"+
		"\"\u00bd\3\2\2\2$\u00c9\3\2\2\2&\u00cc\3\2\2\2(\u00da\3\2\2\2*\u00e8\3"+
		"\2\2\2,\u00ed\3\2\2\2.\61\5\4\3\2/\61\7\26\2\2\60.\3\2\2\2\60/\3\2\2\2"+
		"\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2"+
		"\65\66\7\2\2\3\66\3\3\2\2\2\67@\5\6\4\28@\5\f\7\29@\5&\24\2:@\5\"\22\2"+
		";@\5(\25\2<@\5*\26\2=@\5,\27\2>@\5\16\b\2?\67\3\2\2\2?8\3\2\2\2?9\3\2"+
		"\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\5"+
		"\b\5\2B\7\3\2\2\2CD\b\5\1\2DE\5\n\6\2EK\3\2\2\2FG\f\4\2\2GH\t\2\2\2HJ"+
		"\5\b\5\5IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2"+
		"NO\b\6\1\2OP\7\16\2\2PQ\5\b\5\2QR\7\r\2\2RU\3\2\2\2SU\5\20\t\2TN\3\2\2"+
		"\2TS\3\2\2\2U[\3\2\2\2VW\f\5\2\2WX\t\3\2\2XZ\5\n\6\6YV\3\2\2\2Z]\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\\13\3\2\2\2][\3\2\2\2^_\7\31\2\2_`\7\'\2\2`a"+
		"\7\17\2\2ab\5\24\13\2bc\7\25\2\2cs\3\2\2\2de\5\36\20\2ef\7\'\2\2fi\7\17"+
		"\2\2gj\5\20\t\2hj\5\b\5\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7\25\2\2ls\3"+
		"\2\2\2mn\7\32\2\2no\7\'\2\2op\7\17\2\2pq\7&\2\2qs\7\25\2\2r^\3\2\2\2r"+
		"d\3\2\2\2rm\3\2\2\2s\r\3\2\2\2tu\7\'\2\2u|\7\17\2\2vy\5\20\t\2wy\5\b\5"+
		"\2xv\3\2\2\2xw\3\2\2\2y}\3\2\2\2z}\5\24\13\2{}\7&\2\2|x\3\2\2\2|z\3\2"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~\177\7\25\2\2\177\17\3\2\2\2\u0080\u0083\7\'"+
		"\2\2\u0081\u0083\5\34\17\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\21\3\2\2\2\u0084\u0085\t\4\2\2\u0085\23\3\2\2\2\u0086\u008b\5\30\r\2"+
		"\u0087\u008b\5\26\f\2\u0088\u008b\5\32\16\2\u0089\u008b\5\22\n\2\u008a"+
		"\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\25\3\2\2\2\u008c\u008d\5\22\n\2\u008d\u008e\7\22\2\2\u008e"+
		"\u008f\5\22\n\2\u008f\u009d\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092"+
		"\7\22\2\2\u0092\u0093\5\32\16\2\u0093\u009d\3\2\2\2\u0094\u0095\5\32\16"+
		"\2\u0095\u0096\7\22\2\2\u0096\u0097\5\22\n\2\u0097\u009d\3\2\2\2\u0098"+
		"\u0099\5\22\n\2\u0099\u009a\7\22\2\2\u009a\u009b\5\32\16\2\u009b\u009d"+
		"\3\2\2\2\u009c\u008c\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0094\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7\24"+
		"\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00af\3\2\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7\24\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00af\3\2\2\2\u00a6\u00a7"+
		"\5\32\16\2\u00a7\u00a8\7\24\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00af\3\2\2"+
		"\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\5\32\16\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a6\3\2"+
		"\2\2\u00ae\u00aa\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2"+
		"\t\5\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5\20\t\2"+
		"\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8"+
		"\t\6\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba\37\3\2\2\2\u00bb\u00bc"+
		"\t\7\2\2\u00bc!\3\2\2\2\u00bd\u00be\7\35\2\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\u00c0\5\24\13\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\7\37\2\2\u00c2\u00c3"+
		"\5$\23\2\u00c3\u00c4\7 \2\2\u00c4#\3\2\2\2\u00c5\u00c8\5\4\3\2\u00c6\u00c8"+
		"\7\26\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cc\u00cd\7\36\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\5\24\13\2"+
		"\u00cf\u00d3\7\r\2\2\u00d0\u00d2\7\26\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7\37\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9\7"+
		" \2\2\u00d9\'\3\2\2\2\u00da\u00db\7\34\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd"+
		"\7\16\2\2\u00dd\u00e1\7\r\2\2\u00de\u00e0\7\26\2\2\u00df\u00de\3\2\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00e6\5$\23\2"+
		"\u00e6\u00e7\7 \2\2\u00e7)\3\2\2\2\u00e8\u00e9\7\'\2\2\u00e9\u00ea\7\16"+
		"\2\2\u00ea\u00eb\7\r\2\2\u00eb\u00ec\7\25\2\2\u00ec+\3\2\2\2\u00ed\u00ee"+
		"\7!\2\2\u00ee\u00f4\7\16\2\2\u00ef\u00f5\7&\2\2\u00f0\u00f1\7&\2\2\u00f1"+
		"\u00f2\7\"\2\2\u00f2\u00f5\7\'\2\2\u00f3\u00f5\7\'\2\2\u00f4\u00ef\3\2"+
		"\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\7\r\2\2\u00f7\u00f8\7\25\2\2\u00f8-\3\2\2\2\26\60\62?KT[irx|\u0082"+
		"\u008a\u009c\u00ae\u00b5\u00c7\u00c9\u00d3\u00e1\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}