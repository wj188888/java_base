package com.wangjie.notcommit.test;

import com.wangjie.notcommit.Employee;

import java.time.LocalDate;

/**
 * @Classname EmployeeTest
 * @Date 2022/11/27 9:50
 * @Description 这是Employee的测试类
 * @Author wangjie
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // 调用无参构造
        System.out.println(new Employee().getName());
        // 调用有参构造
        Employee emp_2 = new Employee("wangjie", 10500.888, LocalDate.now());
        System.out.println(emp_2.getName());
        System.out.println(emp_2.getSalary());
        System.out.println(emp_2.getSalary());
        // 调用toString后，需要重写toString后才可使用
        System.out.println(emp_2.toString());
    }
}
