package com.wangjie.test;

/**
 * @Author WangJie
 * @Create by 2023/2/14 22:11
 * @Description
 */
public class EmployeeTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //Employee emp1 = new Employee(12, "四周");
        //if (emp1.getClass() == Employee.class) {
        //    System.out.println("It True");
        //    System.out.println("emp1实例是Emplyee类的对象");
        //}
        Employee employee = new Employee();


        Class cl = Class.forName("com.wangjie.test.Employee");

        System.out.println(cl.isAnonymousClass());
        //Object obj = cl.getConstructor().newInstance();
        //System.out.println(obj);
    }
}
