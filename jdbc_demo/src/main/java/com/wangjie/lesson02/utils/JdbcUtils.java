package com.wangjie.lesson02.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String driver = null; // 提升作用域
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        try {
            Properties properties = new Properties();
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("DBConfig.properties");
            properties.load(in);

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            // 1.驱动只要加载一次
            Class.forName(driver);
        }
         catch (Exception e) {
            throw new RuntimeException("数据库连接失败");
        }
    }

    // 获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // 释放连接资源
    public static void release(Connection conn, Statement st, ResultSet rs){
        if (rs!=null){
            try{
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
