package com.wangjie;

public class NativeDemo {
    public static void main(String[] args) {
        new Thread(() -> {

        }, "my thread name").start();
    }
    // native: 凡是到了native关键字的，说明java的作用范围达不到了，回去调用C语言库
    // native：凡是进入native都会去本地方法库(JNI)java native interface 接口,扩展java的作用
    // JNI作用：扩展java的使用，融合不同的编程语言为java所用！最初：C，C++
    // Java诞生的时候 C,C++；必须要调用C和C++的程序~！
    // 内存区域中转么开辟了一块标记区域：Native method
    // Robot类，java程序驱动打印机
    private native void start0();

    // 调用其他接口; Socket , webservice,http;

}
