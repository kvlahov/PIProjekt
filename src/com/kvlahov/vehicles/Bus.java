package com.kvlahov.vehicles;

import com.kvlahov.Utils;

public class Bus extends Vehicle {
    public Bus() {
        super(70, VehicleType.LARGE, Utils.getRandomDouble(60,100), Utils.getRandomDouble(90,120));
    }
}
