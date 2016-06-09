package com.leon.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {
	public Person(int age) {
		this.age = age;
	}
	int age;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		String[][] arr = {{"A", "B", "C"},{"D","E"}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + "");
				if (arr[i][j].equals("B")) {
					break;
				}
			}
			continue;
		}
		
		String str = " ";
		str.trim();
		System.out.println(str.equals("") +  " " + str.isEmpty());
	}
}

class TestPerson {
	public static void checkAge(List<Person> list, Predicate<Person> predicate) {
		for (Person person : list) {
			if (predicate.test(person)) {
				System.out.println(person.getAge());
			}
		}
	}
	
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person(45), 
										  new Person(40),
										  new Person(8));
		
		checkAge(list,  (Person p) -> p.getAge() > 40);
	}
}
