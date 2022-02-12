package com.wangjie.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {

    public DialogDemo() throws HeadlessException {
        this.setVisible(true);
        this.setSize(700,500);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame 放东西，容器
        Container container = this.getContentPane();
        // 绝对布局
        container.setLayout(null);

        // 按钮
        JButton button = new JButton("点击弹出一个对话框"); // 创建
        button.setBounds(30,30,200,50);

        // 点击这个按钮的时候，弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹窗
                MyDialogDemo myDialogDemo = new MyDialogDemo();
            }
        });
        container.add(button);

    }

    public static void main(String[] args) {
        // main
        new DialogDemo();
    }
}

// 弹窗的窗口
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        // 因为弹窗自带关闭内容；下一句不用
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 设置默认操作关闭

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("王杰弹窗"));
    }
}
