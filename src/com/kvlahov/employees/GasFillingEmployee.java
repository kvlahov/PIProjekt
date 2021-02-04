package com.kvlahov.employees;

import com.kvlahov.vehicles.Vehicle;

public class GasFillingEmployee extends BaseEmployeeDecorator {
    public GasFillingEmployee(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void doWork(Vehicle vehicle) {
        decoratedEmployee.doWork(vehicle);
        if(vehicle.isGasBelowLimit())
            vehicle.fillGasToMaximum();
    }
}
