package com.jrda.design_patterns.prototype.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShapesTest {
    @Test
    public void testCircle(){
        Circle circle = new Circle();
        circle.radius = 3.1416;
        circle.x = 1;
        circle.y = 2;
        circle.color = "Blue";

        Circle clonedCircle = (Circle) circle.clone();

        //They are equals in values
        assertEquals(circle, clonedCircle);
        //But different in memory
        assertFalse(circle == clonedCircle);
    }
}
