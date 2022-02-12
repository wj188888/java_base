package com.wangjie.base.operator;
public class Demo03 {
    public static void main(String[] args) {
        // 整数拓展：    进制  二进制0b   十进制  八进制0   十六进制0x
        int i =10;
        int i2 = 010; //八进制
        int i3 = 0x10; //十六进制
        float f = 0.1f;
        double x = 1.0/10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(f==x);
        System.out.println(f);
        System.out.println(x);
        // 字符拓展
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println(c3);
        System.out.println((int)c3);
    }
}
