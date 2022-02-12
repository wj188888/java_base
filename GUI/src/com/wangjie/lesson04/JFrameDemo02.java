package com.wangjie.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}

class MyJframe2 extends JFrame {
    public void init(){
        this.setBounds(10,10,200,300);
        this.setVisible(true);
        JLabel label = new JLabel("欢迎来到java系列节目");
        this.add(label);
        // 让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER); // 使用这个实例化的label并垂直居中


        // 获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.YELLOW);

    }
}
