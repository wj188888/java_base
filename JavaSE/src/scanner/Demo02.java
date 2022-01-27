package scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.1f;
        System.out.println("请输入整数: ");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("整数数据\t"+i);
        }else {
            System.out.println("输出不是整数数据！");
        }

        System.out.println("请输入小数: ");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("小数数据\t"+f);
        }else {
            System.out.println("输出不是小数数据！");
        }

        scanner.close();


    }
}
