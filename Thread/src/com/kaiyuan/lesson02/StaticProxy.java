package com.kaiyuan.lesson02;


// 静态代理模式总结
/*
1. 真是对象和代理对象都要实现同一接口
2. 代理对象要代理真实角色

静态代理的优点：
    1. 代理对象可以做很多真实对象做不了的事情
    2. 真实对象就专注做自己的事情

 */

public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();

        new Thread( () -> System.out.println("我爱你我的祖国")).start();

        new WeddingCompany(new You()).Happymarry();

    }
}

interface Marry{
    // 人间四大喜事
    /*
    久旱逢甘霖
    他乡遇故知
    洞房花烛夜
    经榜提名时
     */
    void Happymarry();
}

class You implements Marry{

    @Override
    public void Happymarry() {
        System.out.println("老师结婚有点开心");
    }
}

// 代理角色：帮助你结婚
class WeddingCompany implements Marry{
    // 代理谁-》真实目标角色
    private Marry target;

    // 构造方法
    public WeddingCompany(Marry target) {
        this.target = target; // 这是真实对象
    }

    @Override
    public void Happymarry() {
        before();
        this.target.Happymarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后收尾款很痛苦");
    }

    private void before() {
        System.out.println("结婚之前布置婚姻现场");
    }
}