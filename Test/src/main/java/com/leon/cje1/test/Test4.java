package com.leon.cje1.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        int counter = 0;
        
        outer: for (int i = 0; i < 6; ++i) {
            middle: for (int j = 0; j < 6; ++j) {
                inner: for (int k = 0; k < 6; ++k) {
                    System.out.println("Inside Loop - " + ++counter);
                    if ((k % 4) == 0) {
                        continue outer;
                    }
                }
            }
            
        }
        
        Integer x, y, z;
        
        for (x = 10, y = 11, z = 12; x < y && x < z; x++, y--, z++) {
            System.out.println(x + " " + y + " " + z );
        }
        
        String xx = "Java";
        StringBuffer yy = new StringBuffer(xx);
        System.out.println(xx.equals(yy));
        
        List <Number> listNumber = new ArrayList<>();
        listNumber.add(new Integer(100));
        listNumber.add(new Float(100f));
        listNumber.add(new Double(100));

    }
}
