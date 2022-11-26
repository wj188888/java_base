package com.wangjie.Base01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(123);
        intList.add(456);
        intList.add(789);
        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}
