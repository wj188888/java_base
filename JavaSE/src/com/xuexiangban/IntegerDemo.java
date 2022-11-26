package com.xuexiangban;

import java.util.ArrayList;

/**
 * @Classname IntegerDemo
 * @Date 2022/11/12 23:14
 * @Author wangjie
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // Integer包装器类的作用是，如果是想在ArrayList加上基本类型对象，那么需要进行转换
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        System.out.println(ints);
        System.out.println(ints.get(0).intValue());

        //ArrayList<int> int2 = new ArrayList<int>();
        //int2.add(3);
        //System.out.println(int2.get(0).intValue());

        Integer nullDemo = null;
        // System.out.println(2 * nullDemo); // 这里出现空指针异常

        Integer n = 1;
        Double x = 2.0;
        Long y = 1L;
        System.out.println(true ? x : n);

        int intDemo = Integer.parseInt("12314121"); // 短一点的(纯数字的)字符串可以转换成int的包装类对象,有字母一定报错
        System.out.println(intDemo);

        System.out.println(n.intValue());
        System.out.println(n.toString());
        System.out.println(n.floatValue());
        System.out.println(n.doubleValue());
        System.out.println(n.valueOf(120));
        System.out.println(n.equals(y)); // 是两种不同的对象，且值还不同
    }
}
