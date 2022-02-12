package com.wangjie.base.struct;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
        }while (i<=100);
        System.out.println("sum的值："+ sum);
    }
}
/*
do...while内容
do {
    //循环体
}while (表达式);

 */