package com.wangjie.oop;

public class Demo02 {
    public static void main(String[] args) {
        // 非静态方法，首先进行实例化才能使用
        Student student = new Student();
        student.say();
        System.out.println("上边是非静态方法，后面是静态方法");
        Student.say1();
    }
}
