package com.leon.test;

public class Product {
	int id;
	String name;
	double price;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Product(){}
	
	public static void main(String[] args) {
		Product p1 = new Product(101, "Pen");
		Product p2 = new Product(101, "Pen");
		Product p3 = p1;
		boolean ans1 = p1 == p2;
		boolean ans2 = p1.name.equals(p2.name);
		System.out.println(ans1 + ":" + ans2);
	}
}

class TestUno {
    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }
    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;
        
        TestUno test = new TestUno();
        test.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
        
        ///////////////////////
        int aVar = 9;
        if (aVar++ < 10) {
            System.out.println("Hello World");
        } else
            System.out.println("Hellow Universe");
        
    }
}
