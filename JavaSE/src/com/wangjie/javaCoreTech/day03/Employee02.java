package com.wangjie.javaCoreTech.day03;

/**
 * @Author WangJie
 * @Create by 2023/1/14 11:15
 * @Description
 */
public class Employee02 {



    private  static int nextId;

    private int id;
    private String name;
    private double salary;

    {
        id = nextId;
        nextId++;
    }

    public Employee02(String s, double d)
    {
        name = s;
        salary = d;
    }

    public Employee02()
    {
        name = "";
        salary = 1;
    }

    public int getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
}
