package com.pgorecky.creatures;

import com.pgorecky.devices.Car;
import com.pgorecky.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human extends Animal{
    String firstName;
    String lastName;
    Double salary = 15000.0;
    Double previousSalary;
    public Double cash;
    public Pet pet;
    Integer yearOfBirth;
    public Phone phone;
    private Car car;
    LocalDateTime ldt;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    public Human(String firstName, String lastName, Integer yearOfBirth, Double cash){
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.cash = cash;
    }
    public void displayHuman(){
        System.out.println("First name: " +firstName);
        System.out.println("Last name: " +lastName);
        System.out.println("Year of birth: " +yearOfBirth);
    }
    public void displayPet(){
        if (!(pet == null)){
        System.out.println("You own a dog named: "+ pet.name);
        System.out.println("His weight is: "+ pet.weight);
        } else {
            System.out.println("You don't own any pets");
        }
    }
    public void displayCar(){
        if (!(car == null)){
            System.out.println("You own a car: "+ car.producer + car.model + "with a " + car.horsepower + "hp");
            System.out.println("Your car costs a $"+ car.value);
        } else {
            System.out.println("You don't own any cars");
        }
    }
    public void setSalary(Double salary){
        if (salary < 0){
            System.out.println("The reported payout value is negative!");
            System.out.println("Changes cannot be made!");
        } else {
            ldt = LocalDateTime.now();
            System.out.println("The change has been successful!");
            System.out.println("*new data has been sent to the accounting system.");
            System.out.println("Annex to the contract is waiting in the office of Mrs. Hanna from Human resources.");
            System.out.println("The ZUS and the US have already been informed of your raise, so you'd better not hide it!");
            this.previousSalary = this.salary;
            this.salary = salary;
        }
    }
    public void getInformationAboutSalary(){
        System.out.println("The value of the payout last time was changed a day: " + dtf.format(ldt));
        System.out.println("The salary before the changes was: $" + previousSalary);
        System.out.println("The current salary is: $" + salary);
    }
    public void setCar(Car car) {
        if (salary > car.value){
            System.out.println("Congratulations on your purchase. You managed to buy the car with cash.");
            this.car = car;
        } else if (salary > car.value/12) {
            System.out.println("Congratulations on your purchase. You managed to buy the car on credit");
            this.car = car;
        } else {
            System.out.println("Unfortunately, you are a poor man!!! Enroll in college and fight for your future while it's not too late");
        }
    }
    public void setPurchasedCar (Car car) {
        if (car.isSold){
            this.car = car;
        } else System.out.println("You can't do that");
    }

    public void clearCar(){
        if (car.isSold){
        this.car = null;
        } else System.out.println("You can't do that");
    }

    public Car getCar (){
        return this.car;
    }
    public String toString(){
        return firstName + " " + lastName + " " + yearOfBirth;
    }

}
