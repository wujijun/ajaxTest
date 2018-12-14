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
@WebServlet("/doAdd")
public class DoAddServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("productName");
        Double price = Double.parseDouble(req.getParameter("price"));
        Product p = new Product();
        p.setProductName(productName);
        p.setPrice(price);
        service.add(p);
        resp.sendRedirect("list");
    }
}
