package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public class SportsCarFactory implements CarFactory{

    @Override
    public Car getCarByType(Type type) {
        Car car = null;
        if(type.equals(Type.SC))
        {
            car = new SportsCar();
        }
        return car;
    }
}
