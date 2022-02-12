package com.wangjie.reflection;

public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException{
       Person person = new Student();
        System.out.println("这个人是："+person.name);

        // 方式一： 通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode()); // 获取是同一个Class对象

        // 方式二：forname获得
        Class c2 = Class.forName("com.wangjie.reflection.Student");
        System.out.println(c2.hashCode()); // 获取是同一个Class对象

        // 方式三： 通过类名.class获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方式四： 基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4.hashCode());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());
        System.out.println(c5);

    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}


class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "学生";
    }
}