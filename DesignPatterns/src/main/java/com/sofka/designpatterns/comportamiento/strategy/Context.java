package com.sofka.designpatterns.comportamiento.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(String param1, String param2){
        return strategy.doSomething(param1, param2);
    }
}
