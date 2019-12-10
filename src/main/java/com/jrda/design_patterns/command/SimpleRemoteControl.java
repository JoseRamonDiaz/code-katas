package com.jrda.design_patterns.command;

public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command){
        slot = command;
    }

    public String buttonWasPressed(){
        return slot.execute();
    }
}
