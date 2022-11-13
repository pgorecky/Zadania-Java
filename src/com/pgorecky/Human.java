package com.pgorecky;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    String firstName;
    String lastName;
    Double salary = 15000.0;
    Double previousSalary;
    Animal pet;
    Integer yearOfBirth;
    private Phone phone;
    public Car car;
    LocalDateTime ldt;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    public Human(String firstName, String lastName, Integer yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
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

}
