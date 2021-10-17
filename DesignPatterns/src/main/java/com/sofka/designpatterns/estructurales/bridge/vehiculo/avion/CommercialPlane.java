package com.sofka.designpatterns.estructurales.bridge.vehiculo.avion;

import com.sofka.designpatterns.estructurales.bridge.vehiculo.Vehicle;

public class CommercialPlane implements Vehicle {
    @Override
    public String vehicleName() {
        return "Commercial";
    }

    @Override
    public void produce() {
        System.out.println("Commercial plane produced");
    }
}
