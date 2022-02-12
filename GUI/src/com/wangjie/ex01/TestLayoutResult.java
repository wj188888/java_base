package com.wangjie.ex01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestLayoutResult {
    public static void main(String[] args) {
        // 总
        Frame frame = new Frame("TestLayoutResult");
        frame.setLocation(500,400);
        frame.setSize(700,500);
        frame.setBackground(Color.black);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        // 4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3= new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        p1.add(new Button("West-1"),BorderLayout.WEST);
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2,BorderLayout.CENTER);

        p3.add(new Button("West-2"),BorderLayout.WEST);
        p3.add(new Button("East-2"),BorderLayout.EAST);
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("for-"+i));
        }
        p3.add(p4, BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

        // 关闭这个窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
