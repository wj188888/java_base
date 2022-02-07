package firstbase.base.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        int[] xx = {111,2,3,4,5};
        printArray(xx);
        System.out.println('\n'+nums.toString());
        Arrays.sort(xx);
        System.out.println(xx[0]);
        System.out.println(xx[1]);
        System.out.println(xx[2]);
        System.out.println(xx[3]);
        System.out.println(xx[4]);

    }
    public static void printArray(int[] a) {
        for (int i = 0; i <= a.length-1; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == a.length-1) {
                System.out.print(a[i] + "]");
            }else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}
