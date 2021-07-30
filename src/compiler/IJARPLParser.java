// Generated from C:/Users/salon/IdeaProjects/SER502try/src/antlr4\IJARPL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IJARPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, DATA_TYPE=33, INTEGER=34, NON_INTEGER=35, BOOL_VAL=36, STRING=37, 
		WHITE_SPACE=38;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_expr = 3, RULE_declaration = 4, 
		RULE_while_cond = 5, RULE_if_cond = 6, RULE_for_loop = 7, RULE_for_loop_statement = 8, 
		RULE_identifier = 9, RULE_assign_expr = 10, RULE_arith_expr = 11, RULE_comp_expr = 12, 
		RULE_comp_phrase = 13, RULE_comp_operator = 14, RULE_logic_expr = 15, 
		RULE_logic_phrase = 16, RULE_logic_operator = 17, RULE_number = 18, RULE_print = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "expr", "declaration", "while_cond", 
			"if_cond", "for_loop", "for_loop_statement", "identifier", "assign_expr", 
			"arith_expr", "comp_expr", "comp_phrase", "comp_operator", "logic_expr", 
			"logic_phrase", "logic_operator", "number", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "'{'", "'}'", "';'", "'?'", "':'", "'while'", 
			"'if'", "'else'", "'for'", "'in'", "'range'", "','", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'&&'", "'||'", "'!!'", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "DATA_TYPE", "INTEGER", 
			"NON_INTEGER", "BOOL_VAL", "STRING", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "IJARPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IJARPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
			setState(42);
			match(T__2);
			setState(43);
			match(T__3);
			setState(44);
			block(0);
			setState(45);
			match(T__4);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		return block(0);
	}

	private BlockContext block(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockContext _localctx = new BlockContext(_ctx, _parentState);
		BlockContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_block);
					setState(48);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(49);
					statement();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public While_condContext while_cond() {
			return getRuleContext(While_condContext.class,0);
		}
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				print();
				setState(56);
				match(T__5);
				}
				break;
			case T__1:
			case INTEGER:
			case NON_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				expr(0);
				setState(59);
				match(T__5);
				}
				break;
			case DATA_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				declaration();
				setState(62);
				match(T__5);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				while_cond();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				if_cond();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				for_loop();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(T__3);
				setState(68);
				block(0);
				setState(69);
				match(T__4);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitExpr(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(74);
				identifier(0);
				}
				break;
			case 2:
				{
				setState(75);
				assign_expr();
				}
				break;
			case 3:
				{
				setState(76);
				arith_expr(0);
				}
				break;
			case 4:
				{
				setState(77);
				comp_expr();
				}
				break;
			case 5:
				{
				setState(78);
				logic_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(81);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(82);
					match(T__6);
					setState(83);
					expr(0);
					setState(84);
					match(T__7);
					setState(85);
					expr(2);
					}
					} 
				}
				setState(91);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(IJARPLParser.DATA_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(DATA_TYPE);
				setState(93);
				identifier(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(DATA_TYPE);
				setState(95);
				assign_expr();
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

	public static class While_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterWhile_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitWhile_cond(this);
		}
	}

	public final While_condContext while_cond() throws RecognitionException {
		While_condContext _localctx = new While_condContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__8);
			setState(99);
			match(T__1);
			setState(100);
			expr(0);
			setState(101);
			match(T__2);
			setState(102);
			block(0);
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

	public static class If_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitIf_cond(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_cond);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__9);
				setState(105);
				match(T__1);
				setState(106);
				expr(0);
				setState(107);
				match(T__2);
				setState(108);
				block(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__9);
				setState(111);
				match(T__1);
				setState(112);
				expr(0);
				setState(113);
				match(T__2);
				setState(114);
				block(0);
				setState(115);
				match(T__10);
				setState(116);
				block(0);
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

	public static class For_loopContext extends ParserRuleContext {
		public For_loop_statementContext for_loop_statement() {
			return getRuleContext(For_loop_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__11);
			setState(121);
			for_loop_statement();
			setState(122);
			block(0);
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

	public static class For_loop_statementContext extends ParserRuleContext {
		public List<Assign_exprContext> assign_expr() {
			return getRuleContexts(Assign_exprContext.class);
		}
		public Assign_exprContext assign_expr(int i) {
			return getRuleContext(Assign_exprContext.class,i);
		}
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(IJARPLParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(IJARPLParser.INTEGER, i);
		}
		public For_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterFor_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitFor_loop_statement(this);
		}
	}

	public final For_loop_statementContext for_loop_statement() throws RecognitionException {
		For_loop_statementContext _localctx = new For_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__1);
				setState(125);
				assign_expr();
				setState(126);
				match(T__5);
				setState(127);
				comp_expr();
				setState(128);
				match(T__5);
				setState(129);
				assign_expr();
				setState(130);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__1);
				setState(133);
				identifier(0);
				setState(134);
				match(T__12);
				setState(135);
				match(T__13);
				setState(136);
				match(T__1);
				setState(137);
				match(INTEGER);
				setState(138);
				match(T__14);
				setState(139);
				match(INTEGER);
				setState(140);
				match(T__2);
				setState(141);
				match(T__2);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NON_INTEGER() { return getToken(IJARPLParser.NON_INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(IJARPLParser.INTEGER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		return identifier(0);
	}

	private IdentifierContext identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierContext _localctx = new IdentifierContext(_ctx, _parentState);
		IdentifierContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			match(NON_INTEGER);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new IdentifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifier);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(NON_INTEGER);
						}
						break;
					case 2:
						{
						_localctx = new IdentifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifier);
						setState(150);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(151);
						match(INTEGER);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			identifier(0);
			setState(158);
			match(T__15);
			setState(159);
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

	public static class Arith_exprContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(IJARPLParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitArith_expr(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		return arith_expr(0);
	}

	private Arith_exprContext arith_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, _parentState);
		Arith_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arith_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(162);
				match(INTEGER);
				}
				break;
			case NON_INTEGER:
				{
				setState(163);
				identifier(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(166);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(167);
						match(T__16);
						setState(168);
						arith_expr(9);
						}
						break;
					case 2:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(169);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(170);
						match(T__17);
						setState(171);
						arith_expr(8);
						}
						break;
					case 3:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(173);
						match(T__18);
						setState(174);
						arith_expr(7);
						}
						break;
					case 4:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(176);
						match(T__19);
						setState(177);
						arith_expr(6);
						}
						break;
					case 5:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(T__20);
						setState(180);
						arith_expr(5);
						}
						break;
					case 6:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(T__21);
						setState(183);
						arith_expr(4);
						}
						break;
					}
					} 
				}
				setState(188);
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

	public static class Comp_exprContext extends ParserRuleContext {
		public List<Comp_phraseContext> comp_phrase() {
			return getRuleContexts(Comp_phraseContext.class);
		}
		public Comp_phraseContext comp_phrase(int i) {
			return getRuleContext(Comp_phraseContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public Comp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterComp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitComp_expr(this);
		}
	}

	public final Comp_exprContext comp_expr() throws RecognitionException {
		Comp_exprContext _localctx = new Comp_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comp_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			comp_phrase();
			setState(190);
			comp_operator();
			setState(191);
			comp_phrase();
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

	public static class Comp_phraseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public Comp_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterComp_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitComp_phrase(this);
		}
	}

	public final Comp_phraseContext comp_phrase() throws RecognitionException {
		Comp_phraseContext _localctx = new Comp_phraseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comp_phrase);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				identifier(0);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				number(0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(T__1);
				setState(196);
				arith_expr(0);
				setState(197);
				match(T__2);
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

	public static class Comp_operatorContext extends ParserRuleContext {
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitComp_operator(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public static class Logic_exprContext extends ParserRuleContext {
		public List<Logic_phraseContext> logic_phrase() {
			return getRuleContexts(Logic_phraseContext.class);
		}
		public Logic_phraseContext logic_phrase(int i) {
			return getRuleContext(Logic_phraseContext.class,i);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitLogic_expr(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			logic_phrase();
			setState(204);
			logic_operator();
			setState(205);
			logic_phrase();
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

	public static class Logic_phraseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public Logic_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterLogic_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitLogic_phrase(this);
		}
	}

	public final Logic_phraseContext logic_phrase() throws RecognitionException {
		Logic_phraseContext _localctx = new Logic_phraseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic_phrase);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				identifier(0);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				number(0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__1);
				setState(210);
				arith_expr(0);
				setState(211);
				match(T__2);
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitLogic_operator(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(IJARPLParser.INTEGER, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		return number(0);
	}

	private NumberContext number(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumberContext _localctx = new NumberContext(_ctx, _parentState);
		NumberContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_number, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			match(INTEGER);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NumberContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_number);
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(221);
					match(INTEGER);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext argument;
		public Token text;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(IJARPLParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IJARPLListener ) ((IJARPLListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__31);
				setState(228);
				((PrintContext)_localctx).argument = expr(0);
				setState(229);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__31);
				setState(232);
				((PrintContext)_localctx).text = match(STRING);
				setState(233);
				match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return block_sempred((BlockContext)_localctx, predIndex);
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 11:
			return arith_expr_sempred((Arith_exprContext)_localctx, predIndex);
		case 18:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_sempred(BlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arith_expr_sempred(Arith_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\3\6\5\6c\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\5\r\u00a7\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bb\n\r\f\r\16\r\u00be\13\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d8\n\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00e1\n\24\f\24\16\24\u00e4\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ed\n\25\3\25\2\7\4\b\24\30"+
		"&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\31\36\3\2\37"+
		"!\2\u00f8\2*\3\2\2\2\4\61\3\2\2\2\6I\3\2\2\2\bQ\3\2\2\2\nb\3\2\2\2\fd"+
		"\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26"+
		"\u009f\3\2\2\2\30\u00a6\3\2\2\2\32\u00bf\3\2\2\2\34\u00c9\3\2\2\2\36\u00cb"+
		"\3\2\2\2 \u00cd\3\2\2\2\"\u00d7\3\2\2\2$\u00d9\3\2\2\2&\u00db\3\2\2\2"+
		"(\u00ec\3\2\2\2*+\7\3\2\2+,\7\4\2\2,-\7\5\2\2-.\7\6\2\2./\5\4\3\2/\60"+
		"\7\7\2\2\60\3\3\2\2\2\61\66\b\3\1\2\62\63\f\4\2\2\63\65\5\6\4\2\64\62"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2"+
		"\2\29:\5(\25\2:;\7\b\2\2;J\3\2\2\2<=\5\b\5\2=>\7\b\2\2>J\3\2\2\2?@\5\n"+
		"\6\2@A\7\b\2\2AJ\3\2\2\2BJ\5\f\7\2CJ\5\16\b\2DJ\5\20\t\2EF\7\6\2\2FG\5"+
		"\4\3\2GH\7\7\2\2HJ\3\2\2\2I9\3\2\2\2I<\3\2\2\2I?\3\2\2\2IB\3\2\2\2IC\3"+
		"\2\2\2ID\3\2\2\2IE\3\2\2\2J\7\3\2\2\2KL\b\5\1\2LR\5\24\13\2MR\5\26\f\2"+
		"NR\5\30\r\2OR\5\32\16\2PR\5 \21\2QK\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2"+
		"\2\2QP\3\2\2\2R[\3\2\2\2ST\f\3\2\2TU\7\t\2\2UV\5\b\5\2VW\7\n\2\2WX\5\b"+
		"\5\4XZ\3\2\2\2YS\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]["+
		"\3\2\2\2^_\7#\2\2_c\5\24\13\2`a\7#\2\2ac\5\26\f\2b^\3\2\2\2b`\3\2\2\2"+
		"c\13\3\2\2\2de\7\13\2\2ef\7\4\2\2fg\5\b\5\2gh\7\5\2\2hi\5\4\3\2i\r\3\2"+
		"\2\2jk\7\f\2\2kl\7\4\2\2lm\5\b\5\2mn\7\5\2\2no\5\4\3\2oy\3\2\2\2pq\7\f"+
		"\2\2qr\7\4\2\2rs\5\b\5\2st\7\5\2\2tu\5\4\3\2uv\7\r\2\2vw\5\4\3\2wy\3\2"+
		"\2\2xj\3\2\2\2xp\3\2\2\2y\17\3\2\2\2z{\7\16\2\2{|\5\22\n\2|}\5\4\3\2}"+
		"\21\3\2\2\2~\177\7\4\2\2\177\u0080\5\26\f\2\u0080\u0081\7\b\2\2\u0081"+
		"\u0082\5\32\16\2\u0082\u0083\7\b\2\2\u0083\u0084\5\26\f\2\u0084\u0085"+
		"\7\5\2\2\u0085\u0092\3\2\2\2\u0086\u0087\7\4\2\2\u0087\u0088\5\24\13\2"+
		"\u0088\u0089\7\17\2\2\u0089\u008a\7\20\2\2\u008a\u008b\7\4\2\2\u008b\u008c"+
		"\7$\2\2\u008c\u008d\7\21\2\2\u008d\u008e\7$\2\2\u008e\u008f\7\5\2\2\u008f"+
		"\u0090\7\5\2\2\u0090\u0092\3\2\2\2\u0091~\3\2\2\2\u0091\u0086\3\2\2\2"+
		"\u0092\23\3\2\2\2\u0093\u0094\b\13\1\2\u0094\u0095\7%\2\2\u0095\u009c"+
		"\3\2\2\2\u0096\u0097\f\4\2\2\u0097\u009b\7%\2\2\u0098\u0099\f\3\2\2\u0099"+
		"\u009b\7$\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\5\b\5"+
		"\2\u00a2\27\3\2\2\2\u00a3\u00a4\b\r\1\2\u00a4\u00a7\7$\2\2\u00a5\u00a7"+
		"\5\24\13\2\u00a6\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00bc\3\2\2\2"+
		"\u00a8\u00a9\f\n\2\2\u00a9\u00aa\7\23\2\2\u00aa\u00bb\5\30\r\13\u00ab"+
		"\u00ac\f\t\2\2\u00ac\u00ad\7\24\2\2\u00ad\u00bb\5\30\r\n\u00ae\u00af\f"+
		"\b\2\2\u00af\u00b0\7\25\2\2\u00b0\u00bb\5\30\r\t\u00b1\u00b2\f\7\2\2\u00b2"+
		"\u00b3\7\26\2\2\u00b3\u00bb\5\30\r\b\u00b4\u00b5\f\6\2\2\u00b5\u00b6\7"+
		"\27\2\2\u00b6\u00bb\5\30\r\7\u00b7\u00b8\f\5\2\2\u00b8\u00b9\7\30\2\2"+
		"\u00b9\u00bb\5\30\r\6\u00ba\u00a8\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba\u00ae"+
		"\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\31\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1\5\36\20\2\u00c1"+
		"\u00c2\5\34\17\2\u00c2\33\3\2\2\2\u00c3\u00ca\5\24\13\2\u00c4\u00ca\5"+
		"&\24\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\5\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2"+
		"\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\37\3\2\2\2\u00cd\u00ce"+
		"\5\"\22\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\5\"\22\2\u00d0!\3\2\2\2\u00d1"+
		"\u00d8\5\24\13\2\u00d2\u00d8\5&\24\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\5"+
		"\30\r\2\u00d5\u00d6\7\5\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00da\t\3\2\2"+
		"\u00da%\3\2\2\2\u00db\u00dc\b\24\1\2\u00dc\u00dd\7$\2\2\u00dd\u00e2\3"+
		"\2\2\2\u00de\u00df\f\4\2\2\u00df\u00e1\7$\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\'\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8"+
		"\7\5\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7\'\2\2\u00eb"+
		"\u00ed\7\5\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed)\3\2\2\2"+
		"\22\66IQ[bx\u0091\u009a\u009c\u00a6\u00ba\u00bc\u00c9\u00d7\u00e2\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}