package lesson03;

import java.awt.*;

// 测试画笔
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}


class MyPaint extends Frame {
    public void loadFrame(){

        setBounds(200,200,600,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // 第一步：画笔需要有颜色
        g.setColor(Color.red);

        // 第二部：画笔形状
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100); // 实心圆
        g.setColor(Color.GREEN);
        g.fillRect(200,100,200,100);
        repaint();//重新画

        // 值得注意的是，画笔用完，将他还原到最初颜色
    }
}