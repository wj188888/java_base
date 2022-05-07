package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * 8锁，就是关于锁的八个问题
 * 1. 标准情况下， 两个线程先打印，发短信还是打电话？ 1、发短信 2. 打电话
 *
 */

public class Test1 {
    public static void main(String[] args) {
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendSms();
        }, "A").start();

        // 捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone.call();
        }, "B").start();
    }
}

class Phone{
    public synchronized void sendSms(){
        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
}