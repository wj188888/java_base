package firstbase.base.sort;

import java.util.Arrays;

public class ArrayMaoPao {
    public static void main(String[] args) {
        int[] a = {1, 2, 31, 453, 12, 123, -12};
        int[] sort = sortede(a);
        System.out.println(Arrays.toString(sort));
        // 冒泡排序：
        // 1.比较数组中，两个相邻元素，如果一个数比第二个数打，我们就
//    交换他们的位置
//    2.每一次比较，都会产生出一个最大，或者最小的数字，
//    3.下一轮就可以少一次排序；
//    4.依次循环，直到结束

    }
    public static int[] sortede(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {

            boolean flag = false; // 通过flag标识位减少没有意义的比较

            // 内层循环，比较两个数，如果第一个数，比第二个数大，则交换位置；
            for (int j = 0; j< array.length-1-i; j++) {
                if (array[j+1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }

        return array;
    }
}
