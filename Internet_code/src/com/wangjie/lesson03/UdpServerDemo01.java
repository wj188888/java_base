package com.wangjie.lesson03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// 还是要等待客户端的链接!
public class UdpServerDemo01 {
    public static void main(String[] args) throws IOException {
        // 开放端口
        DatagramSocket socket = new DatagramSocket(9090);

        // 接收数据包
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);// 接收

        socket.receive(packet);

        // 关闭链接
        socket.close();




    }
}
