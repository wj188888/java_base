package firstbase.base.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bool = false;
        System.out.println("请输入bool布尔内型内容:\t");
        if (scanner.hasNextBoolean()) {
            bool = scanner.nextBoolean();
            System.out.println("请输入bool布尔值:\t"+ bool);
        }else {
            System.out.println("不是bool类型");
        }

        scanner.close();

    }
}
