package com.wangjie.Base01;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        Arrays.asList(new String[]{"a","b","c"});

        list.add("1231231szz");
        list.add("1231231szz");
        list.offer("1231231szz");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);

        list.element();
    }
}
