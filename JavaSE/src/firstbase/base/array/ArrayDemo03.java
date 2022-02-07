package firstbase.base.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        int[] res = reverse(arrays);
        printArray(res);
    }

    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] +"\t");
        }
    }
    // 反转数组
    public static int[] reverse(int[] arrays){
        int[] res = new int[arrays.length];
        for (int i = 0, j = res.length-1; i < res.length; i++,j--) {
            res[j] = arrays[i];
        }
        return res;
    }
}
