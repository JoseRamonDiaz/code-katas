package com.jrda.design_patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GarageDoorTest {
    @Test
    public void testDoorUp(){
        GarageDoor garageDoor = new GarageDoor();

        assertEquals("Closing the door", garageDoor.down());
        assertEquals("Opening the door", garageDoor.up());
    }
}
