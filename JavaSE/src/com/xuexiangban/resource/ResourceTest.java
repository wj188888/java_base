package com.xuexiangban.resource;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import javax.swing.*;

/**
 * @Classname ResourceTest
 * @Date 2022/11/20 22:17
 * @Author wangjie
 */
public class ResourceTest {
    public void zz() {
        System.out.println("print zz");
    }
    public static void main(String[] args) {

        Class cl = ResourceTest.class;
        URL aboutURL = cl.getResource("./wjview.png");
        ImageIcon icon = new ImageIcon(aboutURL);

        System.out.println(icon.getIconHeight());
        System.out.println(icon.getIconWidth());
        System.out.println(icon.getImageLoadStatus());
        System.out.println(icon.getImageObserver());
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getAnnotatedSuperclass());
        System.out.println(cl.getAnnotations());
        System.out.println(cl.hashCode());
    }
}
