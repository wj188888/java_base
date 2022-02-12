package com.wangjie.oop.demo06;

public class A extends B{
    @Override // 注解是给人看的：有功能的,重写
    /*
    1. 非静态方法才能进行重写l;子类重写了父类方法
    2. 只有public的方法才可以进行重写
     */
    public void test(){
        System.out.println("A=>test()");
    }
}
