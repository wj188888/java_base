package com.yunsuan;

import java.util.Random;

/**
 * @author WangJie
 * @time 2023/8/26 22:29
 * @description 生成随机数
 */
public class SuiJiShu {
    public static void main(String[] args) {

        //Random rand = new Random();
        //int lucky = rand.nextInt(10);
        //System.out.println("今天的幸运数字是：" + lucky);
        //
        //int lucky2 = rand.nextInt(10);
        //System.out.println("lucky2 : " + (-lucky2));
        //
        //int lucky3 = rand.nextInt(90) + 10;
        //System.out.println("lucky3 : " + lucky3);
        LongFunc();
        BooleanFunc();
    }

    /**
     * 输入布尔类型的随机值
     */
    public static void BooleanFunc(){
        Random rand = new Random();

        boolean bool = rand.nextBoolean();
        System.out.println("布尔类型的随机值为：" + bool);
    }

    /*
    *显示Long长整型的随机值
     */
    public static void LongFunc(){
        Random rand = new Random();

        long aLong = rand.nextLong();
        System.out.println("Long长整型的随机值为：" + aLong);
    }
}
