package com.alexsuilea;

public class BMW extends Car{
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW->Engine on";
    }

    @Override
    public String accelerate() {
        return "BMW->accelerate..";
    }

    @Override
    public String brake() {
        return "BMW->stopped..";
    }
}
