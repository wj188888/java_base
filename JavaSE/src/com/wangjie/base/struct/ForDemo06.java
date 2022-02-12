package com.wangjie.base.struct;

public class ForDemo06 {
    public static void main(String[] args) {
        // 定义数组, 重点是循环数组和集合的;
        int [] numbers = {10,20,30,40,50};
        for (int i = 0; i <5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("===========");

        for (int x:numbers) { // 遍历数组
            System.out.println(x);
        }
    }
}
