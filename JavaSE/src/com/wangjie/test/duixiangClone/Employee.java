package com.wangjie.test.duixiangClone;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author WangJie
 * @Create by 2023/2/18 8:53
 * @Description 实现了接口Cloneable，可以在对象实例中去进行浅拷贝;
 */
public class Employee implements Cloneable{
    private double salary;
    private String name;
    private Date hireDay;

    public Employee clone() throws CloneNotSupportedException
    {
        return (Employee) super.clone();
    }

    public Employee(double salary, String name, Date hireDay) {
        this.salary = salary;
        this.name = name;
        this.hireDay = hireDay;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double raiseSalary(double inc)
    {
        this.salary = this.salary + inc;
        return 1;
    }
    public Date addDay(Date date, int i)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_YEAR, i);
        this.hireDay = c.getTime();
        return this.hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", hireDay=" + hireDay +
                '}';
    }
}
