package com.wangjie.javaCoreTech.day03;

/**
 * @Author WangJie
 * @Create by 2023/1/14 17:30
 * @Description 定义抽象类 Person
 */
public abstract class Person {


    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName()
    {
        return name;
    }
}
