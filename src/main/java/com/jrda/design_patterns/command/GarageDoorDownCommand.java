package com.jrda.design_patterns.command;

public class GarageDoorDownCommand implements Command {
    private Door door;

    public GarageDoorDownCommand(Door door){
        this.door = door;
    }

    @Override
    public String execute() {
        return door.down();
    }
}
