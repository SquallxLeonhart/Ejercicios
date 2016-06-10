package com.leon.cje1.test.braindumps;

public class MyString {
    String msg;
    
    MyString(String msg) {
        this.msg = msg;
    }
    
    public static void main(String[] args) {
        System.out.println(new StringBuilder("Java SE 8"));
        System.out.println(new MyString("Java SE 8"));
        
        ////////////////////
        
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        iVar = fVar;
        fVar = iVar;
        dVar = fVar;
        fVar = dVar;
        dVar = iVar;
        iVar = dVar;
       
    }
}
