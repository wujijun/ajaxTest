package neuedu.test.day1213.service;

import neuedu.test.day1213.dao.IProductDao;
import neuedu.test.day1213.dao.ProductDaoImpl;
import neuedu.test.day1213.pojo.Product;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductDao dao= new ProductDaoImpl();
    @Override
    public List<Product> getlLists() {
        return dao.getlLists();
    }

    @Override
    public int add(Product product) {
        return dao.add(product);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Product getone(int id) {
        return dao.getone(id);
    }

    @Override
    public int update(Product product) {
        return dao.update(product);
    }
}
