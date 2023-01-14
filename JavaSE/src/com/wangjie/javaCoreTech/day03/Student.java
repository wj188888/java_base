package com.wangjie.javaCoreTech.day03;

/**
 * @Author WangJie
 * @Create by 2023/1/14 17:33
 * @Description 定义一个person抽象类的子类
 */
public class Student extends Person{


    private String major;
    public Student(String name, String major)
    {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in " + major;
    }
}
