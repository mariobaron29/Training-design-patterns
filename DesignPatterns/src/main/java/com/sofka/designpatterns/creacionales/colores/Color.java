package com.sofka.designpatterns.creacionales.colores;

public abstract class Color {
    private String nombre;
    private String codigo;

    protected Color(Color color) {
        this.nombre = color.nombre;
        this.codigo = color.codigo;
    }

    public Color() {

    }

    @Override
    public Color clone() throws CloneNotSupportedException {
        return (Color) super.clone();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
