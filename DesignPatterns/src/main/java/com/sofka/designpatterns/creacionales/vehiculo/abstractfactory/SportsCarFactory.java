package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.vehiculo.Car;
import com.sofka.designpatterns.creacionales.vehiculo.SportsCar;

public class SportsCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
