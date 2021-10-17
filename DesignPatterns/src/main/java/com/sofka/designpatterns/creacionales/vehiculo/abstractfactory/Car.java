package com.sofka.designpatterns.creacionales.vehiculo.abstractfactory;

import com.sofka.designpatterns.creacionales.asientos.Seat;
import com.sofka.designpatterns.creacionales.colores.Color;

import java.util.List;

public interface Car {
    String type();
    List<Color> colors() throws CloneNotSupportedException;
    Seat seat();
}
