package com.wangjie.javaCoreTech.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author WangJie
 * @Create by 2023/1/28 14:49
 * @Description
 */
public class JavaTest {
    public static void main(String[] args) {

        HashMap<EnumEx, Enum> map = new HashMap<>();
        map.put(new EnumEx(21, "wangjie"), EnumEx.Size.large);
        map.put(new EnumEx(98, "HuYa"), EnumEx.Size.extra_large);
        map.put(new EnumEx(34, "LiXiaoLong"), EnumEx.Size.small);
        map.put(new EnumEx(21, "LiuHuanLaoShi"), EnumEx.Size.medium);

        // 方法一
        //map.forEach((key, value) -> System.out.println("key:" + key + "value: " + map.get(key)));
        // 方法二
        Iterator<Map.Entry<EnumEx, Enum>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<EnumEx, Enum> entry = iterator.next();
            System.out.println("key:" + entry.getKey() + "value: " + entry.getValue());
        }

        // 方法三
        //for (EnumEx key: map.keySet()
        //     ) {
        //    System.out.println("key:" + key + "value: " + map.get(key));
        //}

    }
}
