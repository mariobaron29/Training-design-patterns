package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.vehiculo.Car;
import com.sofka.designpatterns.creacionales.vehiculo.Hatchback;

public class HatchBackFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hatchback();
    }
}
