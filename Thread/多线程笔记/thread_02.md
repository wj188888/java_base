## 管程法
### **生产消费者模式**
```
package com.kaiyuan.syn;


// 测试生产者消费者模型-->利用缓冲区解决：管程法
public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();

    }
}

// 生产者
class Productor extends Thread{
    SynContainer container;

    public Productor(SynContainer container){
        this.container = container;
    }


    // 生产方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了-->第"+i+"只鸡");
        }
    }
}

// 消费者
class Consumer extends Thread{
    SynContainer container;

    public Consumer(SynContainer container){
        this.container = container;
    }

    // 消费方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->第"+container.pop().id+"只鸡");
        }
    }
}

// 产品
class Chicken{
    int id; // 产品编号

    // 构造方法
    public Chicken(int id) {
        this.id = id;
    }
}

// 缓冲区
class SynContainer{
    // 需要一个容器大小
    Chicken[] chickens = new Chicken[10];

    // 容器计算器
    int count = 0;

    // 生产者放入产品
    public synchronized void push(Chicken chicken){

        // 如果容器满了，就等待消费者消费
        if (count == chickens.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 如果没有满，就需要丢入产品
        chickens[count] = chicken;
        count++;

        // 可以通知消费者可以消费了
        this.notifyAll();

    }

    // 消费者消费产品,返回Chicken
    public synchronized Chicken pop(){

        // 判断能否消费
        if (count == 0){
            // 等待生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 如果可以消费
        count--;
        Chicken chicken = chickens[count];

        // 吃完了，通知生产者生产
        this.notifyAll();
        return chicken;
    }

}
```

### **信号灯法**
```
package com.kaiyuan.syn;

// 测试生产者消费者问题2：信号灯法，标志位解决
public class TestPC2 {
    public static void main(String[] args) {

        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();


    }
}

// 生产者--》 演员
class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv= tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%6 == 0){
                this.tv.play("快乐大本营播放中");
            }else if (i%5 == 0){
                this.tv.play("天天向上播放中");
            }
            else if (i%7 == 0){
                this.tv.play("数码宝贝播放中");
            }
            else {
                this.tv.play("抖音：记录美好生活");
            }
        }
    }
}


// 消费者--》观众
class Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            tv.watch();
        }
    }
}

// 产品--》节目
class TV{
    // 演员表演，观众等待
    // 观众观看，演员等待
    String voice; // 表演的节目
    boolean flag = true;


    // 表演
    public synchronized void play(String voice){

        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("演员表演了："+voice);

        // 通知观众观看
        this.notifyAll(); // 通知唤醒
        this.voice = voice;

        this.flag = !this.flag;

    }

    // 观看
    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("观看了："+voice);
        // 通知演员表演
        this.notifyAll();
        this.flag = !this.flag;



    }

}
```

## 线程池
*背景：*
- 经常创建和销毁丶使用量特别大的资源，比如并发情况下的线程，对性能影响很大。

*思路：*
- 提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中。
可以避免频繁创建销毁丶实现重复利用。类似生活中的公共交通工具。

*好处：*
- 提高响应速度
- 降低资源消耗
- 便于线程管理
    - corePoolsize: 核心池的大小
    - maximumPoolSize:最大线程数
    - keepAliveTime:线程没有任务时最多保持多长时间后会终止

**ExecutorService和Executors**
- *ExecutorService*真正的线程池接口：执行任务、命令，没有返回值，一般用来执行Runnable
- <T>Future<T>submit(Cllable<T>task):执行任务，有返回值，一般用来执行Callable
- void shutdown():关闭连接池

**Executors**
- 工具类丶线程池的工厂类，用于创建并返回不同的类型的线程池

