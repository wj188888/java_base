package com.wangjie.oop;

public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        Demo03.change(a);
        System.out.println(a);
    }

    // 返回值为空,值传递
    public static void change(int a) {
        a = 10;
    }
}
