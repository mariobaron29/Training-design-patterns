package com.sofka.designpatterns.creacionales.vehiculo;

import com.sofka.designpatterns.creacionales.colores.*;

import java.util.Arrays;
import java.util.List;

public class SportsCar implements Car {

    @Override
    public String type() {
        return "Sports car";
    }

    @Override
    public List<Color> colors() {
        return Arrays.asList(new Color[]{
                new Blue(),
                new Red(),
                new Green(),
                new Yellow()
        });
    }
}
