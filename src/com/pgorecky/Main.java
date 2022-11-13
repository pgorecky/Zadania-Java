package com.pgorecky;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Patryk", "Gorecki", 1998);
        Animal dog = new Animal("dog");
        dog.name = "Snowy";
        me.pet = dog;
        Car auto = new Car("Vanquish S", "Aston Martin", 520, 253000);
        me.car = auto;
    }
}