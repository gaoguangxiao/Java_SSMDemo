package demo;

import pojo.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//JDBC的快读入门
public class JDBCDemoResultMol {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //、注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/itheima";

        String url = "jdbc:mysql:///itheima";
        String username = "root";
        String password = "g12345678";
        //2、获取链接
        Connection connection = DriverManager.getConnection(url, username, password);
        //3、编写更新sql
        String sql = "select * from account";
        //4、获取执行sql的对象
        Statement statement = connection.createStatement();
        //5、返回受影响的行数
        ResultSet resultSet = statement.executeQuery(sql);

        List<Account> list = new ArrayList<Account>();

        while (resultSet.next()) {
            Account account = new Account();

            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            double money = resultSet.getDouble(3);

            account.setId(id);
            account.setName(name);
            account.setMoney(money);

            list.add(account);

//            System.out.println(name + "有" + money + "元");
        }

        System.out.println(list);
        //6、关闭
        resultSet.close();
        statement.close();
        connection.close();

    }
}
