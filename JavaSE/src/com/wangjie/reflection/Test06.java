package com.wangjie.reflection;

// 测试类什么时候会初始化
public class Test06 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException{
        // 1,主动引用
//        Son son = new Son();
//        System.out.println("============");
//        Father father = new Son();
//        int x = Father.b;
//        System.out.println(x);

        // 反射也会主动引用
//        Class c1 = Class.forName("reflection.Son");
//        System.out.println(c1);

        // 不会产生类的引用的方法，第一种
        System.out.println(Son.b); // 子类调用父类的静态属性，方法
        // 2.第二种，数组也不会产生类的引用的方法
        Son[] array = new Son[5];

        // 3.第三种，常量池的运用

    }
}

class Father{
    static {
        System.out.println("父类被加载");
    }
    static int b = 2;
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
    }
    static  int m = 300;
    static final int M = 1;
}