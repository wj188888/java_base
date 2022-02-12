package lesson05;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    public JPanelDemo() {
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(2,1,10,10));

        JPanel panel1 = new JPanel(new GridLayout(1,3));
        JPanel panel2 = new JPanel(new GridLayout(1,2));
        JPanel panel3 = new JPanel(new GridLayout(2,1));
        JPanel panel4 = new JPanel(new GridLayout(3,2));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel2.add(new JButton("4"));
        panel2.add(new JButton("5"));
        panel3.add(new JButton("6"));
        panel3.add(new JButton("7"));
        panel4.add(new JButton("8"));
        panel4.add(new JButton("9"));
        panel4.add(new JButton("10"));
        panel4.add(new JButton("11"));
        panel4.add(new JButton("12"));
        panel4.add(new JButton("13"));

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
