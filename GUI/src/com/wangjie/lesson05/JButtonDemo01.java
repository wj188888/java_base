package com.wangjie.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

// 回顾GUI事件监听
public class JButtonDemo01 extends JFrame {
    public JButtonDemo01() throws HeadlessException {
        Container container = this.getContentPane();
        URL resource = JButtonDemo01.class.getResource("icon.png"); // 获取图片路径
        Icon icon = new ImageIcon(resource);

        // 把图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("这是一个图片按钮");
        container.add(button);

        this.setVisible(true);
        this.setBounds(500,300,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
