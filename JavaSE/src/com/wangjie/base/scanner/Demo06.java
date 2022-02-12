package com.wangjie.base.scanner;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;
        System.out.println("请输入double类型数字：\n");
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();

            m = m + 1;
            sum = sum + x;
            System.out.println("你输入了第"+m+"个数据，然后当前结果sum="+sum);
        }
        System.out.println(m + "个数字之和未: \t" + sum);
        System.out.println(m + "个数字的平均数是: \t" + (sum/m));
    }
}
// 反编译 java---class （反编译）idea
// 把反编译的class 文件编译成我们人可以看懂的内容