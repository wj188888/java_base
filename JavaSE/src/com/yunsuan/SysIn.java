package com.yunsuan;

import java.util.Scanner;

/**
 * @author WangJie
 * @time 2023/8/26 21:52
 * @description 变量的系统输入
 */
public class SysIn {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("对x和y进行加减乘除运算。");

        System.out.println("x的值：");
        int x = stdIn.nextInt();

        System.out.println("y的值：");
        int y = stdIn.nextInt();

        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x % y = " + (x%y)); //取余运算
        /*
        * byte 1字节整数
        * short 短整形
        * int 整数
        * long 长整型
        * */

        /*
        *浮点型
        * float 单精度浮点数
        * double 双精度浮点数
        * */
    }
}
