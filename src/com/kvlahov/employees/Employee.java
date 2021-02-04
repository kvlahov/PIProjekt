package com.kvlahov.employees;

import com.kvlahov.RevenueCalculator;
import com.kvlahov.vehicles.Vehicle;

public interface Employee extends RevenueCalculator {
    void doWork(Vehicle vehicle);
    void parkVehicle(Vehicle vehicle);
}
