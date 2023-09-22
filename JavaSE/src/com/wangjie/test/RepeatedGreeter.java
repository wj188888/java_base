package com.wangjie.test;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @Author WangJie
 * @Create by 2023/2/21 21:55
 * @Description
 */
public class RepeatedGreeter extends Greeter{
    public void greet(ActionEvent event)
    {
        Timer timer = new Timer(5000, super::greet);
        timer.start();
    }

    public static void main(String[] args) {

        RepeatedGreeter greeter = new RepeatedGreeter();
        ActionEvent str = new ActionEvent(greeter, 1, "print 1s");
        greeter.greet(str);
    }
}
