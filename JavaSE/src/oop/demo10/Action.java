package oop.demo10;



// abstract 抽象类： 类 extends: 单继承 （接口可以多继承）
public abstract class Action { // 这是一个抽象类
    // 抽象方法，只有抽象方法，没有抽象其他的
    // 约束，有人帮我们实现了，我们这里不用实现的方法
    public abstract void doSomething();
}
