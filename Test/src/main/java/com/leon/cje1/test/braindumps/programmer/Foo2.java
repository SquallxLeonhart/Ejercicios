package com.leon.cje1.test.braindumps.programmer;

import java.util.ArrayList;
import java.util.List;

public class Foo2<K, V> {
    private K key;
    private V value;

    public Foo2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo2<T, T> twice(T value) {
        return new Foo2<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public static void main(String[] args) {
        Foo2<String, Integer> mark = new Foo2<String, Integer> ("Steve", 100);
        System.out.println(mark.getKey() + " " + mark.getValue());
        
        Foo2<String, String> pair = Foo2.<String>twice ("Hello World!");
        System.out.println(pair.getKey() + " " + pair.getValue());
        
        Foo2<?, ?> percentage = new Foo2<>(97, 32);
        System.out.println(percentage.getKey() + " " + percentage.getValue());
        
        Foo2<String, String> grade = new Foo2 <> ("John", "A");
        System.out.println(grade.getKey() + " " + grade.getValue());
        
     // illegal code – assume that the following intialization is allowed
        List<?> intList = new ArrayList<Integer>();
//        intList.add(new Integer(10)); // okay
//        intList.add(new Float(10.0f)); // oops!
//        System.out.println(intList.get(0).getClass());
//        System.out.println(intList.get(1).getClass());
    }
}