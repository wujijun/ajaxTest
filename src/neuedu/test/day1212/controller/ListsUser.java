package neuedu.test.day1212.controller;

import com.alibaba.fastjson.JSONObject;
import neuedu.test.day1213.pojo.Product;
import neuedu.test.day1213.service.IProductService;
import neuedu.test.day1213.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("lists")
public class ListsUser extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list =service.getlLists();
        String lists = JSONObject.toJSONString(list);
        req.setCharacterEncoding("utf-8");
        resp.getWriter().write(lists);
    }
}
