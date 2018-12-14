package neuedu.test.day1213.dao;

import neuedu.test.day1213.pojo.Product;

import java.util.List;

public interface IProductDao {
    public List<Product> getlLists();
    public int add(Product product);
    public  int delete(int id);
    public  Product getone(int id);
    public  int update(Product product);

}
