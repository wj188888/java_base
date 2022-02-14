package com.wangjie.lesson04;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {

    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://www.baidu.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(url.getProtocol()); // 协议
        System.out.println(url.getHost()); // 主机IP
        System.out.println(url.getPort()); // 端口
        System.out.println(url.getFile()); // 文件
        System.out.println(url.getPath()); // 全路径
        System.out.println(url.getQuery()); // 参数


    }


}
