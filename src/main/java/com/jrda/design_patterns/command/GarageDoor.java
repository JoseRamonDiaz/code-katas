package com.jrda.design_patterns.command;

public class GarageDoor {
    private GarageDoorUpCommand garageDoorUpCommand;
    private GarageDoorDownCommand garageDoorDownCommand;

    public GarageDoor(){
        Door door = new Door();
        garageDoorUpCommand = new GarageDoorUpCommand(door);
        garageDoorDownCommand = new GarageDoorDownCommand(door);
    }

    public String up(){
        return garageDoorUpCommand.execute();
    }

    public String down(){
        return garageDoorDownCommand.execute();
    }
}
