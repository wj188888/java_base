package com.wangjie.javaCoreTech.day01;

import java.time.LocalDate;

/**
 * @Author WangJie
 * @Create by 2023/1/11 22:32
 * @Description 用于分析java源码执行过程例子
 */
public class Employee {
    private String name;
    private  double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
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
