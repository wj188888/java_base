package oop.demo05;

public class Person {
    protected String name = "wangjie";

    public Person() {
        System.out.println("Person-无参构造器执行");
    }

    public void print(){
        System.out.println("Person");
    }
    // 私有无法被继承
    private void stre(){}
}
