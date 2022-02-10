package ex01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Testlayout {
    public static void main(String[] args) {

        Frame frame = new Frame("TestBorderLayout");

        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");
        Button btn7 = new Button("btn7");
        Button btn8 = new Button("btn8");
        Button btn9 = new Button("btn9");
        Button btn10 = new Button("btn10");

        frame.setBackground(Color.black);
        frame.setLocation(500, 400);
        frame.setSize(700,500);

        frame.setLayout(new GridLayout(2,1));
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setVisible(true);
        panel1.setLayout(new GridLayout(1,3));
        panel1.add(btn1, BorderLayout.WEST);
        panel1.add(panel3);
        panel1.add(btn2, BorderLayout.EAST);
        panel3.setLayout(new GridLayout(2,1));
        panel3.add(btn3, BorderLayout.NORTH);
        panel3.add(btn4, BorderLayout.SOUTH);
//        System.out.println("==========上半部分==========");
        panel2.setLayout(new GridLayout(1,3));
        panel2.add(btn5, BorderLayout.WEST);

        panel2.add(panel4);
        panel2.add(btn6, BorderLayout.EAST);
        panel4.setLayout(new GridLayout(2,2));
        panel4.add(btn7);
        panel4.add(btn8);
        panel4.add(btn9);
        panel4.add(btn10);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
