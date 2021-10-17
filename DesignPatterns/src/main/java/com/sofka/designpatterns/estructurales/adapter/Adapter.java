package com.sofka.designpatterns.estructurales.adapter;

public abstract class Adapter<S, T> {
    abstract public void request(S payload);
    abstract public T response();
}
