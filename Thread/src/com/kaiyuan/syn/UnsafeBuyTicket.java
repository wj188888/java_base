package com.kaiyuan.syn;

// 不安全的买票
// 线程不安全，有负数
public class UnsafeBuyTicket {
}


class BuyTicket implements Runnable{
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();


        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的人").start();
        new Thread(buyTicket,"可恶的黄牛").start();


    }


    // 票
    private int ticketNums = 10;
    boolean flag = true; // 外部停止方式


    @Override
    public void run() {
        // 买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    // 加上synchronized变成同步方法,锁的是this
    private synchronized void buy() throws InterruptedException {
        // 判断是否有票
        if (ticketNums <= 0) {
            flag = false;
            return;
        }

        // 模拟延时
        Thread.sleep(400); // 每次都会添加一个异常的抛出

        // 买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
