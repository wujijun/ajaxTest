package neuedu.test.day1212.dao;

import neuedu.test.day1212.pojo.User;

public interface IUsername {
    public int insert(User user);
    public  User getone(String username);

}
