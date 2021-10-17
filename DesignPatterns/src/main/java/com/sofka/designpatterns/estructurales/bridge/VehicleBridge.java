package com.sofka.designpatterns.estructurales.bridge;

import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.Car;
import com.sofka.designpatterns.estructurales.bridge.vehiculo.Vehicle;

public abstract class VehicleBridge {
    private final Vehicle vehicle;
    private final String vehicleType;

    public VehicleBridge(Vehicle vehicle, String vehicleType){
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
    }

    public abstract void produceVehicle();

}
