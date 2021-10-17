package com.sofka.designpatterns.comportamiento.iterator;

import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.Car;

import java.util.Iterator;
import java.util.List;

public class CarIterator implements Iterator<Car> {
    private List<Car> cars;
    int position;

    public CarIterator(List<Car> cars){
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return position < cars.size();
    }

    @Override
    public Car next() {
        return cars.get(position++);
    }
}
