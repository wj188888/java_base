package com.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class CASDemo01 {

    // CAS 比较并交换

    public static void main(String[] args) {
//        AtomicInteger atomicInteger = new AtomicInteger(2020);
//
//        // 对于我们平时写的SQL: 乐观锁
//        atomicInteger.compareAndSet(2020,2999);
//        atomicInteger.getAndIncrement();
//        System.out.println(atomicInteger.get());

        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(1,2);

        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp(); // 获得版本号
            System.out.println("a1 =>" + stamp);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicStampedReference.compareAndSet(1, 30,atomicStampedReference.getStamp(),
                    atomicStampedReference.getStamp()+1);
            System.out.println("a2=>"+stamp);

            atomicStampedReference.compareAndSet(30, 1,atomicStampedReference.getStamp(),
                    atomicStampedReference.getStamp()+1);
            System.out.println("a3=>"+stamp);
        },"a").start();

        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp(); // 获得版本号
            System.out.println("b1=>"+stamp);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            atomicStampedReference.compareAndSet(1,99,stamp, stamp+1);
            System.out.println("b1=>"+atomicStampedReference.getStamp());
        },"b").start();
    }
}
