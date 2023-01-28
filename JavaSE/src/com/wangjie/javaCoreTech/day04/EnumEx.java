package com.wangjie.javaCoreTech.day04;

/**
 * @Author WangJie
 * @Create by 2023/1/28 13:39
 * @Description
 */
public class EnumEx {
    enum Size {small, medium, large, extra_large};
    private int age;
    private String name;

    public EnumEx(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnumEx{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
