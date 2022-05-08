package com.lock8;

import java.util.concurrent.TimeUnit;

/**
 * 3. 增加了一个普通方法hello,这个方法没有加上synchronized;
 * 答：没有锁的方法，不收锁的影响，所以普通方法自己去执行;
 * 4. 两个对象，两个同步方法；
 */

public class Test2 {
    public static void main(String[] args) {
        // 两个对象
        Phone2 phone1 = new Phone2();
        Phone2 phone2 = new Phone2();

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

class Phone2 {
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

    public void hello() {
        System.out.println("hello");
    }
}

