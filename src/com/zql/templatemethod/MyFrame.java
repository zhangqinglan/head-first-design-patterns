package com.zql.templatemethod;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "Lisa";
        graphics.drawString(msg,250,250);
    }
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("设计模式");
    }
}
