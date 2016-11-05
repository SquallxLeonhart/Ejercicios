package com.leon.cje1.test.braindumps.programmer;

public class X3 {
    public void mX() {
        System.out.println("Xm1");
    }
    
    public static void main(String[] args) {
        X3 xref = new Y3();
        Y3 yref = (Y3) xref;
        
        yref.mY();
        yref.mX();
    }
}


class Y3 extends X3 {
    public void mX() {
        System.out.println("Xm2");
    }
    
    public void mY() {
        System.out.println("Ym");
    }
}