package com.wangjie.reflection;

// 什么叫反射
public class Test02 extends Object {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的class对象
        Class c1 = Class.forName("com.wangjie.reflection.User"); // 包名和类名，在同一个类中不写你属的那个类

        System.out.println(c1);

        Class c2 = Class.forName("com.wangjie.reflection.User"); // 包名和类名，在同一个类中不写你属的那个类
        Class c3 = Class.forName("com.wangjie.reflection.User"); // 包名和类名，在同一个类中不写你属的那个类
        Class c4 = Class.forName("com.wangjie.reflection.User"); // 包名和类名，在同一个类中不写你属的那个类

        // 一个类在内存中只有一个class对象
        // 一个类被加载后，类的整个结构都会被封装在class对象中；
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }
}

// s实体类:pojo, entity
class User{
    private String name;
    private int id;
    private char sex;
    public User(){
        // 无参构造器
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
