package com.zql.commandmode;

public class RemoteLoaderCeilingFan {
    public static void main(String[] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanNewOffCommand ceilingFanOff = new CeilingFanNewOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanMedium,ceilingFanOff);
        remoteControl.setCommand(1,ceilingFanHigh,ceilingFanOff);
        remoteControl.onButtonWasPushed(0);//首先，以中速开启吊扇
        remoteControl.offButtonWasPushed(0);//然后关闭
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();//撤销，回到中速

        remoteControl.onButtonWasPushed(1);//开启高速
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();//撤销，回到中速
    }
}
