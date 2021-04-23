package com.zql.commandmode;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    //前一个命令被记录在这里
    Command undoCommand;

    public RemoteControlWithUndo(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i<7;i++){
            onCommands[i]= noCommand;
            offCommands[i]= noCommand;
        }
        undoCommand = noCommand;
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
    @Override
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------遥控-------\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot "+i+"]"+onCommands[i].getClass().getName()+" "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();

    }
}
