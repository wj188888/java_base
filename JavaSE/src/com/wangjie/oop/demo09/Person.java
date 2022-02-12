package com.wangjie.oop.demo09;



// 被final修饰的类不可以被继承
public class Person {
    {
        // 匿名代码快
        System.out.println("匿名代码快");
    }

    static { // 只执行一次
        // 静态代码快
        System.out.println("静态代码快");
    }

    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new Person();
        System.out.println("=============");
        new Person();
    }
}
