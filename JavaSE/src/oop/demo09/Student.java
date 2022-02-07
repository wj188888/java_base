package oop.demo09;

public class Student {
    private static int age; // 静态变量
    private double score;   // 非静态变量

    public void run(){
        // 非静态方法调用静态方法
        go();
    }
    public static void go(){

    }


    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);
    }
}
