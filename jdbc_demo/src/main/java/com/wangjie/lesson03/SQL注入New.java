package com.wangjie.lesson03;

import com.wangjie.lesson02.utils.JdbcUtils;

import java.sql.*;

public class SQL注入New {
    public static void main(String[] args) {
        login("kuangshen","123456");
        // SQL注入
//        login(" 'or '1=1"," 'or'1=1");
    }
    // 登录
    public static void login(String username, String password){

        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();


            // SQL
            String sql = "select * from users where `NAME`=? and `PASSWORD`=?";

            // prepareStatement 防止SQL注入的本质，把传递进来的参数当做字符；
            // 假设其中存在转义字符，就直接忽略，，   '会被直接转义
            st = conn.prepareStatement(sql);
            st.setString(1,"kuangshen");
            st.setString(2,"123456");
            rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("NAME"));
                System.out.println(rs.getString("PASSWORD"));
                System.out.println("============================");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

}
