package com.methods;


public class Mathematics {
	
	public void prime(int num) {
		
		boolean divisible = false;
		for (int i = 2; i < num; i++)
			if(num%i == 0)
				divisible = true;
		
		if (divisible)
			System.out.println(num + " is not prime");
		else
			System.out.println(num + " is prime");
	}
	
	public void Armstrong(int num) {
		
		int pow = 0; int copy = num;
		while (num != 0) {
			num/=10; pow++; 
		}
		num = copy;
		int digit, sum = 0, mult = 1;
		
		while (num != 0) {
			digit = num%10;
			for (int i = 1; i <= pow; i++) {
				mult*=digit;
			}
			sum+=mult;
			mult = 1;
			num/=10; 
		}
		if(sum == copy)
			System.out.println(copy + " is armstrong number");
		else
			System.out.println(copy + " is NOT armstrong number");
	}
	
	public void palindrome(int num) {
		
		int copy = num, rev = 0;
		while (num != 0) {
			rev = (rev * 10) + num%10;
			num/=10; 
		}
		if(rev == copy)
			System.out.println(copy + " is palindrome");
		else
			System.out.println(copy + " is NOT palindrome");
	}
}
