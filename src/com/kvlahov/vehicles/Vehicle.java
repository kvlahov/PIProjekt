package com.kvlahov.vehicles;

import com.kvlahov.Resource;

public abstract class Vehicle {
    private double ticketPrice;
    private VehicleType type;
    private Resource gas;
    private Resource battery;

    public Vehicle(double ticketPrice, VehicleType type, double maxGasCapacity, double maxBatteryCapacity) {
        this.ticketPrice = ticketPrice;
        this.type = type;
        this.gas = new Resource(maxGasCapacity);
        this.battery = new Resource(maxBatteryCapacity);
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public VehicleType getType() {
        return type;
    }

    public Resource getGas() {
        return gas;
    }

    public void setGas(Resource gas) {
        this.gas = gas;
    }

    public Resource getBattery() {
        return battery;
    }

    public void setBattery(Resource battery) {
        this.battery = battery;
    }

    public boolean isGasBelowLimit() {
        return gas.getCurrentQuantityPercentage() < 0.1;
    }

    public void fillGasToMaximum() {
        gas.fillToMaximum();
    }

    public boolean isBatteryBelowLimit() {
        return battery.getCurrentQuantityPercentage() < 0.1;
    }

    public void fillBatteryToMaximum() {
        battery.fillToMaximum();
    }
}
