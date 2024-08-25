package org.example;

public class Laptop {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void compile() {
        System.out.println("I am compiling");
    }
}
