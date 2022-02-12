package lesson05;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame{
    public JButtonDemo02() throws HeadlessException {
        Container container = this.getContentPane();

        // 单选框
        JRadioButton radioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton02 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton03 = new JRadioButton("JRadioButton01");

        // 由于单选框只能选择一个，分组,一个组中只能选一个
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);

        container.add(radioButton01, BorderLayout.CENTER);
        container.add(radioButton02, BorderLayout.NORTH);
        container.add(radioButton03, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
