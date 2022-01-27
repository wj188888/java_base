package scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte bit = 20;
        System.out.println("请输入大的byte型:\t");
        if (scanner.hasNextByte()) {
            bit = scanner.nextByte();
            System.out.println("byte型的内容:\t"+bit);
        }else {
            System.out.println("不是byte型的内容!");
        }

        scanner.close();
    }
}
