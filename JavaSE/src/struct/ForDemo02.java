package struct;

public class ForDemo02 {
    public static void main(String[] args) {
        // 0-100偶数之和奇数和
        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i <= 100; i++) {
            if(i%2 != 0){
                // oddsum = oddsum + i
                oddsum += i;
            }else {
                evensum += i;
            }
        }
        System.out.println("奇数的和的值：" + oddsum);
        System.out.println("偶数的和的值：" + evensum);
    }
}
