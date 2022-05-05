package com.wangjie;

public class Test1 {
    public static void main(String[] args) {
        // 获取cpu的核数
        // cpu密集型和IO密集型
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
