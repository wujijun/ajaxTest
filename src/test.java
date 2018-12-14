import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class test extends HttpServlet {
    @Override
    public void destroy() {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* resp.setContentType("text/html;charset=utf-8");
       PrintWriter pt=resp.getWriter();
        pt.write("我来了");*/




/*作用域*/

     /*  req.setAttribute("key","value");
       req.getRequestDispatcher("aindex1.jsp").forward(req,resp);*/

  /*      HttpSession session = req.getSession();
        session.setAttribute("session","session");
        req.getRequestDispatcher("aindex1.jsp").forward(req,resp);*/

        req.getServletContext().setAttribute("ser","sfr");
        req.getRequestDispatcher("aindex1.jsp").forward(req,resp);

        /*System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getServletPath());
        System.out.println(req.getScheme());
        System.out.println(req.getServerName());
        System.out.println(req.getRequestDispatcher("s"));*/

    }

}
