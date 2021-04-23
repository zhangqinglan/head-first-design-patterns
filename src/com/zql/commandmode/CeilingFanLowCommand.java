package com.zql.commandmode;

public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;//增加局部状态以便追踪吊扇之前的速度。

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    public void undo(){
        if(prevSpeed==CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed==CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed==CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed==CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
