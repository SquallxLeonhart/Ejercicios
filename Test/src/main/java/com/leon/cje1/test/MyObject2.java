package com.leon.cje1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.MyObject.B;

public class MyObject2 extends java.lang.Object {
    String name = "DEFAULT VALUE";
    
    protected void finalize() {
        name = null;
    }

    public static void main(String[] args) {
        Object obj = new MyObject2();
//        obj.finalize();

        
        int myArray[] = new int[]{1, 2, 3};
        System.out.println(myArray[1]);
        
        String in = "Java Tiger";
        System.out.println(in.substring(0, in.length()-3));
        
        String str = "Java*JSP*EJB*JEE";
        System.out.println(Arrays.toString(str.split("/*", -2)));
        int i = 0;
        new ArrayList().add(i);
        
        for (B b : B.values()) {
            
        }
        
        System.out.println(new Boolean("Incorrect"));
    }
}
