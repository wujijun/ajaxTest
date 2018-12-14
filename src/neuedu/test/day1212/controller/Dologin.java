package neuedu.test.day1212.controller;

import neuedu.test.day1212.dao.IUsername;
import neuedu.test.day1212.dao.UsernameImpfn;
import neuedu.test.day1212.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dologin extends HttpServlet {
    IUsername user=new UsernameImpfn();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        User u=user.getone(username);

        if (u!=null){

            if (password.equals(u.getPassword())){
                //跳至登录成功

                System.out.println(u);
                resp.sendRedirect("jsp/day1212/loginIn.jsp");
            }else {
                //跳至登录界面
                resp.sendRedirect("login");
            }
        }else {
            //跳至注册
            resp.sendRedirect("resign");
        }
    }
}
