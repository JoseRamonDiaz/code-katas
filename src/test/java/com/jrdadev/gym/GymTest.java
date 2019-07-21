package com.jrdadev.gym;

import org.junit.Test;

public class GymTest {
    @Test
    public void testVigency(){
        Gym gym = new Gym();

        gym.isVigent("1234");
    }
}
