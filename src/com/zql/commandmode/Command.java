package com.zql.commandmode;

public interface Command {
    public void execute();
    //增加撤销功能
    public void undo();
}
