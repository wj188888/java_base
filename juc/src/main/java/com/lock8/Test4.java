package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * 6. 一个普通同步方法，一个静态同步方法，一个对象，1.发短信还是打电话？
 * 答： 先打电话，static锁的对象是Class，而普通同步方法的锁的对象是这个对象;
 */

public class Test4 {
    public static void main(String[] args) {
        // 两个对象的Class类模板只有一个, static,锁的是Class
        Phone4 phone1 = new Phone4();
        Phone4 phone2 = new Phone4();

        new Thread(()->{
            phone1.sendSms();
        }, "A").start();

        // 捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        }, "B").start();
    }
}

class Phone4 {
    // 静态的同步方法 锁的是Class 类模板
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
//        Class<Phone3> phone3Class = Phone3.class; // 这是全局唯一的
    }

    // 普通同步方法, 锁的对象
    public synchronized void call(){
        System.out.println("打电话");
    }

    public void hello() {
        System.out.println("hello");
    }
}
