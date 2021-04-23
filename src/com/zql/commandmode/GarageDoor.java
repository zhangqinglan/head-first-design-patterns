package com.zql.commandmode;

public class GarageDoor {
    String name;
    public GarageDoor(String name){
        this.name = name;
    }
    //public GarageDoor(){}
    public void up(){
        System.out.println("打开车库门");
    }
    public void down(){
        System.out.println("关闭车库门");
    }
}
