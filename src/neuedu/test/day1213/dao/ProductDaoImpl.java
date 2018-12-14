package neuedu.test.day1213.dao;

import neuedu.test.day1213.pojo.Product;
import neuedu.test.day1213.util.JDBCUtil;
import neuedu.test.day1213.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements IProductDao{
    @Override
    public List<Product> getlLists() {
        return JDBCUtil.executeQuery("select * from product", new RowMap<Product>() {
            @Override
            public Product RowMaping(ResultSet rs) {
                Product p =new Product();
                try {
                    p.setId(rs.getInt("id"));
                    p.setPrice(rs.getDouble("price"));
                    p.setProductName(rs.getString("product_name"));
                 } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, null);
    }

    @Override
    public int add(Product product) {
        return JDBCUtil.executeUpdate("insert into product(id,product_name,price) value(?,?,?)",
                product.getId(),product.getProductName(),product.getPrice());
    }

    @Override
    public int delete(int id) {
        return JDBCUtil.executeUpdate("delete from product where id=?",id);
    }

    @Override
    public Product getone(int id) {
        return JDBCUtil.Queryone("select * from product where id=?", new RowMap<Product>() {
            @Override
            public Product RowMaping(ResultSet rs) {
                Product p = new Product();
                try {
                    p.setProductName(rs.getString("product_name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setId(id);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, id);
    }

    @Override
    public int update(Product product) {
        return JDBCUtil.executeUpdate("update  product set product_name=?,price=? where id=?",
                product.getProductName(), product.getPrice(), product.getId());

    }
}
