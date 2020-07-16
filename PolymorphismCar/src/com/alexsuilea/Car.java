package com.alexsuilea;

public class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car->Engine on";
    }

    public String accelerate(){
        return "Car->accelerate..";
    }

    public String brake(){
        return "Car->stopped..";
    }
}
