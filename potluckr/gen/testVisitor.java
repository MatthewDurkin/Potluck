// Generated from C:/Users/Dustin/IdeaProjects/potluckr\test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(testParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(testParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(testParser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(testParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(testParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(testParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#place}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(testParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(testParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(testParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan(testParser.PlanContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#attendee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttendee(testParser.AttendeeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#allergy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllergy(testParser.AllergyContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#diet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiet(testParser.DietContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#cuisine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuisine(testParser.CuisineContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#available}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailable(testParser.AvailableContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#unavailable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnavailable(testParser.UnavailableContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(testParser.RecipeContext ctx);
}