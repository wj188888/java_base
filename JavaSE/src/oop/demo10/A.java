package oop.demo10;

// 抽象类的所有方法，继承了他的子类，都必须要实现它的方法，除非子类也是抽象类
public class A extends Action{
    @Override
    public void doSomething(){
        System.out.println("Hello World!!~!");
    }
}
