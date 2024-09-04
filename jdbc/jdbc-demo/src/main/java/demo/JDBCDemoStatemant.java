package demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC的快读入门
public class JDBCDemoStatemant {

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
        String sql = "update account set money = '1000' where id = 1";
        //4、获取执行sql的对象
        Statement statement = connection.createStatement();
        //5、返回受影响的行数
        int count = statement.executeUpdate(sql);

        System.out.println(count);
        //6、关闭
        statement.close();
        connection.close();

    }
}
