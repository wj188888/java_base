package lesson04;

import javax.swing.*;
import java.awt.*;

// 图标，需要实现类，Frame继承
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;

    public IconDemo(int width, int height) throws HeadlessException {
        this.width = width;
        this.height = height;
    }

    public void init(){
        IconDemo iconDemo = new IconDemo(15,15);
        JLabel label = new JLabel("icontest", iconDemo, SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // main
    public static void main(String[] args) {
        new IconDemo(15,15).init();

    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}
