package com.wangjie.oop.Demo12;

// 抽象类 extends
// 类 可以实现接口 implments 接口
// 实现接口的类，就需要重写接口的方法
/*
接口可以进行多继承，但是java的类是单继承的
 */
public class UserServiceImpl implements UserService,TimeService {
    @Override
    public void run() {
        System.out.println("wangjie run");
    }

    @Override
    public void add(String name) {
        System.out.println("这是添加接口的实现");
    }

    @Override
    public void delete(String name) {
        System.out.println("这是删除接口的实现");
    }

    @Override
    public void update(String name) {
        System.out.println("这是更新方法的实现");
    }

    @Override
    public void select(String name) {
        System.out.println("这是查询方法的实现");
    }

    @Override
    public void time() {
        System.out.println("time是的实现");
    }
}
