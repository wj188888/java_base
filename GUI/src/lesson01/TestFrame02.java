package lesson01;

import java.awt.*;

public class TestFrame02 {
    public static void main(String[] args) {
        // 展示多个窗口 new
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.red);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.pink);
    }
}

class MyFrame extends Frame {
    static int id = 0; // 可能存在多个窗口，我们需要计数器

    public MyFrame(int x, int y, int w, int h,Color color) throws HeadlessException {
        super("Myframe+"+(++id));
        setBackground(color); // 设置背景颜色
        setBounds(x,y,w,h); // 设置初始位置和宽高
        setVisible(true); // 可见性设置
    }
}