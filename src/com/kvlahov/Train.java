package com.kvlahov;

import com.kvlahov.vehicles.Vehicle;
import com.kvlahov.vehicles.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Train implements RevenueCalculator {
    private List<Vehicle> vehicles = new ArrayList<>();
    private int occupied = 0;
    private int maxCapacity;
    private VehicleType acceptableVehicleType;

    public Train(int maxCapacity, VehicleType acceptableVehicleType) {
        this.maxCapacity = maxCapacity;
        this.acceptableVehicleType = acceptableVehicleType;
    }

    public Train(List<Vehicle> vehicles, int maxCapacity, VehicleType acceptableVehicleType) {
        this.vehicles = vehicles;
        this.maxCapacity = maxCapacity;
        this.acceptableVehicleType = acceptableVehicleType;
    }

    public int getOccupied() {
        return occupied;
    }

    public int getFreeSpace() {
        return maxCapacity - occupied;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (vehicle.getType() != acceptableVehicleType) return false;

        vehicles.add(vehicle);
        occupied++;
        return true;
    }

    public void clearVehicles() {
        vehicles.clear();
        occupied = 0;
    }

    @Override
    public double calculateRevenue() {
        return vehicles.stream().mapToDouble(v -> v.getTicketPrice()).sum();
    }
}
