// Generated from CMM.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, NUMBER=39, 
		NEWLINE=40, DIGIT=41, ALPHA=42, STRING=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_singleExpr = 2, RULE_ioStat = 3, RULE_declrStat = 4, 
		RULE_assignStat = 5, RULE_write = 6, RULE_read = 7, RULE_multiExpr = 8, 
		RULE_ifExpr = 9, RULE_whileExpr = 10, RULE_whileDoExpr = 11, RULE_doWhileExpr = 12, 
		RULE_functionDeclr = 13, RULE_formalParameters = 14, RULE_formalParameter = 15, 
		RULE_anotationExpr = 16, RULE_block = 17, RULE_expr = 18, RULE_exprList = 19, 
		RULE_type = 20;
	public static final String[] ruleNames = {
		"prog", "stat", "singleExpr", "ioStat", "declrStat", "assignStat", "write", 
		"read", "multiExpr", "ifExpr", "whileExpr", "whileDoExpr", "doWhileExpr", 
		"functionDeclr", "formalParameters", "formalParameter", "anotationExpr", 
		"block", "expr", "exprList", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "';'", "'='", "'write'", "'('", "')'", "'read'", "'if'", 
		"'else'", "'while'", "'do'", "','", "'/*'", "'*'", "'*/'", "'{'", "'}'", 
		"'['", "']'", "'-'", "'!'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", 
		"'/'", "'+'", "'>'", "'<'", "'=='", "'!='", "'int'", "'float'", "'double'", 
		"'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "NUMBER", "NEWLINE", "DIGIT", "ALPHA", "STRING", "WS"
	};
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
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CMMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CMMParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				stat();
				setState(44);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(43);
					match(NEWLINE);
					}
				}

				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << ID))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public SingleExprContext singleExpr() {
			return getRuleContext(SingleExprContext.class,0);
		}
		public MultiExprContext multiExpr() {
			return getRuleContext(MultiExprContext.class,0);
		}
		public FunctionDeclrContext functionDeclr() {
			return getRuleContext(FunctionDeclrContext.class,0);
		}
		public AnotationExprContext anotationExpr() {
			return getRuleContext(AnotationExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				singleExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				multiExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				functionDeclr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				anotationExpr();
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

	public static class SingleExprContext extends ParserRuleContext {
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public DeclrStatContext declrStat() {
			return getRuleContext(DeclrStatContext.class,0);
		}
		public IoStatContext ioStat() {
			return getRuleContext(IoStatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSingleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSingleExpr(this);
		}
	}

	public final SingleExprContext singleExpr() throws RecognitionException {
		SingleExprContext _localctx = new SingleExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleExpr);
		int _la;
		try {
			setState(64);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				assignStat();
				}
				break;
			case T__33:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				declrStat();
				}
				break;
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				ioStat();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(T__0);
				setState(61);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(60);
					expr(0);
					}
				}

				setState(63);
				match(T__1);
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

	public static class IoStatContext extends ParserRuleContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public IoStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIoStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIoStat(this);
		}
	}

	public final IoStatContext ioStat() throws RecognitionException {
		IoStatContext _localctx = new IoStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ioStat);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				write();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				read();
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

	public static class DeclrStatContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclrStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declrStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDeclrStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDeclrStat(this);
		}
	}

	public final DeclrStatContext declrStat() throws RecognitionException {
		DeclrStatContext _localctx = new DeclrStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declrStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(71);
			match(ID);
			setState(74);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(72);
				match(T__2);
				setState(73);
				expr(0);
				}
			}

			setState(76);
			match(T__1);
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

	public static class AssignStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAssignStat(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__2);
			setState(80);
			expr(0);
			setState(81);
			match(T__1);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__3);
			setState(84);
			match(T__4);
			setState(85);
			match(ID);
			setState(86);
			match(T__5);
			setState(87);
			match(T__1);
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

	public static class ReadContext extends ParserRuleContext {
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__6);
			setState(90);
			match(T__4);
			setState(91);
			match(T__5);
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

	public static class MultiExprContext extends ParserRuleContext {
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public MultiExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMultiExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMultiExpr(this);
		}
	}

	public final MultiExprContext multiExpr() throws RecognitionException {
		MultiExprContext _localctx = new MultiExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiExpr);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				whileExpr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				ifExpr();
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

	public static class IfExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__7);
			setState(98);
			expr(0);
			setState(99);
			block();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(T__8);
					setState(101);
					match(T__7);
					setState(102);
					expr(0);
					setState(103);
					block();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(112);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(110);
				match(T__8);
				setState(111);
				block();
				}
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

	public static class WhileExprContext extends ParserRuleContext {
		public WhileDoExprContext whileDoExpr() {
			return getRuleContext(WhileDoExprContext.class,0);
		}
		public DoWhileExprContext doWhileExpr() {
			return getRuleContext(DoWhileExprContext.class,0);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWhileExpr(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileExpr);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				whileDoExpr();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				doWhileExpr();
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

	public static class WhileDoExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileDoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWhileDoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWhileDoExpr(this);
		}
	}

	public final WhileDoExprContext whileDoExpr() throws RecognitionException {
		WhileDoExprContext _localctx = new WhileDoExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileDoExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__9);
			setState(119);
			expr(0);
			setState(120);
			block();
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

	public static class DoWhileExprContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDoWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDoWhileExpr(this);
		}
	}

	public final DoWhileExprContext doWhileExpr() throws RecognitionException {
		DoWhileExprContext _localctx = new DoWhileExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_doWhileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__10);
			setState(123);
			block();
			setState(124);
			match(T__9);
			setState(125);
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

	public static class FunctionDeclrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFunctionDeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFunctionDeclr(this);
		}
	}

	public final FunctionDeclrContext functionDeclr() throws RecognitionException {
		FunctionDeclrContext _localctx = new FunctionDeclrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			type();
			setState(128);
			match(ID);
			setState(129);
			match(T__4);
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(130);
				formalParameters();
				}
			}

			setState(133);
			match(T__5);
			setState(134);
			block();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			formalParameter();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(137);
				match(T__11);
				setState(138);
				formalParameter();
				}
				}
				setState(143);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			type();
			setState(145);
			match(ID);
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

	public static class AnotationExprContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CMMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CMMParser.NEWLINE, i);
		}
		public AnotationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAnotationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAnotationExpr(this);
		}
	}

	public final AnotationExprContext anotationExpr() throws RecognitionException {
		AnotationExprContext _localctx = new AnotationExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_anotationExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__12);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(148);
					matchWildcard();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(154);
				match(NEWLINE);
				setState(155);
				match(T__13);
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(156);
						matchWildcard();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(T__14);
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CMMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CMMParser.NEWLINE, i);
		}
		public SingleExprContext singleExpr() {
			return getRuleContext(SingleExprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			setState(181);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__15);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << ID))) != 0)) {
					{
					{
					setState(170);
					stat();
					setState(172);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(171);
						match(NEWLINE);
						}
					}

					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(T__16);
				}
				break;
			case T__0:
			case T__3:
			case T__6:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				singleExpr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CMMParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpr(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(184);
				match(T__19);
				setState(185);
				expr(15);
				}
				break;
			case 2:
				{
				setState(186);
				match(T__20);
				setState(187);
				expr(14);
				}
				break;
			case 3:
				{
				setState(188);
				match(ID);
				setState(189);
				match(T__4);
				setState(191);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(190);
					exprList();
					}
				}

				setState(193);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(194);
				match(ID);
				setState(195);
				match(T__17);
				setState(196);
				expr(0);
				setState(197);
				match(T__18);
				}
				break;
			case 5:
				{
				setState(199);
				match(ID);
				}
				break;
			case 6:
				{
				setState(200);
				read();
				}
				break;
			case 7:
				{
				setState(201);
				match(NUMBER);
				}
				break;
			case 8:
				{
				setState(202);
				match(T__4);
				setState(203);
				expr(0);
				setState(204);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(209);
						match(T__23);
						setState(210);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(212);
						match(T__24);
						setState(213);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(215);
						match(T__25);
						setState(216);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(218);
						match(T__26);
						setState(219);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(221);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(222);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(225);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(227);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(228);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(230);
						match(T__21);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(232);
						match(T__22);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			expr(0);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(239);
				match(T__11);
				setState(240);
				expr(0);
				}
				}
				setState(245);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\6\2\61\n\2\r"+
		"\2\16\2\62\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\5"+
		"\4C\n\4\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\nb\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13l\n\13\f\13\16\13o\13\13\3\13"+
		"\3\13\5\13s\n\13\3\f\3\f\5\fw\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\5\17\u0086\n\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\7\20\u008e\n\20\f\20\16\20\u0091\13\20\3\21\3\21\3\21\3\22\3\22\7\22"+
		"\u0098\n\22\f\22\16\22\u009b\13\22\3\22\3\22\3\22\7\22\u00a0\n\22\f\22"+
		"\16\22\u00a3\13\22\7\22\u00a5\n\22\f\22\16\22\u00a8\13\22\3\22\3\22\3"+
		"\23\3\23\3\23\5\23\u00af\n\23\7\23\u00b1\n\23\f\23\16\23\u00b4\13\23\3"+
		"\23\3\23\5\23\u00b8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00c2\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00d1\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00ec\n\24\f\24\16\24\u00ef\13\24\3\25\3\25\3\25\7\25\u00f4"+
		"\n\25\f\25\16\25\u00f7\13\25\3\26\3\26\3\26\4\u0099\u00a1\3&\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\4\2\20\20\36\36\4\2\26\26"+
		"\37\37\3\2 #\3\2$\'\u010e\2\60\3\2\2\2\48\3\2\2\2\6B\3\2\2\2\bF\3\2\2"+
		"\2\nH\3\2\2\2\fP\3\2\2\2\16U\3\2\2\2\20[\3\2\2\2\22a\3\2\2\2\24c\3\2\2"+
		"\2\26v\3\2\2\2\30x\3\2\2\2\32|\3\2\2\2\34\u0081\3\2\2\2\36\u008a\3\2\2"+
		"\2 \u0092\3\2\2\2\"\u0095\3\2\2\2$\u00b7\3\2\2\2&\u00d0\3\2\2\2(\u00f0"+
		"\3\2\2\2*\u00f8\3\2\2\2,.\5\4\3\2-/\7*\2\2.-\3\2\2\2./\3\2\2\2/\61\3\2"+
		"\2\2\60,\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2"+
		"\2\649\5\6\4\2\659\5\22\n\2\669\5\34\17\2\679\5\"\22\28\64\3\2\2\28\65"+
		"\3\2\2\28\66\3\2\2\28\67\3\2\2\29\5\3\2\2\2:C\5\f\7\2;C\5\n\6\2<C\5\b"+
		"\5\2=?\7\3\2\2>@\5&\24\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\7\4\2\2B:\3\2"+
		"\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2C\7\3\2\2\2DG\5\16\b\2EG\5\20\t\2FD"+
		"\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI\5*\26\2IL\7(\2\2JK\7\5\2\2KM\5&\24\2L"+
		"J\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\4\2\2O\13\3\2\2\2PQ\7(\2\2QR\7\5\2\2"+
		"RS\5&\24\2ST\7\4\2\2T\r\3\2\2\2UV\7\6\2\2VW\7\7\2\2WX\7(\2\2XY\7\b\2\2"+
		"YZ\7\4\2\2Z\17\3\2\2\2[\\\7\t\2\2\\]\7\7\2\2]^\7\b\2\2^\21\3\2\2\2_b\5"+
		"\26\f\2`b\5\24\13\2a_\3\2\2\2a`\3\2\2\2b\23\3\2\2\2cd\7\n\2\2de\5&\24"+
		"\2em\5$\23\2fg\7\13\2\2gh\7\n\2\2hi\5&\24\2ij\5$\23\2jl\3\2\2\2kf\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nr\3\2\2\2om\3\2\2\2pq\7\13\2\2qs\5"+
		"$\23\2rp\3\2\2\2rs\3\2\2\2s\25\3\2\2\2tw\5\30\r\2uw\5\32\16\2vt\3\2\2"+
		"\2vu\3\2\2\2w\27\3\2\2\2xy\7\f\2\2yz\5&\24\2z{\5$\23\2{\31\3\2\2\2|}\7"+
		"\r\2\2}~\5$\23\2~\177\7\f\2\2\177\u0080\5&\24\2\u0080\33\3\2\2\2\u0081"+
		"\u0082\5*\26\2\u0082\u0083\7(\2\2\u0083\u0085\7\7\2\2\u0084\u0086\5\36"+
		"\20\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\7\b\2\2\u0088\u0089\5$\23\2\u0089\35\3\2\2\2\u008a\u008f\5 \21"+
		"\2\u008b\u008c\7\16\2\2\u008c\u008e\5 \21\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\37\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0092\u0093\5*\26\2\u0093\u0094\7(\2\2\u0094!\3"+
		"\2\2\2\u0095\u0099\7\17\2\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a6\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7*\2\2\u009d\u00a1\7\20\2\2\u009e"+
		"\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u009c\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa"+
		"#\3\2\2\2\u00ab\u00b2\7\22\2\2\u00ac\u00ae\5\4\3\2\u00ad\u00af\7*\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\7\23\2\2\u00b6\u00b8\5"+
		"\6\4\2\u00b7\u00ab\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8%\3\2\2\2\u00b9\u00ba"+
		"\b\24\1\2\u00ba\u00bb\7\26\2\2\u00bb\u00d1\5&\24\21\u00bc\u00bd\7\27\2"+
		"\2\u00bd\u00d1\5&\24\20\u00be\u00bf\7(\2\2\u00bf\u00c1\7\7\2\2\u00c0\u00c2"+
		"\5(\25\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00d1\7\b\2\2\u00c4\u00c5\7(\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5&"+
		"\24\2\u00c7\u00c8\7\25\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00d1\7(\2\2\u00ca"+
		"\u00d1\5\20\t\2\u00cb\u00d1\7)\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5&"+
		"\24\2\u00ce\u00cf\7\b\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00b9\3\2\2\2\u00d0"+
		"\u00bc\3\2\2\2\u00d0\u00be\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0\u00c9\3\2"+
		"\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1"+
		"\u00ed\3\2\2\2\u00d2\u00d3\f\r\2\2\u00d3\u00d4\7\32\2\2\u00d4\u00ec\5"+
		"&\24\16\u00d5\u00d6\f\f\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00ec\5&\24\r\u00d8"+
		"\u00d9\f\13\2\2\u00d9\u00da\7\34\2\2\u00da\u00ec\5&\24\f\u00db\u00dc\f"+
		"\n\2\2\u00dc\u00dd\7\35\2\2\u00dd\u00ec\5&\24\13\u00de\u00df\f\t\2\2\u00df"+
		"\u00e0\t\2\2\2\u00e0\u00ec\5&\24\n\u00e1\u00e2\f\b\2\2\u00e2\u00e3\t\3"+
		"\2\2\u00e3\u00ec\5&\24\t\u00e4\u00e5\f\7\2\2\u00e5\u00e6\t\4\2\2\u00e6"+
		"\u00ec\5&\24\b\u00e7\u00e8\f\17\2\2\u00e8\u00ec\7\30\2\2\u00e9\u00ea\f"+
		"\16\2\2\u00ea\u00ec\7\31\2\2\u00eb\u00d2\3\2\2\2\u00eb\u00d5\3\2\2\2\u00eb"+
		"\u00d8\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e1\3\2"+
		"\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\'\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00f0\u00f5\5&\24\2\u00f1\u00f2\7\16\2\2\u00f2\u00f4"+
		"\5&\24\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6)\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\t\5\2\2"+
		"\u00f9+\3\2\2\2\32.\628?BFLamrv\u0085\u008f\u0099\u00a1\u00a6\u00ae\u00b2"+
		"\u00b7\u00c1\u00d0\u00eb\u00ed\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}