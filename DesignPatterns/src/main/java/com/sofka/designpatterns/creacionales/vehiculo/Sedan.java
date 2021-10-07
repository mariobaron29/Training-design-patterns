package com.sofka.designpatterns.creacionales.vehiculo;

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
    public List<Color> colors() {
        return Arrays.asList(new Color[]{
                new Blue(),
                new Red()
        });
    }
}
