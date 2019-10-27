// Generated from E:/Programming/Compiladores/CompiladoresRepo/04-MiniJavaAST/src/main/java/br/ufpe/cin/if688/minijava\MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Identifier=36, Alphanumeric=37, 
		Letter=38, Digit=39;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"type", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'class'", "'{'", "'public'", "'static'", "'void'", 
			"'main'", "'String[]'", "'}'", "'extends'", "';'", "','", "'return'", 
			"'int'", "'['", "']'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", 
			"'false'", "'this'", "'new'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Identifier", "Alphanumeric", "Letter", "Digit"
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
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaGrammarParser.EOF, 0); }
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainClass();
			setState(17);
			match(T__0);
			setState(18);
			classDeclaration();
			setState(19);
			match(T__1);
			setState(20);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaGrammarParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__2);
			setState(23);
			match(Identifier);
			setState(24);
			match(T__3);
			setState(25);
			match(T__4);
			setState(26);
			match(T__5);
			setState(27);
			match(T__6);
			setState(28);
			match(T__7);
			setState(29);
			match(T__0);
			setState(30);
			match(T__8);
			setState(31);
			match(Identifier);
			setState(32);
			match(T__1);
			setState(33);
			match(T__3);
			setState(34);
			statement();
			setState(35);
			match(T__9);
			setState(36);
			match(T__9);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaGrammarParser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(39);
			match(Identifier);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(40);
				match(T__10);
				setState(41);
				match(Identifier);
				}
			}

			setState(44);
			match(T__3);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				{
				setState(45);
				varDeclaration();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(51);
				methodDeclaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__9);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaGrammarParser.Identifier, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			type();
			setState(60);
			match(Identifier);
			setState(61);
			match(T__11);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaGrammarParser.Identifier, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			type();
			setState(65);
			match(Identifier);
			setState(66);
			match(T__0);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				setState(67);
				type();
				setState(68);
				match(Identifier);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(69);
					match(T__12);
					setState(70);
					type();
					setState(71);
					match(Identifier);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(80);
			match(T__1);
			setState(81);
			match(T__3);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					varDeclaration();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__13);
			setState(95);
			expression(0);
			setState(96);
			match(T__11);
			setState(97);
			match(T__9);
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
		public TerminalNode Identifier() { return getToken(MiniJavaGrammarParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__14);
				setState(100);
				match(T__15);
				setState(101);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(T__14);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaGrammarParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__3);
				setState(108);
				statement();
				setState(109);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__18);
				setState(112);
				match(T__0);
				setState(113);
				expression(0);
				setState(114);
				match(T__1);
				setState(115);
				statement();
				setState(116);
				match(T__19);
				setState(117);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__20);
				setState(120);
				match(T__0);
				setState(121);
				expression(0);
				setState(122);
				match(T__1);
				setState(123);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(T__21);
				setState(126);
				match(T__0);
				setState(127);
				statement();
				setState(128);
				match(T__1);
				setState(129);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(Identifier);
				setState(132);
				match(T__22);
				setState(133);
				expression(0);
				setState(134);
				match(T__11);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(Identifier);
				setState(137);
				match(T__15);
				setState(138);
				expression(0);
				setState(139);
				match(T__16);
				setState(140);
				match(T__22);
				setState(141);
				expression(0);
				setState(142);
				match(T__11);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(MiniJavaGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MiniJavaGrammarParser.Digit, i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaGrammarParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(147);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(150); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(152);
				match(T__30);
				}
				break;
			case 3:
				{
				setState(153);
				match(T__31);
				}
				break;
			case 4:
				{
				setState(154);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(155);
				match(T__32);
				}
				break;
			case 6:
				{
				setState(156);
				match(T__33);
				setState(157);
				match(T__14);
				setState(158);
				match(T__15);
				setState(159);
				expression(0);
				setState(160);
				match(T__16);
				}
				break;
			case 7:
				{
				setState(162);
				match(T__33);
				setState(163);
				match(Identifier);
				setState(164);
				match(T__0);
				setState(165);
				match(T__1);
				}
				break;
			case 8:
				{
				setState(166);
				match(T__34);
				setState(167);
				expression(2);
				}
				break;
			case 9:
				{
				setState(168);
				match(T__0);
				setState(169);
				expression(0);
				setState(170);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(175);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(178);
						match(T__15);
						setState(179);
						expression(0);
						setState(180);
						match(T__16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(183);
						match(T__28);
						setState(184);
						match(T__29);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(186);
						match(T__28);
						setState(187);
						match(Identifier);
						setState(188);
						match(T__0);
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << Identifier) | (1L << Digit))) != 0)) {
							{
							setState(189);
							expression(0);
							setState(194);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(190);
								match(T__12);
								setState(191);
								expression(0);
								}
								}
								setState(196);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(199);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(204);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4\3\4\7"+
		"\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\5\6Q\n\6\3\6\3\6\3\6\7\6V\n"+
		"\6\f\6\16\6Y\13\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n\b\3\t\3\t\6\t\u0097"+
		"\n\t\r\t\16\t\u0098\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c3\n\t\f\t\16\t"+
		"\u00c6\13\t\5\t\u00c8\n\t\3\t\7\t\u00cb\n\t\f\t\16\t\u00ce\13\t\3\t\2"+
		"\3\20\n\2\4\6\b\n\f\16\20\2\3\3\2\32\36\2\u00e5\2\22\3\2\2\2\4\30\3\2"+
		"\2\2\6(\3\2\2\2\b=\3\2\2\2\nA\3\2\2\2\fk\3\2\2\2\16\u0092\3\2\2\2\20\u00ae"+
		"\3\2\2\2\22\23\5\4\3\2\23\24\7\3\2\2\24\25\5\6\4\2\25\26\7\4\2\2\26\27"+
		"\7\2\2\3\27\3\3\2\2\2\30\31\7\5\2\2\31\32\7&\2\2\32\33\7\6\2\2\33\34\7"+
		"\7\2\2\34\35\7\b\2\2\35\36\7\t\2\2\36\37\7\n\2\2\37 \7\3\2\2 !\7\13\2"+
		"\2!\"\7&\2\2\"#\7\4\2\2#$\7\6\2\2$%\5\16\b\2%&\7\f\2\2&\'\7\f\2\2\'\5"+
		"\3\2\2\2()\7\5\2\2),\7&\2\2*+\7\r\2\2+-\7&\2\2,*\3\2\2\2,-\3\2\2\2-.\3"+
		"\2\2\2.\62\7\6\2\2/\61\5\b\5\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\f\2\2<\7\3\2\2"+
		"\2=>\5\f\7\2>?\7&\2\2?@\7\16\2\2@\t\3\2\2\2AB\7\7\2\2BC\5\f\7\2CD\7&\2"+
		"\2DP\7\3\2\2EF\5\f\7\2FM\7&\2\2GH\7\17\2\2HI\5\f\7\2IJ\7&\2\2JL\3\2\2"+
		"\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PE\3\2\2"+
		"\2PQ\3\2\2\2QR\3\2\2\2RS\7\4\2\2SW\7\6\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\20\2\2ab\5\20\t\2b"+
		"c\7\16\2\2cd\7\f\2\2d\13\3\2\2\2ef\7\21\2\2fg\7\22\2\2gl\7\23\2\2hl\7"+
		"\24\2\2il\7\21\2\2jl\7&\2\2ke\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\r"+
		"\3\2\2\2mn\7\6\2\2no\5\16\b\2op\7\f\2\2p\u0093\3\2\2\2qr\7\25\2\2rs\7"+
		"\3\2\2st\5\20\t\2tu\7\4\2\2uv\5\16\b\2vw\7\26\2\2wx\5\16\b\2x\u0093\3"+
		"\2\2\2yz\7\27\2\2z{\7\3\2\2{|\5\20\t\2|}\7\4\2\2}~\5\16\b\2~\u0093\3\2"+
		"\2\2\177\u0080\7\30\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5\16\b\2\u0082"+
		"\u0083\7\4\2\2\u0083\u0084\7\16\2\2\u0084\u0093\3\2\2\2\u0085\u0086\7"+
		"&\2\2\u0086\u0087\7\31\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7\16\2\2\u0089"+
		"\u0093\3\2\2\2\u008a\u008b\7&\2\2\u008b\u008c\7\22\2\2\u008c\u008d\5\20"+
		"\t\2\u008d\u008e\7\23\2\2\u008e\u008f\7\31\2\2\u008f\u0090\5\20\t\2\u0090"+
		"\u0091\7\16\2\2\u0091\u0093\3\2\2\2\u0092m\3\2\2\2\u0092q\3\2\2\2\u0092"+
		"y\3\2\2\2\u0092\177\3\2\2\2\u0092\u0085\3\2\2\2\u0092\u008a\3\2\2\2\u0093"+
		"\17\3\2\2\2\u0094\u0096\b\t\1\2\u0095\u0097\7)\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00af"+
		"\3\2\2\2\u009a\u00af\7!\2\2\u009b\u00af\7\"\2\2\u009c\u00af\7&\2\2\u009d"+
		"\u00af\7#\2\2\u009e\u009f\7$\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\7\22"+
		"\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\7\23\2\2\u00a3\u00af\3\2\2\2\u00a4"+
		"\u00a5\7$\2\2\u00a5\u00a6\7&\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00af\7\4\2"+
		"\2\u00a8\u00a9\7%\2\2\u00a9\u00af\5\20\t\4\u00aa\u00ab\7\3\2\2\u00ab\u00ac"+
		"\5\20\t\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\3\2\2\2\u00ae\u0094\3\2\2\2"+
		"\u00ae\u009a\3\2\2\2\u00ae\u009b\3\2\2\2\u00ae\u009c\3\2\2\2\u00ae\u009d"+
		"\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00af\u00cc\3\2\2\2\u00b0\u00b1\f\17\2\2\u00b1\u00b2\t"+
		"\2\2\2\u00b2\u00cb\5\20\t\20\u00b3\u00b4\f\16\2\2\u00b4\u00b5\7\22\2\2"+
		"\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7\23\2\2\u00b7\u00cb\3\2\2\2\u00b8\u00b9"+
		"\f\r\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00cb\7 \2\2\u00bb\u00bc\f\f\2\2\u00bc"+
		"\u00bd\7\37\2\2\u00bd\u00be\7&\2\2\u00be\u00c7\7\3\2\2\u00bf\u00c4\5\20"+
		"\t\2\u00c0\u00c1\7\17\2\2\u00c1\u00c3\5\20\t\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\7\4\2\2\u00ca\u00b0\3\2\2\2\u00ca\u00b3\3\2"+
		"\2\2\u00ca\u00b8\3\2\2\2\u00ca\u00bb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\21\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\21,\628MPW]k\u0092\u0098\u00ae\u00c4\u00c7\u00ca\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}