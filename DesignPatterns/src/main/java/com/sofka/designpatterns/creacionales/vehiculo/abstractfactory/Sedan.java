package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.asientos.Seat;
import com.sofka.designpatterns.creacionales.colores.Blue;
import com.sofka.designpatterns.creacionales.colores.Color;
import com.sofka.designpatterns.creacionales.colores.Red;

import java.util.Arrays;
import java.util.List;

public class Sedan implements Car {

    @Override
    public String type() {
        return "Sedan";
    }

    @Override
    public List<Color> colors() throws CloneNotSupportedException {
        Color blue = new Blue();
        blue.setCodigo("#0000FF");
        blue.setNombre("Azul");

        Color red = new Red();
        red.setCodigo("#FF0000");
        red.setNombre("Rojo");

        return Arrays.asList(new Color[]{
                blue.clone(),
                red.clone()
        });
    }

    @Override
    public Seat seat() {
        // Builder
        return new Seat.SeatBuilder()
                .setCover("Tela")
                .setType("Normal")
                .createSeat();
    }
}
