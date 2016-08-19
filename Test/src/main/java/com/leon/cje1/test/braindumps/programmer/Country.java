package com.leon.cje1.test.braindumps.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Country {
    public enum Continent {
        ASIA, EUROPE
    }

    String name;
    Continent region;

    public Country (String na, Continent reg) {
    this.name = na;
    this.region = reg;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return region;
    }
    
    public static void main(String[] args) {
        List<Country> couList = 
                Arrays.asList(
                        new Country("Japan", Country.Continent.ASIA),
                        new Country("Italy", Country.Continent.EUROPE), 
                        new Country("Germany", Country.Continent.EUROPE));

        Map<Country.Continent, List<String>> regionNames = 
                couList.stream()
                .collect(
//                        Collectors.groupingBy(Country::getContinent)); 
                        Collectors.groupingBy(Country::getContinent, 
                                              Collectors.mapping(Country::getName, 
                                                                 Collectors.toList())));
        System.out.println("size: " + regionNames.size());
        System.out.println(regionNames);
        
        for (Map.Entry<Country.Continent, List<String>>  entry: regionNames.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}