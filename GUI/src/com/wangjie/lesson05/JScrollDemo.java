package com.wangjie.lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {

    public JScrollDemo() throws HeadlessException {
        Container container = this.getContentPane();

        // 文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("欢迎学习java");

        JScrollPane scrollPane = new JScrollPane(textArea); // 放在scrollPanel中s
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
