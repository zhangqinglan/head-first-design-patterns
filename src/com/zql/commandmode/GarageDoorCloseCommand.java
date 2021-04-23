package com.zql.commandmode;

public class GarageDoorCloseCommand {
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;

    }

    public void execute(){
        garageDoor.down();
    }
}
