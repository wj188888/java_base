package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * 5. 增加两个静态同步方法,只有一个对象，先发短信，再打电话， 对象是Class，用的同一把锁
 * 6. 两个对象！ 增加两个静态的同步方法，先打印 发短信？打电话？ 先发短信，再打电话
 */

public class Test3 {
    public static void main(String[] args) {
        // 两个对象的Class类模板只有一个, static,锁的是Class
        Phone3 phone1 = new Phone3();
        Phone3 phone2 = new Phone3();


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

// Phone3唯一的一个class 对象
class Phone3 {
    // synchronized 锁的对象是方法的调用者
    // 两个方法用的是同一个锁，谁先拿到就谁先执行;
    // static 是一个静态方法
    // 类一加载就有了, 锁的对象是Class, 不在是Class对象
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
//        Class<Phone3> phone3Class = Phone3.class; // 这是全局唯一的
    }
    public static synchronized void call(){
        System.out.println("打电话");
    }

    public void hello() {
        System.out.println("hello");
    }
}