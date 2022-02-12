package com.wangjie.snakegame;

import javax.swing.*;
import java.net.URL;

public class Data {

    /*
    - 相对路径
    - 绝对路径 / 相当于当前的项目
     */
    public static URL headerURL = Data.class.getResource("/GUI/statics/header.png");
    public static URL upURL = Data.class.getResource("/GUI/statics/up.png");
    public static URL downURL = Data.class.getResource("/GUI/statics/down.png");
    public static URL leftURL = Data.class.getResource("/GUI/statics/left.png");
    public static URL rightURL = Data.class.getResource("/GUI/statics/right.png");
    public static URL bodyURL = Data.class.getResource("/GUI/statics/body.png");
    public static URL foodURL = Data.class.getResource("/GUI/statics/food.png");

    public static ImageIcon header = new ImageIcon(headerURL);
    public static ImageIcon up = new ImageIcon(upURL);
    public static ImageIcon down = new ImageIcon(downURL);
    public static ImageIcon left = new ImageIcon(leftURL);
    public static ImageIcon right = new ImageIcon(rightURL);
    public static ImageIcon body = new ImageIcon(bodyURL);
    public static ImageIcon food = new ImageIcon(foodURL);



}
