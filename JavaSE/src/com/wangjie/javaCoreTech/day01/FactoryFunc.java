package com.wangjie.javaCoreTech.day01;

import java.text.NumberFormat;

/**
 * @Author WangJie
 * @Create by 2023/1/12 23:42
 * @Description
 */
public class FactoryFunc {
    public static void main(String[] args) {

        NumberFormat currentFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currentFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }
}
