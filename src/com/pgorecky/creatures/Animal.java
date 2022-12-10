package com.pgorecky.creatures;

import com.pgorecky.devices.salleable;

public abstract class Animal implements salleable, Feedable, Ownable {
    private static final Boolean DEFAULT_RUN = true;
    private static final Integer DEFAULT_DISTANCE = 5;
    final String species;
    public String name;
    Double weight;
    Boolean isAlive;
    Human owner;


    public Animal(String species)
    {
        isAlive = true;
        this.species = species;
        if (species.equals("dog")){
            weight = 2.5;
        } else if (species.equals("cat")){
            weight = 0.5;
        }
    }
    void feed(Double foodWeight){

    }
    public void feed()
    {
        if (weight > 0)
        {
            this.weight += 0.5;
            System.out.println("The dog is grateful to you! ");
        }
        else System.out.println("Your dog won't eat anything anymore for a simple reason: he's dead you little bastard ");
    }
    public void takeForAWalk(){
        takeForAWalk(DEFAULT_DISTANCE);
    }
    public void takeForAWalk(Integer distance){
        this.takeForAWalk(distance, DEFAULT_RUN);
    }
    public void takeForAWalk(Integer distance, Boolean areWeRunning)
    {
        if (areWeRunning) {
            System.out.println("Dog has runned" + distance + "km ");
        } else if (!(areWeRunning)) {
            System.out.println("Dog has walked" + distance + "km");
        }
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
    public void feed(Integer foodWeight) {
        if (weight > 0)
        {
            this.weight += foodWeight;
            System.out.println("The dog is grateful to you! ");
        }
        else System.out.println("Your dog won't eat anything anymore for a simple reason: he's dead you little bastard ");
        System.out.println("feed(Integer)");
    }
    public String toString(){
        return species + " " + name + " " + weight + "lbs  is alive?: " + isAlive;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null){
            if (buyer.cash >= price) {
                seller.cash += price;
                buyer.cash -= price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("SUCCESSFUL SALE");
            } else System.out.println("Buyer is poor, can't afford it!!! ");
        } else System.out.println("He's a scammer, there's nothing for sale!!! ");
    }

    @Override
    public Human getOwner() {
        return this.owner;
    }

    public void setOwner(Human human){
        this.owner = human;
    }

    @Override
    public Boolean isOwned() {
        return this.owner != null;
    }
}
