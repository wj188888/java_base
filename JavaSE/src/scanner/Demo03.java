package scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dd = 0.01;
        System.out.println("请输入double型内容：\t");

        if (scanner.hasNextDouble()) {
            dd = scanner.nextDouble();
            System.out.println("输入的double型数据：\t"+dd);
        }else {
            System.out.println("输入的不是double型数据!");
        }
        scanner.close();
    }
}
