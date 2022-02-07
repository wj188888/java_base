package oop.demo05;

import oop.demo05.Person;

public class Student extends Person {
    private String name = "清江";

    public Student() {
        super(); // 调用父类的构造器，必须是子类的第一行去调用;
        // 隐藏代码默认调用了父类的构造方法
        System.out.println("Student-无参构造器执行");

    }

    public void test1(){
        print();    // Student
        this.print(); // Student
        super.print(); // Person
    }

    public void print(){
        System.out.println("Student");
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);  // 当前类的属性：名字
        System.out.println(super.name);
    }
}
