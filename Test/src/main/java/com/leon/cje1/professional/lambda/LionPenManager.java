package com.leon.cje1.professional.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LionPenManager {
    static int x = 0;

    private void removeAnimals() {
        System.out.println("Removing animals");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addAnimals() {
        System.out.println("Adding animals");
    }

    // public void performTask() {
    // removeAnimals();
    // cleanPen();
    // addAnimals();
    // }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeAnimals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle checked exceptions here
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4,
                                                () -> System.out.println("*** Pen Cleaned!"));

            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1, c2));
        } finally {
            if (service != null)
                service.shutdown();
        }
        
        System.out.println("------------Parrallel Stream-----------------");
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        
        Arrays.asList(1, 2, 3, 4, 5, 6)
            .parallelStream()
            .map(i -> {
                data.add(i);
                return i;
            }) // AVOID STATEFUL LAMBDA EXPRESSIONS!
            .forEachOrdered(i -> System.out.print(i + " "));
        
        System.out.println();
        
        for (Integer e : data) {
            System.out.print(e + " ");
        }
        
        System.out.println("---------Collect()--------");
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        
        SortedSet<String> set = 
                stream
                .collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        
        System.out.println(set); // [f, l, o, w]
        
        
        
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = 
                ohMy
                .collect(Collectors.toConcurrentMap(String::length, 
                                                    k -> k,
                                                    (s1, s2) -> s1 + "," + s2));
        
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
        
        
        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
        Collectors.groupingByConcurrent(String::length));
        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}
        
        
    }
}
