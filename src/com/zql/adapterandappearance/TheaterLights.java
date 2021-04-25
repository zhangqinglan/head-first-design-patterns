package com.zql.adapterandappearance;

public class TheaterLights {
    public TheaterLights(){
    }
    public void on(){
        System.out.println("打开剧院灯");
    }
    public void off(){
        System.out.println("关闭剧院灯");
    }
    public void dim(int n){
        System.out.println("调暗剧院灯为"+n);
    }
}
