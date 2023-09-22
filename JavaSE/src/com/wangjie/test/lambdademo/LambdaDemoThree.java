package com.wangjie.test.lambdademo;


import com.wangjie.test.service.Test;
import com.wangjie.test.service.Test2;

import javax.swing.*;

/**
 * @Author WangJie
 * @Create by 2023/2/21 21:29
 * @Description
 */
public class LambdaDemoThree {

    public static void main(String[] args) {
        Test test = (name, age) -> {
            age = age + 1;
            System.out.println("name: " + name + " \nage: " + age);
        };
        test.test("wangjie", 21);
        Test2 test2 = (n, a) -> {
            int sum = a + n;
            System.out.println("sum = " + sum);
        };
        test2.printSum(29,12);

        //Timer timer = new Timer(1000, e -> System.out.println(e));
        Timer timer2 = new Timer(1000, System.out::println);


    }
}
