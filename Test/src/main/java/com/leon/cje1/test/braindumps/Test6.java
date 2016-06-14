package com.leon.cje1.test.braindumps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        String date = LocalDateTime.parse("2014-05-04T12:30").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        
        
        /////////////////////////
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        
        ////////////////////
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;
        //String s4 = (String) (s3*s2);
        
        //System.out.println(s4);
        
    }
}

abstract class Planet {
     protected void resolve() {
        
    }
    
    abstract void rotate();
}

class Earth extends Planet {

    void resolve() {
        
    }
    
    @Override
    protected void rotate() {
        // TODO Auto-generated method stub
        
    }
    
}



