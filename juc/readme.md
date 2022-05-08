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
Juc lock await signal
>大有门道

### JUC版生产者和消费者
通过Lock找到Condition
Lock替换sychronized方法和语句的使用，Condition取代l对象监视器方法的使用。

```
package com.wangjie;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductComtumeB {
    public static void main(String[] args) {
        Data2 data = new Data2();

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

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

// 等待，业务， 通知
class Data2 {
    //数字
    private int number = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

//    condition.await(); // 等待
//    condition.signalAll(); // 唤醒全部

    //+1
    public void increment() throws InterruptedException {
        lock.lock();
        try {
            // 业务代码
            while (number!=0){
                // 等待
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+"=>"+number);
            // 通知其他线程，+1完毕了
            condition.signalAll(); // 唤醒全部
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    //-1
    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            // 业务代码
            while (number==0){
                // 等待
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName()+"=>"+number);
            // 通知其他线程，-1完毕了
            condition.signalAll(); // 唤醒全部
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
```
**任何一个新的技术，绝对不是仅仅只是覆盖了原来的技术，绝对有优势和补充！**
>Condition

优势是什么？
![img_1.png](img_1.png)

代码测试:
```
package com.wangjie;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A 执行完调用B， B执行完调用C，C执行完调用D，D执行完调用A
 */

public class ProductComtumeC {
    public static void main(String[] args) {
        Data3 data3 = new Data3();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data3.printA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data3.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data3.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data3.printD();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

class Data3 { // 资源类
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    private Condition condition4 = lock.newCondition();
    private int number = 1; // 1A 2B 3C 4D
    public void printA() throws InterruptedException {
        lock.lock();
        try {
            // 业务代码, 判断-》执行-》通知
            while (number != 1) {
                // 等待
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>AAAAAAA");
            // 唤醒指定的人，唤醒B, condition2
            number = 2; // 精准唤醒
            condition2.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printB() throws InterruptedException {
        lock.lock();
        try {
            // 业务代码
            while (number != 2) {
                // 等待
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>BBBBBBB");
            // 唤醒指定的人，唤醒C ，condition3
            number = 3; // 精准唤醒
            condition3.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printC() throws InterruptedException {
        lock.lock();
        try {
            // 业务代码
            while (number != 3) {
                // 等待
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>CCCCCCC");
            // 唤醒指定的人，唤醒D，condition4
            number = 4; // 精准唤醒
            condition4.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printD() throws InterruptedException {
        lock.lock();
        try {
            // 业务代码
            while (number != 4) {
                // 等待
                condition4.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>DDDDDDD");
            // 唤醒指定的人，唤醒A，condition1
            number = 1; // 精准唤醒
            condition1.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    // 生产线：下单 -》 支付- 》交易-》
}
```
---
**tips：**
1. 为什么在业务代码下我们等待不适用if，而是适用while？
- 问题存在A,B,C,D4个线程 ！ 虚假唤醒

---
### 8锁现象
---
如何判断锁的是谁？永远的知道什么锁？锁到底的锁的是谁？
对象丶Class
**深刻理解我们的锁**

> 小结

`new this`具体的一个手机
`static Class` 唯一的一个模板

## 6. 集合类不安全
> List不安全

问题和解决方案：
```
package com.unsafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// java.util.ConcurrentModificationException 并发修改异常！
public class ListTest {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("1", "2", "3", "4");
//        list.forEach(System.out::println);
        // 并发下 ArrayList 不安全的
        /**
         * 解决方案；
         * 1. 可以用Vector<>()解决
         * 2. 使用Collections.synchronizedList()包裹new ArrayList<>()这个
         * 3. CopyOnWriteArrayList这种方式去使用这个东西.
         */
//        List<String> list = new ArrayList<>();
//        List<String> list = new Vector<>();
//         List<String> list = Collections.synchronizedList(new ArrayList<>());
         // CopyOnWrite写入时复制 COW 计算机程序设计领域的一种优化策略;
         // 多线程调用的时候,list,读取的时候，固定的，写入（覆盖）
         // 在写入的时候避免覆盖,造成数据问题?
         // 读写分离
         // CopyOnWriteArrayList
         // CopyOnWriteArrayList 比 Vector的区别是什么？ 使用的是Lock，不是
         List<String> list = new CopyOnWriteArrayList<>();

         for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
```

> 狂神的学习方法推荐：1.先会用 2.货币三家，寻找其他的解决方案，3. 分析源码

> set不安全

解决的代码：
```
package com.unsafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 同理可证：java.util.ConcurrentModificationException
 * 1. Collections.synchronizedSet()写法
 * 2. 还是CopyOnWriteArraySet<>()内容;
 */

public class SetTest {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = Collections.synchronizedSet(new HashSet<>()); // 方法一
        Set<String> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(set);
            }, String.valueOf(i)).start();
        }
    }
}
```
> HashMap的底层是什么？

```
public Hashset(){
    map = new HashMap<>();
    
    
}
// add set 本质是 map key是无法重复的!
public boolean add(E e){
    return map.put(e, PRESENT)==null;
}

private static final Object PRESENT = new Object(); // 不变的值
```

> Map不安全



