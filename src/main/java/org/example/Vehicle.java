package org.example;
//Liskov substitution
public abstract class Vehicle {
    String name;
    int price;
   String color;

    public Vehicle(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
