package com.wangjie.test.javadoc;

/**
 * @author WangJie
 * @time 2023/3/1 17:13
 * @description 测试javadoc文件注释的类
 */
public class Doc {
    String name;
    int n=5;
    int m=6;
    /**
     * @author WangJie
     * @version jdk1.8.0
     * @since 1.0
     * @param n 参数1
     * @param m 参数2
     * @return 返回他们的和
     * @Description 将两个数相加求和
     */
    public int add(int n, int m) {
        int sum = 0;
        if (n<m){
            m--;
        }else {
            System.out.println(n);
        }
        return sum;
    }

    /**
     * 返回学生的名字
     * @param name 录入学生的姓名
     * @return name 输出学生姓名
     * @throws Exception 异常抛出
     */
    public String student(String name) throws  Exception{
        name="ling";
        return name;
    }
}
