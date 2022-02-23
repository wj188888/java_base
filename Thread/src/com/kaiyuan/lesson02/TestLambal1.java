package com.kaiyuan.lesson02;

/*
推导式lambal表达式
 */


public class TestLambal1 {
    // 3 静态内部类
    static class Like2 implements ILike{

        @Override
        public void lambal() {
            System.out.println("I like lambda2");
        }
    }




    public static void main(String[] args) {
        ILike like = new Like();
        like.lambal();

        like = new Like2();
        like.lambal();

        // 4 局部内部类
        class Like3 implements ILike{

            @Override
            public void lambal() {
                System.out.println("I like lambda3");
            }
        }

        like = new Like3();
        like.lambal();



        // 5 匿名内部类,没有类额名称，必须要借助接口或者父类
        like = new ILike() {
            @Override
            public void lambal() {
                System.out.println("I like lambda4");
            }
        };
        like.lambal();

        // 6 用lambda简化
        like = () -> {System.out.println("I like lambda5");};
        like.lambal();


    }
}

// 定义一个函数式接口
interface ILike{
    void lambal();
}

// 2 实现类
class Like implements ILike{

    @Override
    public void lambal() {
        System.out.println("I like lambda");
    }
}