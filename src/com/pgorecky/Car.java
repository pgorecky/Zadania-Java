package com.pgorecky;

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
}
