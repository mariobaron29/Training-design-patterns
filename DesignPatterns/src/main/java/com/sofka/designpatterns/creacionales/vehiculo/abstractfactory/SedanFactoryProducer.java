package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public final class SedanFactoryProducer {

    public static SedanFactory getFactory() {
        return new SedanFactory();
    }
}
