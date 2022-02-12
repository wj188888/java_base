package com.wangjie.snakegame;

import javax.swing.*;

// 游戏的主启动类
public class StartGame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new GamePanel();
        frame.add(panel);

        frame.setBounds(10,10,900,720); // 设置固定的窗口大小
        frame.setResizable(false); // 窗口大小不可变
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 正常游戏界面都应该在面板上

        frame.setVisible(true);
    }
}
