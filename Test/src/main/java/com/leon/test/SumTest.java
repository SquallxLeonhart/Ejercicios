package com.leon.test;

public class SumTest {
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer");
	}
	
	public static void doSum(double x, double y) {
		System.out.println("double");
	}
	
	public static void doSum(int x, int y) {
		System.out.println("int");
	}
	
	public static void doSum(float x, float y) {
		System.out.println("float");
	}
	
	public static void main(String[] args) {
		doSum(10, 20);
		doSum(10.0, 20.0);
		
		String[] strs = new String[2];
		int idx = 0;
		
		for (String s : strs) {
			strs[idx].concat("element ");
			idx++;
		}
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[idx]);
		}
		
	}
	
	
}
