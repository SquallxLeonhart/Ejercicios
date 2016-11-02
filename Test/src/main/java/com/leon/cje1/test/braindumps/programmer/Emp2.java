package com.leon.cje1.test.braindumps.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp2 {
    private String eName;
    private Integer eAge;
    Emp2(String eN, Integer eA) {
    this.eName = eN;
    this.eAge = eA;
    }
    public Integer getEAge () {return eAge;}
    public String getEName () {return eName;}
    
    public static void main(String[] args) {
        System.out.println("Q64 ----------------------------");
        List<Emp2>li = Arrays.asList(new Emp2("Sam", 20), new Emp2("John", 60), new Emp2("Jim", 51));
        
        Predicate<Emp2> agVal = s -> s.getEAge() > 50;//line n1
        
        li = li.stream().filter(agVal).collect(Collectors.toList());
        
        Stream<String> names = li.stream().map(Emp2::getEName);//line n2
        
        names.forEach(n -> System.out.print(n + " "));
    }
}
