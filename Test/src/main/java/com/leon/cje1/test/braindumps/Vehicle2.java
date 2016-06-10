package com.leon.cje1.test.braindumps;

public class Vehicle2 {
    int x;
    
    Vehicle2() {
        this(10);
    }
    
    Vehicle2(int x) {
        this.x = x;
    }
    
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Car2();
        System.out.println(vehicle2);
    }
}

class Car2 extends Vehicle2 {
    int y;
    Car2() {
//        super();
        this(20);
    }
    
    Car2(int y) {
        this.y = y;
    }
    
    public String toString() {
        return super.x + ":" + this.y;
    }
}
