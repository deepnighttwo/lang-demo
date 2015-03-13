package sql;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * User: mzang
 * Date: 2015-03-12
 * Time: 20:49
 */
@WebServlet(name = "antlr4", urlPatterns = {"/sql", "/data"})

public class ServletAntlr4 extends HttpServlet {

    static Gson gson = new Gson();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String postData = readStream(req.getInputStream());
        if ("/sql".equalsIgnoreCase(uri)) {
            String tree = ANTLR4SQLParser.instance.updateSQL(postData);
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.setHeader("Content-Type", "application/json; charset=UTF-8");
            resp.getOutputStream().write(tree.getBytes());
        } else if ("/data".equalsIgnoreCase(uri)) {
            Map respData = ANTLR4SQLParser.instance.executeSqlOnJSON(postData);
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.setHeader("Content-Type", "application/json; charset=UTF-8");
            resp.getOutputStream().write(gson.toJson(respData).getBytes());
        }
    }


    private String readStream(InputStream is) throws IOException {

        int bufLength = 4096;
        byte[] rt = new byte[0];
        byte[] buf = new byte[bufLength];
        int readCount = is.read(buf);
        while (readCount > 0) {
            if (rt == null) {
                rt = new byte[readCount];
                System.arraycopy(buf, 0, rt, 0, readCount);
            } else {
                byte[] tmp = new byte[rt.length + readCount];
                System.arraycopy(rt, 0, tmp, 0, rt.length);
                System.arraycopy(buf, 0, tmp, rt.length, readCount);
                rt = tmp;
            }
            readCount = is.read(buf);
        }
        return new String(rt, "UTF-8");
    }
}
