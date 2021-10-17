package com.sofka.designpatterns.application;

import com.sofka.designpatterns.creacionales.colores.Color;
import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.Car;
import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.CarFactory;
import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.CarFactoryProducer;

public class MainApplication{
    public static void main(String[] args) {
        // Abstract Factory
        System.out.println("### Abstract Factory ###");
        for(CarFactory.Type type : CarFactory.Type.values()){
            CarFactory carFactory = CarFactoryProducer.getFactory();
            Car car = carFactory.getCarByType(type);
            System.out.println("\n ### Car: ###");
            System.out.println(String.format("Type: %s  ", car.type()));
            System.out.println(String.format("Available colors:"));

            try {
                for (Color color:car.colors()) {
                    System.out.println(String.format("Code: %s name: %s", color.getCodigo(), color.getNombre()));
                }
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            System.out.println("Seats");
            System.out.println(String.format("Type: %s  cover: %s", car.seat().getType(),car.seat().getCover()));
        }

    }
}
