package com.leon.cje1.test.braindumps.programmer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
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
//        BiFunction<IntUnaryOperator> inFu = x -> y -> x*y;
        IntStream newStream = stream.map(inFu.apply(10));//line n2
//        IntStream newStream = stream.map(inFu.applyAsInt (10));
        newStream.forEach(System.out::println);
        
        //Q3
        System.out.println("Q3-------Q102---------------------");
        List<Integer> values = Arrays.asList (1, 2, 3);
        long x = values.stream()
        .map(n -> n*2)//line n1
        .peek(System.out::println)//line n2
        .count();
        System.out.println("count: " + x);
        
        //Q6
        System.out.println("Q6----------------------------");
        int a = 10;
        int b = -1;
//        assert (b >=1) : "Invalid Denominator";
        int c = a / b;
        System.out.println (c);
        
        //Q11
        System.out.println("----------------------------");
        Stream<List<String>> iStr = 
                Stream.of(
                        Arrays.asList("1", "John"), 
                        Arrays.asList("2", null));

        Stream<String> nInSt = iStr.flatMap((xx) -> xx.stream());
        nInSt.forEach(System.out::println);

        Stream<List<Integer>> iStr2 = 
                Stream.of(
                        Arrays.asList(1, 2), 
                        Arrays.asList(3, 4));
                
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
//            System.out.println ("GDP: " + gdp);
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
        
        
        System.out.println("Q33------Q2----------------------");
        int i;
        char cc;
        try (FileInputStream fis = new FileInputStream("src/main/resources/course.txt");
                InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) { // line n1
                isr.skip(2);
                i = isr.read();
                cc = (char) i;
                System.out.print(cc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
        
        System.out.println("Q38---------Q110-------------------");
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println (
        // line n1
                listVal.stream().filter(x2 -> x2.length()>3).count()
//                listVal.stream().map(x2 -> x2.length()>3).count()
//                listVal.stream().peek(x2 -> x2.length()>3).count().get()
//                listVal.stream().filter(x2 -> x2.length()>3).mapToInt(x2 -> x2).count()
//                listVal.stream().map(x2 -> x2.length()>3).collect(Collectors.toList())
        );
        
        
        System.out.println("Q41-------------Q111---------------");
        List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int ii = 0;
            boolean result = (s.contains("pen"));
//            System.out.println(ii);
            System.out.println(ii++ + ":");
//            System.out.println(ii);
            return result;
        };
        
        str.stream()
            .filter(test)
            .findFirst()
            .ifPresent(System.out::println);
        
        
        System.out.println("Q42----------Q104------------------");
        List<String> empDetails = Arrays.asList("100, Robin, HR",
                "200, Mary, AdminServices",
                "101, Peter, HR");
                empDetails.stream()
                .filter(s-> s.contains("1"))
                .sorted()
                .forEach(System.out::println); //line n1
          
        System.out.println("Q46----------------------------");
        List<Integer> nums = Arrays.asList(10, 20, 8);
        System.out.println(
                nums.stream().max(Comparator.comparing(e -> e)).get()
//                nums.stream().max(Integer :: max).get()
        ); 
//        nums.stream().max();
//        nums.stream().map(a -> a).max();
        
        System.out.println("Q54 ----------------------------");
        List<Integer> codes = Arrays.asList (10, 20);
//        UnaryOperator<Double> uo = s -> s +10.0;
        UnaryOperator<Integer> uo = s -> s + 10;
        codes.replaceAll(uo);
        codes.forEach(c1 -> System.out.println(c1));
        
        System.out.println("Q58 ----------------------------");
        String str3 = "Java is a programming language";
        ToIntFunction<String> indexVal = str3::indexOf; //line n1
        int x3 = indexVal.applyAsInt("Java");//line n2
        System.out.println(x3);
        
        System.out.println("Q59 -----------Q116-----------------");
        List<String> codes2 = Arrays.asList ("DOC", "MPEG", "JPEG");
        codes2.forEach (c4 -> System.out.print(c4 + " "));
        String fmt = codes2.stream()
            .filter (s-> s.contains ("PEG"))
            .reduce((s, t) -> s + t)
            .get();
        System.out.println("\n" + fmt);
        
        System.out.println("Q60 -----------Q66-----------------");
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello : ".concat(s);
        
        nL.stream()
        .map(funVal)
//        .collect(Collectors.toList()).forEach(System.out::println);
        //.forEach(System.out::println);
        .peek(System.out::println);
        
        System.out.println("Q62 ----------------------------");
//        Locale loc1 = "UK";
//        Locale loc2 = Locale.getInstance("ru");
//        Locale loc3 = Locale.getLocaleFactory("RU");
        Locale loc4 = Locale.UK;
        Locale loc5 = new Locale ("ru", "RU");
        
        System.out.println("Q66 ----------------------------");
        LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15); //line n1
        System.out.println(nextYear);
        
        System.out.println("Q67 ----------------------------");
//        BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2;//line n1
        BiFunction<Integer, Double, Double> val = (t1, t2) -> t1 + t2;//line n1
        System.out.println(val.apply(10, 10.5));
        
        System.out.println("Q69 ----------------------------");
//        UnaryOperator<Integer> uo1 = s7 -> s7*2;//line n1
        UnaryOperator<Double> uo1 = s7 -> s7*2;//line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
        .filter(lv -> lv >= 1500)
        .map(lv -> uo1.apply(lv))
        .forEach(s6 -> System.out.print(s6 + " "));
        System.out.println("");
        
        System.out.println("Q77 ----------------------------");
        try {
            Path source = Paths.get("src/main/resources/green.txt");
            Path target = Paths.get("src/main/resources/colors/yellow.txt");
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
//            Files.delete(source);
         
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        
        System.out.println("Q79 ----------------------------");
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);
        
        Stream.of(list1, list2)
        .flatMap(list -> list.stream())
        .forEach(s -> System.out.print(s + " "));
        
