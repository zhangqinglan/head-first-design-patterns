package com.zql.adapterandappearance;
//构造家庭影院外观
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper){
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;

    }
    public void watchMovie(String movie){
        System.out.println("准备观看电影");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie(){
        System.out.println("关闭电影");
        popper.off();

        lights.on();
        screen.up();
        projector.off();

        amp.off();

        dvd.stop();
        dvd.off();
    }
}
