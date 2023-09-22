package com.wangjie.test.lambdademo;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


/**
 * @Author WangJie
 * @Create by 2023/2/18 12:43
 * @Description
 */
public class LambdaDemoTwo {
    public static void main(String[] args) {


        String[] plants = new String[] {"one", "two", "three", "four"};
        System.out.println(Arrays.toString(plants));
        System.out.println("sorted the dict:");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("sorted by length:");
        Arrays.sort(plants, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));

        Timer timer = new Timer(3000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
