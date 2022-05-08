package com.unsafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// java.util.ConcurrentModificationException 并发修改异常！
public class ListTest {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("1", "2", "3", "4");
//        list.forEach(System.out::println);
        // 并发下 ArrayList 不安全的
        /**
         * 解决方案；
         * 1. 可以用Vector<>()解决
         * 2. 使用Collections.synchronizedList()包裹new ArrayList<>()这个
         * 3. CopyOnWriteArrayList这种方式去使用这个东西.
         */
//        List<String> list = new ArrayList<>();
//        List<String> list = new Vector<>();
//         List<String> list = Collections.synchronizedList(new ArrayList<>());
         // CopyOnWrite写入时复制 COW 计算机程序设计领域的一种优化策略;
         // 多线程调用的时候,list,读取的时候，固定的，写入（覆盖）
         // 在写入的时候避免覆盖,造成数据问题?
         // 读写分离
         // CopyOnWriteArrayList
         // CopyOnWriteArrayList 比 Vector的区别是什么？ 使用的是Lock，不是
         List<String> list = new CopyOnWriteArrayList<>();

         for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
