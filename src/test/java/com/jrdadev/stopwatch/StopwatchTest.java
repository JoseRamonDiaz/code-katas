package com.jrdadev.stopwatch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopwatchTest {
    @Test
    public void testStopwatch() throws InterruptedException {
        String methodName = "testMethodName";
        Stopwatch stopwatch = new Stopwatch(methodName);
        assertEquals(methodName, stopwatch.getMethodName());
        stopwatch.start();
        Thread.sleep(1000);
        stopwatch.stop();
        assertEquals(1000, stopwatch.getMeasurement(), 10.0);
        assertEquals(methodName + " took " + stopwatch.getMeasurement() + " ms", stopwatch.toString());
    }
}
