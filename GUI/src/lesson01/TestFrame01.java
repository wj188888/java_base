package lesson01;

import java.awt.*;

public class TestFrame01 {
    public static void main(String[] args) {
        // Frame, JDK,看源码
        Frame f1 = new Frame("我的第一个窗口java界面");

        // 需要设置可见性
        f1.setVisible(true);

        // 设置窗口大小
        f1.setSize(400,400);

        // 设置背景颜色
        f1.setBackground(Color.black);
//        f1.setBackground(new Color(61, 155, 55)); // 自定义颜色

        // 弹出的初始化位置
        f1.setLocation(200,200);
        //设置大小固定
        f1.setResizable(false);

    }
}
