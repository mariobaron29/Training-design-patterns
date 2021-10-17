package com.sofka.designpatterns.comportamiento.strategy;

public class Operation1 implements Strategy{
    @Override
    public String doSomething(String param1, String param2) {
        System.out.println("Executing operation 1");
        return param1.concat(param2);
    }
}
