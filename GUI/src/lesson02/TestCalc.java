package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();

//        calculator1.windowClose(calculator1);
    }
}


// 计算器类
class Calculator extends Frame{
    TextField num1, num2, num3;
    public void loadFrame(){
        // 3个文本框
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        // 1个按钮
        Button button = new Button("=");

        // 1个标签
        Label label = new Label("+");
        // 给button加上监听事件
        button.addActionListener(new MyCalculatorListener());
        // 流式布局
        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }

    public void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // 内部类最大的好处，就是可以畅通无阻的访问外部的方法和属性！
    // 监听器类
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) throws NullPointerException {
            // 1. 获得加数和被加数
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(""+(n1+n2));
            num1.setText("");
            num2.setText("");
        }
    }
}


