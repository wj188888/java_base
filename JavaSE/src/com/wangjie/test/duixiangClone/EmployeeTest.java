package com.wangjie.test.duixiangClone;

import java.util.Date;

/**
 * @Author WangJie
 * @Create by 2023/2/18 8:54
 * @Description 实现了Cloneable才可以进行copy克隆操作
 */
public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date currentTime = new Date();
        Employee employee = new Employee(50000,"Kolin", currentTime);
        Employee copy = employee.clone(); // clone是一个保护方法，不可以直接由对象调用
        copy.raiseSalary(20);
        copy.addDay(currentTime, 622);
        System.out.println(copy.toString());
        System.out.println(employee.toString());

    }
}
