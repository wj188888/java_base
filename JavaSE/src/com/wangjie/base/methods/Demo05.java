package com.wangjie.base.methods;

public class Demo05 {
    public static void main(String[] args) {
        Demo05 test = new Demo05();
        test.test(); // 自己调用自己递归报错：java.lang.StackOverflowError
    }

    public void test(){
        test(); // 递归,
    }
}
