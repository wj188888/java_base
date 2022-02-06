package array;

import java.lang.reflect.Array;

public class TwoArrayDemo01 {
    public static void main(String[] args) {
        // 声明二维数组
        int[][] nums = { {1,2}, {2,3},{34,23,12,31}};
//        System.out.println(nums[0][0]);
//        System.out.println(nums[0][1]);
//        System.out.println(nums[1][0]);
//        System.out.println(nums[1][1]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums.length);




        int[][] array = {{1,2}, {2,3}, {3,5}, {4,5}};

        for (int i= 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
