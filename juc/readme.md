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
