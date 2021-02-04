package com.kvlahov.vehicles;

import com.kvlahov.Utils;

public class Truck extends Vehicle {
    public Truck() {
        super(90, VehicleType.LARGE, Utils.getRandomDouble(100,140), Utils.getRandomDouble(130,180));
    }
}
