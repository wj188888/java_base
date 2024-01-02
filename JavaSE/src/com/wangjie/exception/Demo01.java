package com.wangjie.exception;

public class Demo01 {
    public static void main(String[] args) {
        new Demo01().a();
    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
    // 死锁调用相互调用时报错：StackOverflowError
}
