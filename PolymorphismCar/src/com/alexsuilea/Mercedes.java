package com.alexsuilea;

public class Mercedes extends Car {
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes->Engine on";
    }

    @Override
    public String accelerate() {
        return "Mercedes->accelerate..";
    }

    @Override
    public String brake() {
        return "Mercedes->stopped..";
    }
}
