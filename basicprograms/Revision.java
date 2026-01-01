package com.basicprograms;

public class Revision {
	public static void main (String [] args) {
		float a = 3.7F;
		float b = 1.2F;
		float area;
		area = a * b;
		System.out.println("The area of rectangle is " + area);
		
		//Q2 calculate
		float w = 12F;
		float h = 12F;
		double ar;
		ar =  0.5 * w * h ;
		System.out.println("The area of triangle is " + ar);
		
		//Q3 Kg to Grams
		float K = 28F;
		float grams;
		grams =  K * 1000F ;
		System.out.println(K +" kg =" + grams + "g");
		
		//Q4 Change Degree
		double C = 28;
		double F;
		F =  (C * 9/5) + 32 ;
		System.out.println("Value of temperature in Fahrenhit is "+F);
		
		//Q5 Area of Circle
		float r = 3.5F;
        float d;
		float areaa;
		float circumference;
		d = 2 * r;
		circumference = 3.1416F * d;
		areaa = 3.1416F * r * r;
		System.out.println("The diameter of circle is " + d);
		System.out.println("The circumference of circle is " + circumference);
		System.out.println("The area of circle is " + areaa);
        
		
		
		
		

}
}


