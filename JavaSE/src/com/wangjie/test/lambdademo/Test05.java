package com.wangjie.test.lambdademo;

/**
 * @Author WangJie
 * @Create by 2023/2/25 12:12
 * @Description lambda表达式静态方法引用
 */
public class Test05 {
    public static void main(String[] args) {
        //实现多个参数，一个返回值的接口
        //对一个静态方法的引用，语法：类::静态方法
        Test1 test1 = Calculator::calculate;
        System.out.println(test1.test(123, 5));

    }
}

class Calculator
{
    public static int calculate(int a, int b)
    {
        if (a > b)
        {
            return a - b;
        }
        return b - a;
    }
}

interface Test1
{
    int test(int a, int b);
}
