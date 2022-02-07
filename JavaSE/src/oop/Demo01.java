package oop;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(max(11,12));
    }

    /*
    修饰符 返回值类型 方法名（。。。） {
        // 方法体
        return 返回值
    }
     */
    public static String sayHello(){
        return "hello, world";
    }
    public static int max(int a, int b) {
        return a > b ? a:b;
    }
    /*
    方法的调用：
        静态方法；
        非静态方法；
        形参和实参；
        值传递和；

     */
    public void readFile(String file) throws IOException {

    }
    // 数组下标越界；ArrayIndexoutofValue

}
