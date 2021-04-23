package com.zql.commandmode;

public class RemoteMacroTest {
    public static void main(String[] args){
        Light light = new Light("卧室");
        Stereo stereo = new Stereo("卧室");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereOnWithCDCommand stereOn = new StereOnWithCDCommand(stereo);
        StereOffWithCDCommand stereOff = new StereOffWithCDCommand(stereo);

        Command[] partyOn = {lightOn,stereOn};
        Command[] partyOff = {lightOff,stereOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---Pushing Macro On");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off");
        remoteControl.offButtonWasPushed(0);
    }
}
