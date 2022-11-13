package com.pgorecky.devices;

import java.util.Objects;

public class Car extends Device{
    public Integer horsepower;


    public Car(String model, String producer,Integer yearOfProduction, Integer horsepower, Integer value)
    {
        super(producer, model, yearOfProduction, value);
        this.horsepower = horsepower;
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

    @Override
    public void turnOn() {
        System.out.println("Car is turned on now");
    }
}
