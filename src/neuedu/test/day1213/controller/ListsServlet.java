package neuedu.test.day1213.controller;

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

public class ListsServlet extends HttpServlet {

    private IProductService service = new ProductServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = service.getlLists();
        req.setAttribute("list", list);

        req.getRequestDispatcher("jsp/day1212/list.jsp").forward(req,resp);

    }
}