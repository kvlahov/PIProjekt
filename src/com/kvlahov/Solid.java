package com.kvlahov;

import com.kvlahov.employees.BaseEmployee;
import com.kvlahov.employees.BatteryFillingEmployee;
import com.kvlahov.employees.Employee;
import com.kvlahov.employees.GasFillingEmployee;
import com.kvlahov.vehicles.*;

public class Solid {

    public static void main(String[] args) {
	    //demo
        Train smallTrain = new Train(8, VehicleType.SMALL);
        Train largeTrain = new Train(6, VehicleType.LARGE);

        Employee ordinaryEmployee = new GasFillingEmployee(new BaseEmployee(0.1));
        Employee specialEmployee = new BatteryFillingEmployee(new BaseEmployee(0.11));

        ordinaryEmployee.parkVehicle(new Car(), smallTrain);
        ordinaryEmployee.parkVehicle(new Van(), smallTrain);
        ordinaryEmployee.parkVehicle(new Car(), smallTrain);
        ordinaryEmployee.parkVehicle(new Van(), smallTrain);

        specialEmployee.parkVehicle(new Bus(), largeTrain);
        specialEmployee.parkVehicle(new Bus(), largeTrain);
        specialEmployee.parkVehicle(new Truck(), largeTrain);

        System.out.println("Small train revenue: " + smallTrain.calculateRevenue());
        System.out.println("Large train revenue: " + largeTrain.calculateRevenue());

        System.out.println("Ordinary employee revenue: " + ordinaryEmployee.calculateRevenue());
        System.out.println("Special employee revenue: " + specialEmployee.calculateRevenue());

        Vehicle emptyGasCar = new Car();
        emptyGasCar.getGas().setCurrentQuantity(0);

        System.out.println("Before gas for car:" + emptyGasCar.getGas().getCurrentQuantity());
        ordinaryEmployee.doWork(emptyGasCar);
        System.out.println("After gas for car:" + emptyGasCar.getGas().getCurrentQuantity());

        Vehicle emptyBatteryCar = new Car();
        emptyGasCar.getBattery().setCurrentQuantity(0);

        System.out.println("Before battery for car:" + emptyGasCar.getBattery().getCurrentQuantity());
        specialEmployee.doWork(emptyGasCar);
        System.out.println("After battery for car:" + emptyGasCar.getBattery().getCurrentQuantity());
    }
}
