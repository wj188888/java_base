package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * 8锁，就是关于锁的八个问题
 * 1. 标准情况下， 两个线程先打印，发短信还是打电话？ 1、发短信 2. 打电话
 * 2. 延迟4s，还是先发短信，再打电话；
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
    // synchronized 锁的对象是方法的调用者
    // 两个方法用的是同一个锁，谁先拿到就谁先执行;
    public synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
}