package com.wangjie.Base01;

import java.util.ArrayList;

/**
 * @Classname ForeachDemo
 * @Date 2022/11/27 9:41
 * @Author wangjie
 */
public class ForeachDemo {

    public static void main(String[] args) {

        ArrayList<Integer> in = new ArrayList<>();
        in.add(10);
        in.add(20);
        in.add(30);
        for (int ind: in) {
            System.out.println(ind);
        }
        in.remove(0); // 通过下标删除
        System.out.println(in);
    }
}
