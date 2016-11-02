package com.leon.cje1.test.braindumps.programmer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FileThread implements Runnable {
    String fName;

    public FileThread(String fName) {
        this.fName = fName;
    }

    public void run() {
        System.out.println(fName);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("C:\\apache-maven-3.3.3"));
        listOfFiles.forEach(line -> {
            executor.execute(new FileThread(line.getFileName().toString())); // line n1
        });
        
//        listOfFiles.forEach(line -> {
//            new FileThread(line.getFileName().toString()); // line n1
//        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS);// line n2
    }
}
