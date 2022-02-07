package firstbase.base.array;

import static jdk.internal.org.objectweb.asm.Type.getType;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[][] a = {{1,2,34,5422,2131,21,42,2,234},{1,2}};
        int as = 1;
        System.out.println(a); // 打印是地址
        // 打印数组Array.toString元素
        System.out.println(a.toString());
        System.out.println(getType(a));

    }

    private static String getType(Object a) {
        return a.getClass().toString();
    }
}
