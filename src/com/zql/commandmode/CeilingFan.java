package com.zql.commandmode;

public class CeilingFan {
    String name;
    public CeilingFan(String name){
        this.name = name;
    }
    //public CeilingFan(){}
    public void on(){
        System.out.println("打开吊扇");
    }
/*    public void off(){
        System.out.println("关闭吊扇");
    }*/

    //使用状态实现撤销
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public void high(){
        speed = HIGH;
        System.out.println("高速");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("中速");
    }

    public void low(){
        speed = LOW;
        System.out.println("低速");
    }

    public void off(){
        speed = OFF;
        System.out.println("关闭吊扇");
    }

    public int getSpeed(){
        return speed;
    }

}
