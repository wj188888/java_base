package com.wangjie.base.struct;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        /*
        switch 多选择结构还有一个实现方式就是switch case 语句
        switch(expression) {
            case value:
            //
            break;
            case value2:
            //
            break;
            case value3:
            //
            break;
            defalut:
            //
        }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个成绩等级(字符串):\n");
        String grade = scanner.next();

        switch (grade) {
            // case 穿透,没有break就会穿透
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            case "D":
                System.out.println("再接再厉");
                break;
            default:
                System.out.println("未知等级");
        }
        scanner.close();

    }
}
