package com.leon.cje1.test.braindumps.programmer;

public class MoveableClass {

    public static void main(String[] args) {
        Moveable<Integer> animal = (Integer n) -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);
        
//        Moveable animal2 = (Object n) -> System.out.println(n);
//        animal2.run(100);
//        animal3.walk(20);
//        
//        Moveable<Integer> animal3 = n ->n + 10;
//        animal3.run(100);
//        animal3.walk(20);
    }

}

interface Moveable<Integer> {
    public default void walk(Integer distance) {
        System.out.println("Walking");
    }

    public void run(Integer distance);
}