package com.leon.cje1.test.braindumps;

import java.io.*;

public class Planet2 {
    public String name;
    public int moons;
    
    public Planet2(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }
    
    public static void main(String[] args) {
        Planet2[] planets = {
                                new Planet2("Mercury", 0),
                                new Planet2("Venus", 0),
                                new Planet2("Earth", 1),
                                new Planet2("Mars", 2),
                            };
        
        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
        
        //////////////////
        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        
        for (int i : intArr) {
            System.out.println(i);
        }
    }
    
    
}
