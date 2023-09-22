package com.wangjie.test.lambdademo;

import java.util.function.BiFunction;

/**
 * @Author WangJie
 * @Create by 2023/2/18 12:38
 * @Description
 */
public class LambdaDemo {
    public static void main(String[] args) {

        BiFunction<String, String, String> function = (String first, String second) -> {
            return first + second;
        };
        Runnable runnable = () -> {
            System.out.println("hello world!");
        };
        System.out.println(function);
        System.out.println(runnable);
    }
}
