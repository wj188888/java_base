package com.wangjie.oop.demo07;

public class Student extends Person{
    @Override
    public void run(){
        System.out.println("son-run");
    }

    public void eat(){
        System.out.println("eat");
    }
}
