package otfql;// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTFQLGrammar.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#ql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQl(@NotNull OTFQLGrammarParser.QlContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull OTFQLGrammarParser.SelectContext ctx);
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
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#propsSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsSel(@NotNull OTFQLGrammarParser.PropsSelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#propFullName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropFullName(@NotNull OTFQLGrammarParser.PropFullNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(@NotNull OTFQLGrammarParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(@NotNull OTFQLGrammarParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#literalStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralStr(@NotNull OTFQLGrammarParser.LiteralStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprs(@NotNull OTFQLGrammarParser.BoolExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull OTFQLGrammarParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#tttt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTttt(@NotNull OTFQLGrammarParser.TtttContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTFQLGrammarParser#boolOprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOprt(@NotNull OTFQLGrammarParser.BoolOprtContext ctx);
}