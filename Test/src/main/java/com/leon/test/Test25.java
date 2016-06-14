package com.leon.test;

public class Test25 {
	static int count = 0;
	int i = 0;
	
	public void changeCount() {
		while(i < 5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Test25 check1 = new Test25();
		Test25 check2 = new Test25();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " + check2.count );
		
		System.out.println(1<0 ? true : false);
		
		
		String planets[] = {"Mercury", "Venus", "Earth", "Mars"};
		System.out.println(planets.length);
		System.out.println(planets[1].length());
	}
}

