package scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // 创建一个烧苗器对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");

        // 判断用户没有输入字符串
        if (scanner.hasNext()) {
            // 接收用户的输出
            String str = scanner.next();
            System.out.println("输出的内容未：\n"+str);
        }
//        if (scanner.hasNextLine()) {
//            // 对比Next()的区别,回车为结束符,接收空白等字符串s
//            String str = scanner.nextLine();
//            System.out.println("输出的内容为：\n"+str);
//        }

        // 凡是属于I/O的类都要进行关闭；都要进行关闭
        scanner.close();

    }
}
