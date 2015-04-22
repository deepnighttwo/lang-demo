package otl.parser;


import otl.grammar.OTLBaseVisitor;

/**
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:09
 */
public interface OTLVisitorFactory {
    OTLBaseVisitor<Object> createVisitor() throws Exception;
}
