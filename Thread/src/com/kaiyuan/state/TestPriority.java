package com.kaiyuan.state;

// 测试线程的优先级
public class TestPriority extends Thread{


    public static void main(String[] args) {
        // 主线程的默认优先级
        System.out.println(Thread.currentThread().getName() +"-->"+Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();


        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        Thread t4 = new Thread(myPriority);
        Thread t5 = new Thread(myPriority);
        Thread t6 = new Thread(myPriority);

        // 先设置优先级，再启动
        t1.start();

        t2.setPriority(1);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY); // 最大优先级

        t5.setPriority(1);
        t5.start();

        t6.setPriority(9);
        t6.start();
        // 小结：
        // 设置完优先级,可以直接看这个,优先级高的情况下，不一定就优先执行



    }



}

class MyPriority implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() +"-->"+Thread.currentThread().getPriority());
    }
}
