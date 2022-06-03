package com.wangjie.lesson03;

import com.wangjie.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null; // 是statement子类

        try {
            conn = JdbcUtils.getConnection();
            // 区别
            // 使用? 占位符代替参数
            String sql = "insert into users(id,`NAME`,`PASSWORD`,`email`,`birthday`) values(?,?,?,?,?)";
            st = conn.prepareStatement(sql); // 预编译SQl，先写sql，然后不执行

            // 手动给参数赋值
            st.setInt(1,4);
            st.setString(2,"qinjiang");
            st.setString(3,"1234561");
            st.setString(4,"121242@qq.com");
            // 注意点： sql.Date  数据库用的
            // util.Date Java  new Date().getTime() 获得时间戳
            st.setDate(5,new Date(new Date(1654210383).getTime()));

            // 执行
//            st.executeUpdate();
            int i = st.executeUpdate();
            if (i>0) {
                System.out.println("插入成功！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,null);
        }
    }
}
