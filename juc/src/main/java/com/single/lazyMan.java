package com.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class lazyMan {
    private lazyMan() {
//        synchronized (lazyMan.class){
//            if (lazyMan != null){
//                throw new RuntimeException("不要试图使用反射破坏异常");
//            }
//        }
        System.out.println(Thread.currentThread().getName() + " ok");
    }

    private volatile static lazyMan LazyMan; // 禁止指令重排

    // 枷锁,双重检测锁模式 懶汉单例模式 DCL
    public static lazyMan getInstance() {

        if (LazyMan == null) {
            synchronized (lazyMan.class){
                if (LazyMan == null) {
                    LazyMan = new  lazyMan(); // 这个操作不是原子行的,首先1. 分配内存空间,2. 执行构造方法,初始化对象 3.把这个对象指向这个空间
                }
            }
        }
        return LazyMan;
    }
    // 多线程并发
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        lazyMan instance = lazyMan.getInstance();
        Constructor<lazyMan> declaredConstructor = lazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        lazyMan instance2 = declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(instance2);
    }
}
