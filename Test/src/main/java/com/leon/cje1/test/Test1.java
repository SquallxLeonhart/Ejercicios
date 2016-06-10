package com.leon.cje1.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;


public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}

class Sub {
    int i = 1999;
    
    static int u = 0;
    
    public void aMethod() {
        System.out.println("Base.aMethod()");
    }
    
    Sub() {
        aMethod();
        this.u = 0;
    }
    
    Object get() {
        return "Sub";
    }
    
    float aa(){
        return 1.2f;
    }
}

class Super extends Sub {
    int i = -1;
    
    public static void aMethod() {
        System.out.println("Derived.aMethod()");
    }
    
    public static void main(String[] args) {
        Sub sub = new Super();
        System.out.println(sub.i);
        sub.aMethod();
        
        a();
    }
    
    @Override
    String get() {
        return "Super";
    }
    
    static void a() {
        try {
            System.out.println("METHOD A()");
            System.out.printf("%d%n", Month.FEBRUARY.maxLength());
            
            System.out.printf("%s%n", DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, Locale.US));
            System.out.printf("%s%n", DayOfWeek.FRIDAY.getDisplayName(TextStyle.NARROW, Locale.US));
            System.out.printf("%s%n", DayOfWeek.FRIDAY.getDisplayName(TextStyle.SHORT, Locale.US));
            
            System.out.printf("%s%n", DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL_STANDALONE, Locale.US));
            System.out.printf("%s%n", DayOfWeek.FRIDAY.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.US));
            System.out.printf("%s%n", DayOfWeek.FRIDAY.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.US));
            
            LocalDate.of(2015, Month.OCTOBER, 12).getDayOfWeek();
            
//            YearMonth ym = YearMonth.now().l
            LocalDate dob = LocalDate.of(2015, Month.OCTOBER, 12);
            dob.plusYears(1);
            System.out.println("DATE OF BIRTH: " + dob);
            
            System.out.println("Monday minus" + DayOfWeek.MONDAY.minus(3));
            
            String x = "Java";
            StringBuffer y = new StringBuffer(x);
            System.out.println(x.equals(y));
//            System.out.printf();
            
            
            System.out.println("Boolean: " + new Boolean("Incorrect"));
            
           return; 
        } finally {
            System.out.println("fINALLY");
        }
        
    }
    
//    Float aa(){
//        return 1.2f;
//    }
}

abstract class AbstractClass {
    String s;
    
    AbstractClass() {
        
    }
    
    abstract String getName() throws Throwable;
}

class ClassA extends AbstractClass {

    @Override
    String getName() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static void main(String[] args) {
        AbstractClass abs = new ClassA();
        
        System.out.println(abs.s);
        
        boolean b1 = true;
        Boolean b2 = false;
        
        if (b1&&b2 == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        Integer x, y, z;
        
        for (x = 10, y = 11, z = 12; x < y && x < z; x++, y--, z++) {
            System.out.println("x, y , z: " + x + y +z);
        }
        
//        for (B string : B.values()) {
//            
//        }
        
        String s1 = new String("Java");
        String s3 = "Jaya";
        String s2 = s1.replace("v", "y");
        System.out.println("Cadena");
        System.out.println(s3==s2);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        
        String[] s = list.toArray(new String[4]);
        
        for (String string : s) {
            System.out.println("number: " + string);
        }
        
    }
    
    
}

class A {
    
}

class B extends A {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = (B) ob1;
        
    }
}
