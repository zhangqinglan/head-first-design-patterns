package com.zql.commandmode;

public class MacroCommand implements Command{
    Command[] commands;
    Command[] undoCommands;
    public MacroCommand(Command[] commands){
        this.commands = commands;
        //this.undoCommands =undocommands;
    }
    @Override
    public void execute(){
        for(int i = 0;i<commands.length;i++){
            commands[i].execute();
        }
    }
    public void undo(){
        for(int i = 0;i<undoCommands.length;i++){
            undoCommands[i].execute();
        }
    }
}
