// Generated from C:/Users/Dustin/IdeaProjects/potluckr\test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(testParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(testParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(testParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(testParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(testParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(testParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(testParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(testParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(testParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(testParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(testParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(testParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(testParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(testParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(testParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(testParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(testParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(testParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#plan}.
	 * @param ctx the parse tree
	 */
	void enterPlan(testParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#plan}.
	 * @param ctx the parse tree
	 */
	void exitPlan(testParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#attendee}.
	 * @param ctx the parse tree
	 */
	void enterAttendee(testParser.AttendeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#attendee}.
	 * @param ctx the parse tree
	 */
	void exitAttendee(testParser.AttendeeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#allergy}.
	 * @param ctx the parse tree
	 */
	void enterAllergy(testParser.AllergyContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#allergy}.
	 * @param ctx the parse tree
	 */
	void exitAllergy(testParser.AllergyContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#diet}.
	 * @param ctx the parse tree
	 */
	void enterDiet(testParser.DietContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#diet}.
	 * @param ctx the parse tree
	 */
	void exitDiet(testParser.DietContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#cuisine}.
	 * @param ctx the parse tree
	 */
	void enterCuisine(testParser.CuisineContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#cuisine}.
	 * @param ctx the parse tree
	 */
	void exitCuisine(testParser.CuisineContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#available}.
	 * @param ctx the parse tree
	 */
	void enterAvailable(testParser.AvailableContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#available}.
	 * @param ctx the parse tree
	 */
	void exitAvailable(testParser.AvailableContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#unavailable}.
	 * @param ctx the parse tree
	 */
	void enterUnavailable(testParser.UnavailableContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#unavailable}.
	 * @param ctx the parse tree
	 */
	void exitUnavailable(testParser.UnavailableContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(testParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(testParser.RecipeContext ctx);
}