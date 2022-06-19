package com.wangjie.annotation.demo01;

import java.util.ArrayList;
import java.util.List;

// 什么是注解
public class Demo01 extends Object{
    // @Override 重写注解
    @Override
    public String toString() {
        return super.toString();
    }

    // 不推荐使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    public void test02(){
        List list = new ArrayList();
    }
    // 镇压所有的警告
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.toString();
        //test(); // 不推荐使用，但是也能够使用
    }


}
