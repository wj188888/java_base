# Swing
## JFrame
**标签居中代码：**
```aidl
package lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}

class MyJframe2 extends JFrame {
    public void init(){
        this.setBounds(10,10,200,300);
        this.setVisible(true);
        JLabel label = new JLabel("欢迎来到java系列节目");
        this.add(label);
        // 让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER); // 使用这个实例化的label并垂直居中


        // 获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.YELLOW);

    }
}
```
## 弹窗
**DialogFrame弹窗：**

```aidl
package lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {

    public DialogDemo() throws HeadlessException {
        this.setVisible(true);
        this.setSize(700,500);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame 放东西，容器
        Container container = this.getContentPane();
        // 绝对布局
        container.setLayout(null);

        // 按钮
        JButton button = new JButton("点击弹出一个对话框"); // 创建
        button.setBounds(30,30,200,50);

        // 点击这个按钮的时候，弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹窗
                MyDialogDemo myDialogDemo = new MyDialogDemo();
            }
        });
        container.add(button);

    }

    public static void main(String[] args) {
        // main
        new DialogDemo();
    }
}

// 弹窗的窗口
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        // 因为弹窗自带关闭内容；下一句不用
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 设置默认操作关闭

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("王杰弹窗"));
    }
}
```
## 标签
label
`new Label("名称);`
**图标 icon**
- Icon接口

**图标icon**
```aidl
package lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame{

    public ImageIconDemo() {
        // 获取图片的地址
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("icon.png");

        ImageIcon imageIcon = new ImageIcon(url);// 命名不能冲突
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}

```

## 面板
**JPanel**
```aidl
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

```
**JScroll,滚动条**
```aidl
package lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {

    public JScrollDemo() throws HeadlessException {
        Container container = this.getContentPane();

        // 文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("欢迎学习java");

        JScrollPane scrollPane = new JScrollPane(textArea); // 放在scrollPanel中s
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}

```
## 按钮
- 单选按钮
```aidl
package lesson05;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame{
    public JButtonDemo02() throws HeadlessException {
        Container container = this.getContentPane();
        URL resource = JButtonDemo02.class.getResource("icon.png");// 获取图片路径
        Icon icon = new ImageIcon(resource);

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
```
- 复选按钮
```aidl
package lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame{
    public JButtonDemo03() throws HeadlessException {
        Container container = this.getContentPane();

        // 多选框
        JCheckBox checkBox01 = new JCheckBox("checkBox01");
        JCheckBox checkBox02 = new JCheckBox("checkBox02");
        container.add(checkBox01,BorderLayout.NORTH);
        container.add(checkBox02,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo03();
    }
}

```
## 下拉列表
```aidl
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

```

## 列表框
```aidl
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

```
### 应用场景
- 选择地区，或者一些单个选项
- 列表，展示信息，一般是动态扩容！

## 文本框
- 文本框

```aidl
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


```
- 密码框

```aidl
package lesson06;

import javax.swing.*;
import java.awt.*;

// 密码框
public class TestDemo02 extends JFrame{
    public TestDemo02() throws HeadlessException {
        Container container = this.getContentPane();


        // 密码框
        JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setEchoChar('^'); // 这里是char类型
        JPasswordField passwordField2 = new JPasswordField();
        JPasswordField passwordField3 = new JPasswordField();
        container.add(passwordField1,BorderLayout.NORTH);
        container.add(passwordField2,BorderLayout.SOUTH);
        container.add(passwordField3);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestDemo02();
    }
}
```
- 文本域

```aidl
package lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {

    public JScrollDemo() throws HeadlessException {
        Container container = this.getContentPane();

        // 文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("欢迎学习java");

        JScrollPane scrollPane = new JScrollPane(textArea); // 放在scrollPanel中s
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
```
