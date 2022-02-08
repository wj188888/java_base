package reflection;

public class Test05 {
    public static void main(String[] args) {
        A _ = new A();
        System.out.println(A.m);
    }
}


class A{
    {
        System.out.println("A类的普通代码块");
    }
    static {
        System.out.println("A类静态代码快初始化");
    }

    static int m = 1000;
    public A(){
        System.out.println("A类的无参构造初始化");
    }

}
