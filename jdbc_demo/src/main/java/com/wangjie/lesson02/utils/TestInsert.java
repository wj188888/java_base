package com.wangjie.lesson02.utils;

import com.wangjie.lesson01.JdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection(); // 获取数据库连接
            st = conn.createStatement();
            String sql = "INSERT INTO users(`id`,`NAME`,`PASSWORD`,`email`,`birthday`)" +
                    "VALUES(4,'kuangshen','123245','2460665525@qq.com','2022-6-2')";
            int i = st.executeUpdate(sql);
            if (i>0){
                System.out.println("插入成功!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,rs);
        }

    }
}
