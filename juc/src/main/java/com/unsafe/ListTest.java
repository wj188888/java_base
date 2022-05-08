package com.unsafe;

import java.util.*;

// java.util.ConcurrentModificationException 并发修改异常！
public class ListTest {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("1", "2", "3", "4");
//        list.forEach(System.out::println);
        // 并发下 ArrayList 不安全的
        /**
         * 解决方案；
         * 1. 可以用Vector<>()解决
         */
//        List<String> list = new ArrayList<>();
        List<String> list = new Vector<>();

         for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
