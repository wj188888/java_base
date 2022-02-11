package lesson04;

import javax.swing.*;

public class JFrameDemo {

    // init();初始化方法
    public void init(){
        JFrame frame = new JFrame();
        frame.setTitle("这是一个JFrame的窗体");
        frame.setBounds(500,400,200,200);
        frame.setVisible(true);

        // 设置文字 Jlabel
        JLabel label = new JLabel("欢迎来到java系列节目");
        frame.add(label);

        // 容器实例化


        // 关闭事件
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // 建立一个窗口
        new JFrameDemo().init();

    }
}
