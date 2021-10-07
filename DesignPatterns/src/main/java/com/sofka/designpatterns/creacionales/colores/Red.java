package com.sofka.designpatterns.creacionales.colores;

public class Red implements Color{
    @Override
    public String nombre() {
        return "rojo";
    }

    @Override
    public String codigo() {
        return "#FF0000";
    }
}
