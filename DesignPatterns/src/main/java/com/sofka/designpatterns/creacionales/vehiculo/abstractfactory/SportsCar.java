package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.asientos.Seat;
import com.sofka.designpatterns.creacionales.colores.*;

import java.util.Arrays;
import java.util.List;

public class SportsCar implements Car {

    @Override
    public String type() {
        return "Sports car";
    }

    @Override
    public List<Color> colors() throws CloneNotSupportedException {
        Color blue = new Blue();
        blue.setCodigo("#0000FF");
        blue.setNombre("Azul");

        Color red = new Red();
        red.setCodigo("#FF0000");
        red.setNombre("Rojo");

        Color green = new Green();
        green.setCodigo("#00FF00");
        green.setNombre("Verde");

        Color yellow = new Yellow();
        yellow.setCodigo("#FFF000");
        yellow.setNombre("Amarillo");

        return Arrays.asList(new Color[]{
                blue.clone(),
                red.clone(),
                green.clone(),
                yellow.clone()
        });
    }

    @Override
    public Seat seat() {
        return new Seat.SeatBuilder()
                .setCover("Cuero")
                .setType("Normal")
                .createSeat();
    }
}
