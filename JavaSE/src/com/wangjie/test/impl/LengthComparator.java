package com.wangjie.test.impl;

import com.wangjie.test.service.Comparator;

/**
 * @Author WangJie
 * @Create by 2023/2/17 22:10
 * @Description
 */
public class LengthComparator implements Comparator<String> {

    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
