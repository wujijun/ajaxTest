package neuedu.test.day1212.dao;

import neuedu.test.day1212.pojo.User;
import neuedu.test.day1212.utilUsername.RowMap;
import neuedu.test.day1212.utilUsername.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsernameImpfn implements IUsername {


    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate("insert into usertable(username,password,email) values(?,?,?)",
                user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public User getone(String username) {
        return JDBCUtil.Queryone("select * from usertable where username = ?", new RowMap<User>() {
            @Override
            public User RowMaping(ResultSet rs) {
                User u=new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setEmail(rs.getString("email"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println(u);
                return u;
            }
        }, username);
    }
}
