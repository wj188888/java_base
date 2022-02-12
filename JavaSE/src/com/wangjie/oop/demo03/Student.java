package com.wangjie.oop.demo03;

public class Student {
    private String name;
    private int id; // id
    private char sex; // 性别

    public void setName(String newname){
        this.name = newname;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    /*
    1. 提高程序的安全性，保护数据
    2. 隐藏代码的实现细节
    3. 统一接口
    4. 系统的可维护性增加
     */
}
