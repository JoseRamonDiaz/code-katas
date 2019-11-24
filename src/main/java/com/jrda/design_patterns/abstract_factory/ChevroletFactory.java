package com.jrda.design_patterns.abstract_factory;

public class ChevroletFactory implements VehiclesFactory{
    @Override
    public Car createCar() {
        return new ChevroletCar();
    }

    @Override
    public Truck createTruck() {
        return new ChevroletTruck();
    }
}
