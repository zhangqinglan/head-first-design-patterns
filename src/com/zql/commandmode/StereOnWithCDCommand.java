package com.zql.commandmode;

public class StereOnWithCDCommand implements Command{
    Stereo stereo;
    public StereOnWithCDCommand(Stereo stereo){

        this.stereo = stereo;

    }
    @Override
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
    public void undo(){
        stereo.off();
    }
}
