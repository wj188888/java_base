package com.wangjie.snakegame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    // 绘制面板,我们游戏中所有东西，都是用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 清屏
        this.setBackground(Color.BLACK);
    }

}
