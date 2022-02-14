package com.kaiyuan.lesson01;

// 创建线程方式一：继承Thread类，重写run()方法，调用start开启线程

// 小结：注意：线程开启不一定立即执行，由cpu进行调度执行;

public class TestThread extends Thread{
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码---"+i);
        }


    }

    public static void main(String[] args) {
        // main主线程
        // 创建一个线程对象
        TestThread testThread1 = new TestThread();

        // 调用start方法,开启一条主线程
        testThread1.start();

//        testThread1.run();


        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程--"+i);
        }
    }


}
