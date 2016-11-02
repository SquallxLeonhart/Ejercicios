package com.leon.cje1.test.braindumps.programmer;

import java.util.function.Consumer;
import java.util.function.Supplier;

//Q7
class Bird {
    public void fly() {
        System.out.println("Can fly");
    }
}

class Penguin extends Bird {
    public void fly() {
        System.out.println("Cannot fly");
    }
}

public class Birdie {
    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);
    }
    
    //static void fly (Supplier<? extends Bird> bird) {
    static void fly (Supplier<Bird> bird) {
        bird.get().fly();
    }
    
//    static void fly2 (Consumer<Bird> bird) {
//        bird::fly();
//    }
    
//    static void fly3 (Consumer<? extends Bird> bird) {
//        bird.accept(new Bird()).fly ();
//     }
}
