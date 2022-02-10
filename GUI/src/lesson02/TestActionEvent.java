package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();

        // 因为，addActionListener需要一个ActionLister,所以我们需要狗仔一个 ActionListener
        MyActionLister myActionLister = new MyActionLister();
        button.addActionListener(myActionLister);

        frame.add(button,BorderLayout.CENTER);
        frame.pack(); // 自适应
        windowClose(frame);
        frame.setVisible(true);

        // 网络编程: 按下！

    }

    // 关闭窗体的事件
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

// 事件监听
class MyActionLister implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击一下");
    }
}