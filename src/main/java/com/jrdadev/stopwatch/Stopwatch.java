package com.jrdadev.stopwatch;

public class Stopwatch {
    private String methodName;

    private long startTime;
    private long endTime;

    public Stopwatch(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void start() {
        startTime = System.nanoTime();
    }


    public void stop() {
        endTime = System.nanoTime();
    }

    public double getMeasurement() {
        return (endTime - startTime) / 1000000d;
    }

    @Override
    public String toString() {
        return methodName + " took " + getMeasurement() + " ms";
    }
}
