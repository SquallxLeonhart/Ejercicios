package com.leon.cje1.test.braindumps.programmer;

import java.util.Set;
import java.util.TreeSet;

public class Vehicle2 implements Comparable<Vehicle2>{
    int vno;
    String name;

    public Vehicle2(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    public String toString() {
        return vno + ":" + name;
    }
    
    public static void main(String[] args) {
        Set<Vehicle2> vehicles = new TreeSet <> ();
        vehicles.add(new Vehicle2 (10123, "Ford"));
        vehicles.add(new Vehicle2 (10124, "BMW"));
        System.out.println(vehicles);
    }

    @Override
    public int compareTo(Vehicle2 o) {
        if (this.vno == o.vno) {
            return 0;
        } else if(this.vno > o.vno){
            return 1;
        } else {
            return -1;
        }
    }
}
