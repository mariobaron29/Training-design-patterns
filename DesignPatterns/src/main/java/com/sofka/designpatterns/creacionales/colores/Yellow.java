package com.sofka.designpatterns.creacionales.colores;

public class Yellow extends Color implements Cloneable{
    private String name;
    private String codigo;

    public Yellow(Color color) {
        super(color);
    }

    public Yellow() {

    }

    @Override
    public Color clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }
    public String getCodigo() { return codigo; }

    public void setName(String name){
        this.name = name;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}
