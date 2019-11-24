package com.jrda.design_patterns.abstrac_factory;

import com.jrda.design_patterns.abstract_factory.*;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testChevroletFactory(){
        VehiclesFactory vehiclesFactory = new ChevroletFactory();

        Car car = vehiclesFactory.createCar();
        car.carRun();

        Truck truck = vehiclesFactory.createTruck();
        truck.load();
    }

    @Test
    public void testAudiFactory(){
        VehiclesFactory vehiclesFactory = new AudiFactory();

        Car car = vehiclesFactory.createCar();
        car.carRun();

        Truck truck = vehiclesFactory.createTruck();
        truck.load();
    }
}
