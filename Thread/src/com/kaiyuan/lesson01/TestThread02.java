package com.kaiyuan.lesson01;


import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

// 练习Thread，实现多线程同步下载图片
public class TestThread02 extends  Thread{

    private String url; // 网络图片地址
    private String name; // 保存的文件名

    public TestThread02(String url, String name){
        this.url = url;
        this.name = name;
    }



    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载的文件名为："+ name);
    }

    public static void main(String[] args) {
        TestThread02 t1 = new TestThread02("https://img2022.cnblogs.com/blog/2383983/202202/2383983-20220214170658548-1971654908.png","1.png");
        TestThread02 t2 = new TestThread02("https://img2022.cnblogs.com/blog/2383983/202202/2383983-20220214170803773-680168043.png","2.png");
        TestThread02 t3 = new TestThread02("https://img2022.cnblogs.com/blog/2383983/202202/2383983-20220214170818148-973069556.png","3.png");

        // cpu自己分配资源进行下载操作
        t1.start();
        t2.start();
        t3.start();

    }
}


//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}