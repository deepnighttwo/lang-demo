// Generated from G:\mymise\lang-demo\antlr-demo\src\main\java\otfql\OTFQLGrammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OTFQLGrammarParser}.
 */
public interface OTFQLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(@NotNull OTFQLGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(@NotNull OTFQLGrammarParser.TContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterPropVar(@NotNull OTFQLGrammarParser.PropVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitPropVar(@NotNull OTFQLGrammarParser.PropVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#ttt}.
	 * @param ctx the parse tree
	 */
	void enterTtt(@NotNull OTFQLGrammarParser.TttContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#ttt}.
	 * @param ctx the parse tree
	 */
	void exitTtt(@NotNull OTFQLGrammarParser.TttContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull OTFQLGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull OTFQLGrammarParser.SelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#ql}.
	 * @param ctx the parse tree
	 */
	void enterQl(@NotNull OTFQLGrammarParser.QlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#ql}.
	 * @param ctx the parse tree
	 */
	void exitQl(@NotNull OTFQLGrammarParser.QlContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#arrayProp}.
	 * @param ctx the parse tree
	 */
	void enterArrayProp(@NotNull OTFQLGrammarParser.ArrayPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#arrayProp}.
	 * @param ctx the parse tree
	 */
	void exitArrayProp(@NotNull OTFQLGrammarParser.ArrayPropContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(@NotNull OTFQLGrammarParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(@NotNull OTFQLGrammarParser.PropContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull OTFQLGrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull OTFQLGrammarParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#propsSel}.
	 * @param ctx the parse tree
	 */
	void enterPropsSel(@NotNull OTFQLGrammarParser.PropsSelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#propsSel}.
	 * @param ctx the parse tree
	 */
	void exitPropsSel(@NotNull OTFQLGrammarParser.PropsSelContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(@NotNull OTFQLGrammarParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(@NotNull OTFQLGrammarParser.FromContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull OTFQLGrammarParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull OTFQLGrammarParser.WhereContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprs(@NotNull OTFQLGrammarParser.BoolExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprs(@NotNull OTFQLGrammarParser.BoolExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#propFullName}.
	 * @param ctx the parse tree
	 */
	void enterPropFullName(@NotNull OTFQLGrammarParser.PropFullNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#propFullName}.
	 * @param ctx the parse tree
	 */
	void exitPropFullName(@NotNull OTFQLGrammarParser.PropFullNameContext ctx);
}