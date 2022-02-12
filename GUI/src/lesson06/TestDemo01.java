package lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

// 文本框
public class TestDemo01 extends JFrame {
    public TestDemo01() throws HeadlessException {
        Container container = this.getContentPane();

        // 文本框
        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world", 20);
        container.add(textField1,BorderLayout.NORTH);
        container.add(textField2,BorderLayout.SOUTH);


        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestDemo01();
    }
}

