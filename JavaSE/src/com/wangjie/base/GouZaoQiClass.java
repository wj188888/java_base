package com.wangjie.base;

import java.io.StringReader;

/**
 * @author WangJie
 * @time 2024/1/6 17:01
 * @description
 */

public class GouZaoQiClass {
    private int id;
    private String name;
    // 无参构造器
    public GouZaoQiClass(){

    }
    // 有参构造器
    public GouZaoQiClass(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        //GouZaoQiClass qiClass1 = new GouZaoQiClass();
        //System.out.println(qiClass1.toString());
        //GouZaoQiClass qiClass2 = new GouZaoQiClass(10,"wangjie");
        //System.out.println(qiClass2);
        // 验证变量初始化可以是一个变量值。而非一个定值。
        //PersonOne one = new PersonOne();
        //System.out.println(one.getId());
        //PersonOne two = new PersonOne();
        //System.out.println(two.getId());
        //PersonOne three = new PersonOne();
        //System.out.println(three.getId());
        //PersonOne four = new PersonOne(300);
        //System.out.println(four.getName());
        //-------------------------------
        // 验证static的更新次数
        //PersonTwo two = new PersonTwo();
        ////System.out.println(two.getId());
        //PersonTwo two1 = new PersonTwo();
        //System.out.println(two1.getId());
        //PersonTwo two2 = new PersonTwo();
        //PersonTwo two3 = new PersonTwo();
        //PersonTwo two4 = new PersonTwo();
        //PersonTwo two5 = new PersonTwo();
        //System.out.println(two1.getNextId()); //static这个nextId变量会被更新六次，这个nextId可以作为类被实例化的次数。

    }
}

class PersonOne{

    private static int nextId=100;
    private int id = assignId(); // System.out.println(two.getId());
    private String name;

    public PersonOne(){

    }

    public PersonOne(int aId,String aName){
        this.id = aId;
        this.name = aName;
    }

    public PersonOne(int aId){
        // 调用的其实是PersonOne(int aId,String aName)这个构造器。
        this(aId,"调用另一个构造器");
    }
    private static int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}

class PersonTwo{

    private static int nextId;
    private int id;
    private String aName;
    private double aSalary;

    {
        id = nextId;
        nextId++;
    }
    public int getId(){
        return this.id;
    }
    public String getaName(){
        return this.aName;
    }
    public double getaSalary(){
        return this.aSalary;
    }
    public  PersonTwo(){
        aName = "";
        aSalary = 0.0;
    }
    public int getNextId(){
        return nextId;
    }
    public PersonTwo(String aName,double aSalary){
        this.aName = aName;
        this.aSalary = aSalary;
    }
}

