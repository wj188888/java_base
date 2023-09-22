package com.wangjie.test.DingShiqi;


import com.wangjie.test.service.ActionListener;

import javax.swing.*;

/**
 * @Author WangJie
 * @Create by 2023/2/17 21:37
 * @Description
 */
class TimePrinterTest {

    public static void main(String[] args) {

        ActionListener listener = new TimePrinter();
        Timer t = new Timer(5000,  listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}