package com.wangjie.lesson01;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JdbcFirstDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
//        Class.forName("com.mysql.jdbc.Driver"); // 固定写法，加载驱动
//        DriverManager.registerDriver(new Driver()); // 这是原来的写法
        Class.forName("com.mysql.cj.jdbc.Driver"); // 固定写法，加载驱动

        // 2.用户信息和url
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&&useSSL=true";
        String username = "root";
        String password="123456";

        // 3.连接成功，数据库对象 Connection 代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 4.执行SQL的对象 Statement 执行SQL对象
        Statement statement = connection.createStatement();

        // 5.执行SQL的对象 去执行SQL，可能存在结果，查看返回结果
        String sql = "select * from users";

        ResultSet resultSet = statement.executeQuery(sql); // 返回的结果集，结果集中封装了我们全部的查询出来的结果
        while (resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("name"));
            System.out.println("pwd="+resultSet.getObject("password"));
            System.out.println("email="+resultSet.getObject("email"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
        }

        // 6.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
