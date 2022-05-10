package com.add;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3, true);

        // 抢车位
        for (int i = 1; i <= 8; i++) {
            new Thread(() -> {
                try {
                    // 获取当前资源
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放当前资源
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}


