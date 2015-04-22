package otl.parser;

import com.google.gson.Gson;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import otl.grammar.OTLLexer;
import otl.grammar.OTLParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * not thread safe
 * <p/>
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:02
 */
public class OTLExplainService {

    Map<String, List<QlContextWithId>> ds2Ctx = new HashMap<>();

    static Gson gson = new Gson();

    JSONOTLVisitor visitor;


    public OTLExplainService() {
        FunctionMgr functionMgr = new FunctionMgr();

        visitor = new JSONOTLVisitor();
        visitor.setFunctionMgr(functionMgr);

    }

    public void addFunction(String funcName, Method method, Object on) {
        visitor.getFunctionMgr().addFunction(funcName, new Function(method, on));
    }

    public synchronized void addOTL(Object id, String otl) {
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(new ByteArrayInputStream(otl.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        OTLLexer lexer = new OTLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        OTLParser otlParse = new OTLParser(tokenStream);

        OTLParser.QlContext qlContext = otlParse.ql();

        String fromSource = qlContext.from().fromSource.getText();

        List<QlContextWithId> ctxs = ds2Ctx.get(fromSource);
        if (ctxs == null) {
            ctxs = new ArrayList<>();
            ds2Ctx.put(fromSource, ctxs);
        }

        QlContextWithId qlContextWithId = new QlContextWithId(id, qlContext);

        ctxs.add(qlContextWithId);
    }

    public synchronized boolean removeOTL(Object id) {
        for (List<QlContextWithId> qlContexts : ds2Ctx.values()) {
            if (qlContexts.remove(id)) {
                return true;
            }
        }
        return false;
    }

    public Map<Object, Object> process(String datasource, String json) {

        Map data = gson.fromJson(json, Map.class);

        return this.process(datasource, data);
    }

    public Map<Object, Object> process(String datasource, Map json) {

        List<QlContextWithId> qlContexts = ds2Ctx.get(datasource);

        if (qlContexts == null) {
            return Collections.EMPTY_MAP;
        }


        Map<Object, Object> rets = new HashMap<>();

        for (QlContextWithId qlContextWithId : qlContexts) {
            Object id = qlContextWithId.id;
            OTLParser.QlContext qlContext = qlContextWithId.qlContext;

            visitor.setRawData(json);
            Object var = visitor.visit(qlContext);
            rets.put(id, var);
        }

        return rets;
    }

}

class QlContextWithId {

    public QlContextWithId(Object id, OTLParser.QlContext qlContext) {
        this.id = id;
        this.qlContext = qlContext;
    }

    Object id;

    OTLParser.QlContext qlContext;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QlContextWithId)) return false;

        QlContextWithId that = (QlContextWithId) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
