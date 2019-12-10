package com.jrda.design_patterns.command;

public class GarageDoorUpCommand implements Command {
    private Door door;

    public GarageDoorUpCommand(Door door){
        this.door = door;
    }

    @Override
    public String execute() {
        return door.up();
    }
}
