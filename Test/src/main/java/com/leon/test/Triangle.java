package com.leon.test;

public class Triangle {
	static double area;
	int b = 2, h = 3;
	
	public static void main(String[] args) {
		double p, b, h;
		
		if (area == 0) {
			b = 3;
			h = 4;
			p = 0.5;
		}
		
//		area = p * b * h;
		
		System.out.println(area);
		
		//////////////////
		Byte x = 1;
//		short x = 1;
//		String x = "1";
//		Long x = 1;
//		Double x = 1;
//		Integer x = new Integer("1");
		
		switch (x) {
		case 1:
			System.out.println("One");
			break;

		case 3:
			System.out.println("Two");
			break;
		}
		
		/////////////////////
		Boolean[] bool = new Boolean[2];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		
		System.out.println(bool[0] + " " + bool[1]);
		
	}
}
