package com.wangjie;

public class Car {
    private int age;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.age = 1;
        car2.age = 2;
        car3.age = 3;

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> aClass1 = car1.getClass();
        Class<? extends Car> aClass2 = car1.getClass();
        Class<? extends Car> aClass3 = car1.getClass();

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());
        ClassLoader classLoader = aClass1.getClassLoader(); // AppClassLoader

        System.out.println(classLoader);
        System.out.println(classLoader.getParent()); // ExClassLoader 、jre\
        System.out.println(classLoader.getParent().getParent()); // null 1.不存在，2.java程序获取不到
    }
}
