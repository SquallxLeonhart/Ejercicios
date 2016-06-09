package com.leon.test;

import java.util.ArrayList;

public class Base {
	public void test() {
		System.out.println("Base");
	}
	
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String [] myArray;
		try {
//			while (true) {
//				myList.add("My String");
//				System.out.println("Added String");
//			}
		} catch (RuntimeException e) {
			System.out.println("Runtime");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Ready to use");
		
		
		System.out.println("" + 3+ 4);
		System.out.println("" + (3+ 4));
	}
}

class DerivedA extends Base {
	public void test() {
		System.out.println("DerivedA");
	}
}

class DerivedB extends Base {
	public void test() {
		System.out.println("DerivedB");
	}
	
	public static void main(String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		
		b1.test();
		b4.test();
	}

}