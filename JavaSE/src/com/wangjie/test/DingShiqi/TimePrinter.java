package com.wangjie.test.DingShiqi;

import com.wangjie.test.service.ActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.Instant;

/**
 * @Author WangJie
 * @Create by 2023/2/17 21:33
 * @Description
 */
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " +
                Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
