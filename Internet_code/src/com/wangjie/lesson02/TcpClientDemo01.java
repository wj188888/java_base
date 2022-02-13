package com.wangjie.lesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class TcpClientDemo01 {

    public static void main(String[] args) {
        //1.要知道服务器地址
        Socket socket = null;
        OutputStream os = null;

        {
            try {
                InetAddress serverIP = InetAddress.getByName("127.0.0.1");
                // 2.端口号
                int port = 9999;
                // 3.创建一个socket连接
                socket = new Socket(serverIP,port);
                // 发送IO流
                os = socket.getOutputStream();

                os.write("你好兄弟,java狂神牛皮".getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (os != null){
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (socket != null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
