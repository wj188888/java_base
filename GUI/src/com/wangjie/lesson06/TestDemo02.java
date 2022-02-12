package com.wangjie.lesson06;

import javax.swing.*;
import java.awt.*;

// 密码框
public class TestDemo02 extends JFrame{
    public TestDemo02() throws HeadlessException {
        Container container = this.getContentPane();


        // 密码框
        JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setEchoChar('^'); // 这里是char类型
        JPasswordField passwordField2 = new JPasswordField();
        JPasswordField passwordField3 = new JPasswordField();
        container.add(passwordField1,BorderLayout.NORTH);
        container.add(passwordField2,BorderLayout.SOUTH);
        container.add(passwordField3);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestDemo02();
    }
}
