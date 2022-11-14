package com.pgorecky;

import com.pgorecky.devices.Car;
import com.pgorecky.devices.Phone;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Patryk", "Gorecki", 1998, 150000.0);
        me.displayHuman();
        Animal dog = new Animal("dog");
        dog.name = "Snowy";
        me.pet = dog;
        dog.takeForAWalk();
        dog.feed();
        Car car = new Car("Vanquish S", "Aston Martin", 2017,520, 253000);
        Car car1 = new Car("Vanquish S", "Aston Martin", 2017,520, 253000);
        me.setCar(car);
        System.out.println(me.getCar());
        me.displayCar();
        me.setSalary(16000.0);
        me.getInformationAboutSalary();
        Phone iPhone = new Phone("iPhone 12 Pro", "Apple",2020,128,999);
        me.phone = iPhone;
        System.out.println("Compare no.1: " + (car1 == car));
        System.out.println("Compare no.2: " + car.equals(car1));
        System.out.println(car);
        System.out.println(me);
        System.out.println(dog);
        System.out.println(iPhone);
        car.turnOn();
        iPhone.turnOn();
        Human buyer = new Human("Elon", "Blain",1971,1000000.0);
        dog.sell(me, buyer, 1000.0);
        car.sell(me, buyer, 100000.0);
        iPhone.sell(me, buyer, 1000.0);
    }
}