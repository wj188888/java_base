package com.wangjie.Base01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 定义一维数组intList，数据为integer包类型
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(123);
        intList.add(456);
        intList.add(789);
        intList.add(128312);
        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}
