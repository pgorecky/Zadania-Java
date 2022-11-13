package com.pgorecky.devices;

public class Phone extends Device{
    public Integer memory;

    public Phone(String model, String producer,Integer yearOfProduction, Integer memory, Integer value)
    {
        super(producer, model, yearOfProduction, value);
        this.memory = memory;
    }

    public String toString(){
        return model + " " + producer + " $" + value + " " + memory;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on now");
    }
}
