package firstbase.base.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        /*
        for (初始化;布尔表达式;迭代) {
            //循环体
        }
         */
        int a = 1;
        while (a<=100) {
            System.out.println(a);
            a++;
        }
        System.out.println("while循环结束");

        // 初始化值，条件，迭代
        for (int i=1; i<=100; i++) {
            System.out.println(i);
        }
        System.out.println("for循环结束");

        /**
         * for 循环是支持迭代的一种通用结构，是最有效，最灵活的循环结构；
         *
         */
        // 高效写法是100.for高端啊

        /*
        for(; ; ;) {
            //死循环
        }
         */
    }
}
