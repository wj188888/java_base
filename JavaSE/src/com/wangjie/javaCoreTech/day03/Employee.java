package com.wangjie.javaCoreTech.day03;

/**
 * @Author WangJie
 * @Create by 2023/1/14 10:58
 * @Description
 */
public class Employee {



    private static int nextId;
    private int id = assignId();


    private static int assignId()
    {
        int r = nextId;
        nextId++;
        return r;
    }

    public int getId()
    {
        return id;
    }

}
