package com.wangjie.javaCoreTech.day03;

/**
 * @Author WangJie
 * @Create by 2023/1/14 11:00
 * @Description
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        // 定义的id是一个自变量
        System.out.println(e1.getId());
        System.out.println(e2.getId());
        System.out.println(e3.getId());

        System.out.println("========");
        Employee02 ex1 = new Employee02();
        Employee02 ex2 = new Employee02("wangjie", 90000);
        System.out.println(ex1.getId() + ": " + ex1.getSalary() + "name: " + ex1.getName());
        System.out.println(ex2.getId() + ": " + ex2.getSalary() + "name: " + ex2.getName());



    }
}
