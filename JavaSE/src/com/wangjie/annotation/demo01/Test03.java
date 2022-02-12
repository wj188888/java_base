package com.wangjie.annotation.demo01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {
    // 自定义注解, 如果没有默认值，我们就必须给注释赋值
    @MyAnnotation2(name="王杰",schools = "成都信息工程学院")
    public static void test(){
        System.out.println("你好注解，我的么么哒");
    }
    // 如果注解只有一个参数，那么参数的名字可以不写，默认就是传给该参数的值
    @MyAnnotation3("王杰")
    public static void test02(){

    }

    public static void main(String[] args) {
        test();
    }
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 注解的参数： 参数类型 + 参数名();
//    String name();
    String name() default ""; // 自己设定默认值
    int age() default 0;
    int id() default -1; // 如果默认值为-1，代表不存在或者找不到

    String[] schools() default {"牛牛大学", "河北大学"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value() default ""; //
}