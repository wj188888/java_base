### 什么是JUC
就是java下的三个包
- java.util.concurrent
- java.util.concurrent.automic
- java.util.concurrent.Locks

**源码+官方文档**
面试高频问!

java.util工具包丶包丶类

**业务：普通的线程代码**
Runnable 没有返回值丶效率相比Callable相对比较低;
Java默认有几个线程？
2个
- main
- GC垃圾回收线程

线程：开了一个进程Typora，写字， 自动保存（线程负责的）

***Java可以开启线程吗？***
开不了的，java无法操作硬件

---
**并发和并行是什么？**
并发（多线程操作同一个资源）
- CPU一核，模拟出多条线程，天下武功，无快不破，快速交替

**并行（多个人一起行走）**,线程池

>线程有几个状态
```
public enum State {
        // 新生
        NEW,
        // 运行
        RUNNABLE,
        // 阻塞
        BLOCKED,
        // 等待,一直等，等到死
        WAITING,
        // 超时等待
        TIMED_WAITING,
        // 终止
        TERMINATED;
    }
```

>wait/sleep

1丶来自不同的类
wait => Object
sleep => Thread
**2丶关于锁的释放**
wait会释放锁，sleep不会释放锁
**3丶使用的范围是不同的**

wait
>wait必须在同步代码块中

sleep
>可以在任何地方睡觉

**4丶是否需要捕获异常**

wait
>不需要捕获异常

sleep
>必须要捕获异常

### Lock（重点）

>传统Synchronized

>Lock

实现类：ReentrantLock， ReentrantReadWriteLock.ReadLock， ReentrantReadWriteLock.WriteLock
可重入锁(最常用的);
![img.png](img.png)

- 公平锁:十分公平，可以先来后到 
- 非公平锁：十分不公平，可以插队（默认）

```
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
```

>Synchronized和Lock区别

1. Synchronized 是内置的关键字，Lock是一个Java类
2. Synchronized 无法判断锁的状态， Lock是可以判断是否获取到了锁
3. Synchronized 会自动释放锁（a》b）， lock必须要手动释放锁,死锁
4. Synchronized 线程1（获得锁），线程2（等待，傻傻的等）;Lock锁就不一定一直等待下去了；
5. Synchronized 可重入锁，不可以中断的，非公平的；Lock，可重入锁，可以判断锁，默认非公平的（可以自己设置）;
6. Synchronized 使用锁少量的代码同步问题，Lock锁适合锁大量的同步代码；

>锁是什么？如何判断锁的是谁？

### 4.生产者和消费者问题
面试题：
1.
Synchronized wait notify（老版）
Juc lock
>大有门道

