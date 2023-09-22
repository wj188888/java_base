package com.yunsuan;

import java.util.Scanner;

/**
 * @author WangJie
 * @time 2023/8/26 22:11
 * @description 练习1
 */
public class Pra1 {
    public static void Squa(){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("请输入三角形的底：");
        double a = stdIn.nextDouble();

        System.out.println("请输入三角形的高：");
        double b = stdIn.nextDouble();
        double S = a*b/2;
        System.out.println("三角形的面积：" + S);

    }
    public static void main(String[] args) {
        //Scanner stdIn = new Scanner(System.in);
        //
        //System.out.println("请输入整数：");
        //int num = stdIn.nextInt();
        //System.out.println("num + 10 = " + (num+10));
        //System.out.println("num - 10 = " + (num-10));
        //
        //System.out.println("################");
        //System.out.println("请输入一个实数：");
        //double num2 = stdIn.nextDouble();
        //System.out.println("请输入第二个实数：");
        //double num3 = stdIn.nextDouble();
        //System.out.println("num2 + num3 = " + (num2+num3));
        //
        //System.out.println("num + num3 的平均值为：" + (num2+num3)/2);
        Squa();
    }
}
