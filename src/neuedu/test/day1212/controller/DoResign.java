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
@WebServlet("/doRegister")
public class DoResign extends HttpServlet {
    IUsername user=new UsernameImpfn();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String names = req.getParameter("names");
        String password = req.getParameter("password");
        String password1 = req.getParameter("password1");
        String email = req.getParameter("email");

        System.out.println(names);
        System.out.println(password);
        System.out.println(password1);
        System.out.println(email);

        if (names!=""){
            User u=user.getone(names);

            if (u!=null){
                resp.getWriter().write("1");   //cannot
            }else {
                resp.getWriter().write("2");    //can
                if (password!=""&&password1!=""){            /*都不为空*/
                    if (password.equals(password1)){
                        resp.getWriter().write("3");     /*正常注册*/
                    }else {
                        resp.getWriter().write("4");    /*两次密码不一样*/
                    }
                }
            }
        }




    }


}
