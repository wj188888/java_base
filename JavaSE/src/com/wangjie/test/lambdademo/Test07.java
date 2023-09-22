package com.wangjie.test.lambdademo;

import com.sun.xml.internal.ws.developer.BindingTypeFeature;

/**
 * @Author WangJie
 * @Create by 2023/2/25 13:09
 * @Description
 */
public class Test07 {
    private static class Dog{
        String name;
        int age;
        //无参构造
        public Dog()
        {
            System.out.println("一个DOG对象通过无参构造被实例化了");
        }
        //有参构造
        public Dog(String name, int age)
        {
            System.out.println("一个DOG对象通过有参构造被实例化了");
            this.name = name;
            this.age = age;
        }
    }
    private interface GetDog
    {
        Dog test();
    }

    //定义一个函数式接口，用于获取有参的对象
    @FunctionalInterface
    private interface GetDogWithParameter
    {
        //若此方法仅仅为了获得一个Dog对象，而且通过有参构造去获取一个Dog对象作为返回值
        Dog test(String name, int age);
    }

    //测试
    public static void main(String[] args) {
        //lambda表达式实现接口
        GetDog lm = Dog::new; //引用到Dog类中的无参构造，获取HigeDog对象
        Dog dog = lm.test();
        System.out.println("");
        GetDogWithParameter lm2 = Dog::new;
        Dog dog1 = lm2.test("萨摩耶", 2);
        System.out.println("傻狗的名字："+dog1.name + "傻狗的年龄："+dog1.age);
    }

}
