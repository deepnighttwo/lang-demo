// Generated from G:\mymise\lang-demo\antlr-demo\src\main\java\otfql\OTFQLGrammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OTFQLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OTFQLGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(@NotNull OTFQLGrammarParser.TContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropVar(@NotNull OTFQLGrammarParser.PropVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#ttt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtt(@NotNull OTFQLGrammarParser.TttContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull OTFQLGrammarParser.SelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#ql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQl(@NotNull OTFQLGrammarParser.QlContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#arrayProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayProp(@NotNull OTFQLGrammarParser.ArrayPropContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(@NotNull OTFQLGrammarParser.PropContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull OTFQLGrammarParser.BoolExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#propsSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsSel(@NotNull OTFQLGrammarParser.PropsSelContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(@NotNull OTFQLGrammarParser.FromContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(@NotNull OTFQLGrammarParser.WhereContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprs(@NotNull OTFQLGrammarParser.BoolExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#propFullName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropFullName(@NotNull OTFQLGrammarParser.PropFullNameContext ctx);
}