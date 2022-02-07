package oop.demo07;

public class Application {
    public static void main(String[] args) {
        // 一个对象的实际类型是确定的
        // new Student();
        // new Person();

        // 可以指向的引用类型就不确定了: 父类的引用指向子类

        // Student 能调用的方法都是自己的或者继承父类的方法
        Student student = new Student();
        // Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person person = new Student(); // 父类的引用去指向之类的类型
        Object object = new Student();

        // 对象能执行哪些方法主要看对象左边的类型，和右边关系不大；
        person.run();   // 子类重写了父类的run方法
        student.run();
        student.eat();
//        person.eat();
        ((Student)person).eat(); // 强制转换了这个eat的类型，高类型转成低类型-
    }
}
