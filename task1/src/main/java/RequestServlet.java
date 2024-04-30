import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestServlet extends HttpServlet implements Servlet{
    private String mes;
    public RequestServlet() { }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final String message = req.getParameter("key");
        if (message == null || message.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
        } else {
            resp.setStatus(HttpServletResponse.SC_OK);
        }

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(message);
    }

}
