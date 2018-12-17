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
@WebServlet(value = "/doRegister")

public class DoResign extends HttpServlet {

    IUsername user=new UsernameImpfn();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("unames");
        User u=user.getone(uname);

        System.out.println(uname);
        if (u!=null){
            resp.getWriter().write("1");   //cannot
        }else {
            resp.getWriter().write("2");    //can

        }


    }
}
