package com.leon.cje1.test.braindumps.programmer;

public class EBook extends Book5 {
    public String read(String url) {
        return "View" + url;
    }

}

class Book5 {
    private String read(String bname) {
        return "Read" + bname;
    }
}

class Test5 {
    public static void main(String[] args) {
        Book5 b1 = new Book();
        b1.read("Java Programing");
        Book5 b2 = new EBook();
        b2.read("http://ebook.com/ebook");
    }
}
