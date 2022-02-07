package oop.demo08;


public class Application {
    public static void main(String[] args) {
        // Object > String
        // Object > Person > Teacher
        // Object > Person > Student

        Object object = new Student();
        System.out.println(object instanceof Object); // true
        System.out.println(object instanceof Student);// true
        System.out.println(object instanceof Person);// true
        System.out.println(object instanceof Teacher);// false
        System.out.println(object instanceof String);// false


        System.out.println("=========================");
        Person person = new Student();
        System.out.println(person instanceof Object); // true
        System.out.println(person instanceof Student);// true
        System.out.println(person instanceof Person);// true
        System.out.println(person instanceof Teacher);// false
//        System.out.println(person instanceof String);// false

        System.out.println("=========================");
        Student student = new Student();
        System.out.println(student instanceof Object); // true
        System.out.println(student instanceof Student);// true
        System.out.println(student instanceof Person);// true
//        System.out.println(student instanceof Teacher);// false
//        System.out.println(person instanceof String);// false
    }
}
