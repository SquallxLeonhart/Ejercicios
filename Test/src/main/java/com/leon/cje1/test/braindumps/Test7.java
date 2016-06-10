package com.leon.cje1.test.braindumps;

public class Test7 {

}

class Vehicle {
    String type = "4W";
    
    Vehicle(String type, int maxSpeed) {
        
    }
}

class Car extends Vehicle {
    String trans;
    
    Car(String trans) {
        this.trans = trans;
    }

    Car(String type, int maxSpeed) {
        super(type, maxSpeed);
        this(type);
    }
    
}