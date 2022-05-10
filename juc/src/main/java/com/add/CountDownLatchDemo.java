package com.add;
import java.util.concurrent.CountDownLatch;
// 减法计算器
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        // 总数6,必须要执行任务才使用
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+" Go out");
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        countDownLatch.await(); // 等待计算器归零然后向下执行;
//        countDownLatch.countDown(); //-1
        System.out.println("Close Door");
    }
}
