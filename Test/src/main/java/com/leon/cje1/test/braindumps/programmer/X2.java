package com.leon.cje1.test.braindumps.programmer;

public class X2 implements Z {
    public String toString() {
        return "X ";
    }
    
    public static void main(String[] args) {
        Y2 myY = new Y2();
        X2 myX2 = myY;
        Z myZ = myX2;
        
        System.out.println(myY);
        System.out.println((Y2) myX2);
        System.out.println(myZ);
    }
}

interface Z {
    String toString();
}

class Y2 extends X2 {
    public String toString() {
        return "Y ";
    }
}