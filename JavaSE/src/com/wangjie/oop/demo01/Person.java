package com.wangjie.oop.demo01;

public class Person {
    String name;


    // 一个类机制什么都不写，也会可以进行生成对象
    public Person(){
        // 无参构造
        this.name = "wnagjie";
    }

    // 有参构造,
//    public Person(String name){
//        this.name = name;
//    }
//

    public Person(String name) {
        this.name = name;
    }
}
