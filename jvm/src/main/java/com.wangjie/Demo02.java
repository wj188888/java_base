package com.wangjie;

public class Demo02 {
    public static void main(String[] args) {
        // 返回虚拟机视图使用的最大内存
        long max = Runtime.getRuntime().maxMemory();
        //返回jvm的总内存
        long total = Runtime.getRuntime().totalMemory();

        System.out.println("max = "+ max + "字节\t" + (max/(double)1024/1024)+"MB");
        System.out.println("total = "+ total + "字节\t" + (total/(double)1024/1024)+"MB");
        // 默认情况下 ，分配的总内存，是电脑内存的1/4左右，而初始化的内存是电脑内存的1/64;

        /*
        OOM：解决方案：
        1.尝试扩大堆内存看结果
        2.分析内存，看一下哪个地方出现了问题（专业工具）
        新生代+老年代=981.5M
        元空间：逻辑上存在，物理上不存在；
        */
    }
}
