package com.leon.cje1.test.braindumps.programmer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
    String fName;
    String lName;

    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
    
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Emp [fName=" + fName + ", lName=" + lName + "]";
    }

    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList (
                new Emp ("John", "Smith"),
                new Emp ("Peter", "Sam"),
                new Emp ("Thomas", "Wale"));
                emp.stream()
                //line n1
                .sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
//                .sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
                .collect(Collectors.toList()).forEach(System.out::println);
                
                System.out.println("--------------------------------------");
                
                List<Emp> emp2 = Arrays.asList (
                        new Emp ("John", "Smith"),
                        new Emp ("Peter", "Sam"),
                        new Emp ("Thomas", "Wale"));
                        emp2.stream()
                        //line n1
                        .map(Emp::getfName)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
       
    }
}