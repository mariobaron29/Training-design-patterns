package com.sofka.designpatterns.comportamiento.templatemethod;

public class StartCar extends AbsTemplate {

    @Override
    public void checkGas() {
        System.out.println("Checking gas...");
    }

    @Override
    public void checkOil() {
        System.out.println("Checking oil...");
    }

    @Override
    public void checkMirrors() {
        System.out.println("Checking mirrors...");
    }
}
