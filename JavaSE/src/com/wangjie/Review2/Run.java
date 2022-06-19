package com.wangjie.Review2;

public class Run {
    public static void main(String[] args) {
        Review2 r2 = new Review2();
        System.out.println("牌子名字:"+r2.getname()
                +"\n"+ "价格："+r2.getPrice()+"元\n" + "使用年限: "+r2.getUseYear());
    }
}
