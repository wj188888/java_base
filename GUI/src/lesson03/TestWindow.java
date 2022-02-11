package lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}


class WindowFrame extends Frame{
    public WindowFrame() throws HeadlessException {
        setBackground(Color.BLUE);
        setBounds(100,100,200,200);
        setVisible(true);
//        addWindowListener(new MyWindowListener());

        this.addWindowListener(new WindowAdapter() {
            // 关闭窗口
            // 匿名内部类
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("你点击的x");
            }

            @Override
            public void windowOpened(WindowEvent e) {

                System.out.println("windowOpened");

            }
            // 激活窗口, 关闭窗口和激活窗口用的比较多
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame source =(WindowFrame) e.getSource();
                source.setTitle("被激活了");
                System.out.println("windowActivated");
            }
        });
    }

}
