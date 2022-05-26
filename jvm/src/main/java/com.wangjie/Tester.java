package com.wangjie;

public class Tester {
    @Override
    public String toString() {
        return "wj";
    }
    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println(tester.getClass().getClassLoader());
        System.out.println(tester.getClass());
        System.out.println(tester.toString().getClass());
    }
}
