package com.wangjie.base.operator;

public class Demo05 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        float float1 = 1.2131F;
        float float2 = 1.215631F;
        double pow = Math.pow(2,5);
        System.out.println(pow);

        // 与丶或丶非
        boolean bools = true;
        boolean boolz = true;
        System.out.println("bools && boolz\n" + (bools && boolz));
        System.out.println("bools || boolz\n" + (bools || boolz));
        System.out.println("! (bools && boolz):\n" + ! (bools && boolz));
    }
}
