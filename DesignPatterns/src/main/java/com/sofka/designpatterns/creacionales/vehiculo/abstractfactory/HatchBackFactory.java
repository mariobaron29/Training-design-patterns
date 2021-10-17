package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public class HatchBackFactory implements CarFactory{

    @Override
    public Car getCarByType(Type type) {
        Car car = null;
        if(type.equals(Type.HB))
        {
            car = new Hatchback();
        }
        return car;
    }
}
