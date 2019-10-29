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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Int=31, IntArray=32, 
		Boolean=33, ExpTrue=34, ExpFalse=35, ExpThis=36, ExpNumber=37, Identifier=38, 
		Digit=39, WS=40, COMMENT=41, LINE_COMMENT=42;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_statementBlock = 7, 
		RULE_assignID = 8, RULE_whileStatement = 9, RULE_ifStatement = 10, RULE_printStatement = 11, 
		RULE_assignArray = 12, RULE_expression = 13, RULE_expNewInt = 14, RULE_expNewID = 15, 
		RULE_expNegate = 16, RULE_expParent = 17, RULE_identifier = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"type", "statement", "statementBlock", "assignID", "whileStatement", 
			"ifStatement", "printStatement", "assignArray", "expression", "expNewInt", 
			"expNewID", "expNegate", "expParent", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String[]'", "')'", "'}'", "'extends'", "';'", "','", "'return'", "'='", 
			"'while'", "'if'", "'else'", "'System.out.println'", "'['", "']'", "'&&'", 
			"'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'new'", "'!'", "'int'", 
			null, "'boolean'", "'true'", "'false'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Int", "IntArray", "Boolean", 
			"ExpTrue", "ExpFalse", "ExpThis", "ExpNumber", "Identifier", "Digit", 
			"WS", "COMMENT", "LINE_COMMENT"
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
		public TerminalNode EOF() { return getToken(MiniJavaGrammarParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			mainClass();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(39);
				classDeclaration();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(47);
			match(T__0);
			setState(48);
			identifier();
			setState(49);
			match(T__1);
			setState(50);
			match(T__2);
			setState(51);
			match(T__3);
			setState(52);
			match(T__4);
			setState(53);
			match(T__5);
			setState(54);
			match(T__6);
			setState(55);
			match(T__7);
			setState(56);
			identifier();
			setState(57);
			match(T__8);
			setState(58);
			match(T__1);
			setState(59);
			statement();
			setState(60);
			match(T__9);
			setState(61);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(63);
			match(T__0);
			setState(64);
			identifier();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(65);
				match(T__10);
				setState(66);
				identifier();
				}
			}

			setState(69);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << IntArray) | (1L << Boolean) | (1L << Identifier))) != 0)) {
				{
				{
				setState(70);
				varDeclaration();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(76);
				methodDeclaration();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(84);
			type();
			setState(85);
			identifier();
			setState(86);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(88);
			match(T__2);
			setState(89);
			type();
			setState(90);
			identifier();
			setState(91);
			match(T__6);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << IntArray) | (1L << Boolean) | (1L << Identifier))) != 0)) {
				{
				setState(92);
				type();
				setState(93);
				identifier();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(94);
					match(T__12);
					setState(95);
					type();
					setState(96);
					identifier();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
			match(T__8);
			setState(106);
			match(T__1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					varDeclaration();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << Identifier))) != 0)) {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__13);
			setState(120);
			expression(0);
			setState(121);
			match(T__11);
			setState(122);
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
		public TerminalNode IntArray() { return getToken(MiniJavaGrammarParser.IntArray, 0); }
		public TerminalNode Boolean() { return getToken(MiniJavaGrammarParser.Boolean, 0); }
		public TerminalNode Int() { return getToken(MiniJavaGrammarParser.Int, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntArray:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(IntArray);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(Boolean);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(Int);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				identifier();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public AssignIDContext assignID() {
			return getRuleContext(AssignIDContext.class,0);
		}
		public AssignArrayContext assignArray() {
			return getRuleContext(AssignArrayContext.class,0);
		}
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				statementBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				assignID();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				assignArray();
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

	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__1);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << Identifier))) != 0)) {
				{
				{
				setState(139);
				statement();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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

	public static class AssignIDContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterAssignID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitAssignID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitAssignID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignIDContext assignID() throws RecognitionException {
		AssignIDContext _localctx = new AssignIDContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			identifier();
			setState(148);
			match(T__14);
			setState(149);
			expression(0);
			setState(150);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__15);
			setState(153);
			match(T__6);
			setState(154);
			expression(0);
			setState(155);
			match(T__8);
			setState(156);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__16);
			setState(159);
			match(T__6);
			setState(160);
			expression(0);
			setState(161);
			match(T__8);
			setState(162);
			statement();
			setState(163);
			match(T__17);
			setState(164);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__18);
			setState(167);
			match(T__6);
			setState(168);
			expression(0);
			setState(169);
			match(T__8);
			setState(170);
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

	public static class AssignArrayContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignArrayContext assignArray() throws RecognitionException {
		AssignArrayContext _localctx = new AssignArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			identifier();
			setState(173);
			match(T__19);
			setState(174);
			expression(0);
			setState(175);
			match(T__20);
			setState(176);
			match(T__14);
			setState(177);
			expression(0);
			setState(178);
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

	public static class ExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ExpNumber() { return getToken(MiniJavaGrammarParser.ExpNumber, 0); }
		public TerminalNode ExpTrue() { return getToken(MiniJavaGrammarParser.ExpTrue, 0); }
		public TerminalNode ExpFalse() { return getToken(MiniJavaGrammarParser.ExpFalse, 0); }
		public TerminalNode ExpThis() { return getToken(MiniJavaGrammarParser.ExpThis, 0); }
		public ExpNewIntContext expNewInt() {
			return getRuleContext(ExpNewIntContext.class,0);
		}
		public ExpNegateContext expNegate() {
			return getRuleContext(ExpNegateContext.class,0);
		}
		public ExpParentContext expParent() {
			return getRuleContext(ExpParentContext.class,0);
		}
		public ExpNewIDContext expNewID() {
			return getRuleContext(ExpNewIDContext.class,0);
		}
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(181);
				identifier();
				}
				break;
			case 2:
				{
				setState(182);
				match(ExpNumber);
				}
				break;
			case 3:
				{
				setState(183);
				match(ExpTrue);
				}
				break;
			case 4:
				{
				setState(184);
				match(ExpFalse);
				}
				break;
			case 5:
				{
				setState(185);
				match(ExpThis);
				}
				break;
			case 6:
				{
				setState(186);
				expNewInt();
				}
				break;
			case 7:
				{
				setState(187);
				expNegate();
				}
				break;
			case 8:
				{
				setState(188);
				expParent();
				}
				break;
			case 9:
				{
				setState(189);
				expNewID();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(196);
						match(T__19);
						setState(197);
						expression(0);
						setState(198);
						match(T__20);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(201);
						match(T__26);
						setState(202);
						match(T__27);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(204);
						match(T__26);
						setState(205);
						identifier();
						setState(206);
						match(T__6);
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__28) | (1L << T__29) | (1L << ExpTrue) | (1L << ExpFalse) | (1L << ExpThis) | (1L << ExpNumber) | (1L << Identifier))) != 0)) {
							{
							setState(207);
							expression(0);
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(208);
								match(T__12);
								setState(209);
								expression(0);
								}
								}
								setState(214);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(217);
						match(T__8);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExpNewIntContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MiniJavaGrammarParser.Int, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpNewIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expNewInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpNewInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpNewInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpNewInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpNewIntContext expNewInt() throws RecognitionException {
		ExpNewIntContext _localctx = new ExpNewIntContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expNewInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__28);
			setState(225);
			match(Int);
			setState(226);
			match(T__19);
			setState(227);
			expression(0);
			setState(228);
			match(T__20);
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

	public static class ExpNewIDContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpNewIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expNewID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpNewID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpNewID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpNewID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpNewIDContext expNewID() throws RecognitionException {
		ExpNewIDContext _localctx = new ExpNewIDContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expNewID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__28);
			setState(231);
			identifier();
			setState(232);
			match(T__6);
			setState(233);
			match(T__8);
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

	public static class ExpNegateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpNegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expNegate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpNegateContext expNegate() throws RecognitionException {
		ExpNegateContext _localctx = new ExpNegateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expNegate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__29);
			setState(236);
			expression(0);
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

	public static class ExpParentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expParent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpParentContext expParent() throws RecognitionException {
		ExpParentContext _localctx = new ExpParentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expParent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__6);
			setState(239);
			expression(0);
			setState(240);
			match(T__8);
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
		public TerminalNode Identifier() { return getToken(MiniJavaGrammarParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(Identifier);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4F\n\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\7\4P\n\4\f\4\16\4S\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6e"+
		"\n\6\f\6\16\6h\13\6\5\6j\n\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\7"+
		"\6u\n\6\f\6\16\6x\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0083\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\7\t\u008f\n\t\f\t\16"+
		"\t\u0092\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00c1\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d5\n\17\f\17\16\17\u00d8"+
		"\13\17\5\17\u00da\n\17\3\17\3\17\7\17\u00de\n\17\f\17\16\17\u00e1\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\2\3\34\25\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&\2\3\3\2\30\34\2\u0102\2(\3\2\2\2\4\61\3\2\2\2\6A"+
		"\3\2\2\2\bV\3\2\2\2\nZ\3\2\2\2\f\u0082\3\2\2\2\16\u008a\3\2\2\2\20\u008c"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u009a\3\2\2\2\26\u00a0\3\2\2\2\30\u00a8\3"+
		"\2\2\2\32\u00ae\3\2\2\2\34\u00c0\3\2\2\2\36\u00e2\3\2\2\2 \u00e8\3\2\2"+
		"\2\"\u00ed\3\2\2\2$\u00f0\3\2\2\2&\u00f4\3\2\2\2(,\5\4\3\2)+\5\6\4\2*"+
		")\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\2\2"+
		"\3\60\3\3\2\2\2\61\62\7\3\2\2\62\63\5&\24\2\63\64\7\4\2\2\64\65\7\5\2"+
		"\2\65\66\7\6\2\2\66\67\7\7\2\2\678\7\b\2\289\7\t\2\29:\7\n\2\2:;\5&\24"+
		"\2;<\7\13\2\2<=\7\4\2\2=>\5\16\b\2>?\7\f\2\2?@\7\f\2\2@\5\3\2\2\2AB\7"+
		"\3\2\2BE\5&\24\2CD\7\r\2\2DF\5&\24\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GK\7"+
		"\4\2\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3"+
		"\2\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3"+
		"\2\2\2TU\7\f\2\2U\7\3\2\2\2VW\5\f\7\2WX\5&\24\2XY\7\16\2\2Y\t\3\2\2\2"+
		"Z[\7\5\2\2[\\\5\f\7\2\\]\5&\24\2]i\7\t\2\2^_\5\f\7\2_f\5&\24\2`a\7\17"+
		"\2\2ab\5\f\7\2bc\5&\24\2ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2i^\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\13\2\2lp\7"+
		"\4\2\2mo\5\b\5\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2rp\3"+
		"\2\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv"+
		"\3\2\2\2yz\7\20\2\2z{\5\34\17\2{|\7\16\2\2|}\7\f\2\2}\13\3\2\2\2~\u0083"+
		"\7\"\2\2\177\u0083\7#\2\2\u0080\u0083\7!\2\2\u0081\u0083\5&\24\2\u0082"+
		"~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\r\3\2\2\2\u0084\u008b\5\20\t\2\u0085\u008b\5\26\f\2\u0086\u008b\5\24"+
		"\13\2\u0087\u008b\5\30\r\2\u0088\u008b\5\22\n\2\u0089\u008b\5\32\16\2"+
		"\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\17\3\2\2\2\u008c"+
		"\u0090\7\4\2\2\u008d\u008f\5\16\b\2\u008e\u008d\3\2\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7\f\2\2\u0094\21\3\2\2\2\u0095\u0096\5&\24"+
		"\2\u0096\u0097\7\21\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\16\2\2\u0099"+
		"\23\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009c\7\t\2\2\u009c\u009d\5\34"+
		"\17\2\u009d\u009e\7\13\2\2\u009e\u009f\5\16\b\2\u009f\25\3\2\2\2\u00a0"+
		"\u00a1\7\23\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4"+
		"\7\13\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\16\b"+
		"\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab"+
		"\5\34\17\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\7\16\2\2\u00ad\31\3\2\2\2"+
		"\u00ae\u00af\5&\24\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5\34\17\2\u00b1"+
		"\u00b2\7\27\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5"+
		"\7\16\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\b\17\1\2\u00b7\u00c1\5&\24\2\u00b8"+
		"\u00c1\7\'\2\2\u00b9\u00c1\7$\2\2\u00ba\u00c1\7%\2\2\u00bb\u00c1\7&\2"+
		"\2\u00bc\u00c1\5\36\20\2\u00bd\u00c1\5\"\22\2\u00be\u00c1\5$\23\2\u00bf"+
		"\u00c1\5 \21\2\u00c0\u00b6\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2"+
		"\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0"+
		"\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00df\3\2"+
		"\2\2\u00c2\u00c3\f\17\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00de\5\34\17\20\u00c5"+
		"\u00c6\f\16\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9"+
		"\7\27\2\2\u00c9\u00de\3\2\2\2\u00ca\u00cb\f\r\2\2\u00cb\u00cc\7\35\2\2"+
		"\u00cc\u00de\7\36\2\2\u00cd\u00ce\f\f\2\2\u00ce\u00cf\7\35\2\2\u00cf\u00d0"+
		"\5&\24\2\u00d0\u00d9\7\t\2\2\u00d1\u00d6\5\34\17\2\u00d2\u00d3\7\17\2"+
		"\2\u00d3\u00d5\5\34\17\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\7\13\2\2\u00dc\u00de\3\2\2\2\u00dd\u00c2\3\2\2\2\u00dd\u00c5\3"+
		"\2\2\2\u00dd\u00ca\3\2\2\2\u00dd\u00cd\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\35\3\2\2\2\u00e1\u00df\3\2\2"+
		"\2\u00e2\u00e3\7\37\2\2\u00e3\u00e4\7!\2\2\u00e4\u00e5\7\26\2\2\u00e5"+
		"\u00e6\5\34\17\2\u00e6\u00e7\7\27\2\2\u00e7\37\3\2\2\2\u00e8\u00e9\7\37"+
		"\2\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\7\13\2\2\u00ec"+
		"!\3\2\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\5\34\17\2\u00ef#\3\2\2\2\u00f0"+
		"\u00f1\7\t\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7\13\2\2\u00f3%\3\2\2"+
		"\2\u00f4\u00f5\7(\2\2\u00f5\'\3\2\2\2\22,EKQfipv\u0082\u008a\u0090\u00c0"+
		"\u00d6\u00d9\u00dd\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}