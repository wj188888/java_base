package com.wangjie.base.struct;

public class WhileDemo01 {
    public static void main(String[] args) {
        /*
        while (布尔表达式) {
            // 循环内容
        }

        只要布尔表达式未true，循环就会一直执行下去

         */
        // 输入1-100
        int i = 0;
        // 判断i<100表达式为100是否为真;
        while (i < 100) {
            i++;
            System.out.println(i);
        }
        /*
        while (true) {
            //死循环
        }
        */

    }
}
