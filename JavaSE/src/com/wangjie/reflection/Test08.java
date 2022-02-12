package com.wangjie.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException{
        // 反射方法二
        Class c1 = Class.forName("com.wangjie.reflection.User");
        // 反射方法一
        User user = new User();
        c1 = user.getClass();

        System.out.println(c1.getName()); // 获得包名+ 类名
        System.out.println(c1.getSimpleName()); // 获得类名

        //获得类的属性
        System.out.println("================");
        Field[] fields = c1.getFields(); // 只能找到public属性


        fields = c1.getDeclaredFields(); // 能找到全部的属性
        for (Field one : fields) {
            System.out.println(one);
        }

        // 获得类的方法
        System.out.println("==============");
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的:"+ method);

        }
        methods = c1.getDeclaredMethods(); // 获得本类的所有方法
        for (Method method : methods) {
            System.out.println("getDeclareMethods:"+ method);
        }

        // 获得指定方法
        // 重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        // 获得指定的构造器
        System.out.println("=======获得指定的构造器=======");
        Constructor[] constructors = c1.getConstructors(); // 反射所有的public 的构造器
        Constructor[] constructors1 = c1.getDeclaredConstructors(); // 反射本类的所有构造器
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }


    }
}
