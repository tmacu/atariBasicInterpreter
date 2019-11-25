// Generated from /home/fatjoker/IdeaProjects/AtariBasic/novisitor/Atari.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtariParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_instruction = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_fPrint = 4, RULE_fList = 5, RULE_fGoto = 6, RULE_fInput = 7, RULE_fTrap = 8, 
		RULE_fIf = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "instruction", "statement", "expr", "fPrint", "fList", "fGoto", 
			"fInput", "fTrap", "fIf"
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

	@Override
	public String getGrammarFileName() { return "Atari.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AtariParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AtariParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				instruction();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(25);
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AtariParser.NUMBER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NL() { return getToken(AtariParser.NL, 0); }
		public List<TerminalNode> COLON() { return getTokens(AtariParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AtariParser.COLON, i);
		}
		public TerminalNode COMMENT() { return getToken(AtariParser.COMMENT, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(NUMBER);
			setState(28);
			statement();
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(29);
					match(COLON);
					setState(30);
					statement();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(36);
				match(COMMENT);
				}
			}

			setState(39);
			match(NL);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SPrintContext extends StatementContext {
		public FPrintContext fPrint() {
			return getRuleContext(FPrintContext.class,0);
		}
		public SPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SGotoContext extends StatementContext {
		public FGotoContext fGoto() {
			return getRuleContext(FGotoContext.class,0);
		}
		public SGotoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIfContext extends StatementContext {
		public FIfContext fIf() {
			return getRuleContext(FIfContext.class,0);
		}
		public SIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SInputContext extends StatementContext {
		public FInputContext fInput() {
			return getRuleContext(FInputContext.class,0);
		}
		public SInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SListContext extends StatementContext {
		public FListContext fList() {
			return getRuleContext(FListContext.class,0);
		}
		public SListContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SAssignValueContext extends StatementContext {
		public TerminalNode VAR() { return getToken(AtariParser.VAR, 0); }
		public TerminalNode ASS() { return getToken(AtariParser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SAssignValueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementTodoContext extends StatementContext {
		public TerminalNode F_END() { return getToken(AtariParser.F_END, 0); }
		public TerminalNode F_DEG() { return getToken(AtariParser.F_DEG, 0); }
		public TerminalNode F_RAD() { return getToken(AtariParser.F_RAD, 0); }
		public StatementTodoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitStatementTodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STrapContext extends StatementContext {
		public FTrapContext fTrap() {
			return getRuleContext(FTrapContext.class,0);
		}
		public STrapContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitSTrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_END:
			case F_DEG:
			case F_RAD:
				_localctx = new StatementTodoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << F_END) | (1L << F_DEG) | (1L << F_RAD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case F_PRINT:
				_localctx = new SPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				fPrint();
				}
				break;
			case F_LIST:
				_localctx = new SListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				fList();
				}
				break;
			case F_GOTO:
				_localctx = new SGotoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				fGoto();
				}
				break;
			case F_INTPUT:
				_localctx = new SInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				fInput();
				}
				break;
			case F_TRAP:
				_localctx = new STrapContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				fTrap();
				}
				break;
			case F_IF:
				_localctx = new SIfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				fIf();
				}
				break;
			case VAR:
				_localctx = new SAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				match(VAR);
				setState(49);
				match(ASS);
				setState(50);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EUnaryMinusContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(AtariParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EUnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ENotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(AtariParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ENotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitENot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EMathFunctionContext extends ExprContext {
		public Token fun;
		public TerminalNode BROP() { return getToken(AtariParser.BROP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRCL() { return getToken(AtariParser.BRCL, 0); }
		public TerminalNode F_INT() { return getToken(AtariParser.F_INT, 0); }
		public TerminalNode F_SGN() { return getToken(AtariParser.F_SGN, 0); }
		public TerminalNode F_SQR() { return getToken(AtariParser.F_SQR, 0); }
		public TerminalNode F_ABS() { return getToken(AtariParser.F_ABS, 0); }
		public TerminalNode F_CLOG() { return getToken(AtariParser.F_CLOG, 0); }
		public TerminalNode F_LOG() { return getToken(AtariParser.F_LOG, 0); }
		public TerminalNode F_EXP() { return getToken(AtariParser.F_EXP, 0); }
		public TerminalNode F_SIN() { return getToken(AtariParser.F_SIN, 0); }
		public TerminalNode F_COS() { return getToken(AtariParser.F_COS, 0); }
		public EMathFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEMathFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EPowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(AtariParser.POW, 0); }
		public EPowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ERelopContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GRT_THN() { return getToken(AtariParser.GRT_THN, 0); }
		public TerminalNode GRT_THN_EQ() { return getToken(AtariParser.GRT_THN_EQ, 0); }
		public TerminalNode LES_THN() { return getToken(AtariParser.LES_THN, 0); }
		public TerminalNode LES_THN_EQ() { return getToken(AtariParser.LES_THN_EQ, 0); }
		public TerminalNode ASS() { return getToken(AtariParser.ASS, 0); }
		public TerminalNode NOT_EQ() { return getToken(AtariParser.NOT_EQ, 0); }
		public ERelopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitERelop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(AtariParser.OR, 0); }
		public EOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(AtariParser.AND, 0); }
		public EAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ENumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(AtariParser.NUMBER, 0); }
		public ENumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitENumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EVariableContext extends ExprContext {
		public TerminalNode VAR() { return getToken(AtariParser.VAR, 0); }
		public EVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EInfixExpressionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AtariParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AtariParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(AtariParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AtariParser.MINUS, 0); }
		public EInfixExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EBracketsContext extends ExprContext {
		public TerminalNode BROP() { return getToken(AtariParser.BROP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRCL() { return getToken(AtariParser.BRCL, 0); }
		public EBracketsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitEBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BROP:
				{
				_localctx = new EBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(BROP);
				setState(55);
				expr(0);
				setState(56);
				match(BRCL);
				}
				break;
			case MINUS:
				{
				_localctx = new EUnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(MINUS);
				setState(59);
				expr(11);
				}
				break;
			case NOT:
				{
				_localctx = new ENotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(NOT);
				setState(61);
				expr(6);
				}
				break;
			case F_INT:
			case F_SGN:
			case F_SQR:
			case F_ABS:
			case F_CLOG:
			case F_LOG:
			case F_EXP:
			case F_SIN:
			case F_COS:
				{
				_localctx = new EMathFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((EMathFunctionContext)_localctx).fun = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << F_INT) | (1L << F_SGN) | (1L << F_SQR) | (1L << F_ABS) | (1L << F_CLOG) | (1L << F_LOG) | (1L << F_EXP) | (1L << F_SIN) | (1L << F_COS))) != 0)) ) {
					((EMathFunctionContext)_localctx).fun = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				match(BROP);
				setState(64);
				expr(0);
				setState(65);
				match(BRCL);
				}
				break;
			case NUMBER:
				{
				_localctx = new ENumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(NUMBER);
				}
				break;
			case VAR:
				{
				_localctx = new EVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EPowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(72);
						match(POW);
						setState(73);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new EInfixExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(75);
						((EInfixExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EInfixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new EInfixExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(78);
						((EInfixExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((EInfixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ERelopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(81);
						((ERelopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASS) | (1L << NOT_EQ) | (1L << GRT_THN_EQ) | (1L << LES_THN_EQ) | (1L << GRT_THN) | (1L << LES_THN))) != 0)) ) {
							((ERelopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new EAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(84);
						match(AND);
						setState(85);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new EOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						match(OR);
						setState(88);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FPrintContext extends ParserRuleContext {
		public FPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fPrint; }
	 
		public FPrintContext() { }
		public void copyFrom(FPrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FPrintNewLineContext extends FPrintContext {
		public TerminalNode F_PRINT() { return getToken(AtariParser.F_PRINT, 0); }
		public FPrintNewLineContext(FPrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFPrintNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FPrintSemicolonVariableContext extends FPrintContext {
		public TerminalNode F_PRINT() { return getToken(AtariParser.F_PRINT, 0); }
		public TerminalNode STRING() { return getToken(AtariParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(AtariParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(AtariParser.VAR, 0); }
		public FPrintSemicolonVariableContext(FPrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFPrintSemicolonVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FPrintVariableContext extends FPrintContext {
		public TerminalNode F_PRINT() { return getToken(AtariParser.F_PRINT, 0); }
		public TerminalNode VAR() { return getToken(AtariParser.VAR, 0); }
		public FPrintVariableContext(FPrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFPrintVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FPrintExpressionContext extends FPrintContext {
		public TerminalNode F_PRINT() { return getToken(AtariParser.F_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FPrintExpressionContext(FPrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FPrintStringContext extends FPrintContext {
		public TerminalNode F_PRINT() { return getToken(AtariParser.F_PRINT, 0); }
		public TerminalNode STRING() { return getToken(AtariParser.STRING, 0); }
		public FPrintStringContext(FPrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FPrintContext fPrint() throws RecognitionException {
		FPrintContext _localctx = new FPrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fPrint);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FPrintSemicolonVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(F_PRINT);
				setState(95);
				match(STRING);
				setState(96);
				match(SEMICOLON);
				setState(97);
				match(VAR);
				}
				break;
			case 2:
				_localctx = new FPrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(F_PRINT);
				setState(99);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new FPrintNewLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(F_PRINT);
				}
				break;
			case 4:
				_localctx = new FPrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(F_PRINT);
				setState(102);
				expr(0);
				}
				break;
			case 5:
				_localctx = new FPrintVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(F_PRINT);
				setState(104);
				match(VAR);
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

	public static class FListContext extends ParserRuleContext {
		public FListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fList; }
	 
		public FListContext() { }
		public void copyFrom(FListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FListAllContext extends FListContext {
		public TerminalNode F_LIST() { return getToken(AtariParser.F_LIST, 0); }
		public FListAllContext(FListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFListAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FListNumberContext extends FListContext {
		public TerminalNode F_LIST() { return getToken(AtariParser.F_LIST, 0); }
		public TerminalNode NUMBER() { return getToken(AtariParser.NUMBER, 0); }
		public FListNumberContext(FListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFListNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FListSpanContext extends FListContext {
		public TerminalNode F_LIST() { return getToken(AtariParser.F_LIST, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AtariParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AtariParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(AtariParser.COMMA, 0); }
		public FListSpanContext(FListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFListSpan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FListContext fList() throws RecognitionException {
		FListContext _localctx = new FListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fList);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FListAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(F_LIST);
				}
				break;
			case 2:
				_localctx = new FListNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(F_LIST);
				setState(109);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new FListSpanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(F_LIST);
				setState(111);
				match(NUMBER);
				setState(112);
				match(COMMA);
				setState(113);
				match(NUMBER);
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

	public static class FGotoContext extends ParserRuleContext {
		public TerminalNode F_GOTO() { return getToken(AtariParser.F_GOTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FGotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fGoto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FGotoContext fGoto() throws RecognitionException {
		FGotoContext _localctx = new FGotoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fGoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(F_GOTO);
			setState(117);
			expr(0);
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

	public static class FInputContext extends ParserRuleContext {
		public TerminalNode F_INTPUT() { return getToken(AtariParser.F_INTPUT, 0); }
		public TerminalNode VAR() { return getToken(AtariParser.VAR, 0); }
		public FInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FInputContext fInput() throws RecognitionException {
		FInputContext _localctx = new FInputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(F_INTPUT);
			setState(120);
			match(VAR);
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

	public static class FTrapContext extends ParserRuleContext {
		public TerminalNode F_TRAP() { return getToken(AtariParser.F_TRAP, 0); }
		public TerminalNode NUMBER() { return getToken(AtariParser.NUMBER, 0); }
		public FTrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fTrap; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFTrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FTrapContext fTrap() throws RecognitionException {
		FTrapContext _localctx = new FTrapContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fTrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(F_TRAP);
			setState(123);
			match(NUMBER);
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

	public static class FIfContext extends ParserRuleContext {
		public TerminalNode F_IF() { return getToken(AtariParser.F_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode F_THEN() { return getToken(AtariParser.F_THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtariVisitor ) return ((AtariVisitor<? extends T>)visitor).visitFIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FIfContext fIf() throws RecognitionException {
		FIfContext _localctx = new FIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(F_IF);
			setState(126);
			expr(0);
			setState(127);
			match(F_THEN);
			setState(128);
			statement();
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3"+
		"\16\3%\13\3\3\3\5\3(\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3#\3\b"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\7\4\2\f\f\27\30\3\2\16\26\3\2()\3\2*+\4\2"+
		"$$,\60\2\u0095\2\27\3\2\2\2\4\35\3\2\2\2\6\65\3\2\2\2\bG\3\2\2\2\nk\3"+
		"\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20y\3\2\2\2\22|\3\2\2\2\24\177\3\2\2\2\26"+
		"\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\7\35\2\2\36#\5\6\4\2\37 "+
		"\7\37\2\2 \"\5\6\4\2!\37\3\2\2\2\"%\3\2\2\2#$\3\2\2\2#!\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2&(\7\"\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\61\2\2*\5"+
		"\3\2\2\2+\66\t\2\2\2,\66\5\n\6\2-\66\5\f\7\2.\66\5\16\b\2/\66\5\20\t\2"+
		"\60\66\5\22\n\2\61\66\5\24\13\2\62\63\7\34\2\2\63\64\7$\2\2\64\66\5\b"+
		"\5\2\65+\3\2\2\2\65,\3\2\2\2\65-\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60"+
		"\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\66\7\3\2\2\2\678\b\5\1\289\7%\2\2"+
		"9:\5\b\5\2:;\7&\2\2;H\3\2\2\2<=\7*\2\2=H\5\b\5\r>?\7\31\2\2?H\5\b\5\b"+
		"@A\t\3\2\2AB\7%\2\2BC\5\b\5\2CD\7&\2\2DH\3\2\2\2EH\7\35\2\2FH\7\34\2\2"+
		"G\67\3\2\2\2G<\3\2\2\2G>\3\2\2\2G@\3\2\2\2GE\3\2\2\2GF\3\2\2\2H]\3\2\2"+
		"\2IJ\f\f\2\2JK\7\'\2\2K\\\5\b\5\fLM\f\13\2\2MN\t\4\2\2N\\\5\b\5\fOP\f"+
		"\n\2\2PQ\t\5\2\2Q\\\5\b\5\13RS\f\t\2\2ST\t\6\2\2T\\\5\b\5\nUV\f\7\2\2"+
		"VW\7\32\2\2W\\\5\b\5\bXY\f\6\2\2YZ\7\33\2\2Z\\\5\b\5\7[I\3\2\2\2[L\3\2"+
		"\2\2[O\3\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\7\3\2\2ab\7#\2\2bc\7 \2\2cl\7\34\2\2de\7"+
		"\3\2\2el\7#\2\2fl\7\3\2\2gh\7\3\2\2hl\5\b\5\2ij\7\3\2\2jl\7\34\2\2k`\3"+
		"\2\2\2kd\3\2\2\2kf\3\2\2\2kg\3\2\2\2ki\3\2\2\2l\13\3\2\2\2mu\7\6\2\2n"+
		"o\7\6\2\2ou\7\35\2\2pq\7\6\2\2qr\7\35\2\2rs\7!\2\2su\7\35\2\2tm\3\2\2"+
		"\2tn\3\2\2\2tp\3\2\2\2u\r\3\2\2\2vw\7\7\2\2wx\5\b\5\2x\17\3\2\2\2yz\7"+
		"\b\2\2z{\7\34\2\2{\21\3\2\2\2|}\7\t\2\2}~\7\35\2\2~\23\3\2\2\2\177\u0080"+
		"\7\n\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7\13\2\2\u0082\u0083\5\6\4\2"+
		"\u0083\25\3\2\2\2\13\31#\'\65G[]kt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}