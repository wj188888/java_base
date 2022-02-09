package lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Panel 可以看成是一个空间,但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        // 布局的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        // 初始坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,161, 35));

        // panel 设置坐标,相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(0xC20303));

        // frame.add(panel)
        frame.add(panel);

        frame.setVisible(true);

        // 监听事件, 监听窗口关闭事件
        // 适配器模式: 就是写其中的某一种父类方法进行重写
        // 一种是WindowListener这种模式，是直接去重写所有父类的方法
        frame.addWindowListener(new WindowAdapter() {
            // 窗口关闭所需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // 0是正常退出，1是有异常的退出
            }
        });
    }
}
