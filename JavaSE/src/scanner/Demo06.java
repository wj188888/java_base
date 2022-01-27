package scanner;

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
        }
        System.out.println("这些数字之和未: \t" + sum);
    }
}
