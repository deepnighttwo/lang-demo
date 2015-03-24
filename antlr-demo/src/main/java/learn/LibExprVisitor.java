package learn;// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/learn\LibExpr.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link learn.LibExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LibExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link learn.LibExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull LibExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link learn.LibExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull LibExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link learn.LibExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull LibExprParser.ExprContext ctx);
}