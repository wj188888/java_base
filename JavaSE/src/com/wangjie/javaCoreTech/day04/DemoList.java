package com.wangjie.javaCoreTech.day04;

import java.util.ArrayList;

/**
 * @Author WangJie
 * @Create by 2023/1/28 13:53
 * @Description
 */
public class DemoList {
    public static void main(String[] args) {

        //实现类
        ArrayList<EnumEx>  staff = new ArrayList<>();
        staff.add(new EnumEx(21,"wangjie"));
        staff.add(new EnumEx(23, "NiuLang"));

        for (EnumEx s1: staff
             ) {
            System.out.println("列表A： " + s1.getName() + " 的年龄是：" + s1.getAge());
        }

        // 声明一个包含3个对象的数组
        ArrayList<EnumEx>  staff2 = new ArrayList<>();
        staff2.ensureCapacity(3);

        staff2.add(new EnumEx(23, "LiYong"));
        staff2.add(new EnumEx(87, "ZhaoChangWen"));
        staff2.add(new EnumEx(98, "ZhangNaiNai"));

        // 给staff2列表增加一个对象，前3次不会重新分配空间，而第四次会重新分配空间
        staff2.add(new EnumEx(92, "YongZLi"));
        for (EnumEx s2: staff2
             ) {
            System.out.println("列表B: "+ s2.getName() + " 的年龄是： " + s2.getAge()
            );
        }
    }
}
