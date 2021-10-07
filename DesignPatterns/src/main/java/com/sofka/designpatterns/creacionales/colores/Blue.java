package com.sofka.designpatterns.creacionales.colores;

public class Blue implements Color{
    @Override
    public String nombre() {
        return "Azul";
    }

    @Override
    public String codigo() {
        return "#0000FF";
    }
}
