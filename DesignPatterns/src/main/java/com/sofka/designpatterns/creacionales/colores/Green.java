package com.sofka.designpatterns.creacionales.colores;

public class Green implements Color{
    @Override
    public String nombre() {
        return "verde";
    }

    @Override
    public String codigo() {
        return "#00FF00";
    }
}
