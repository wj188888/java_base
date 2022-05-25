package com.tvoiatile;

import java.util.concurrent.TimeUnit;

public class JMMDemo {
    // 不加 volatile 程序就会死循环！
    // 加 volatile 可以保证可见性
    private volatile static int num = 0;
    public static void main(String[] args) throws InterruptedException { // main

        new Thread(() -> { // 线程1 对主内存的变化是不知道的
            while (num == 0) {

            }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        num = 1;
        System.out.println(num);
    }
}
