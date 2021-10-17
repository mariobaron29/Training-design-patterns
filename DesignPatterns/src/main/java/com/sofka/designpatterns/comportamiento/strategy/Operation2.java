package com.sofka.designpatterns.comportamiento.strategy;

import java.util.Locale;

public class Operation2 implements Strategy{
    @Override
    public String doSomething(String param1, String param2) {
        System.out.println("Executing operation 2");
        return param1.replace(param2, param2.toUpperCase(Locale.ROOT));
    }
}
