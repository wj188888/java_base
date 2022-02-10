package lesson02;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestText01 {
    public static void main(String[] args) {
        // 只管启动
        MyFrame myFrame1 = new MyFrame();
        myFrame1.windowClose(myFrame1);
    }
}

class MyFrame extends Frame{
    public MyFrame() {

        // 无参构造器
        TextField textField = new TextField();
        add(textField);
        
        // 监听这个文本框的内容
        /*
        第一步：先申请一个监听器对象
        第二步：然后获得一个内容
         */
        MyActionListener2 myActionListener2 = new MyActionListener2();
        // 按下enter，就会发送这个事件;
        textField.addActionListener(myActionListener2);

        // 设置替换编码
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
    public void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyActionListener2 implements ActionListener{
    // 监听的一切事情东西都放在这里
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource(); // 获得一些资源，返回的一个对象
        System.out.println(field.getText()); // 获得输入框的文本
        field.setText(""); // null,将这个文本框输入后就为空
    }
}
