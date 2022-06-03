package com.wangjie.lesson03;

import com.wangjie.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDelete {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null; // 是statement子类

        try {
            conn = JdbcUtils.getConnection();
            // 区别
            // 使用? 占位符代替参数
            String sql = "delete from users where id=?";
            st = conn.prepareStatement(sql); // 预编译SQl，先写sql，然后不执行

            // 手动给参数赋值
            st.setInt(1,4); // 删除这个内容

            // 执行
//            st.executeUpdate();
            int i = st.executeUpdate();
            if (i>0) {
                System.out.println("删除成功！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,null);
        }
    }
}
