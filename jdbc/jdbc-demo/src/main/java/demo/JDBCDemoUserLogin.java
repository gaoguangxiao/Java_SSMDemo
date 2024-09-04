package demo;

import java.sql.*;

//JDBC的快读入门
public class JDBCDemoUserLogin {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //、注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/itheima";
        String url = "jdbc:mysql:///itheima";
        String username = "root";
        String password = "g12345678";
        //2、获取链接
        Connection connection = DriverManager.getConnection(url,username,password);
        //3、编写更新sql
//        String name = "zhangsan";
//        String psw = "12";

        String name = "sffdas";
        String psw = "'or '1' = '1";

        String sql = "select * from tb_user where username = '"+name+"' and password = '"+psw+"'";
        //4、获取执行sql的对象
        Statement statement = connection.createStatement();
        //5、返回受影响的行数
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        System.out.println(resultSet);
        //6、关闭
        statement.close();
        connection.close();

    }

}
