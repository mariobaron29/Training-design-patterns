package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public final class HatchBackFactoryProducer {

    public static HatchBackFactory getFactory() {
        return new HatchBackFactory();
    }
}
