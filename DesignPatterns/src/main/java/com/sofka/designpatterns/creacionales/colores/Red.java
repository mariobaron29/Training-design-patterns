package com.sofka.designpatterns.creacionales.colores;

public class Red extends Color implements Cloneable{
    private String name;
    private String codigo;
    public Red(Color color) {
        super(color);
    }

    public Red() {

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
