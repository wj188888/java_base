package com.wangjie.Base01;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        Arrays.asList(new String[]{"a","b","c"});

        list.add("1231231szz"); // 在尾部添加
        list.add("1231231szzbbb");
        list.offer("1231231szzkkk"); // 在尾部添加
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);
        list.addLast("131saa"); // 在最后一个添加
        list.addFirst("888111eacx"); // 在首部添加一个
        LinkedList<String> l3 = (LinkedList<String>) list.clone(); // 复制list
        System.out.println("l3: " + l3);
        System.out.println("list: " + list);
        System.out.println("list双向链表第一个" + list.getFirst());
        //list.clear(); // 清空
        System.out.println("list: " + list);
        //System.out.println(list.getFirst()); // 如果list为空，报错NoSuchElementException
        System.out.println("查看list的值的下标值：" + list.indexOf("1231231szz"));
        System.out.println(list.peek()); // 获取这个list的第一个值
        System.out.println(list);
        list.poll(); // 检索并删除list的第一个值
    }
}
