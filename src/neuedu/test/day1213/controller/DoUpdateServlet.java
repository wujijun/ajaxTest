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
@WebServlet("/doUpdate")
public class DoUpdateServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("productName");
        Double price = Double.parseDouble(req.getParameter("price"));
        int id=Integer.parseInt(req.getParameter("id"));
        Product p=new Product();
        p.setId(id);
        p.setPrice(price);
        p.setProductName(productName);
        service.update(p);
        resp.sendRedirect("list");

    }
}
