package com.pgorecky;

public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species)
    {
        isAlive = true;
        this.species = species;
        if (species.equals("dog")){
            weight = 2.5;
        } else if (species.equals("cat")){
            weight = 0.5;
        }
    }

    void feed()
    {
        if (weight > 0)
        {
            this.weight += 0.5;
            System.out.println("The dog is grateful to you! ");
        }
        else System.out.println("Your dog won't eat anything anymore for a simple reason: he's dead you little bastard ");
    }
    void takeForAWalk()
    {
        if (isAlive && (weight > 0))
        {
            this.weight -= 0.5;
            System.out.println("The dog is grateful to you for a walk! ");
            if (weight < 0){
                isAlive = false;
            }
        }
        else System.out.println("Aren't you ashamed to take a dead dog for a walk? ");
    }
    public String toString(){
        return species + " " + name + " " + weight + "lbs  is alive?: " + isAlive;
    }
}
