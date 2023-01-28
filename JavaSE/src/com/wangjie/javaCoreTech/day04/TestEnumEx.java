package com.wangjie.javaCoreTech.day04;

/**
 * @Author WangJie
 * @Create by 2023/1/28 13:40
 * @Description
 */
public class TestEnumEx {
    public static void main(String[] args) {
        EnumEx ex = new EnumEx(21, "wangjie");

        System.out.println(ex.toString());
        EnumEx.Size s = EnumEx.Size.large;
        if (s.equals(EnumEx.Size.large))
        {
            System.out.println("都等于large");
        }
        System.out.println(s);
    }
}
