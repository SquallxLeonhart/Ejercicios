package com.leon.cje1.test.braindumps.programmer;

public class Vehicle3 {
    void ride() throws FuelNotAvailException {// line n1
        System.out.println("Happy Journey!");
    }

    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle3 v = new SolarVehicle();
        v.ride();
    }
}

class FuelNotAvailException extends Exception {
}

class FuelNotAvailException2 extends Exception {
}

class FuelNotAvailException3 extends FuelNotAvailException2 {
}

class SolarVehicle extends Vehicle3 {
    public void ride() throws FuelNotAvailException {//line n2
        super.ride ();
    }
}
