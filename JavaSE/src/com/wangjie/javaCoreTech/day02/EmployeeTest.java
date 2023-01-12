package com.wangjie.javaCoreTech.day02;

/**
 * @Author WangJie
 * @Create by 2023/1/13 7:20
 * @Description
 * 总结如下：
 * - 方法不能修改基本数据类型的参数
 * - 方法可以改变对象参数的状态
 * - 方法不能让一个对象参数引用一个新的对象
 */
public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before:" + percent);
        tripleValue(percent);
        System.out.println("After:" + percent);

        System.out.println("\nTesting tripleSalary");
        Employee harry = new Employee("Harry", 5000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alce", 90000);
        Employee b = new Employee("Bob", 80000);
        System.out.println("Before a="+ a.getName());
        System.out.println("Before b="+ b.getName());
        swap(a, b);
        System.out.println("After a=" + a.getName());
        System.out.println("After b="+ b.getName());

    }

    public static void tripleValue(double x)
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }
    public static void tripleSalary(Employee x)
    {
        x.raiseSalary(200);
        System.out.println("End of method:salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x= "+ x.getName());
        System.out.println("End of method: y= "+ y.getName());
    }
}
