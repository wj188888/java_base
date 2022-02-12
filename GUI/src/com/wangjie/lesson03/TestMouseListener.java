package com.wangjie.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

// 鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("画图");

    }
}


// 自己的类
class MyFrame extends Frame{
    // 画画要有画笔，监听鼠标当前位置 需要集合存储这些点
    ArrayList points;

    public MyFrame(String title){
        super(title); // 这个之前还在找构造方法来着，终于遇到你了

        setBounds(200,200,400,300);

        // 存鼠标点击的点
        points = new ArrayList<>();


        setVisible(true);

        // 鼠标监听器, 正对这个窗口
        this.addMouseListener(new MyMouseLister());
    }

    @Override
    public void paint(Graphics g) {
        // 画画， 监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }

    }
    //添加一个点到界面上
    public void addPaint(Point point){
        points.add(point);
    }


    // 如果要进行鼠标的接口 Mouse
    // 适配器模式
    private class MyMouseLister extends MouseAdapter {
        // 鼠标 按下，弹起，按住不放

        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            // 这里我们点击，界面就产生一个点!
            // 这个点就是鼠标的点
            frame.addPaint(new Point(e.getX(),e.getY()));

            // 每次点击鼠标都要重新画一遍
            frame.repaint(); // 这个是自带的,刷新,24帧就不错了
        }
    }
}