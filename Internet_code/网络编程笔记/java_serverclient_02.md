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