package com.leon.cje1.test.braindumps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        String date = LocalDateTime.parse("2014-05-04T12:30").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;
        String s4 = (String) (s3*s2);
        
        System.out.println(s4);
        
    }
}

abstract class Planet {
     protected void resolve() {
        
    }
    
    abstract void rotate();
}

class Earth extends Planet {

    public void resolve() {
        
    }
    
    @Override
    protected void rotate() {
        // TODO Auto-generated method stub
        
    }
    
}



