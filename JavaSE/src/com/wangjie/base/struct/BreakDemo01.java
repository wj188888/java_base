package com.wangjie.base.struct;

public class BreakDemo01 {
    public static void main(String[] args) {
        int i = 0;
        /*
        break在任何循环语句的主体部分，均可用break控制循环的过程;
        break用于强行退出循环，不执行循环中剩余的语句。
        continue语句用在循环语句体中，用于终止某次循环的过程，既跳过循环中尚未执行的语句；
        接着进行下一次是否执行循环的判定；
         */
//        while (i <100) {
//            i++;
//            System.out.println(i);
//            if (i == 10) {
//                break;
//            }
//        }
        while (i < 10) {
            i++;
            if (i %3 == 0) {
                System.out.println(i);
                // 如果遇到continue，跳过未执行的循环内容
                continue;
            }
            if (i %2 == 0) {
                System.out.println(i);
                continue;
            }
            System.out.println("不打印"+i);
        }

    }
}
/*
关于goto关键词：
    尽管goto仍是java的一个保留字，但是未在语言中得到正式的使用；
    java没有goto，然而，在break和continue这两个关键字上，我们仍然看到了
    goto的影子；
    对java来说，唯一的地方是在循环语句之前，而在循环之前设置标签的唯一理由是；
    我们希望在其中嵌套宁一个循环，由于break和continue关键字通常只中断当前循环；
    但若随同标签一起使用，他们就会中断到存在的标签的地方;历史渊源；
 */