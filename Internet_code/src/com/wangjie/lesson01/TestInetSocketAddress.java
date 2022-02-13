package com.wangjie.lesson01;

import java.net.InetSocketAddress;

public class TestInetSocketAddress {
    public static void main(String[] args) {

        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",8080);
        System.out.println(socketAddress);
        System.out.println(socketAddress2);
        System.out.println(socketAddress2.getAddress());
        System.out.println(socketAddress.getHostName()); // 地址和端口
        System.out.println(socketAddress.getHostString());
        System.out.println(socketAddress.getPort());


    }
}
