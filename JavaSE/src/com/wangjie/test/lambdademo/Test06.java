package com.wangjie.test.lambdademo;

/**
 * @Author WangJie
 * @Create by 2023/2/25 12:57
 * @Description lambda表达式对非静态方法的引用
 */
public class Test06 {
    public static void main(String[] args) {
        //对非静态方法的引用，需要使用对象来完成
        Test2 test2 = new Calculator()::calculate;
        System.out.println(test2.calulate(982, 3));
    }
    private static class Calculator {
        public int calculate(int a, int b)
        {
            return a>b ? a-b : b-a;
        }
    }
}

interface Test2
{
    int calulate(int a, int b);
}