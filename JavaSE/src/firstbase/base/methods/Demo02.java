package firstbase.base.methods;

public class Demo02 {
    public static void main(String[] args) {
        int results = max(3, 3);
        System.out.println(results);
        double res = max(1.232, 1.212);
        System.out.println(res);
    }
    // 比大小
    public static int max(int numone, int numtwo){
        int result = 0;

        if (numone > numtwo) {
            return numone;
        } else if (numone == numtwo) {
            return 0;
        }
        else {
            return result;
        }


    }

    // 重载
    public static double max(double numone, double numtwo){
        int result = 0;

        if (numone > numtwo) {
            return numone;
        } else if (numone == numtwo) {
            return 0;
        }
        else {
            return result;
        }
    }
}
