package com.pool;


import java.util.concurrent.*;

// Executors工具类
// 使用了线程池后，使用线程去创建
public class Demo01 {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();// 单个线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(5); // 创建一个固定的线程池的大小
//        ExecutorService threadPool = Executors.newCachedThreadPool(); // 创建一个可伸缩的线程池大小
        // 自定义线程池，工作 ThreadPoolExecutor
        // 最大线程该如何定义，
        // 1. CPU密集型 几核就给几个可以保障效率最高
        // 2. I/O密集型    判断你的程序中十分耗IO的线程。
        //          15个任务 I/O十分占用资源！
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                Runtime.getRuntime().availableProcessors(),
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3), //候客区
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy() // 银行满了，还有人进来;不处理这个人的，抛出异常；
//                new ThreadPoolExecutor.CallerRunsPolicy() // 哪来的去哪里!
//                new ThreadPoolExecutor.DiscardPolicy() // 队列满了就丢掉任务丢掉任务，不会抛出异常,
                new ThreadPoolExecutor.DiscardOldestPolicy() // 队列满了,会尝试和最早的竞争，尝试失败就丢掉；
                );

        try {
            // 最大承载, Duque + max
            for (int i = 0; i < 9; i++) {
                // 使用了线程池后，使用线程去创建
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName()+" ok");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 线程池用完，程序结束，关闭线程池
            threadPool.shutdown();
        }
    }
}
