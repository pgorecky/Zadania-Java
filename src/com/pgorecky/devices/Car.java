package com.pgorecky.devices;

import java.util.Objects;

public class Car {
    final public String model;
    final public String producer;
    public Integer horsepower;
    public Integer value;

    public Car(String model, String producer, Integer horsepower, Integer value)
    {
        this.model = model;
        this.producer = producer;
        this.horsepower = horsepower;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer) && horsepower.equals(car.horsepower) && value.equals(car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, horsepower, value);
    }

    public String toString(){
        return model + " " + producer + " " + horsepower + "hp $" + value;
    }
}
