// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTL.g4 by ANTLR 4.5
package com.deepnighttwo.otl.grammar.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OTLParser#ql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQl(@NotNull OTLParser.QlContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull OTLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(@NotNull OTLParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(@NotNull OTLParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarProp}
	 * labeled alternative in {@link OTLParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarProp(@NotNull OTLParser.VarPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link OTLParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull OTLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link OTLParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull OTLParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link OTLParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull OTLParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link OTLParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull OTLParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#propsSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsSel(@NotNull OTLParser.PropsSelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectPropVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectPropVar(@NotNull OTLParser.DirectPropVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExprVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExprVar(@NotNull OTLParser.NumExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralVar(@NotNull OTLParser.LiteralVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVar(@NotNull OTLParser.FuncVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#propFullName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropFullName(@NotNull OTLParser.PropFullNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prop}
	 * labeled alternative in {@link OTLParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(@NotNull OTLParser.PropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayProp}
	 * labeled alternative in {@link OTLParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayProp(@NotNull OTLParser.ArrayPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#boolExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprs(@NotNull OTLParser.BoolExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull OTLParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull OTLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull OTLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(@NotNull OTLParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull OTLParser.BooleanLiteralContext ctx);
}