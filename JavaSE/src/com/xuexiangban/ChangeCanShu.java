package com.xuexiangban;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;

/**
 * @Classname ChangeCanShu
 * @Date 2022/11/19 4:16
 * @Author wangjie
 */
public class ChangeCanShu {
    public static double max(double...WJ) { // WJ是这个形参Object数组的名称，一般是values
        double largest = Double.NEGATIVE_INFINITY;
        for(double v: WJ) {
            if (v > largest) largest = v;
        }
        return largest;
    }

    public static void main(String[] args) {
        double m = max(3.21, 3123.2, -21.3, 9123.1);
        System.out.println(m);

        // 调用printz
        System.out.println(printz(10,100, 132, -23, 99, 1, 82, -91, 100, 10));;
    }

    public static ArrayList printz(int x,int y, int...WJ) { // int 和 Integer都是可以成功
        /*
         * 找到x，y区间的整数并返回
         */
        ArrayList<Integer> z = new ArrayList<Integer>();
        for (int v: WJ) {
            if (v >= x && v <= y) z.add(v);
        }
        return z;
    }
}
