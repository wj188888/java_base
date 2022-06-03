package com.wangjie.lesson03;

import com.wangjie.lesson02.utils.JdbcUtils;

import java.sql.*;

public class TestUpdate {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null; // 是statement子类
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            String sql = "select * from users where id=?";
            st = conn.prepareStatement(sql); // 预编译SQl，先写sql，然后不执行

            // 手动给参数赋值
            st.setInt(1,1);

            rs = st.executeQuery(); // 执行

            if (rs.next()){
                System.out.println(rs.getString("NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,null);
        }
    }
}
