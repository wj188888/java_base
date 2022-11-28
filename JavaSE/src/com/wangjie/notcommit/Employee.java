package com.wangjie.notcommit;

import java.time.LocalDate;

/**
 * @Classname Employee
 * @Date 2022/11/27 9:47
 * @Author wangjie
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    // 无参构造
    public Employee() {
    }

    // 有参构造
    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
