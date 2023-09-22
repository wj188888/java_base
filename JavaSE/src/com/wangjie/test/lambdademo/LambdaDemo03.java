package com.wangjie.test.lambdademo;

import com.wangjie.test.service.ActionListener;

/**
 * @Author WangJie
 * @Create by 2023/2/25 11:34
 * @Description
 */
public class LambdaDemo03 {
    public static void main(String[] args) {
        LambdaDemo03.repeat("这个是神课大赛", 2);
    }

    public static void repeat(String text, int count)
    {
        ActionListener listener = event -> {
            System.out.println(": " + text);
            int sum;
            sum = count + 1;
            System.out.println(sum);
        };

    }
}
