package com.jrda.design_patterns.command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public String execute() {
        return light.on();
    }
}
