package com.leon.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

class Test1 {
//	static int i =j;
	static int j = 1;
	public static void main(String[] args) {
		Collection<? extends Number> foo = new ArrayList<Number>();
		
		foo.add(null);
		
			A a1 = new B();
			A b1 = new C();
			
			a1 = b1;
			
			C b2 = (C) a1;
			
			String str = "Java*JSP*EJB*J2EE";
			
//			System.out.println(Arrays.toString(str.split("*", -2)));
//			new Boolean("sdfdf");
			
			new ArrayList();
			
			A [] a2 = new A [10];
			A [][] a3 = new A[10][10];
			a3[0] = new A[5];
			System.out.println(a2[0]);
			System.out.println(a3[1][0]);
			
//			System.out.println(Double.valueOf("aa"));
			boolean b11= true;
			Boolean b22= false;
			if(b11&&b22 == true) {
				System.out.println("INSIDE IF");
			} else {
				System.out.println("OUTSIDE IF");
			}
			
			String s1 = new String("Java");
			String s3 = "Jaya";
			String s4 = "Jaya";
			String s2 = s1.replace('v', 'y');
			System.out.println(s2==s3);
			System.out.println(s3==s4);
			
			Test1 test1 = new Test1();
			Test1.StaticClassA staticA= test1.new StaticClassA();
			
			LocalDate date1 = LocalDate.now();
			System.out.println(date1.with(TemporalAdjusters.lastDayOfMonth()).minusDays(0));
			
			Month month = Month.JANUARY;
			System.out.println(month.getDisplayName(TextStyle.FULL, Locale.US));
			System.out.println(month.getDisplayName(TextStyle.NARROW, Locale.US));
			System.out.println(month.getDisplayName(TextStyle.SHORT, Locale.US));
			
			byte byte1= Byte.parseByte("22");
			short short1 = 1;
			new Integer(short1);
			
			System.out.printf("%d%n",Month.FEBRUARY.maxLength());
			System.out.printf("%d%n",Month.FEBRUARY.maxLength());
			test1.testMethod();
	}
	
	public void testMethod() {
		try {
			System.out.println("testMethod");
			getBalance(new Integer(1));
			
			new HashSet();
			return;
		} finally {
			System.exit(0);
			System.out.println("testMethod finally");
		}
	}
	
	void getBalance(double x) {
		
	}
	
	 abstract class TestAbstract{}
	 
	 class StaticClassA{
		 StaticClassA() {
			 System.out.println("StaticClassA");
		 }
	 }
}
