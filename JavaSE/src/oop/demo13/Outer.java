package oop.demo13;

public class Outer {

    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        // 内部类访问外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
        // 静态内部类不能直接通过内部类去访问私有属性;


        // 局部内部类
        public void method(){
            class Inners{
                public void selfsay(){
                    System.out.println("这是局部内部类");
                }
            }
        }
    }
}
