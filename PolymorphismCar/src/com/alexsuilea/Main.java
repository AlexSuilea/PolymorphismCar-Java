package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
	    for(int i = 0; i < 10; i++){
	        Car car = randomCar();
            System.out.println("Car #"+i+ " :\n" +car.startEngine()+
                    "\n"+car.accelerate()+
                    "\n"+car.brake());
        }
    }

    public static Car randomCar(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random generated number is: "+randomNumber);
        switch(randomNumber){
            case 1:
                return new BMW("BMW", 100);
            case 2:
                return new Audi("Audi", 100);
            case 3:
                return new Mercedes("Mercedes", 100);
            case 4:
                return new Ford("Ford", 70);
            case 5:
                return new Dacia("Dacia", 50);
        }
        return null;
    }
}
