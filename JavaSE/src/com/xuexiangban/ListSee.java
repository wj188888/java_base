package com.xuexiangban;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ListSee
 * @Date 2022/11/12 22:10
 * @Author wangjie
 */
public class ListSee {
    public static void main(String[] args) {

        List<String> strs = new ArrayList<String>();
        System.out.println("strs hashcode:" + strs.hashCode());
        strs.add("one");
        System.out.println("strs one hashcode:" + strs.hashCode());
        strs.add("two");
        System.out.println("strs two hashcode:" + strs.hashCode());
        strs.add("three");
        System.out.println("strs three hashcode:" + strs.hashCode());
        System.out.println(strs);
        // ArrayList.get根据下标获取数组元素
        System.out.println(strs.get(1));
        strs.remove(0);
        //strs.remove(0);
        //strs.remove(0);

        ArrayList<String> str2 = new ArrayList<>();
        System.out.println("str2 hashcode:" + str2.hashCode());
        str2.addAll(strs);
        System.out.println(strs);
        System.out.println(str2);
        System.out.println("strs的hashcode: " + System.identityHashCode(strs)); // 不管hashcode方法是否被重写都返回未被重写时的hashcode
        System.out.println("str2的hashcode: " + System.identityHashCode(str2));
        if (strs.equals(str2)) { // equals比较的是两个对象的内容是否相等
            System.out.println("strs等于str2");
        }
        if (strs!=str2) { // 1、都是基本类型，转成同一种基础类型，比较值得大小 2、都是对象，比较内存地址
            System.out.println("strs==str2");
        }

    }
}
