package com.pgorecky;

public class Human {
    String firstName;
    String lastName;
    Double salary = 15000.0;
    Double previousSalary;
    Animal pet;
    Integer yearOfBirth;
    private Phone phone;

    public Human(String firstName, String lastName, Integer yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

}
