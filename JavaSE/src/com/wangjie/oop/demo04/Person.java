package com.wangjie.oop.demo04;

// 是父类
public class Person {
    private int money = 1_0000_0000; // 超过了int的方法内容了;
    public void say(){
        System.out.println("说了一句话");
    }
    /*
    public
    protected
    defalut
    private
     */

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
