package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public interface CarFactory {
    enum Type {
        HB, SD, SC
    }
    Car getCarByType(Type type);
}
