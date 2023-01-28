package com.wangjie.javaCoreTech.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author WangJie
 * @Create by 2023/1/28 14:08
 * @Description
 */
public class JavaFaceTest {
    public static void main(String[] args) {

        // 向上取整数
        long round = Math.round(6.7);
        System.out.println(round);

        // 取反
        StringBuffer b1 = new StringBuffer("zhangshan");
        b1.append(12);
        b1.append(78);
        System.out.println(b1.reverse()); // reverse()方法的修改会直接细节该这个值，修改后引用的值也会跟着变
        System.out.println(b1);

        HashMap<EnumEx, Enum> map = new HashMap<>();
        map.put(new EnumEx(21, "wangjie"), EnumEx.Size.large);
        map.put(new EnumEx(98, "HuYa"), EnumEx.Size.extra_large);
        map.put(new EnumEx(34, "LiXiaoLong"), EnumEx.Size.small);
        map.put(new EnumEx(21, "LiuHuanLaoShi"), EnumEx.Size.medium);

        // 遍历map方法一
        //for (EnumEx key: map.keySet())
        //{
        //    System.out.println("key: " + key + ", value " + map.get(key));//取键值对
        //}
        //System.out.println(map.values()); // 取所有的值

        // 遍历map方法二 lambda
        //map.forEach((key, value) ->
        //    System.out.println("key: " + key + ", value " + map.get(key))//取键值对
        //);

        // 遍历map方法三迭代器
        Iterator<Map.Entry<EnumEx, Enum>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<EnumEx, Enum> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + "value:" + entry.getValue());
        }
    }
}
