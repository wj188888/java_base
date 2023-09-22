package com.wangjie.test.service;

/**
 * @Author WangJie
 * @Create by 2023/2/17 21:10
 * @Description
 */
public interface Person {
    default String getName() {
        String name = "jack!";
        System.out.println(name);
        return name;
    }
}