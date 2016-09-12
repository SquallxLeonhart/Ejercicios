package com.leon.cje1.test.braindumps.programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book2 implements Comparator<Book2> {
    String name;
    double price;

    public Book2() {
    }

    public Book2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compare(Book2 b1, Book2 b2) {
        return b1.name.compareTo(b2.name);
    }

    public String toString() {
        return name + ":" + price;
    }

    public static void main(String[] args) {
        List<Book2> books = Arrays.asList(
                new Book2("Beginning with Java", 2), 
                new Book2("A Guide to Java Tour", 3));
        Collections.sort(books, new Book2());
        System.out.print(books);
    }
}