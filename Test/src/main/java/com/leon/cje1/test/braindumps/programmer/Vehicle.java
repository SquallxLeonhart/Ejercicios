package com.leon.cje1.test.braindumps.programmer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Vehicle {
    int distance;// line n1

    Vehicle(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) {// line n2
        int timeTravel = time;// line n3
        class Car {
            int value = 0;

            public void speed() {
                value = distance / timeTravel;
                System.out.println("Velocity with new speed " + value + " kmph");
            }
        }
        new Car().speed();
    }
    
    // Q1
    public static void main(String[] args) {
        Vehicle v = new Vehicle (100);
        v.increSpeed(60);
        
        System.out.println("----------------------------");
         //Q2
        IntStream stream = IntStream.of (1,2,3);
//        IntFunction<Integer> inFu= x -> y -> x*y;//line n1
        IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
//        IntFunction<UnaryOperator> inFu = x -> y -> x*y;
        IntStream newStream = stream.map(inFu.apply(10));//line n2
//        IntStream newStream = stream.map(inFu.applyAsInt (10));
        newStream.forEach(System.out::println);
        
        //Q3
        System.out.println("----------------------------");
        List<Integer> values = Arrays.asList (1, 2, 3);
        long x = values.stream()
        .map(n -> n*2)//line n1
        .peek(System.out::println)//line n2
        .count();
        System.out.println("count: " + x);
        
        //Q6
        System.out.println("----------------------------");
        int a = 10;
        int b = -1;
//        assert (b >=1) : "Invalid Denominator";
        int c = a / b;
        System.out.println (c);
        
        //Q11
        System.out.println("----------------------------");
        Stream<List<String>> iStr = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));

        Stream<String> nInSt = iStr.flatMap((xx) -> xx.stream());
        nInSt.forEach(System.out::println);

        Stream<List<Integer>> iStr2 = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4));
                
        IntStream nInSt2 = iStr2.flatMapToInt((xx) -> xx.stream().mapToInt(yy -> yy));
        nInSt2.forEach (System.out :: println);
        
        //Q12
        System.out.println("Q12----------------------------");
        try {
            Path file = Paths.get ("src/main/resources/courses.txt");
            List<String> fc = Files.readAllLines(file);
            fc.stream().forEach (s -> System.out.println(s));
            
            Stream<String> fc2 = Files.lines (file);
            fc2.forEach (s -> System.out.println(s));
        } catch (IOException e) {
            // TODO: handle exception
        }
        
      //Q3
        System.out.println("Q13----------------------------");
        try {
            recDelete("C:\\Users\\e00487\\Documents\\theProjectsdirectory");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Q14----------------------------");
        try {
            doStuff();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
        System.out.println("Q16----------------------------");
        Map<Integer, String> books = new TreeMap<>();
        books.put (1007, "A");
        books.put (1002, "C");
        books.put (1001, "B");
        books.put (1003, "B");
        System.out.println (books);
        
        System.out.println("Q18----------------------------");
        try {
            //welcome1="Good day!"
            Properties prop = new Properties ();
            FileInputStream fis = new FileInputStream("src/main/resources/Message.properties");
            prop.load(fis);
            System.out.println(prop.getProperty("welcome1"));
            System.out.println(prop.getProperty("welcome2", "Test"));//line n1
            System.out.println(prop.getProperty("welcome3"));
        } catch (IOException e) {
            // TODO: handle exception
        }
        
        System.out.println("Q20----------------------------");
        Path p1 = Paths.get("/Pics/MyPic.jpeg");
        System.out.println (p1.getNameCount() +
        ":" + p1.getName(1) +
        ":" + p1.getFileName() + p1.toAbsolutePath());
        
        
        System.out.println("Q22----------------------------");
        try {
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
            System.out.print ("Enter GDP: ");
//            int gdp = Integer.parseInt (br.readLine());
//            int gdp = br.read();
//            System.out.print ("GDP: " + gdp);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Q23----------------------------");
        try {
            Path source = Paths.get ("src/main/resources/data/december/log.txt");
            Path destination = Paths.get("src/main/resources/data/log2.txt");
            Files.copy (source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Q31----------------------------");
        try ( Stream<Path> files = Files.walk(Paths.get("C:\\apache-maven-3.3.3"));){
            //Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
           
            files.forEach (fName -> {//line n1
                try {
                    Path aPath = fName.toAbsolutePath();//line n2
                    System.out.println(fName + ": creation time: "
                            + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
                    );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void recDelete(String dirName) throws IOException {
        File[] listOfFiles = new File(dirName).listFiles();
        if (listOfFiles != null && listOfFiles.length > 0) {
            for (File aFile : listOfFiles) {
                if (aFile.isDirectory()) {
                    recDelete(aFile.getAbsolutePath());
                } else {
                    if (aFile.getName().endsWith(".class"))
                        aFile.delete();
                }
            }
        }
    }
    
    static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
        if (Math.random() > -1) 
                throw new Exception ("Try again");
         }
}
