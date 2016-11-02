package com.leon.cje1.test.braindumps.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechName {
    String techName;

    TechName(String techName) {
        this.techName = techName;
    }

    public static void main(String[] args) {
        List<TechName> tech = 
                Arrays.asList(new TechName("Java-"), new TechName("Oracle DB-"), new TechName("J2EE-"));
        Stream<TechName> stre = tech.stream();
        
        //stre.forEach(System.out::print);
        stre.map(a-> a.techName).forEach(System.out::print);
//        stre.map(a-> a.techName).forEachOrdered(System.out::print);
    }
}