package com.leon.test;

public class App {
	String myStr = "7007";
	
	public void doStuff(String str) {
		int myNum = 0; 
		
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
			
		} catch (NumberFormatException e) {
			System.out.println("Error");
		}
		
		System.out.println("myStr: " + myStr + " myNum: " + myNum);
	}
	
	public static void main(String[] args) {
		App obj = new App();
		obj.doStuff("9009");
		
		///////////////////
		int nums1[] = new int[3];
		int nums2[] = {1,2,3,4,5};
		
		nums1 = nums2;
		
		for (int i : nums1) {
			System.out.println(i);
		}
	}
}
