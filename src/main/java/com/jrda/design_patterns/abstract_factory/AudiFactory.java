package com.jrda.design_patterns.abstract_factory;

public class AudiFactory implements VehiclesFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }

    @Override
    public Truck createTruck() {
        return new AudiTruck();
    }
}
