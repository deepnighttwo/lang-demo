package sql;// Generated from D:/mymise/antlr-demo/src/main/java/sql\Query.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sql.QueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sql.QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull QueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sql.QueryParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull QueryParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link sql.QueryParser#colname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColname(@NotNull QueryParser.ColnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sql.QueryParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(@NotNull QueryParser.TablenameContext ctx);
}