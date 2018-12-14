package neuedu.test.day1212.utilUsername;

import com.mysql.jdbc.Driver;
import org.omg.CORBA.Object;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {

/*驱动加载*/
    static {
        try {
            new Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/user?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
/*
     * 连接通道*/

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

/*关闭通道*/

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

/*封装增删改*/
    public static int executeUpdate(String sql, java.lang.Object...obj) {
        int a = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        con = getConnection();

        try {
            con.setAutoCommit(false);
            pstmt = con.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pstmt.setObject(i + 1, obj[i]);
                }
            }
            a = pstmt.executeUpdate();

            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null, pstmt, con);
        }
        return a;
    }

/*封装getone*/
    public static <T> T Queryone(String sql, RowMap<T> rm, java.lang.Object... obj) {

    T t=null;
    Connection con = null;
    PreparedStatement pstmt = null;
    con = getConnection();
    ResultSet rs = null;

    try {

        pstmt = con.prepareStatement(sql);
        if (obj != null) {
            for (int i = 0; i < obj.length; i++) {
                pstmt.setObject(i + 1, obj[i]);

            }
        }
        rs = pstmt.executeQuery();
        System.out.println(rs);
        while (rs.next()) {
            t=rm.RowMaping(rs);

        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        close(rs, pstmt, con);
    }
        System.out.println(t);
    return t;
}


/*查询*/
    public static <T> List<T> executeQuery(String sql, RowMap<T> rm, Object... obj) {
        int a = 0;
        List<T> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        con = getConnection();
        ResultSet rs = null;


        try {
            con.setAutoCommit(false);
            pstmt = con.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pstmt.setObject(i + 1, obj[i]);

                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()) {
                T g = rm.RowMaping(rs);
                list.add(g);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null, pstmt, con);
        }
      return list;
    }
}


