package com.leon.cje1.test.braindumps.programmer;

public class TestCall {
    public static void main(String[] args) {
        Caller2 c = new Caller2();
        c.start();
        c.init();
    }
}

class Caller2 {
    private void init() {
        System.out.println("Initialized");
    }
    
    public void start() {
        init();
        System.out.println("Started");
    }
}
