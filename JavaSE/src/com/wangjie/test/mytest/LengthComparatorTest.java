package com.wangjie.test.mytest;

import com.wangjie.test.impl.LengthComparator;

/**
 * @Author WangJie
 * @Create by 2023/2/17 22:12
 * @Description
 */
public class LengthComparatorTest {
    public static void main(String[] args) {

        LengthComparator comparator = new LengthComparator();
        int x = comparator.compare("word", "javaks");
        if (x > 0)
        {
            System.out.println("第一个字符串比后一个字符串 更长");
        } else if (x < 0) {
            System.out.println("第一个字符串比后一个字符串 更短");
        }else
        {
            System.out.println("第一个字符串和后一个字符串 一样长");
        }
    }
}
