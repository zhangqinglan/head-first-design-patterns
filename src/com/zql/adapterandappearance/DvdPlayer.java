package com.zql.adapterandappearance;

public class DvdPlayer {
    public DvdPlayer(){}
    public void on(){
        System.out.println("打开DVD");
    }
    public void play(String movie){
        System.out.println("播放DVD"+movie);
    }
    public void stop(){
        System.out.println("暂停DVD");
    }
    public void eject(){
        System.out.println("弹出DVD");
    }
    public void off(){
        System.out.println("关闭DVD");
    }
}
