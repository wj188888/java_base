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
                System.out.println("I like lambda2");
            }
        }


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