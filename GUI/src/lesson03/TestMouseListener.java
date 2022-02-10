package lesson03;

import java.awt.*;

// 鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("画图");

    }
}


// 自己的类
class MyFrame extends Frame{
    // 画画要有画笔，监听鼠标当前位置 需要集合存储这些点

    public MyFrame(String title){
        super(title); // 这个之前还在找构造方法来着，终于遇到你了

        setBounds(200,200,400,300);

        // 鼠标监听器
        this.addMouseListener();

    }

    @Override
    public void paint(Graphics g) {
        // 画画， 监听鼠标的事件


    }
}