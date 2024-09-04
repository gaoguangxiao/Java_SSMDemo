package demo;

import java.sql.*;

//JDBC的快读入门
public class JDBCDemoResult {
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

        int count = 0;
//        resultSet.next();//光标向前移动；判断当前行是否有效。返回是否有效
//        resultSet.getArray();//获取数据
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String money = resultSet.getString(3);
            System.out.println(name + "有" + money + "元");
        }
        //6、关闭
        resultSet.close();
        statement.close();
        connection.close();

    }
}
