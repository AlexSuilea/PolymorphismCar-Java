package com.alexsuilea;

public class Dacia extends Car{
    public Dacia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Dacia->Engine on";
    }

    @Override
    public String brake() {
        return "Dacia->stopped..";
    }
}
