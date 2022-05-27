# JVM探究
- 请你谈谈对jvm的理解?
- java8虚拟机和之前的变化?
- 什么是OOM(内存溢出),什么是栈溢出StackOverFlowError?怎么分析
- JVM的常用调优参数有哪些?
- 内存快照如何抓取，怎么分析Dump文件?知道吗?
- 谈谈JVM中，类加载器你的认识?

1. JVM的位置
2. JVM的体系结构
3. 类加载器
4. 双亲委派机制
5. 沙箱安全机制
6. Native
7. PC寄存器
8. 方法区
9. 栈
10. 三种JVM
11. 堆
12. 新生区
13. 老年区
14. 永久区
15. 堆内存调优
16. GC
    - 常见算法
17. JMM
18. 总结

---
java执行顺序：
java>>>Class file>>> class类加载器>>>运行时数据区(Runtime Data Area)
分为方法区 java栈丶本地方法栈丶堆丶程序计算器丶(执行引擎，本地方法库->本地方法区)

---
![img.png](img.png)

---
调优的位置大致是这里
![img_1.png](img_1.png)

## 双亲委派机制：安全
![img_2.png](img_2.png)
```java
public class String {
    // 双亲委派机制;安全
    // 1.APP--> EXC ---> BOOT(最终执行)
    // BOOT,优先级最高
    // EXC，其次
    // APP，最后才轮到他去调用
    // null: java调用不到C, C++
}
```

1. 虚拟机自带的加载器
2. 启动类（根）加载器
3. 拓展类加载器
4. 应用程序（系统）加载器

## 沙箱安全机制
 组成沙箱的基本组件：
 1. 第一步：字节码校验，核心类是不用进行字节码校验；
 2. 类加载器。防止恶意代码去干涉善意的代码。
 - 从最内层JVM自带的类加载器加载，外层恶意代码无法修改加载顺序；

3. java中将执行程序分为本地代码和远程代码两种吗，本地代码默认是可信任的，而远程代码则不是受信任的

## 本地方法Native和方法区
```java
package com.wangjie;

public class NativeDemo {
    public static void main(String[] args) {
        new Thread(() -> {

        }, "my thread name").start();
    }
    // native: 凡是到了native关键字的，说明java的作用范围达不到了，回去调用C语言库
    // native：凡是进入native都会去本地方法库(JNI)java native interface 接口,扩展java的作用
    // JNI作用：扩展java的使用，融合不同的编程语言为java所用！最初：C，C++
    // Java诞生的时候 C,C++；必须要调用C和C++的程序~！
    // 内存区域中转么开辟了一块标记区域：Native method
    // Robot类，java程序驱动打印机
    private native void start0();

    // 调用其他接口; Socket , webservice,http;
    
}
```
### PC寄存器
程序计数器
每个线程都有一个程序计数器，是线程私有的，就是一个指针，指向方法区中的方法字节码（用来
存储指向像一条指令的地址，也即将要执行的指令代码），在执行引擎读取下一条指令，是一个非常小的内存空间，
几乎可以忽略不计

### 方法区
method area 方法区
方法区是被所有线程共享的，所有字段和方法字节码，以及一些特殊方法，如构造函数，接口代码也在此定义，简单说，所有定义的
方法的信息都是保存在该区域，此区域属于共享区间。

**静态变量丶常量丶类信息（构造方法丶接口定义）丶运行时的常量池存在方法区中，但是实例变量存在堆内存中，和方法区无关；**

static final, Class 常量池；

## 栈
程序：数据结构 +算法
程序：不是 业务+ 逻辑

栈： 先进后出，后进先出
队列：先进先出（FIFO：First Input First Output）

喝多了吐就是栈，吃多了就是队列

为什么main()先执行，因为main()是最先进栈的；
栈：栈内存，主管程序的运行，生命周期和线程同步；
线程结束，栈内存就释放；对于栈来说，不存在垃圾回收问题！
一旦线程结束，栈就Over！

栈： 8大基本类型 + 对象引用 + 实例的方法
**栈运行原理；栈帧存在，栈顶和栈底**
栈帧的组成有：
- 方法索引
- 输入输出参数()
- 本地变量
- Class File:引用
- 父帧
- 子帧

>>> 程序正在执行的方法，一定在栈的顶部；
栈满了：StackOverflowError

> 栈 + 堆 + 方法区：交互关系

画出一个对象实例化过程的在内存中的流程；


### 三种JVM
- Sun公司 `Hotspot`
- BEA `JRockit`
- IBM `J9VM`

学习的是`Hotspot`
堆：
heap, 一个JVM只有一个堆内存，堆内存的大小是可以调节的；
类加载器读取了类文件后，一般会把什么东西放到堆中?类，方法，方法，常量~,保存我们所有引用类型的真实对象；
堆内存中还要细分为三个区域：
- 新生区 Young/New (Eden Space)还包括幸存区0区，幸存区1区；
- 养老区 Old ()
- 永久区 

垃圾回收分为轻量级垃圾回收和重量级垃圾回收;
重量级和轻量级;

GC垃圾回收，主要是在伊甸园去和养老区；
假设内存满了，OOM（堆内存不够） 会报错;java.lang.OutOfMemoryError
在JDK8以后，永久存储区改了个名字()

**新生区**
- 类：诞生和成长的地方，甚至死亡；
- 伊甸园，所有的对象都是在伊甸园区生产的；
- 幸存者去（0,1）

**老年区**
大部分的对象都是临时对象！ 

**永久区**
这个区域常驻内存的。用来存放JDK自身携带的Class对象。Interface元数据，
存储的是java运行时的一些环境或类信息~，这个区域不存在垃圾回收~关闭Vm虚拟机就会释放这个区域的内存~
一个启动类，加载了大量的第三方jar包。tomcat部署了太多的应用，大量动态生成的反射类。不断的被加载。
直到内存满，就会出现OOM；
- jdk1.6之前 ： 永久代，常量池是在方法区；
- jdk1.7 ：永久代，但是慢慢的退化了，`去永久代`，常量池在堆中
- jdk1.8之后：无永久代，常量池在元空间

元空间：逻辑上存在，物理上不存在
在一个项目中，突然出现了OOM故障，那么如何排除~研究为甚么出错~
- 能够看到代码第几行出错，内存快照分析工具，MAT，Jprofiler
- Debug，一行行分析代码！

MAT，Jprofiler作用：
- 分析Dump内存文件，快速定位内存泄漏；
- 获得堆中的数据
- 获得大的对象
......

堆内存调优
GC
GC常用算法
JMM

```java
package com.wangjie;

import java.util.ArrayList;

//Dump文件
//-Xms 设备初始化内存分配大小 1/64
//-Xmx 设置最大分配内存 1/4
// -Xms8m -Xmx8m -XX:+PrintGCDetails 打印GC垃圾回收
// 这样dump： `-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError`
public class Demo03 {
    byte[] array = new byte[1*1024*1024];//1m

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int count = 0;

        try {
            while(true){
                list.add(new Demo03());
                count = count + 1;
            }
        }catch (Exception e) {
            // Throwable;Error,Exception
            System.out.println("count" + count);
            e.printStackTrace();
        }


    }
}

```

