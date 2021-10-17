package com.sofka.designpatterns.creacionales.colores;

public class Blue extends Color  implements Cloneable{

    @Override
    public Color clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
