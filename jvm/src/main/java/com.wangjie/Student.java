package com.wangjie;



public class Student {
    public String toString(){
        return "hello";
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getClass().getClassLoader());
        System.out.println(student.toString());

    }

    /*
    1. 类加载器收到 类加载的请求
    2. 将这个请求向上委托给父类加载器去完成，一直向上委托，直到启动类加载器
    3. 启动加载器检查是否能够加载这个类，能加载就结束，使用当前的加载器，否则抛出异常，通知子加载器进行加载
    4. 重复步骤3
    */
}
