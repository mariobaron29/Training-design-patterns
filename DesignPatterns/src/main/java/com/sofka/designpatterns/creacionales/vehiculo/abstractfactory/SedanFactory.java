package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public class SedanFactory implements CarFactory{
    @Override
    public Car getCarByType(Type type) {
        Car car = null;
        if(type.equals(Type.SD))
        {
            car = new Sedan();
        }
        return car;
    }
}
