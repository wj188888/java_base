package com.kaiyuan.lesson01;

public class TestThread03 implements Runnable {
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码---"+i);
        }


    }

    public static void main(String[] args) {
        // 创建runnable接口的实现类对象
        TestThread03 testThread03 = new TestThread03();
        // 创建线程对象，通过线程对象开启我们的线程，代理
        Thread thread = new Thread(testThread03);
        thread.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程--"+i);
        }
    }
}
