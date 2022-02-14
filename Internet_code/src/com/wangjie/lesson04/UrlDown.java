package com.wangjie.lesson04;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlDown {

    public static void main(String[] args) throws  Exception{
        // 1.下载地址
        URL url = new URL("https://p2.music.126.net/p35y4sKxkMtG4GnX2noyMw==/109951167040372546.jpg?param=130y130");

        //2. 连接到这个资源 HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("wangjie.jpg");

        byte[] buffer = new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!= -1) {
            fos.write(buffer,0,len);
        }

        fos.close();
        inputStream.close();
        urlConnection.disconnect();

    }

}
