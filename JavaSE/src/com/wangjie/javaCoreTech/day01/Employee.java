package com.wangjie.javaCoreTech.day01;

import java.time.LocalDate;

/**
 * @Author WangJie
 * @Create by 2023/1/11 22:32
 * @Description 用于分析java源码执行过程例子
 */
public class Employee {
    /**
     * 新增nextId和 id,其中nextId是被修饰词private修饰的，是一个静态变量；
     * 常用的还是静态常量比较常用
     */
    private static int nextId = 1;
    private int id;

    private String name;
    private  double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**
     * 增加setId和 getId
     */
    public void setId()
    {
        this.id = nextId; // nextId是静态变量，不要使用this实例对象去修饰
        nextId++;
    }
    public int getId()
    {
        return this.id;
    }
    public static int getNextId()
    {
        return nextId;
    }
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    /**
     * 增加年终奖金
     * @param byPercent
     */
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
