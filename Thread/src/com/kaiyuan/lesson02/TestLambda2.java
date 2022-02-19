package com.kaiyuan.lesson02;

public class TestLambda2 {

    static class Love implements ILove{

        @Override
        public void love(int a, int b) {
            System.out.println("I love you --> "+ (a+b));
        }
    }


    public static void main(String[] args) {
        Love love = new Love();
        love.love(123,1314);

        // 这个lambda的所属类必须是一个接口的对象，不能是具体的类
        ILove like = (int a, int b) -> {
            System.out.println("I love you --> "+ (a+b));
        };
        like.love(12,520);


        // 简化2 简括号
        like = (int a, int b) -> {
            System.out.println("I love you --> " + (a*b));
        };
        like.love(123, 390);
        // 简化3 去掉花括号
        like = (int a, int b) -> System.out.println("I love you --> "+ (a+b));
        like.love(12,521);

//         总结：
//         lambda表达式只能有一行代码的情况下才能简化成为一行，如果有多行，那就用代码块包裹；
//         前提是接口为函数式接口,函数式接口只有一个抽象方法;
//         多个参数也可以去掉参数类型，要去掉就都去掉;必须加上括号，

    }


}


interface ILove{
    void love(int a, int b);
}

//class Love implements ILove{
//
//    @Override
//    public void love(int a) {
//        System.out.println("I love you --> "+ a);
//    }
//}