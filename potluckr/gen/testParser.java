// Generated from C:/Users/Dustin/IdeaProjects/potluckr\test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ALLERGIES=4, DIETTYPE=5, MONTH=6, CUISINES=7, 
		CUISINE=8, DIET=9, ALLERGY=10, PRIVATE=11, EVENT=12, NAME=13, PLAN=14, 
		DESCRIPTION=15, PLACE=16, FROM=17, TO=18, DATE=19, RECIPE=20, ATTENDEE=21, 
		UNAVAILABLE=22, AVAILABLE=23, DAY=24, TIME=25, YEAR=26, DESC=27, WS=28, 
		SPACE=29;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_schedule = 2, RULE_event = 3, RULE_name = 4, 
		RULE_description = 5, RULE_place = 6, RULE_time = 7, RULE_date = 8, RULE_plan = 9, 
		RULE_attendee = 10, RULE_allergy = 11, RULE_diet = 12, RULE_cuisine = 13, 
		RULE_available = 14, RULE_unavailable = 15, RULE_recipe = 16;
	public static final String[] ruleNames = {
		"prog", "start", "schedule", "event", "name", "description", "place", 
		"time", "date", "plan", "attendee", "allergy", "diet", "cuisine", "available", 
		"unavailable", "recipe"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", null, null, null, null, "'cuisine'", "'diet'", 
		"'allergy'", "'private'", "'event'", "'name'", "'plan'", "'description'", 
		"'place'", "'from'", "'to'", "'date'", "'recipe'", "'attendee'", "'unavailable'", 
		"'available'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ALLERGIES", "DIETTYPE", "MONTH", "CUISINES", 
		"CUISINE", "DIET", "ALLERGY", "PRIVATE", "EVENT", "NAME", "PLAN", "DESCRIPTION", 
		"PLACE", "FROM", "TO", "DATE", "RECIPE", "ATTENDEE", "UNAVAILABLE", "AVAILABLE", 
		"DAY", "TIME", "YEAR", "DESC", "WS", "SPACE"
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitProg(this);
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				start();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << EVENT) | (1L << PLAN))) != 0) );
			setState(39);
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

	public static class StartContext extends ParserRuleContext {
		public ScheduleContext schedule() {
			return getRuleContext(ScheduleContext.class,0);
		}
		public PlanContext plan() {
			return getRuleContext(PlanContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case EVENT:
				{
				setState(41);
				schedule();
				}
				break;
			case PLAN:
				{
				setState(42);
				plan();
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

	public static class ScheduleContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(testParser.EVENT, 0); }
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode PRIVATE() { return getToken(testParser.PRIVATE, 0); }
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_schedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(45);
				match(PRIVATE);
				}
			}

			setState(48);
			match(EVENT);
			setState(49);
			match(T__0);
			setState(50);
			event();
			setState(51);
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

	public static class EventContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			name();
			setState(54);
			date();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(55);
					time();
					}
				}

				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLACE) {
					{
					setState(58);
					place();
					}
				}

				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESCRIPTION) {
					{
					setState(61);
					description();
					}
				}

				}
				break;
			case 2:
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(64);
					time();
					}
				}

				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESCRIPTION) {
					{
					setState(67);
					description();
					}
				}

				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLACE) {
					{
					setState(70);
					place();
					}
				}

				}
				break;
			case 3:
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLACE) {
					{
					setState(73);
					place();
					}
				}

				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(76);
					time();
					}
				}

				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESCRIPTION) {
					{
					setState(79);
					description();
					}
				}

				}
				break;
			case 4:
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLACE) {
					{
					setState(82);
					place();
					}
				}

				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESCRIPTION) {
					{
					setState(85);
					description();
					}
				}

				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(88);
					time();
					}
				}

				}
				break;
			case 5:
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESCRIPTION) {
					{
					setState(91);
					description();
					}
				}

				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLACE) {
					{
					setState(94);
					place();
					}
				}

				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(97);
					time();
					}
				}

				}
				break;
			case 6:
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESCRIPTION) {
					{
					setState(100);
					description();
					}
				}

				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(103);
					time();
					}
				}

				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLACE) {
					{
					setState(106);
					place();
					}
				}

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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public TerminalNode DESC() { return getToken(testParser.DESC, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NAME);
			setState(112);
			match(T__0);
			setState(113);
			match(DESC);
			setState(114);
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(testParser.DESCRIPTION, 0); }
		public List<TerminalNode> DESC() { return getTokens(testParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(testParser.DESC, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(DESCRIPTION);
			setState(117);
			match(T__0);
			setState(118);
			match(DESC);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DESC || _la==SPACE) {
				{
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==SPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public static class PlaceContext extends ParserRuleContext {
		public TerminalNode PLACE() { return getToken(testParser.PLACE, 0); }
		public TerminalNode DESC() { return getToken(testParser.DESC, 0); }
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_place);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PLACE);
			setState(128);
			match(T__0);
			setState(129);
			match(DESC);
			setState(130);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(testParser.FROM, 0); }
		public List<TerminalNode> TIME() { return getTokens(testParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(testParser.TIME, i);
		}
		public TerminalNode TO() { return getToken(testParser.TO, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FROM);
			setState(133);
			match(T__0);
			setState(134);
			match(TIME);
			setState(135);
			match(TO);
			setState(136);
			match(TIME);
			setState(137);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(testParser.DATE, 0); }
		public TerminalNode MONTH() { return getToken(testParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(testParser.DAY, 0); }
		public TerminalNode YEAR() { return getToken(testParser.YEAR, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DATE);
			setState(140);
			match(T__0);
			setState(141);
			match(MONTH);
			setState(142);
			match(DAY);
			setState(143);
			match(YEAR);
			setState(144);
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

	public static class PlanContext extends ParserRuleContext {
		public TerminalNode PLAN() { return getToken(testParser.PLAN, 0); }
		public AttendeeContext attendee() {
			return getRuleContext(AttendeeContext.class,0);
		}
		public RecipeContext recipe() {
			return getRuleContext(RecipeContext.class,0);
		}
		public PlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPlan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPlan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanContext plan() throws RecognitionException {
		PlanContext _localctx = new PlanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(PLAN);
			setState(147);
			match(T__0);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTENDEE:
				{
				setState(148);
				attendee();
				}
				break;
			case RECIPE:
				{
				setState(149);
				recipe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
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

	public static class AttendeeContext extends ParserRuleContext {
		public TerminalNode ATTENDEE() { return getToken(testParser.ATTENDEE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AllergyContext allergy() {
			return getRuleContext(AllergyContext.class,0);
		}
		public DietContext diet() {
			return getRuleContext(DietContext.class,0);
		}
		public CuisineContext cuisine() {
			return getRuleContext(CuisineContext.class,0);
		}
		public AvailableContext available() {
			return getRuleContext(AvailableContext.class,0);
		}
		public UnavailableContext unavailable() {
			return getRuleContext(UnavailableContext.class,0);
		}
		public AttendeeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attendee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAttendee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAttendee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAttendee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttendeeContext attendee() throws RecognitionException {
		AttendeeContext _localctx = new AttendeeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attendee);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ATTENDEE);
			setState(155);
			match(T__0);
			setState(156);
			name();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALLERGY) {
				{
				setState(157);
				allergy();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIET) {
				{
				setState(160);
				diet();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CUISINE) {
				{
				setState(163);
				cuisine();
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AVAILABLE) {
				{
				setState(166);
				available();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNAVAILABLE) {
				{
				setState(169);
				unavailable();
				}
			}

			setState(172);
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

	public static class AllergyContext extends ParserRuleContext {
		public TerminalNode ALLERGY() { return getToken(testParser.ALLERGY, 0); }
		public List<TerminalNode> ALLERGIES() { return getTokens(testParser.ALLERGIES); }
		public TerminalNode ALLERGIES(int i) {
			return getToken(testParser.ALLERGIES, i);
		}
		public AllergyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allergy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAllergy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAllergy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAllergy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllergyContext allergy() throws RecognitionException {
		AllergyContext _localctx = new AllergyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_allergy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ALLERGY);
			setState(175);
			match(T__0);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(176);
					match(ALLERGIES);
					setState(177);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(178);
					match(ALLERGIES);
					}
					break;
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALLERGIES );
			setState(183);
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

	public static class DietContext extends ParserRuleContext {
		public TerminalNode DIET() { return getToken(testParser.DIET, 0); }
		public TerminalNode DIETTYPE() { return getToken(testParser.DIETTYPE, 0); }
		public DietContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDiet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDiet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDiet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DietContext diet() throws RecognitionException {
		DietContext _localctx = new DietContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_diet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DIET);
			setState(186);
			match(T__0);
			setState(187);
			match(DIETTYPE);
			setState(188);
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

	public static class CuisineContext extends ParserRuleContext {
		public TerminalNode CUISINE() { return getToken(testParser.CUISINE, 0); }
		public TerminalNode CUISINES() { return getToken(testParser.CUISINES, 0); }
		public CuisineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuisine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCuisine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCuisine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCuisine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuisineContext cuisine() throws RecognitionException {
		CuisineContext _localctx = new CuisineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cuisine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CUISINE);
			setState(191);
			match(T__0);
			setState(192);
			match(CUISINES);
			setState(193);
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

	public static class AvailableContext extends ParserRuleContext {
		public TerminalNode AVAILABLE() { return getToken(testParser.AVAILABLE, 0); }
		public List<TerminalNode> MONTH() { return getTokens(testParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(testParser.MONTH, i);
		}
		public List<TerminalNode> DAY() { return getTokens(testParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(testParser.DAY, i);
		}
		public List<TerminalNode> FROM() { return getTokens(testParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(testParser.FROM, i);
		}
		public List<TerminalNode> TIME() { return getTokens(testParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(testParser.TIME, i);
		}
		public List<TerminalNode> TO() { return getTokens(testParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(testParser.TO, i);
		}
		public AvailableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_available; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAvailable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAvailable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAvailable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailableContext available() throws RecognitionException {
		AvailableContext _localctx = new AvailableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_available);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(AVAILABLE);
			setState(196);
			match(T__0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONTH) {
				{
				{
				setState(197);
				match(MONTH);
				setState(198);
				match(DAY);
				setState(199);
				match(FROM);
				setState(200);
				match(TIME);
				setState(201);
				match(TO);
				setState(202);
				match(TIME);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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

	public static class UnavailableContext extends ParserRuleContext {
		public TerminalNode UNAVAILABLE() { return getToken(testParser.UNAVAILABLE, 0); }
		public List<TerminalNode> MONTH() { return getTokens(testParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(testParser.MONTH, i);
		}
		public List<TerminalNode> DAY() { return getTokens(testParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(testParser.DAY, i);
		}
		public List<TerminalNode> FROM() { return getTokens(testParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(testParser.FROM, i);
		}
		public List<TerminalNode> TIME() { return getTokens(testParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(testParser.TIME, i);
		}
		public List<TerminalNode> TO() { return getTokens(testParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(testParser.TO, i);
		}
		public UnavailableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unavailable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterUnavailable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitUnavailable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitUnavailable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnavailableContext unavailable() throws RecognitionException {
		UnavailableContext _localctx = new UnavailableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unavailable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(UNAVAILABLE);
			setState(211);
			match(T__0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONTH) {
				{
				{
				setState(212);
				match(MONTH);
				setState(213);
				match(DAY);
				setState(214);
				match(FROM);
				setState(215);
				match(TIME);
				setState(216);
				match(TO);
				setState(217);
				match(TIME);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class RecipeContext extends ParserRuleContext {
		public ArrayList<String> strTest;
		public Token a;
		public Token f;
		public Token g;
		public TerminalNode RECIPE() { return getToken(testParser.RECIPE, 0); }
		public List<TerminalNode> DESC() { return getTokens(testParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(testParser.DESC, i);
		}
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_recipe);

		    ((RecipeContext)_localctx).strTest =  new ArrayList<String>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((RecipeContext)_localctx).a = match(RECIPE);
			_localctx.strTest.add((((RecipeContext)_localctx).a!=null?((RecipeContext)_localctx).a.getText():null));
			setState(227);
			match(T__0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DESC) {
				{
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(228);
					((RecipeContext)_localctx).f = match(DESC);
					setState(229);
					match(T__2);
					_localctx.strTest.add((((RecipeContext)_localctx).f!=null?((RecipeContext)_localctx).f.getText():null));
					}
					break;
				case 2:
					{
					setState(231);
					((RecipeContext)_localctx).g = match(DESC);
					_localctx.strTest.add((((RecipeContext)_localctx).g!=null?((RecipeContext)_localctx).g.getText():null));
					}
					break;
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(T__1);
			System.out.println(_localctx.strTest);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00f4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\3\3\5\3.\n\3\3\4\5\4\61\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5;\n\5\3\5\5\5>\n\5\3\5\5\5A\n\5\3\5\5\5"+
		"D\n\5\3\5\5\5G\n\5\3\5\5\5J\n\5\3\5\5\5M\n\5\3\5\5\5P\n\5\3\5\5\5S\n\5"+
		"\3\5\5\5V\n\5\3\5\5\5Y\n\5\3\5\5\5\\\n\5\3\5\5\5_\n\5\3\5\5\5b\n\5\3\5"+
		"\5\5e\n\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\5\5\5n\n\5\5\5p\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13\u0099\n\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a1\n\f"+
		"\3\f\5\f\u00a4\n\f\3\f\5\f\u00a7\n\f\3\f\5\f\u00aa\n\f\3\f\5\f\u00ad\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u00b6\n\r\r\r\16\r\u00b7\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00dd\n\21\f\21\16\21\u00e0"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ec\n"+
		"\22\f\22\16\22\u00ef\13\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\3\4\2\35\35\37\37\2\u010a\2%\3\2\2\2\4-\3\2"+
		"\2\2\6\60\3\2\2\2\b\67\3\2\2\2\nq\3\2\2\2\fv\3\2\2\2\16\u0081\3\2\2\2"+
		"\20\u0086\3\2\2\2\22\u008d\3\2\2\2\24\u0094\3\2\2\2\26\u009c\3\2\2\2\30"+
		"\u00b0\3\2\2\2\32\u00bb\3\2\2\2\34\u00c0\3\2\2\2\36\u00c5\3\2\2\2 \u00d4"+
		"\3\2\2\2\"\u00e3\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'("+
		"\3\2\2\2()\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+.\5\6\4\2,.\5\24\13\2-+\3\2\2"+
		"\2-,\3\2\2\2.\5\3\2\2\2/\61\7\r\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\7\16\2\2\63\64\7\3\2\2\64\65\5\b\5\2\65\66\7\4\2\2\66\7\3"+
		"\2\2\2\678\5\n\6\28o\5\22\n\29;\5\20\t\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2"+
		"<>\5\16\b\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\f\7\2@?\3\2\2\2@A\3\2\2"+
		"\2Ap\3\2\2\2BD\5\20\t\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\f\7\2FE\3\2"+
		"\2\2FG\3\2\2\2GI\3\2\2\2HJ\5\16\b\2IH\3\2\2\2IJ\3\2\2\2Jp\3\2\2\2KM\5"+
		"\16\b\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NP\5\20\t\2ON\3\2\2\2OP\3\2\2\2P"+
		"R\3\2\2\2QS\5\f\7\2RQ\3\2\2\2RS\3\2\2\2Sp\3\2\2\2TV\5\16\b\2UT\3\2\2\2"+
		"UV\3\2\2\2VX\3\2\2\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5\20\t"+
		"\2[Z\3\2\2\2[\\\3\2\2\2\\p\3\2\2\2]_\5\f\7\2^]\3\2\2\2^_\3\2\2\2_a\3\2"+
		"\2\2`b\5\16\b\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5\20\t\2dc\3\2\2\2de\3"+
		"\2\2\2ep\3\2\2\2fh\5\f\7\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\20\t\2ji"+
		"\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\16\b\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2"+
		"o:\3\2\2\2oC\3\2\2\2oL\3\2\2\2oU\3\2\2\2o^\3\2\2\2og\3\2\2\2op\3\2\2\2"+
		"p\t\3\2\2\2qr\7\17\2\2rs\7\3\2\2st\7\35\2\2tu\7\4\2\2u\13\3\2\2\2vw\7"+
		"\21\2\2wx\7\3\2\2x|\7\35\2\2y{\t\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|"+
		"}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\4\2\2\u0080\r\3\2\2\2\u0081"+
		"\u0082\7\22\2\2\u0082\u0083\7\3\2\2\u0083\u0084\7\35\2\2\u0084\u0085\7"+
		"\4\2\2\u0085\17\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\7\3\2\2\u0088"+
		"\u0089\7\33\2\2\u0089\u008a\7\24\2\2\u008a\u008b\7\33\2\2\u008b\u008c"+
		"\7\4\2\2\u008c\21\3\2\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7\3\2\2\u008f"+
		"\u0090\7\b\2\2\u0090\u0091\7\32\2\2\u0091\u0092\7\34\2\2\u0092\u0093\7"+
		"\4\2\2\u0093\23\3\2\2\2\u0094\u0095\7\20\2\2\u0095\u0098\7\3\2\2\u0096"+
		"\u0099\5\26\f\2\u0097\u0099\5\"\22\2\u0098\u0096\3\2\2\2\u0098\u0097\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\4\2\2\u009b\25\3\2\2\2\u009c"+
		"\u009d\7\27\2\2\u009d\u009e\7\3\2\2\u009e\u00a0\5\n\6\2\u009f\u00a1\5"+
		"\30\r\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a4\5\32\16\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u00a7\5\34\17\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\5 \21\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\4\2\2\u00af\27\3\2\2"+
		"\2\u00b0\u00b1\7\f\2\2\u00b1\u00b5\7\3\2\2\u00b2\u00b3\7\6\2\2\u00b3\u00b6"+
		"\7\5\2\2\u00b4\u00b6\7\6\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7\4\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd"+
		"\7\3\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf\7\4\2\2\u00bf\33\3\2\2\2\u00c0"+
		"\u00c1\7\n\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\7\4"+
		"\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\7\31\2\2\u00c6\u00cf\7\3\2\2\u00c7\u00c8"+
		"\7\b\2\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\7\33\2"+
		"\2\u00cb\u00cc\7\24\2\2\u00cc\u00ce\7\33\2\2\u00cd\u00c7\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\37\3\2\2\2\u00d4\u00d5"+
		"\7\30\2\2\u00d5\u00de\7\3\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\7\32\2\2"+
		"\u00d8\u00d9\7\23\2\2\u00d9\u00da\7\33\2\2\u00da\u00db\7\24\2\2\u00db"+
		"\u00dd\7\33\2\2\u00dc\u00d6\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\4\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7\26\2\2\u00e4\u00e5\b\22\1"+
		"\2\u00e5\u00ed\7\3\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\7\5\2\2\u00e8"+
		"\u00ec\b\22\1\2\u00e9\u00ea\7\35\2\2\u00ea\u00ec\b\22\1\2\u00eb\u00e6"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\4"+
		"\2\2\u00f1\u00f2\b\22\1\2\u00f2#\3\2\2\2%\'-\60:=@CFILORUX[^adgjmo|\u0098"+
		"\u00a0\u00a3\u00a6\u00a9\u00ac\u00b5\u00b7\u00cf\u00de\u00eb\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}