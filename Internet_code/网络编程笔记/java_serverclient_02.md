## 文件上传
**服务器端：**
```
package com.wangjie.lesson02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {
    public static void main(String[] args) throws IOException {
        // 1.创建服务
        ServerSocket serverSocket = new ServerSocket(9000);
        // 2. 监听客户端的连接
        Socket socket = serverSocket.accept();
        // 3. 获取输入流
        InputStream is = socket.getInputStream();

        // 文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer))!= -1) {
            fos.write(buffer,0,len);
        }

        // 通知客户端我接收完毕了
        OutputStream os = socket.getOutputStream();
        os.write("我接受完毕了，你可以断开了".getBytes());



        // 关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}

```

**客户端：**
```
package com.wangjie.lesson02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个Socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9000);
        // 2.创建一个输出流
        OutputStream os = socket.getOutputStream();

        // 3. 文件流
        FileInputStream fis = new FileInputStream(new File("Internet_code\\static\\images\\tcp.png"));
        // 4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }

        // 确定服务器接收完毕，才能进行断开
        InputStream inputStream = socket.getInputStream();

        // 通知服务器，我已经结束了
        socket.shutdownOutput();  // 我已经传输完了


        // String byte[]
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2=inputStream.read(buffer2)) != -1) {
            baos.write(buffer2,0,len2);
        }
        System.out.println(baos.toString());



        // 关闭资源
        baos.close();
        fis.close();
        os.close();
        socket.close();

    }
}

```
## UDP
**发送端：**
```
package com.wangjie.lesson03;


import java.io.IOException;
import java.net.*;

// 不需要连接服务器
public class UdpClientDemo01 {
    public static void main(String[] args) throws IOException {
        //1.建立一个Socket
        DatagramSocket socket = new DatagramSocket();



        // 2.建立一个包
        String msg = "你,好服务器!";

        // 发送给谁
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        // 数据的长度，起始，要发送给谁
        DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);


        // 3.发送包
        socket.send(packet);


        // 关闭流
        socket.close();

    }
}

```
**接收端：**
```
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
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);// 接收，这里不需要给Ip和端口

        socket.receive(packet); // 阻塞接收

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        // 关闭链接
        socket.close();



    }
}

```
## 在线咨询
**发送端代码**
```
package com.wangjie.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSenderDemo01 {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(9999);

        // 准备数据，控制台读取system.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();


            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 6666));

            socket.send(packet);
            if (data.equals("bye")) {
                break;
            }
        }

        socket.close();

    }



}

```
**发送端调用代码：**
```
package com.wangjie.chat;

public class TalkStudent {

    public static void main(String[] args) {
        // 开启两个线程
        new Thread(new TalkSend(7777,"localhost",9899)).start();
        new Thread(new TalkReceive(8890,"老师")).start();


    }
}
```
**接收端代码：**
```
package com.wangjie.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveDemo01 {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(6666);


        while (true) {
            // 准备接收包裹
            byte[] container = new byte[1024];


            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet); // 阻塞式接收包裹

            // 断开连接
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(receiveData);

            if (receiveData.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}

```
**接收端调用代码：**
```
package com.wangjie.chat;

public class TalkTeacher {

    public static void main(String[] args) {
        new Thread(new TalkSend(5555,"localhost",8890)).start();
        new Thread(new TalkReceive(9899,"学生")).start();
    }
}

```
## URL
统一资源定位符：定位资源的，定位互联网的某一个资源
DNS域名解析 www.baidu.com
```
协议://ip地址/端口号
```
