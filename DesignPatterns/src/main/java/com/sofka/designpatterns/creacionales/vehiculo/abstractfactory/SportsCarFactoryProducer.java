package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public final class SportsCarFactoryProducer {

    public static SportsCarFactory getFactory() {
        return new SportsCarFactory();
    }
}
