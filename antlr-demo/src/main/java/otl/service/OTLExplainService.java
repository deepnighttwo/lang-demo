package otl.service;

import otl.grammar.OTLParser;
import otl.parser.OTLVisitorFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * not thread safe
 *
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:02
 */
public class OTLExplainService {

    Map<String, List<OTLParser.QlContext>> ds2Ctx= new HashMap<>();

    Map<String, OTLParser.QlContext> otl2Ctx = new HashMap<>();


    OTLVisitorFactory otlVisitorFactory;

    public OTLExplainService(){

    }

    public OTLVisitorFactory getOtlVisitorFactory() {
        return otlVisitorFactory;
    }

    public void setOtlVisitorFactory(OTLVisitorFactory otlVisitorFactory) {
        this.otlVisitorFactory = otlVisitorFactory;
    }


    public void addOTL(){

    }

}
