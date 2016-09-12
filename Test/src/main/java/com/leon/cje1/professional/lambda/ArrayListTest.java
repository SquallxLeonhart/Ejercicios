package com.leon.cje1.professional.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayListTest implements Runnable {
    private CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();
    private List<String> wordList2 = new ArrayList<>();
    
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool(); 
        ArrayListTest test = new ArrayListTest();
        
        ex.submit(test);
        ex.submit(test);
        
        ex.shutdown();
        System.out.println(test.wordList);
    }
    
    @Override
    public void run() {
        wordList.add("A");
        wordList.add("B");
        wordList.add("C");
    }

}
