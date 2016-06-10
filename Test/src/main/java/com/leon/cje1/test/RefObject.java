package com.leon.cje1.test;

public class RefObject {
    String className = "RefObject";
    String nombre = "";
    
    RefObject() {
        className = "RefObject 200";
    }
    
    static void method1(RefObject o) {
//        o = null;
        o.nombre = "Leon";
    }
    
    public static void main(String[] args) {
        RefObject refObject = new RefObject();
        method1(refObject);
        System.out.println(refObject.className);
        System.out.println(refObject.nombre);
        
    }
}
