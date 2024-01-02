package com.wangjie.javaCoreTech.day01;

import java.text.NumberFormat;

/**
 * @Author WangJie
 * @Create by 2023/1/12 23:42
 * @Description
 */
public class FactoryFunc {
    public static void main(String[] args) {
        // 用货币的形式显示单位
        NumberFormat currentFormatter = NumberFormat.getCurrencyInstance();
        // 用百分比的方式显示单位
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        // 用整数的方式显示单位
        NumberFormat instance = NumberFormat.getIntegerInstance();
        // 用于通用数字格式化的NumberFormat实例
        NumberFormat instance1 = NumberFormat.getNumberInstance();
        double x = 2.2;
        System.out.println(currentFormatter.format(x));
        System.out.println(percentFormatter.format(x));
        System.out.println(instance.format(x));
        System.out.println(instance1.format(x));
    }
}
