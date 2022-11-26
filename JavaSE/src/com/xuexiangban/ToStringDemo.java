package com.xuexiangban;

import java.util.ArrayList;

/**
 * @Classname ToStringDemo
 * @Date 2022/11/22 21:49
 * @Author wangjie
 */
public class ToStringDemo {

    public static void main(String[] args) {
        // 如果前面的ArrayList<>泛型框中没有给定一个限定范围，那么打印的时候就不能限制范围，定义的时候要处理好才行
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (int i=0; i <=5; i++) {
            squares.add(i * i);
        }
        System.out.println(squares.toString());
        System.out.println(squares.hashCode());
        System.out.println(squares.spliterator());
        System.out.println(squares.getClass());
        for (Integer i: squares) {
            System.out.println(i);
        }
        System.out.println("==================");
        // 如果前面的ArrayList<>泛型框中没有给定一个限定范围，那么打印的时候就不能限制范围
        ArrayList<Double> ds = new ArrayList<Double>();
        ds.add(91.0902);
        ds.add(91.12);
        for (Double d: ds) {
            System.out.println(d.doubleValue());
        }
        System.out.println(Double.class);
        System.out.println(double.class);
        System.out.println(Integer.class);
        System.out.println(int.class);
        System.out.println(float.class);
    }
}
