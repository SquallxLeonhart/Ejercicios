package com.leon.test;

public class Test23 {
	void readCard(int cardNo) throws Exception {
		System.out.println("");
	}
	
	void checkCard(int cardNo) throws RuntimeException {
		
	}
	
	public static void main(String[] args) {
		Test23 test23 = new Test23();
		test23.checkCard(0);
//		test23.readCard(0);
		
		int x = 5;
		while (isAvailable(x)) {
//			--x;
			System.out.print(--x);	
			
		}
		
		System.out.println("---------------- ");
		x = 5;
		do {
			System.out.println(x-- + " " );
		} while (x == 0);
		
	}
	
	public static boolean isAvailable(int x) {
		return x-- > 0 ? true: false;
	}
}
