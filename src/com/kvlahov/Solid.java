package com.kvlahov;

import com.kvlahov.employees.BaseEmployee;
import com.kvlahov.employees.BatteryFillingEmployee;
import com.kvlahov.employees.Employee;
import com.kvlahov.employees.GasFillingEmployee;
import com.kvlahov.vehicles.VehicleType;

public class Solid {

    public static void main(String[] args) {
	    //demo
        Train smallTrain = new Train(8, VehicleType.SMALL);
        Train largeTrain = new Train(6, VehicleType.LARGE);

        Employee ordinaryEmployee = new GasFillingEmployee(new BaseEmployee(0.1));
        Employee specialEmployee = new BatteryFillingEmployee(new BaseEmployee(0.11));
    }
}
