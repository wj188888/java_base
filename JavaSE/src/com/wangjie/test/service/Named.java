package com.wangjie.test.service;

/**
 * @Author WangJie
 * @Create by 2023/2/17 21:11
 * @Description
 */
public interface Named {
    default String getName() {
        System.out.println(getClass().getName() + "_" + hashCode());
        return getClass().getName() + "_" + hashCode();
    }
}
