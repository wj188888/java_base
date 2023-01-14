package com.wangjie.javaCoreTech.day03;

/**
 * @Author WangJie
 * @Create by 2023/1/14 17:35
 * @Description
 */
public class StudentTest {

    public static void main(String[] args) {


        Student stu1 = new Student("wangjie", "Test");
        System.out.println(stu1.getDescription() + " , and His name is " + stu1.getName());
    }
}
