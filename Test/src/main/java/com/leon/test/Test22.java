package com.leon.test;

import java.util.ArrayList;

public class Test22 {
	public static void main(String[] args) {
		System.out.println(new Boolean(null));
		
		int x = 100;
		int a = x++; //100
		int b = ++x; //102
		int c = x++; //102
		int d = (a<b) ? ((a<c) ? a : ((b<c) ? b: c)) : c;
		System.out.println(d);
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
		
		ArrayList<Tiger> myList = new ArrayList<>();
		myList.add(new Cat());
		
		
		// /////////////
		
		String [][] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i = 97;
		
		for (int aa = 0; aa < chs.length; aa++) {
			for (int bb = 0; bb < chs.length; bb++) {
				chs[aa][bb] = "" + i;
				i++;
			}
		}
		
		for (String[] strings : chs) {
			for (String string : strings) {
				System.out.println(string + " ");
			}
			System.out.println("");
		}
	}
}

abstract class Animal{}
interface Hunter{}
class Cat extends Animal implements Hunter{}
class Tiger extends Cat{}

