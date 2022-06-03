package com.wangjie.lesson03;

import com.wangjie.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestQuery {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null; // 是statement子类


        try {
            conn = JdbcUtils.getConnection();
            // 区别
            // 使用? 占位符代替参数
            String sql = "update users set `NAME`=? where id=?";
            st = conn.prepareStatement(sql); // 预编译SQl，先写sql，然后不执行

            // 手动给参数赋值
            st.setString(1,"狂神");
            st.setInt(2,1);

            // 执行
//            st.executeUpdate();
            int i = st.executeUpdate();
            if (i>0) {
                System.out.println("修改成功！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,null);
        }
    }
}
