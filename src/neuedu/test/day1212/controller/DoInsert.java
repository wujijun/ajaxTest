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
@WebServlet("/doInsert")
public class DoInsert extends HttpServlet {
    private IUsername service= new UsernameImpfn();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String names = req.getParameter("names");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        User u = new User();
        u.setUsername(names);
        u.setPassword(password);
        u.setEmail(email);

       int result= service.insert(u);

       if (result>0){
           resp.getWriter().write("1");   //注册成功
       }else {
           resp.getWriter().write("0");   //注册失败
       }

    }
}
