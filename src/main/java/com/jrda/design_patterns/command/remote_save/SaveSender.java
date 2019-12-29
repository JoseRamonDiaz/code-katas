package com.jrda.design_patterns.command.remote_save;

public class SaveSender {
    private Command command;

    public String executeCommand(){
        return command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
