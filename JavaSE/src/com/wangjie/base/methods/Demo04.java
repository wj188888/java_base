package com.wangjie.base.methods;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test("wangjie","wangjie","wangjie","wangjie");
        demo04.test1(1,3,5,7);

    }
    // 可变参数；也叫作:不定项参数
    public void test(String ... i) { // 本质上是数组
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }

    public void test1(int ... i) { // 本质上是数组
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }
}
