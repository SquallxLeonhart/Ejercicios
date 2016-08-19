package com.leon.cje1.test.braindumps.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    String course, name, city;

    public Student(String name, String course, String city) {
        this.course = course;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return course + ":" + name + ":" + city;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                new Student ("Jessy", "Java ME", "Chicago"),
                new Student ("Helen", "Java EE", "Houston"),
                new Student ("Mark", "Java ME", "Chicago"));
       
        stds.stream()
                .collect(Collectors.groupingBy(Student::getCourse))
                .forEach((src, res) -> System.out.println(src + res));
    }
}