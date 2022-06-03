package com.wangjie.lesson02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL注入 {
    public static void main(String[] args) {



    }
    // 登录
    public static void login(String username, String password){

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();

            // SQL
            String sql = "select * from users where NAME="+username;

            rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("NAME"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

}
