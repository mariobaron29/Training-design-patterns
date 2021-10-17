package com.sofka.designpatterns.estructurales.bridge.vehiculo.avion;

import com.sofka.designpatterns.estructurales.bridge.VehicleBridge;
import com.sofka.designpatterns.estructurales.bridge.vehiculo.Vehicle;

public class Plane extends VehicleBridge {
    private final Vehicle vehicle;
    private final String type;

    public Plane(Vehicle vehicle, String type) {
        super(vehicle, type);
        this.vehicle = vehicle;
        this.type = type;
    }

    @Override
    public void produceVehicle() {
        vehicle.produce();
        System.out.println("Producing "+vehicle.vehicleName()+" type: "+type);
    }

    @Override
    public String toString() {
        return "Type: " + type + "name: " + vehicle.vehicleName()  ;
    }
}
