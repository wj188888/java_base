package com.wangjie;

public class StringDemo {
    // 双亲委派机制：安全
    // 1. APP---> EXC ---> BOOT(最终执行)
    // BOOT
    // EXC
    // APP
    public String toString(){
        return "Hello";
    }

    public static void main(String[] args) {
        String s = new String();
        System.out.println(s.getClass().getClassLoader());
        s.toString();
    }
    /*
    1. 类加载收到的类加载的请求
    2。 将这个请求向上委托给父类加载器去完成，一直向上委托，直到启动加载器
    3. 启动加载器检查是否能够加载当前这个类，能加载就结束，使用当前的加载器，否则，抛出异常，
    通知子加载器；
     */
}
