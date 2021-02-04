package com.kvlahov.employees;

import com.kvlahov.vehicles.Vehicle;

public class BatteryFillingEmployee extends BaseEmployeeDecorator {

    public BatteryFillingEmployee(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void doWork(Vehicle vehicle) {
        decoratedEmployee.doWork(vehicle);
        if(vehicle.isBatteryBelowLimit())
            vehicle.fillBatteryToMaximum();
    }
}
