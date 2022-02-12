package com.wangjie.oop.demo01;

// 一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {
        // 类，抽象的，实例化
        //      类实例化后会返回一个自己的对象！
        //     student对象就是一个Student类的实例
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "xiaoming";
        student1.age = 19;
        System.out.println(student1.name);
        System.out.println(student1.name);
        System.out.println(student2.name);  // 构造函数会进行初始化
        System.out.println(student2.age);   // 构造函数会进行初始
        Person person = new Person();
        System.out.println(person.getClass());
        System.out.println("========================");
        System.out.println(person.name);

    }
}
