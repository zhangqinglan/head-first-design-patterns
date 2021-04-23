package com.zql.commandmode;
/**
 * @author augurit
 * 命令模式将“请求”封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也可支持可撤销的操作。
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;

    }
    @Override
    public void execute(){
        garageDoor.up();
    }
    public void undo(){
        garageDoor.down();
    }
}
