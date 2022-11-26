package com.xuexiangban;
import java.util.*;
/**
 * @Classname GetClassRelecft
 * @Date 2022/11/20 6:47
 * @Author wangjie
 */
public class GetClassRelecft {

    public static void main(String[] args) throws CloneNotSupportedException {
        String className1 = "java.util.Random";
        //Class cl = Class.forName("java.util.Random"); // 不行吗

        Class cl1 = Random.class; // T.class代表匹配的类对象
        Class cl2 = int.class;
        Class cl3 = Double[].class;
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);
        GetClassRelecft re = new GetClassRelecft();
        System.out.println(re.getClass());;
        System.out.println(re.getClass().getName());
        System.out.println(re.getClass().getSimpleName()); // 返回类的名称，简单
        System.out.println(re.getClass().getClasses()); // 不清楚如何使用
        System.out.println(GetClassRelecft.class);
        System.out.println(int.class);
        System.out.println(float.class);
        System.out.println(double.class); // print double,基本类型不会打印对象类
        System.out.println(Integer.class); // print class java.lang.Integer,如果是对象类，那么就会在前面加上class

        //Object clone = re.clone(); // 如果这个re类对象不支持cloneable接口，就不能调用这个方法
        //System.out.println(clone);

        boolean equals = re.equals(re); // 这个类等于它本身
        System.out.println(equals);
        try {
            Class cl = Class.forName("java.lang.Thread", true, ClassLoader.getSystemClassLoader());
            System.out.println(cl);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Class cl9 = Class.forName("java.lang.String", true, ClassLoader.getSystemClassLoader());
            System.out.println(cl9);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            // 获取类信息本身。
            Class cl9 = Class.forName("com.xuexiangban.GetClassRelecft", true, ClassLoader.getSystemClassLoader());
            System.out.println(cl9);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
