package com.sofka.designpatterns.creacionales.vehiculo;

import com.sofka.designpatterns.creacionales.colores.Color;

import java.util.List;

public interface Car {
    String type();
    List<Color> colors();
}
