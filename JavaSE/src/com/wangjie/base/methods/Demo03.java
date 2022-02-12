package com.wangjie.base.methods;

public class Demo03 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i +"]:" + args[i]);
        }
    }
    // 命令行传参
    /*
    第一步:
        1.javac xxx.java文件；生成xxx.class
    第二部：
        2.cd 到src目录，然后 java xxx/xxx/类名 (不包含.class后缀)
    第三部：
        3.执行时添加多个参数 如： my am are you;等args就会打印4个参数

     */
}
