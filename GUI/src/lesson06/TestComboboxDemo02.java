package lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02() throws HeadlessException {
        Container container = this.getContentPane();


        Vector vector = new Vector();
        JList jList = new JList(vector); // 列表放内容
        vector.add("张三");
        vector.add("李四");
        vector.add("王五");

        container.add(jList);
        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemo02();
    }
}
