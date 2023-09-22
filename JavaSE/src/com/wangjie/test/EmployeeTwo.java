package com.wangjie.test;

/**
 * @Author WangJie
 * @Create by 2023/2/16 21:05
 * @Description 理解接口的意义
 */
public class EmployeeTwo implements Comparable{
    private double salary;

    public EmployeeTwo(double salary) {
        this.salary = salary;
    }

    public int compareTo(Object o) {
        EmployeeTwo other = (EmployeeTwo) o;
        return Double.compare(salary, other.salary);
    }

    public static void main(String[] args) {
        EmployeeTwo two = new EmployeeTwo(100);
        EmployeeTwo one = new EmployeeTwo(100);
        int i = two.compareTo(one);
        if (i==0)
        {
            System.out.println("相等");
        } else if (i < 0) {
            System.out.println("two比one 小");
        }else
        {
            System.out.println("two比one 大");
        }
    }
}
