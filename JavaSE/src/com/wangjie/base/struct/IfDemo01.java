package com.wangjie.base.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符串:\n");
        String s = scanner.nextLine();

        if (s.equals("firstbase.base.Hello")) {
            System.out.println(s);
        }else {
            System.out.println("End");
        }

        scanner.close();
    }
}
