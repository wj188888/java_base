package com.wangjie.oop.Demo12;


// 抽象的思维 ~ java 架构师~
// interface 定义的关键字
public interface UserService {
    // 接口中的所有定义的方法其实都是抽象的 public abstract

    public static final int AGE = 12; // 属性是默认的常量,用的很少

    public abstract void run(); // 接口不能进行方法实现
    void add(String name);
    void delete(String name);
    void update(String name);
    void select(String name);
}
