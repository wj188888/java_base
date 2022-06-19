package com.wangjie.Review2;

public class Review2 {
    String name = "media";
    int price = 3000;
    int useYear = 5;

    public String getname(){
        return this.name;
    }

    public int getPrice(){
        return this.price*10;
    }

    public int getUseYear(){
        return this.useYear*6;
    }
}
