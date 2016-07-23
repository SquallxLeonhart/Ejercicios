package com.leon.cje1.professional.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassLambda {
    
    public static void main(String[] args) {
        Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y;
        
        Arrays.asList(1,2,5).stream()
            .map(makeAdder)
            .forEach(t -> System.out.println(t.apply(1)));
        
        System.out.println(Optional.ofNullable(null));
        
        
        Optional<String> optional = Optional.ofNullable(null);
        
        optional.map(String::trim)
//                .orElse( " xxxxyyyy  ");
                .ifPresent(System.out::println);
        
        System.out.println(optional.map(String::trim)
                .orElse( " xxxxyyyy  "));
        
        System.out.println(optional.map(String::trim)
                .orElseGet(() -> " AAABBB"));
        
//        System.out.println(optional.map(String::trim)
//                .orElseThrow(IllegalArgumentException::new));
        
        String[] string = "you never know what you have until you clean your roomxx".split(" ");
        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        System.out.println(Arrays.stream(string).max(lengthCompare).get());
        
        IntStream.rangeClosed(1, 5)
            .forEach(System.out::println);
        
        System.out.println(IntStream.rangeClosed(1, 5)
                .reduce((x, y) -> x * y ).getAsInt());
        
        System.out.println(IntStream.rangeClosed(1, 5)
                .sum());
        
        fill(new ArrayList<Number>(), 1);
        
        
        NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
        examScores.put(90, "Sophia");
        examScores.put(20, "Asabella");
        examScores.put(10, "Emma");
        examScores.put(50, "Olivea");
        System.out.println("The data in the map is: " + examScores);
        System.out.println("The data descending order is: " + examScores.descendingMap());
        System.out.println("Details of those who passed the exam: " + examScores.tailMap(40));
        System.out.println("Details of those who DONT pass the exam: " + examScores.headMap(40));
        System.out.println("The lowest mark is: " + examScores.firstEntry());
        
        List words =
                Arrays.asList("follow your heart but take your brain with you".split(" "));
                Comparator<String> lengthCompare2 = (str1, str2) -> str1.length() - str2.length();
                
        words.stream().distinct().sorted(lengthCompare2).forEach(System.out::println);
        
        
        System.out.println("---------------------");
        String []string2= "you never know what you have until you clean your room".split(" ");
        
        Arrays.stream(string2).distinct().forEach(System.out::println);
        
//        Arrays.stream(string)
//        .map(word -> word.split(""))
//        .distinct()
//        .forEach(System.out::print);
        
        Arrays.stream(string)
        .flatMap(word -> Arrays.stream(word.split("")))
        .distinct()
        .forEach(System.out::println);
        
        System.out.println("---------------------");
        Arrays.asList(1,2,3,4,5,6)
        .parallelStream()
        .forEach(s -> System.out.print(s+" "));
    }
    
    public static <T, R extends Number> void fill(List<T> list, R val) {
        
    }

}
