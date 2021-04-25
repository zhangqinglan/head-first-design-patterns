package com.zql.adapterandappearance;

public class HomeTheaterTestDrive {
    public static void main(String[] args){
        //实例化组件
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,tuner,dvd,cd,projector,lights,screen,popper);
        homeTheater.watchMovie("哈利波特");
        homeTheater.endMovie();
    }
}
