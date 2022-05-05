package com.wangjie;

// 基本的买票例子,真的多线程开发,线程就是一个单独的资源类
public class SaleTicketDemo01 {
    public static void main(String[] args) {
        // 并发：多个线程操作一个资源类
        Ticket ticket = new Ticket();

        // @FunctionInterface函数式接口, jdk1.8，lambda表达式 (方法参数)->{代码}
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        }, "C").start();
    }

}


// 资源类,OOP
class Ticket {
    // 属性和方法
    private int number = 50;

    // 买票方式及, synchronized传统的多并发解决方案, synchronized本质是排队
    public synchronized void sale(){
        if (number>0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+(number-- + "票，剩余票"+number));
        }
    }
}
