package com.zql.adapterandappearance;

public class Amplifier {
    public Amplifier(){}
    public void on(){
        System.out.println("打开扩音器");
    }
    public void setDvd(){
        System.out.println("设置DVD");
    }
    public void setSurroundSound(){
        System.out.println("设置环绕声");
    }
    public void setVolume(int n){
        System.out.println("设置音量为"+n);
    }

    public void off(){
        System.out.println("关闭音效");
    }

}
