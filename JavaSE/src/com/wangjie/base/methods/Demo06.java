package com.wangjie.base.methods;

public class Demo06 {
    public static void main(String[] args) {

        System.out.println(f(8));
    }
    // 5！= 5*4*3*2*1
    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1); // 递归标记
        }
    }
}

// 边界条件：边界
// 前阶段
// 返回阶段 n*(n-1)
