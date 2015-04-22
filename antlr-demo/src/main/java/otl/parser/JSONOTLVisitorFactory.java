package otl.parser;

import otl.ext.ExtensionFunction;
import otl.grammar.OTLBaseVisitor;

import java.lang.reflect.Method;

/**
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:07
 */
public class JSONOTLVisitorFactory implements OTLVisitorFactory {

    @Override
    public OTLBaseVisitor<Object> createVisitor() throws Exception {
        FunctionMgr functionMgr = new FunctionMgr();

        Method method = ExtensionFunction.class.getMethod("isGoodIncome", double.class, String.class, double.class);
        Function func = new Function(method, null);
        functionMgr.addFunction("isGoodIncome", func);
        JSONOTLVisitor visitor = new JSONOTLVisitor();
        visitor.setFunctionMgr(functionMgr);
        return visitor;
    }
}
