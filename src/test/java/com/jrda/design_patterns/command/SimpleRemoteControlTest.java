package com.jrda.design_patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleRemoteControlTest {
    @Test
    public void testTurnOnLight(){
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);

        assertEquals("Lights turned on", simpleRemoteControl.buttonWasPressed());
    }
}
