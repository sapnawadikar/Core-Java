package com.basicprograms;

public class BasicPrograms {
	public static void main(String [] args)
	{
		//Q1.WAP  ro convert litre to ml
		float liter = 5.2F;
		float ml;
		ml =  liter * 1000;
		System.out.println(liter+ "liter =" +ml+ "ml");		
		
        //Q2.WAP to find average of 5 numbers.
		int num1 = 57, num2= 87,num3 = 68, num4 = 98, num5= 88;
		int SumOfTotalNumbers = num1+num2+num3+num4+num5;
	    double Average = SumOfTotalNumbers/5;
		System.out.println("Average of 5 numbers is = "+Average);		
		
		
		
		//Q3.WAP to print unit place digit of a number.
		int number = 789;
		int UnitPlace = number % 10;
		System.out.println("Unit place of  "  +   number  + " is " +UnitPlace) ;
		
		
		
		
		//Q4.WAP to print ten's place digit of a number.
		
		int num = 7225;
		int TensPlace = (num/10) % 10;
		System.out.println("Tens place of  "  +   num + " is " +TensPlace) ;
		
	
		
		
	}
	

}
