package com.sofka.designpatterns.estructurales.bridge.vehiculo.avion;

import com.sofka.designpatterns.estructurales.bridge.vehiculo.Vehicle;

public class CargoPlane implements Vehicle {
    @Override
    public String vehicleName() {
        return "Cargo";
    }

    @Override
    public void produce() {
        System.out.println("Cargo plane produced");
    }
}
