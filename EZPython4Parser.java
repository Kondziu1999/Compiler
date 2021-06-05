// Generated from src/main/java/parser/EZPython4.g4 by ANTLR 4.7.2
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
		NOT_T=17, AND_T=18, END_LINE_T=19, NL_T=20, INT_TYPE_T=21, BOOL_TYPE_T=22, 
		WHILE_T=23, LBRACE_T=24, RBRACE_T=25, INT_T=26, VARIABLE_T=27, WHITESPACE_T=28;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2, RULE_arithmExpr = 3, RULE_term = 4, 
		RULE_variableStmt = 5, RULE_value = 6, RULE_logicalVal = 7, RULE_logicExpr = 8, 
		RULE_logicalOR = 9, RULE_logicalAND = 10, RULE_logicalTerm = 11, RULE_logicalResult = 12, 
		RULE_number = 13, RULE_type = 14, RULE_numberType = 15, RULE_codeSection = 16, 
		RULE_whileStmt = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr", "arithmExpr", "term", "variableStmt", "value", 
			"logicalVal", "logicExpr", "logicalOR", "logicalAND", "logicalTerm", 
			"logicalResult", "number", "type", "numberType", "codeSection", "whileStmt"
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
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET_T) | (1L << NL_T) | (1L << INT_TYPE_T) | (1L << BOOL_TYPE_T) | (1L << WHILE_T) | (1L << INT_T) | (1L << VARIABLE_T))) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET_T:
				case INT_TYPE_T:
				case BOOL_TYPE_T:
				case WHILE_T:
				case INT_T:
				case VARIABLE_T:
					{
					setState(36);
					stmt();
					}
					break;
				case NL_T:
					{
					setState(37);
					match(NL_T);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET_T:
			case INT_T:
			case VARIABLE_T:
				{
				setState(45);
				expr();
				}
				break;
			case INT_TYPE_T:
			case BOOL_TYPE_T:
				{
				setState(46);
				variableStmt();
				}
				break;
			case WHILE_T:
				{
				setState(47);
				whileStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(50);
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
			setState(53);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
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
					setState(55);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(56);
					_la = _input.LA(1);
					if ( !(_la==PLUS_T || _la==MINUS_T) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(57);
					arithmExpr(3);
					}
					} 
				}
				setState(62);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET_T:
				{
				setState(64);
				match(LBRACKET_T);
				setState(65);
				arithmExpr(0);
				setState(66);
				match(RBRACKET_T);
				}
				break;
			case INT_T:
			case VARIABLE_T:
				{
				setState(68);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
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
					setState(71);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(72);
					_la = _input.LA(1);
					if ( !(_la==MUL_T || _la==DIV_T) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(73);
					term(4);
					}
					} 
				}
				setState(78);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(BOOL_TYPE_T);
				setState(80);
				match(VARIABLE_T);
				setState(81);
				match(ASSIGN_T);
				setState(82);
				logicExpr();
				setState(83);
				match(END_LINE_T);
				}
				break;
			case INT_TYPE_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				type();
				setState(86);
				match(VARIABLE_T);
				setState(87);
				match(ASSIGN_T);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(88);
					value();
					}
					break;
				case 2:
					{
					setState(89);
					arithmExpr(0);
					}
					break;
				}
				setState(92);
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
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(VARIABLE_T);
				}
				break;
			case INT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
		enterRule(_localctx, 14, RULE_logicalVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 16, RULE_logicExpr);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				logicalAND();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				logicalOR();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
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

	public static class LogicalORContext extends ParserRuleContext {
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public TerminalNode OR_T() { return getToken(EZPython4Parser.OR_T, 0); }
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
		enterRule(_localctx, 18, RULE_logicalOR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			logicalTerm();
			setState(108);
			match(OR_T);
			setState(109);
			logicalTerm();
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
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public TerminalNode AND_T() { return getToken(EZPython4Parser.AND_T, 0); }
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
		enterRule(_localctx, 20, RULE_logicalAND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			logicalTerm();
			setState(112);
			match(AND_T);
			setState(113);
			logicalTerm();
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
		public LogicalResultContext logicalResult() {
			return getRuleContext(LogicalResultContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_logicalTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			logicalResult(0);
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

	public static class LogicalResultContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LogicalValContext logicalVal() {
			return getRuleContext(LogicalValContext.class,0);
		}
		public List<LogicalResultContext> logicalResult() {
			return getRuleContexts(LogicalResultContext.class);
		}
		public LogicalResultContext logicalResult(int i) {
			return getRuleContext(LogicalResultContext.class,i);
		}
		public TerminalNode EQ() { return getToken(EZPython4Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(EZPython4Parser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(EZPython4Parser.GTE, 0); }
		public TerminalNode LTE() { return getToken(EZPython4Parser.LTE, 0); }
		public TerminalNode GT() { return getToken(EZPython4Parser.GT, 0); }
		public TerminalNode LT() { return getToken(EZPython4Parser.LT, 0); }
		public LogicalResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).enterLogicalResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZPython4Listener ) ((EZPython4Listener)listener).exitLogicalResult(this);
		}
	}

	public final LogicalResultContext logicalResult() throws RecognitionException {
		return logicalResult(0);
	}

	private LogicalResultContext logicalResult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalResultContext _localctx = new LogicalResultContext(_ctx, _parentState);
		LogicalResultContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalResult, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case VARIABLE_T:
				{
				setState(118);
				value();
				}
				break;
			case TRUE_T:
			case FALSE_T:
				{
				setState(119);
				logicalVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalResultContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalResult);
					setState(122);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(123);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LTE) | (1L << GTE) | (1L << GT) | (1L << LT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(124);
					logicalResult(4);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(EZPython4Parser.INT_T, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(INT_T);
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
			setState(132);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(INT_TYPE_T);
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
		enterRule(_localctx, 32, RULE_codeSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET_T) | (1L << INT_TYPE_T) | (1L << BOOL_TYPE_T) | (1L << WHILE_T) | (1L << INT_T) | (1L << VARIABLE_T))) != 0)) {
				{
				{
				setState(136);
				stmt();
				}
				}
				setState(141);
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
		enterRule(_localctx, 34, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE_T);
			setState(143);
			match(LBRACKET_T);
			setState(144);
			logicExpr();
			setState(145);
			match(RBRACKET_T);
			setState(146);
			match(LBRACE_T);
			setState(147);
			codeSection();
			setState(148);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return arithmExpr_sempred((ArithmExprContext)_localctx, predIndex);
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		case 12:
			return logicalResult_sempred((LogicalResultContext)_localctx, predIndex);
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
	private boolean logicalResult_sempred(LogicalResultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\5\7a\n\7\3\b\3\b\5"+
		"\be\n\b\3\t\3\t\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\5\16{\n\16\3\16\3\16\3\16\7\16\u0080\n\16\f"+
		"\16\16\16\u0083\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\7\22\u008c\n"+
		"\22\f\22\16\22\u008f\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\2\5\b\n\32\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3\2\t\n"+
		"\3\2\13\f\3\2\20\21\3\2\3\b\2\u0095\2*\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2"+
		"\2\b\66\3\2\2\2\nG\3\2\2\2\f`\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22k\3\2"+
		"\2\2\24m\3\2\2\2\26q\3\2\2\2\30u\3\2\2\2\32z\3\2\2\2\34\u0084\3\2\2\2"+
		"\36\u0086\3\2\2\2 \u0088\3\2\2\2\"\u008d\3\2\2\2$\u0090\3\2\2\2&)\5\4"+
		"\3\2\')\7\26\2\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-"+
		"\3\2\2\2,*\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\63\5\6\4\2\60\63\5\f\7\2\61\63"+
		"\5$\23\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\5"+
		"\b\5\2\65\7\3\2\2\2\66\67\b\5\1\2\678\5\n\6\28>\3\2\2\29:\f\4\2\2:;\t"+
		"\2\2\2;=\5\b\5\5<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@>"+
		"\3\2\2\2AB\b\6\1\2BC\7\16\2\2CD\5\b\5\2DE\7\r\2\2EH\3\2\2\2FH\5\16\b\2"+
		"GA\3\2\2\2GF\3\2\2\2HN\3\2\2\2IJ\f\5\2\2JK\t\3\2\2KM\5\n\6\6LI\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\7\30\2\2RS\7\35"+
		"\2\2ST\7\17\2\2TU\5\22\n\2UV\7\25\2\2Va\3\2\2\2WX\5\36\20\2XY\7\35\2\2"+
		"Y\\\7\17\2\2Z]\5\16\b\2[]\5\b\5\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^_\7"+
		"\25\2\2_a\3\2\2\2`Q\3\2\2\2`W\3\2\2\2a\r\3\2\2\2be\7\35\2\2ce\5\34\17"+
		"\2db\3\2\2\2dc\3\2\2\2e\17\3\2\2\2fg\t\4\2\2g\21\3\2\2\2hl\5\26\f\2il"+
		"\5\24\13\2jl\5\30\r\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\23\3\2\2\2mn\5\30"+
		"\r\2no\7\22\2\2op\5\30\r\2p\25\3\2\2\2qr\5\30\r\2rs\7\24\2\2st\5\30\r"+
		"\2t\27\3\2\2\2uv\5\32\16\2v\31\3\2\2\2wx\b\16\1\2x{\5\16\b\2y{\5\20\t"+
		"\2zw\3\2\2\2zy\3\2\2\2{\u0081\3\2\2\2|}\f\5\2\2}~\t\5\2\2~\u0080\5\32"+
		"\16\6\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\33\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\34\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\5 \21\2\u0087\37\3\2\2\2\u0088\u0089\7\27\2\2"+
		"\u0089!\3\2\2\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e#\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\7\31\2\2\u0091\u0092\7\16\2\2\u0092\u0093\5\22\n"+
		"\2\u0093\u0094\7\r\2\2\u0094\u0095\7\32\2\2\u0095\u0096\5\"\22\2\u0096"+
		"\u0097\7\33\2\2\u0097%\3\2\2\2\17(*\62>GN\\`dkz\u0081\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}