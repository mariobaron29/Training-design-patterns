package com.sofka.designpatterns.creacionales.colores;

public class Green extends Color implements Cloneable{
   private String name;
    private String codigo;
    public Green(Color color) {
        super(color);
    }

    public Green() {

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
