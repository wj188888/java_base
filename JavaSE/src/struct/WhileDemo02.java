package struct;

public class WhileDemo02 {
    public static void main(String[] args) {
        int i = 0;

        int sum = 0;
        while (i<=100) {
            sum += i;
            i++;
        }
        System.out.println("sum的总和是："+sum);
    }
}
