package com.pgorecky;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Snowy";
        System.out.println(dog.weight);
        dog.feed();
        System.out.println(dog.weight);
        dog.takeForAWalk();
        System.out.println(dog.weight);
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println(dog.weight);
    }
}