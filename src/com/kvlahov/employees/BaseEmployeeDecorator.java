package com.kvlahov.employees;

import com.kvlahov.Train;
import com.kvlahov.vehicles.Vehicle;

public abstract class BaseEmployeeDecorator implements Employee {
    protected Employee decoratedEmployee;

    public BaseEmployeeDecorator(Employee decoratedEmployee) {
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public void doWork(Vehicle vehicle) {
        decoratedEmployee.doWork(vehicle);
    }

    @Override
    public double calculateRevenue() {
        return decoratedEmployee.calculateRevenue();
    }

    @Override
    public void parkVehicle(Vehicle vehicle, Train train) {
        decoratedEmployee.parkVehicle(vehicle, train);
    }
}
