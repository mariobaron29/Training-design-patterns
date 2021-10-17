package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.asientos.Seat;
import com.sofka.designpatterns.creacionales.colores.Blue;
import com.sofka.designpatterns.creacionales.colores.Color;
import com.sofka.designpatterns.creacionales.colores.Red;
import com.sofka.designpatterns.creacionales.colores.Green;

import java.util.Arrays;
import java.util.List;

public class Hatchback implements Car {

    @Override
    public String type() {
        return "Hatchback";
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

        // Prototype
        return Arrays.asList(
                blue.clone(),
                red.clone(),
                green.clone()
        );
    }

    @Override
    public Seat seat() {
        return new Seat.SeatBuilder()
                .setCover("Tela")
                .setType("Normal")
                .createSeat();
    }
}
