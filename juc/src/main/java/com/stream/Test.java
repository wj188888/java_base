package com.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. 编号必须是偶数
 * 2. 年龄必须大于23岁
 * 3. 用户名字母倒着排序
 * 4. 只输出一个用户
 */

public class Test {
    public static void main(String[] args) {
        User u1 = new User(1, "a", 21);
        User u2 = new User(2, "b", 23);
        User u3 = new User(3, "c", 24);
        User u4 = new User(4, "d", 25);
        User u5 = new User(5, "e", 26);
        // 集合就是存储
        List<User> list = Arrays.asList(u1,u2,u3,u4,u5);
        // 计算交给Stream流
        list.stream()
                .filter(u -> {return u.getId()%2==0;})
                .filter(u -> {return u.getAge()>23;})
                .map(u -> { return u.getName().toUpperCase();})
                .sorted((uu1, uu2) -> {return uu2.compareTo(uu1);})
                .limit(1)
                .forEach(System.out::println);
    }
}

