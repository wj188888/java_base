package com.wangjie.snakegame;

import javax.swing.*;

// 游戏的主启动类
public class StartGame extends JFrame {
    public static void main(String[] args) {
        // JFrame对象实例化
        JFrame frame = new JFrame();
        // 实例化一个面板
        JPanel panel = new GamePanel();
        // 在frame添加一个panel;
        frame.add(panel);

        // 设置固定的窗口大小
        frame.setBounds(10,10,900,720);
        // 窗口大小不可变
        frame.setResizable(false);
        // 关闭Frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // frame显示出来,正常游戏界面都应该在面板上,不是在Frame上
        frame.setVisible(true);
    }
}
