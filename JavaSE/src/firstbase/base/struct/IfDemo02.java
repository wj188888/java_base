package firstbase.base.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        double num = scanner.nextDouble();
        if (num==100) {
            System.out.println("恭喜满分");
        }else if (num>=90) {
            System.out.println("优秀的孩子");
        }else if (num>=80) {
            System.out.println("良好儿子");
        }else if (num >=70) {
            System.out.println("一般的儿子");
        }else if (num>= 60) {
            System.out.println("及格");
        }else if (num < 60) {
            System.out.println("成绩不合格");
        }else {
            System.out.println("请输入合法值");
        }


        scanner.close();
    }
}
