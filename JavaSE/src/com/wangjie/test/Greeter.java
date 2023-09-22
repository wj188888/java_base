package com.wangjie.test;

import java.awt.event.ActionEvent;
import java.time.Instant;

/**
 * @Author WangJie
 * @Create by 2023/2/21 21:53
 * @Description
 */
public class Greeter extends Thread{
    public void greet(ActionEvent event)
    {
        System.out.println("Hello, the time is " +
                Instant.ofEpochMilli(event.getWhen()));
    }
}
