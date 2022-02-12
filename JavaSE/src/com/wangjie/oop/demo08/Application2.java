package com.wangjie.oop.demo08;

public class Application2 {
    public static void main(String[] args) {
        // 类型之间的转换： 父与子

        //  高 > 低
        Person obj = new Student();

        // student将这个对象转成Student类型，方便使用Student的内容
        Student student = (Student) obj; // 强制转换

        // 低转高,子类转换成父类，可能丢失自己的本来的一些方法!
        Student student1 = new Student();
        Person person = student1;

    }
}
/*
1. 父类的引用指向子类的对象;
2.把子类转成父类，向上转型;
3.把父类转成子类，向下转型，强制转换;
4. 方便方法的调用,减少代码的重复率;
 */