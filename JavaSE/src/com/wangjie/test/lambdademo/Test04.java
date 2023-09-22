package com.wangjie.test.lambdademo;

/**
 * @Author WangJie
 * @Create by 2023/2/25 11:57
 * @Description
 */
public class Test04 {

    public static void main(String[] args) {
        // 使用lambda表达式实现接口
        Test test = (name, age) -> {
            System.out.println(name + "现在" + age + "岁了！");
            return age + 9;
        };
        int age = test.test("小王", 39);
        System.out.println(age);
    }

}

// -------------
// 注解@FunctionalInterface的作用：接口只有一个抽象方法的是函数式接口，超过一个方法就不是函数式接口
// -------------

@FunctionalInterface
interface Test{
   public int test(String name, int age);

}
