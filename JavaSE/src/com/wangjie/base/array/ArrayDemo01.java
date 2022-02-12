package com.wangjie.base.array;


public class ArrayDemo01 {
    public static void main(String[] args) {
        // 声明数组
        int[] nums;
        nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        try {
            nums[10] = 100;
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("你的的数组内存溢出了");
        }
        System.out.println((double)sum/nums.length);

    }
}
