package com.wangjie.base.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        // 联系2：用while和for循环输出1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 0; i <= 1000; i++) {
            if(i%5 == 0) {
                System.out.print(i+"\t");
            }
            if(i%(5*3) == 0) {
                System.out.print("\n");
//                System.out.println();
            }
        }
        // println 输出完会换行
        // print 输出完会换行
    }
}
