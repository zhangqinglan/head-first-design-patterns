package com.zql.commandmode;

public class Stereo {
    String name;
    public Stereo(String name){
        this.name = name;
    }
    //public Stereo(){}
    public void on(){
        System.out.println("打开音响");
    }
    public void off(){
        System.out.println("关闭音响");
    }
    public void setCD(){
        System.out.println("设置播放CD");
    }
    public void setVolume(int n){
        System.out.println("设置音量为"+n);
    }
}
