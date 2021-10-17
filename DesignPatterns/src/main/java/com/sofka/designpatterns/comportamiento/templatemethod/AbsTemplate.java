package com.sofka.designpatterns.comportamiento.templatemethod;

public abstract class AbsTemplate {

    public void startCar(){
        checkGas();
        checkOil();
        checkMirrors();
    }

    public abstract void checkGas();
    public abstract void checkOil();
    public abstract void checkMirrors();


}
