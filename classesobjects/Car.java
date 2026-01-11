package com.classesobjects;

public class Car {
	
	public String name;
	public String color;
	public String price;
	
	public void assignValues(String s1, String s2, String s3) {
		name = s1;
		color = s2;
		price = s3;
	}
	
	public void displayValues() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
}