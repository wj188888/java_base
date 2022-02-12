package com.wangjie.oop;

public class Demo04 {
    public static void main(String[] args) {
        // 引用传递
        Person person = new Person();
        System.out.println(person.name); // null
        Demo04.change(person);

        // 非静态方法
        String str = "王杰";
        Demo04 demo04 = new Demo04();
        demo04.change1(str);

    }
    public static void change(Person person) {
        // person 是一个对象
        person.name = "wangjie";
        System.out.println(person.name);

    }

    public void change1(String str) {
        String string1 = str;
        System.out.println(string1);

    }
}

class Person {
    String name;
}
