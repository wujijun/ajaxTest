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
@WebServlet("/doLogin")
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
                resp.getWriter().write("0");
              /*  resp.sendRedirect("list");*/
            }else {
                //跳至登录界面
                resp.getWriter().write("1");
                /*resp.sendRedirect("login"); */       //密码错误，请从新登录
            }
        }else {
            //跳至注册                                  //用户不存在
            resp.getWriter().write("2");
            /*resp.sendRedirect("resign");*/
        }
    }
}
