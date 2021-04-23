package com.zql.commandmode;

public class Light {
    String name;
    public Light(String name){
        this.name = name;
    }
    public void on(){
        System.out.println("打开"+name+"的灯");
    }
    public void off(){
        System.out.println("关闭"+name+"的灯");
    }
}
