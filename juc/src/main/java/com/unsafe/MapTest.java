package com.unsafe;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
        // map 是这样用的吗? 默认等价于什么？
        // new HashMap<>(16, 0.75);
        // 同样的痛:java.util.ConcurrentModificationException
//        Map<String, String> map = new HashMap<>();

        Map<String, String> map = new ConcurrentHashMap<>();
        // 加载因子丶初始化容量
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            }, String.valueOf(i)).start();
        }
    }
}

