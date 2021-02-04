package com.kvlahov.vehicles;

import com.kvlahov.Utils;

public class Car extends Vehicle {

    public Car() {
        super(50, VehicleType.SMALL, Utils.getRandomDouble(30,50), Utils.getRandomDouble(50,70));
    }
}
