package com.wangjie.javaCoreTech.day01;

/**
 * @Author WangJie
 * @Create by 2023/1/11 22:36
 * @Description 用于测试Employee类
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl", 75000, 1982, 12, 15);
        staff[1] = new Employee("Hacker", 50000, 1988, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e: staff
             ) {
            e.raiseSalary(5);
        }

        for (Employee e: staff
             ) {
            System.out.println("name="+ e.getName() + ",salary="+ e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}
