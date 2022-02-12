package com.wangjie.reflection;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException{

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器--》 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取系统类加载器的父类加载器--> 根加载器(C++编写的，java是获取不到这一层的)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // 测试当前类是哪个加载类加载的
        ClassLoader classLoader = Class.forName("com.wangjie.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        // 测试JDK内置的类加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        // 双亲委派机制
        // java.lang.string-->...


    }
}
