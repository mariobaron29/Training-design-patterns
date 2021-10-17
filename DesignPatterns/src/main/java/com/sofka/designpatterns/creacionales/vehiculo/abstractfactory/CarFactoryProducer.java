package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

public final class CarFactoryProducer {
    public static CarFactory getFactory(){
        return type -> {
            Car car = null;
            switch (type) {
                case SD:
                    car = new Sedan();
                    break;
                case HB:
                    car = new Hatchback();
                    break;
                case SC:
                    car = new SportsCar();
                    break;

            }
            return car;
        };
    }
}
