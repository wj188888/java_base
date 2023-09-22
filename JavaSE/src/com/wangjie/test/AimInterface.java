package com.wangjie.test;

import com.wangjie.test.service.Named;
import com.wangjie.test.service.Person;

/**
 * @Author WangJie
 * @Create by 2023/2/17 20:27
 * @Description
 */
public class AimInterface implements Powered, Person, Named {
    // 继承的Person和Named的getName(),必须实现一个getName()方法。
    private double x;
    private double y;
    @Override
    public void move(double x, double y) {
        double sum = x + y;
        System.out.println("x + y = " + sum);
    }

    @Override
    public double milesPerGallon() {
        double PI = 123.123123;
        System.out.println("PI的值是："+ PI);
        return PI;
    }


    @Override
    public String getName() {
        return Named.super.getName();
    }
}
