package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo02 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        System.out.println("foreach循环");
        int sum = 0;
        for (Integer i:nums) {
            sum += i;
            System.out.println(i);

        }
        System.out.println("sum = "+ sum);
        System.out.println("average = "+ (double)sum/ nums.size());
    }
}
