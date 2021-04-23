package com.zql.commandmode;

public class StereOffWithCDCommand implements Command{
    Stereo stereo;
    public StereOffWithCDCommand(Stereo stereo){

        this.stereo = stereo;

    }
    public void execute(){
        stereo.off();
    }
    public void undo(){
        stereo.on();
    }
}
