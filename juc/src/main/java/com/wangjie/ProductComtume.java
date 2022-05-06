package com.wangjie;

/**
 * 线程之间的通信问题：生产者和消费者问题！ 等待唤醒，等待通知
 * 线程交替执行A 和 B操作同一个变量 num=0
 * A num+1
 * B num-1
 * */

public class ProductComtume {
    public static void main(String[] args) {
        Data data = new Data();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
    }
}

// 等待，业务， 通知
class Data{
    //数字
    private int number = 0;

    //+1
    public synchronized void increment() throws InterruptedException {
        if (number!=0){
            // 等待
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"=>"+number);
        // 通知其他线程，+1完毕了
        this.notifyAll();
    }
    //-1
    public synchronized void decrement() throws InterruptedException {
        if (number==0){
            // 等待
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"=>"+number);
        // 通知其他线程，-1完毕了
        this.notifyAll();
    }
}