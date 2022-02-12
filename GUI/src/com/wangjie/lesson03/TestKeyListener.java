package com.wangjie.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyBoardFrame();
    }
}


class KeyBoardFrame extends Frame {
    public KeyBoardFrame() {
        setBounds(1,2,300,400);
        setBackground(Color.BLACK);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下触发事件");
                int keyCode = e.getKeyCode(); // 不需要记住这个数值，直接使用就可以了
                System.out.println(keyCode);
                e.getKeyCode(); // 获取当前键盘的码
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键退出成功");
                    System.exit(0);
                }
                // 根据按下不同的内容，就会进入不同的内容;
            }
        });
    }
}