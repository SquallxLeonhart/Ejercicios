package com.leon.test;

public interface A {

}

class B implements A{
	Object get() {
		return "";
	}
}
class C extends B{
	String get() {
		return "";
	}
}

class Test {
	public static void main(String[] args) {
		A a1 = new B();
		A b1 = new C();
		
		a1 = b1;
		
		C b2 = (C) a1;
		
		A [] a2 = new A [10];
		A [][] a3 = new A[10][];
		a3[0] = new A[5];
		System.out.println(a2[0]);
		System.out.println(a3[1][0]);		
	}
}
