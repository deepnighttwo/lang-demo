// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/learn\LibExpr.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LibExprParser}.
 */
public interface LibExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull LibExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull LibExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull LibExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull LibExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull LibExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull LibExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(@NotNull LibExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(@NotNull LibExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull LibExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull LibExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull LibExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull LibExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull LibExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull LibExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull LibExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull LibExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull LibExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull LibExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(@NotNull LibExprParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(@NotNull LibExprParser.TestContext ctx);
}