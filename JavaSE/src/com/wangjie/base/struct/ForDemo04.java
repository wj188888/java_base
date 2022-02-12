package com.wangjie.base.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        // 练习九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j<i+1; j++) {
                System.out.print(i + " x " + j + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
