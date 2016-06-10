package com.leon.cje1.test;

public class Test2 {
    static String s1 = "JAVA7";
    
    Test2() {
        System.out.println("Test Class");
    }
    
    static class InnerTest {
        InnerTest() {
            System.out.println("Inner Class");
        }
    }
    
    class InnerClass {
        
    }

    public static void main(String[] args) {
        Test2.InnerTest inner = new InnerTest();
//        "".split(regex)
        Test2.InnerClass inner2 = new Test2().new InnerClass();
        System.out.println("aaaaaaaaaaaaaaa" + Test5.s4 == s1);
        System.out.println("aaaaaaaaaa " + Test5.s4 == s1);
        
        byte y = Byte.parseByte("");
        int x = new Integer(Byte.parseByte(""));
        
        switch (x) {
        case 20:
            
            break;

        default:
            break;
        }
        
        int a = 10;
        int b;
        
        if (a < 100)b = 100;
        if (a >= 100) b= a *10;
        
        System.out.println("The key is: " + b);
            
        
    }
}

class Test5 {
    static String s4 = "JAVA7";
}