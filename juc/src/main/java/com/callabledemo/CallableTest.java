package com.callabledemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 1. 探究原理
 * 2. 觉得自己会用
 */

public class CallableTest {
    public static void main(String[] args) {
        // new Thread(new Runnable()).start();
        // new Thread(new FatureTask<V>).start();
        // new Thread(new FatureTask<V>(Callable)).start();


        MyThread thread = new MyThread();
        FutureTask task = new FutureTask(thread); // 适配类,找出Runnable()和Runnable之间的关系!

        new Thread(task, "A").start(); // 怎么启动Callable;
        new Thread(task, "B").start(); // 怎么启动Callable;

        // 获取Callable返回值
        try {
            Integer o = (Integer) task.get(); // 可能阻塞,假如这个获取这个返回值是一个耗时的操作就会阻塞
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("call()");
        return 1024;
    }
}