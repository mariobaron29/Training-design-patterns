package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.vehiculo.Car;
import com.sofka.designpatterns.creacionales.vehiculo.Sedan;

public class SedanFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }
}
