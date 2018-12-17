package neuedu.test.day1212.controller;

import neuedu.test.day1212.dao.IUsername;
import neuedu.test.day1212.dao.UsernameImpfn;
import neuedu.test.day1212.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*@WebServlet("/doRegister")*/
public class DoRegister extends HttpServlet {
    private IUsername service=new UsernameImpfn();
    IUsername user=new UsernameImpfn();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password =req.getParameter("password");
        String password1 =req.getParameter("password1");
        String email =req.getParameter("email");

        User u= new User();
        u.setUsername(username);
        u.setPassword(password);
        u.setEmail(email);

        if (password.equals(password1)){
            service.insert(u);
            resp.sendRedirect("login");

        }else {
            resp.sendRedirect("resign");
        }
    }
}
