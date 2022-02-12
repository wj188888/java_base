package com.wangjie.oop;

public class Student {
    // 非静态方法,类实例化之后才存在
    public void say(){
        System.out.println("学生说话了");
    }
    // 静态方法,和类一起加载的
    public static void say1(){
        System.out.println("学生说话了");
    }
}
