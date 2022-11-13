package com.pgorecky;

public class Phone {
    final public String model;
    final public String producer;
    public final Integer yearOfProdtuction;
    public Integer memory;
    public Integer value;

    public Phone(String model, String producer, Integer yearOfProdtuction, Integer memory, Integer value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProdtuction = yearOfProdtuction;
        this.memory = memory;
        this.value = value;
    }
}
