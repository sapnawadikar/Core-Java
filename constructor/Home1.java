package com.constructor;


public class Home1 {
	
	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("Breeza", "Red");
		
		System.out.println(c1.name);
		System.out.println(c2.name);
	}
}
