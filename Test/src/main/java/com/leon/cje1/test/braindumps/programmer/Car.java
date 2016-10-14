package com.leon.cje1.test.braindumps.programmer;

interface Rideable {
    Car getCar(String name);
}

public class Car {
    private String name;

    public Car() {
        this.name = "Mazda";
    }
    
    public Car(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        Rideable rider = Car::new;
        Car vehicle = rider.getCar("MyCar");
        System.out.println(vehicle.name);
    }
}
