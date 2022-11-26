package com.xuexiangban;

/**
 * @Classname EnumerateDemo
 * @Date 2022/11/19 21:00
 * @Author wangjie
 */
public class EnumerateDemo {

    public enum Size {
        SMALL("S"), MEDIUM("M"),LARGE("L"), EXTRA_LARGE("XL");

        private String abbreviationzz; // 定义私有变量

        /*
         * 枚举构造器，总是私有的，如果设置成public或者protect是错误的
         */
        private Size(String abbreviation) {
            this.abbreviationzz = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviationzz;
        }
    }

    public static void main(String[] args) {
        // 返回给定类中有指定名字的枚举常量,找不到就会有IllegalArgumentException报错提示
        Size s = Enum.valueOf(Size.class, "SMALL"); // SMALL123
        System.out.println(s);

        Size m = Enum.valueOf(Size.class, "MEDIUM");
        Size l = Enum.valueOf(Size.class, "LARGE");


        Size[] values = Size.values();
        for (Size v : values) {
            // 打印具体的值
            System.out.println(v);
        }
        System.out.println(s.getAbbreviation());
        System.out.println(s.getClass()); // 打印类名称
        System.out.println(s.name()); // 打印名字
        System.out.println(s.hashCode()); // 打印hashcode
        // 如果枚举常量出现在other之前，返回一个负数，如果this==other,则返回0，否则，返回一个正整数。
        int medium = s.compareTo(Enum.valueOf(Size.class, "MEDIUM"));
        System.out.println(medium);
        System.out.println("=================");
        System.out.println(l.compareTo(s)); // 返回为2，因为L在S之后，在第二个位置
        System.out.println(l.compareTo(m)); // 返回为1，因为L在m之后，在第一个位置

        System.out.println(s.toString()); // 打印枚举值s的字符串
        System.out.println(m.toString()); // 打印枚举值s的字符串
        System.out.println(l.toString()); // 打印枚举值s的字符串
        System.out.println(s.ordinal()); // 返回枚举常量在enum声明中的位置，位置从0开始计数
        System.out.println(m.ordinal()); // 返回枚举常量在enum声明中的位置，位置从0开始计数
        System.out.println(l.ordinal()); // 返回枚举常量在enum声明中的位置，位置从0开始计数
    }
}
