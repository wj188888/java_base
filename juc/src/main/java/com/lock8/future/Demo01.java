package com.lock8.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 异步调用: Ajax
 * // 成功回调
 * 失败回调
 */

public class Demo01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 发起一个请求,没有返回值的异步回调
//        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"runAsync=>void");
//        });
//        System.out.println("111");
//        completableFuture.get(); // 获取执行结果

        // 有返回值的异步回调
        // ajax, 成功和失败的问题
        // 返回的是错误信息
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName()+ "supplyAsync=>VIntegeroid");
            int _ = 10/0;
            return 1024;
        });
        System.out.println(completableFuture.whenComplete((t,u) -> {
            System.out.println("t=>"+t); // 正常的返回结果
            System.out.println("u=>"+u);
        }).exceptionally((e) -> {
            System.out.println(e.getMessage());
            return 2012;
        }).get());
    }
}
