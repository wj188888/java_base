package com.wangjie.base.struct;

public class LabelDemo01 {
    public static void main(String[] args) {
        // 练习：打印100-150之间的质数
        int count = 0; // 标签

        // 标签
        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + "\t");
        }
    }
}
