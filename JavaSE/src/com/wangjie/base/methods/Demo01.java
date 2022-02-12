package com.wangjie.base.methods;

public class Demo01 {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
        test();

    }
    // 类方法要有关键词static 和 public
    static public int add(int a, int b) {
        return a+b;
    }
    static public void test() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j+ " x " + i + " = " +(j*i) +"\t");
            }
            System.out.println();
        }
    }

    /*

    修饰符 返回值类型 方法名（参数类型 参数名）{
        ...
        方法体
        ...
        return 返回值;
    }

     */
}
