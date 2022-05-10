package com.rw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
//        MyCache myCache1 = new MyCache();
        MyCacheLock myCache = new MyCacheLock();


        for (int i = 1; i <= 5; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.put(temp+"", temp+"");
            }).start();

        }

        for (int i = 1; i <= 5; i++) {
            final int temp = 0;
            new Thread(() -> {
                myCache.get(temp+"");
            }).start();
        }
    }
}


/**
 * 读写锁加上后
 */
class MyCacheLock {
    private volatile Map<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock(); // 读写锁

    public void put(String key, Object value) {
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"写入"+key);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName()+"写入完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void get(String key){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"读取"+key);
            map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }

    }
}



/**
 * 自定义缓存
 */
class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();
    public void put(String key, Object value) {
        System.out.println(Thread.currentThread().getName()+"写入"+key);
        map.put(key, value);
        System.out.println(Thread.currentThread().getName()+"写入完成");
    }

    public void get(String key){
        System.out.println(Thread.currentThread().getName()+"读取"+key);
        map.get(key);
        System.out.println(Thread.currentThread().getName()+"读取完成");
    }
}