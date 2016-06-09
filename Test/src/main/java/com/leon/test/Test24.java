package com.leon.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test24 {
	String name;
	boolean contract;
	double salary;
	
	static int i;
	int j;
	
	Test24() {
		this.name = new String("Joe");
		this.contract = new Boolean(true);
		this.salary = new Double(100);
	}
	
	public String toString(){
		return name + ":" + contract + ":" + salary;
	}
	
	public static void main(String[] args) {
		Test24 test24 = new Test24();
//		test24.name = "Joe";
//		test24.contract = true;
//		test24.salary = 100;
		
		System.out.println(test24);
		
		
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if (names.remove("Bran")) {
			names.remove("Jon");
		}
		
		System.out.println(names);
		
		//////////////
		Test24 test24_2 = new Test24();
		test24.i = 3;
		test24.j = 4;
		test24_2.i = 5;
		test24_2.j = 6;
		
		System.out.println(
				test24.i + " " +
						test24.j + " " +
						test24_2.i + " " +
						test24_2.j );
		
		
		
		
		
		//////////////////////
		
		int ii = 0;
		int jj = 7;
		for (ii = 0; ii < jj - 1; ii = ii + 2) {
			System.out.println();
		}
		
		//////////////////
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2016, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		///////////////
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		
		String str2 = str1;
		
		
		System.out.println(str1 == str2);
	}
	
	
	class A{
		public A(){
			
		}
	}
	
}
