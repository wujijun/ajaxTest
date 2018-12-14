package neuedu.test.day1212.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Resign extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/day1212/resign.jsp").forward(req,resp);
     /*   String username = req.getParameter("username" );
        String password =req.getParameter("password" );
        String password1 = req.getParameter("password1" );
        String email = req.getParameter("email" );
        System.out.println(username +"  "+password +"  "+password1 +" "+email);*/

    }
}
