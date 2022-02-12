package com.wangjie.base.methods;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,3,4);

    }
    // 可变参数；也叫作:不定项参数
    public void test(int ... i) { // 本质上是数组
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }
}
