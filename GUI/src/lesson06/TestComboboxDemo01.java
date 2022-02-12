package lesson06;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo01 extends JFrame {
    public TestComboboxDemo01() throws HeadlessException {
        Container container = this.getContentPane();

        JComboBox status = new JComboBox();
        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemo01();
    }
}
