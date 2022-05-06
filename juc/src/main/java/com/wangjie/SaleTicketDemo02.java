package com.wangjie;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo02 {
    public static void main(String[] args) {
        // 并发：多个线程操作一个资源类
        Ticket2 ticket = new Ticket2();
        new Thread(() -> {for (int i = 1;i< 40; i++) ticket.sale();}, "A").start();
        new Thread(() -> {for (int i = 1;i< 40; i++) ticket.sale();}, "B").start();
        new Thread(() -> {for (int i = 1;i< 40; i++) ticket.sale();}, "C").start();
    }
}

// Lock,三部曲
// 1.new ReentrantLock();
// 2.lock.lock();
// 3.finally => Lock.unlock(); // 解锁
class Ticket2 {
    // 属性和方法
    private int number = 30;

    Lock lock = new ReentrantLock();



    // 买票方式及, 不使用synchronized
    public void sale(){

        lock.lock(); // 加锁
//        lock.tryLock(); // 努力的去获取锁;

        try {
            // 业务代码
            if (number>0){
                System.out.println(Thread.currentThread().getName()+"卖出了"+(number-- + "票，剩余票"+number));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 解锁
        }

    }
}