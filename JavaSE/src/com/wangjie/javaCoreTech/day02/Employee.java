package com.wangjie.javaCoreTech.day02;

/**
 * @Author WangJie
 * @Create by 2023/1/13 7:18
 * @Description
 */
public class Employee {

    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
