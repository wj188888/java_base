package com.lock;


import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 自旋锁
 */
public class SpinlockDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    // 加锁
    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+"==> mylock");

        // 自旋锁
        while (atomicReference.compareAndSet(null, thread)){

        }
    }

    // 解锁
    public void myUnLock(){
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+"==> mylock");
        atomicReference.compareAndSet(thread,null);
        // 自旋锁
        while (atomicReference.compareAndSet(null, thread)){

        }
    }
}
