package com.wangjie;

import java.util.Random;

public class Hello {
    public static void main(String[] args) {
        String str = "kuangshenjava";

        // 内存溢出
        while(true) {
            str += str + new Random().nextInt(888888)+ new Random().nextInt(999999);
        }

        // -Xms8m -Xmx8m -XX:+PrintGCDetails
    }
}
