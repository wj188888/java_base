package com.wangjie;

import java.util.ArrayList;

//Dump文件
//-Xms 设备初始化内存分配大小 1/64
//-Xmx 设置最大分配内存 1/4
// -Xms8m -Xmx8m -XX:+PrintGCDetails 打印GC垃圾回收
// 这样dump： `-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError`
public class Demo03 {
    byte[] array = new byte[1*1024*1024];//1m

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int count = 0;

        try {
            while(true){
                list.add(new Demo03());
                count = count + 1;
            }
        }catch (Exception e) {
            // Throwable;Error,Exception
            System.out.println("count" + count);
            e.printStackTrace();
        }


    }
}
