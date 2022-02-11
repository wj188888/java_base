# 画笔
- 第一步：画笔要有颜色
- 第二步：画笔画出什么形状，和位置
- 第三步：画完这个后，还原成初始状态的画笔颜色

# 鼠标监听
**目的：**
- 想要鼠标画画

*思路解析*：
1. 面板
2. 画笔

**第一步**：
- 首先要有鼠标监听事件，鼠标去监听画笔的动作
- 然后将画的这个点存到集合中去，然后画笔去读存在的点
- 然后在画板上显示；

**第二步：**
- 鼠标每点击一次就去重画一次，repaint();

# 窗口监听
```aidl
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
```
# 键盘监听
```aidl
package lesson03;

import javafx.animation.KeyFrame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyBoardFrame();
    }
}


class KeyBoardFrame extends Frame {
    public KeyBoardFrame() {
        setBounds(1,2,300,400);
        setBackground(Color.BLACK);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下触发事件");
                int keyCode = e.getKeyCode(); // 不需要记住这个数值，直接使用就可以了
                System.out.println(keyCode);
                e.getKeyCode(); // 获取当前键盘的码
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键退出成功");
                    System.exit(0);
                }
                // 根据按下不同的内容，就会进入不同的内容;
            }
        });
    }
}
```