//        Stream.of(list1, list2)
//        .flatMap(list -> list.intStream())
//        .forEach(s -> System.out.print(s + " "));
        
//        list1.stream()
//        .flatMap(list2.stream().flatMap(e1 -> e1.stream()))
//        .forEach(s -> System.out.println(s + " "));
        
//        Stream.of(list1, list2)
//        .flatMapToInt(list -> list.stream())
//        .forEach(s -> System.out.print(s + " "));
        
        
        System.out.println("");
        System.out.println("Q80 ----------------------------");
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader (new FileReader("src/main/resources/employee.txt"))) { //line n1
            br.lines().forEach(c5 -> System.out.println(c5));
            brCopy = br;//line n2
            brCopy.ready(); //line n3;
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        System.out.println("Q82 ----------------------------");
        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
        
        System.out.println("Q83 ----------------------------");
        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log");
        
        Path path2 = Paths.get("/server/exe/");
        Path res2 = path2.resolve("/readme/");
        
        System.out.println(res1);
        System.out.println(res2);
        
        System.out.println("Q84 ----------------------------");
        List<String> colors = Arrays.asList("red", "green", "yellow");
        
        Predicate<String> test6 = n -> {
            System.out.println("Searching…");
            return n.contains("red");
        };
        
        System.out.println(colors.stream().filter(c6 -> c6.length() > 3).allMatch(test6));
            
        System.out.println("----Q4------------------------");
        int [] x2 = {6, 7, 8};
        for (int j : x2) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("");
        
        System.out.println("----Q5------------------------");
        StringBuilder message = new StringBuilder("hello java!");
        int pos = 0;
        try {
            for (pos = 0; pos < 12; pos++) {
                switch (message.charAt(pos)) {
                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(message.charAt(pos)).toUpperCase();
                        message.replace(pos, pos + 1, uc);
                }
            }
        } catch (Exception e) {
            System.out.println("Out of limits");
        }
        System.out.println(message);
        
        System.out.println("----Q9------------------------");
//        int[] xx = null;
//        for (int j : xx) {listOfFiles
//            System.out.println(j);
//        }
        
        
        System.out.println("--------Q29------------------------");
            int[] arrar = {1,2,3};
            for ( int i4: arrar ) {
            } 
            
            for(int i5 = 0; i5 < 1; i5++) {
                
            }
            
//            for(;;) {
//                
//            }
            
//            for(; i6 < 1; i6++) {
//                
//            }
//            
//            for(; i7 < 1;) {
//                
//            }
            
            System.out.println("--------Q34------------------------");
            String names[] = new String[3];
            names[0] = "Mary Brown";
            names[1] = "Nancy Red";
            names[2] = "Jessy Orange";
            
            try {
                for (String n : names) {
                    try {
                        String pwd = n.substring(0, 3) + n.substring(6, 10);
                        System.out.println(pwd);
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("string out of limits");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array aout of limits");
            }
            
            System.out.println("--------Q54------------------------");
            int b3 = 3;
            if (!(b3 > 3)) {
                System.out.println("square ");
            } 
            {
                System.out.println("circle ");
            }
            
            System.out.println("...");
            
            System.out.println("--------Q61------------------------");
            int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
            int sum = 0;
            for (int frnt = 0, rear = lst.length - 1 ;
                    frnt < 5 && rear >= 5;
                    frnt++, rear--) {
                sum = sum + lst[frnt] + lst[rear];
            }
            System.out.println(sum);
            
            System.out.println("--------Q78------------------------");
            String product = "pen";
            product.toLowerCase();
            product.concat(" BOX".toLowerCase());
//            System.out.println(product.substring(4, 6));
            
            System.out.println("--------Q80------------------------");
            String message2 = "Hi everyone!";
            System.out.println("message = " + message2.replace("e", "X"));
            
            System.out.println("--------Q83------------------------");
            int num = 5;
            int sum4;
            
            do {
//                sum4 += num;
            } while ((num--) > 1);
            
//            System.out.println("The sum is " + sum4 + ".");
            
            System.out.println("--------Q94------------------------");
            int ar1[] = {2, 4, 6, 8};
            int ar2[] = {1, 3, 5, 7, 9};
            ar2 = ar1;
            for (int e2 : ar2) {
                System.out.println(" " + e2);
            }
            
            System.out.println(String.valueOf(14180825003981233l));
            
            System.out.println("--------Q99------------------------");
            Stream<Path> paths = 
                    Stream.of(
                            Paths.get("src/main/resources/data.doc"), 
                            Paths.get("src/main/resources/data.txt"), 
                            Paths.get("src/main/resources/data.xml"));
            
            paths.filter(s -> s.toString()
                                .endsWith("txt"))
                                .forEach(s -> {
                                    try {
                                        Files.readAllLines(s)
                                             .stream()
                                             .forEach(System.out::println); // line n1
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        System.out.println("Exception");
                                    }
                                });
            
            
            System.out.println("--------Q100------------------------");
            int i4 = 10;
            int j4 = 20;
            int k4 = j4 += i4 / 5;
            
            System.out.println(i4 + " : " +  j4 + " : " + k4);
            
            System.out.println("--------Q106------------------------");
            try {
                String theString = "Hellow World";
                System.out.println(theString.length());
                System.out.println(theString.charAt(11));
            } catch (Exception e2) {
                e2.printStackTrace();
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
