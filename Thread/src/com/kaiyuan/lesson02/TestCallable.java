package com.kaiyuan.lesson02;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/*
callable可以定义返回值
1. 可以定义返回值
2. 可以抛出异常
 */



public class TestCallable implements Callable<Boolean> {
    private String url; // 网络图片地址
    private String name; // 保存的文件名

    public TestCallable(String url, String name){
        this.url = url;
        this.name = name;
    }

    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载的文件名为："+ name);
        return true;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://img2022.cnblogs.com/blog/2383983/202202/2383983-20220214170658548-1971654908.png","1.png");
        TestCallable t2 = new TestCallable("https://img2022.cnblogs.com/blog/2383983/202202/2383983-20220214170803773-680168043.png","2.png");
        TestCallable t3 = new TestCallable("https://img2022.cnblogs.com/blog/2383983/202202/2383983-20220214170818148-973069556.png","3.png");

        // 创建执行服务；
        ExecutorService ser = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);



        // 获取结果
        boolean res1 = r1.get();
        boolean res2 = r2.get();
        boolean res3 = r3.get();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        // 关闭服务
        ser.shutdownNow();
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
