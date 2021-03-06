package com.function;

import java.util.function.Function;

/**
 * 函数型接口, 有一个输入参数，有一个输出
 *  只要是 函数型接口 可以用 lambda表达式简化
 */

public class Demo01 {
    public static void main(String[] args) {
        // 工具类：输出输入的值
//        Function function = new Function<String, String>() {
//            @Override
//            public String apply(String o) {
//                return o + "123";
//            }
//        };
        Function function = (str)->{return (str+"wangjie");};
        System.out.println(function.apply("asd"));

    }
}
