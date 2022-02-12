package com.wangjie.lesson01;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIntAddress {
    public static void main(String[] args) {

        try {
            // 查询本地ip
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress2 = InetAddress.getByName("github.com");
            System.out.println(inetAddress2);

            // 查询网站ip地址
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);


            //常用方法
            System.out.println(inetAddress2.getAddress());
            System.out.println(inetAddress2.getCanonicalHostName()); // 规范的名字
            System.out.println(inetAddress2.getHostAddress());
            System.out.println(inetAddress2.getClass());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
