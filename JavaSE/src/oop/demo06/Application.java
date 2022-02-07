package oop.demo06;

public class Application {
    public static void main(String[] args) {
        A a = new A();
        a.test();

        B b = new A(); // 子类实现父类的实例
        b.test();
        // 父类不能去实例化子类
        // A a1 = new B();

    }
}
