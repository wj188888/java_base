package struct;

public class ForDemo05 {
    public static void main(String[] args) {
        for (int j = 0; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j+ " x " + i + " = " +(j*i) +"\t");
            }
            System.out.println();
        }


    }
}
