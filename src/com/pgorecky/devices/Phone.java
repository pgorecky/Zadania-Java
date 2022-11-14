package com.pgorecky.devices;

import com.pgorecky.creatures.Human;

public class Phone extends Device implements salleable{
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != null){
            if (buyer.cash >= price) {
                seller.cash += price;
                buyer.cash -= price;
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("SUCCESSFUL SALE");
            } else System.out.println("Buyer is poor, can't afford it!!! ");
        } else System.out.println("He's a scammer, there's nothing for sale!!! ");
    }
}
