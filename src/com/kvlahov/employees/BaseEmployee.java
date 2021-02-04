package com.kvlahov.employees;

import com.kvlahov.RevenueCalculator;
import com.kvlahov.vehicles.Vehicle;

import java.util.List;

public class BaseEmployee implements Employee {
    private double commissionPercentage;
    private List<Vehicle> parkedVehicles;

    public BaseEmployee(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public BaseEmployee(double commissionPercentage, List<Vehicle> parkedVehicles) {
        this.commissionPercentage = commissionPercentage;
        this.parkedVehicles = parkedVehicles;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        parkedVehicles.add(vehicle);
    }

    @Override
    public double calculateRevenue() {
        return parkedVehicles.stream()
                .mapToDouble(v -> v.getTicketPrice() * commissionPercentage)
                .sum();
    }

    @Override
    public void doWork(Vehicle vehicle) {
        return;
    }
}
