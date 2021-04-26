package com.zql.templatemethod;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;
    public void init(){
        message = "Hello World,I am alive!";
        repaint();
    }
    public void start(){
        message = "现在开始";
        repaint();
    }
    public void stop(){
        message = "现在停止";
        repaint();
    }
    public void destroy(){

    }
    public void paint(Graphics g){
        g.drawString(message,5,15);
    }

}
