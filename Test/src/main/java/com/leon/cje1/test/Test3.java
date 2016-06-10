package com.leon.cje1.test;

import java.time.DayOfWeek;

public class Test3 {
    enum Month{JAN, FEB, MAR}

    public static void main(String[] args) {
        Long x[] = {1L, 2L};
//        print(x);
        print2("java");
        
        
        int y = new Integer(1);
        
        Month mon = Month.valueOf("JAN");
        
        if (mon == Month.JAN) {
            System.out.println("==");
        }
        
        if (mon.equals(Month.JAN)) {
            System.out.println("equals");
        }
        
        
        System.out.println(DayOfWeek.MONDAY.plus(3));
        
    }
    
    public static void print(long... arr) {
        for (long l : arr) {
            System.out.println(l);
        }
    }
    
    public static void print2(String... arr) {
        for (String l : arr) {
            System.out.println(l);
        }
    }
}
