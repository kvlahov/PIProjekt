package com.kvlahov.vehicles;

import com.kvlahov.Utils;

public class Van extends Vehicle {
    public Van() {
        super(80, VehicleType.SMALL, Utils.getRandomDouble(50,80), Utils.getRandomDouble(60,90));
    }
}
