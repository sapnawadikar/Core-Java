package com.conditionalstatements;

public class conditional{
	public static void main(String [] args)
	{
		//1.WAP to check if number is greater than 10 or not
		int g2 = 15;{
		if (g2 > 10 ) {
	        System.out.println("The number is greater than 10.");
	    } else {
	        System.out.println("The number is not greater than 10.");
	    }
		

		//2.WAP to check if the number is completely divisible by 5 or not
	    int h = 15;{
	    if (h % 5 == 0) {
	     System.out.println(h + " is completely divisible by 5."); 
	    } else {
	    System.out.println(h + " is not completely divisible by 5."); 
	}
   }


		//3.WAP to check if the symbol is dollar or not
	    char symbol = '$';
	    if (symbol == '$') {
	    System.out.println("The entered symbol is a dollar sign.");
	    } else {
	    System.out.println("The entered symbol is NOT a dollar sign.");
	}
}
	  //4.WAP to print single digit number in words
	    int number = 9;{
	    if (number == 9) {
	        System.out.println("Nine");
	    }
	    }
	   
	    //5.WAP to perform addition of a and b if the symbol is '+', print subtraction of a and b if the symbol is '-' and so on.
	   char symbol1 = '+';
	   int a = 5;
	   int b = 8;
	   {
	   if (symbol1 == '+') {
	        System.out.println("Result: " + (a + b));
	    } else if (symbol1 == '-') {
	        System.out.println("Result: " + (a - b));
	    } else if (symbol1 == '*') {
	        System.out.println("Result: " + (a * b));
	    } else if (symbol1 == '/') {
	        if (b != 0) {
	            System.out.println("Result: " + (a / b));
	    } else {
	              System.out.println("Invalid operator!");
	    }
	    }
}
	 //Q.WAP to check if the number is prime or not.
	     
	
				
		
		
		
		
		
	 		//Q.WAP to check whether if the number is armstrong or not.
	int num= 153;
			int pow = 0; 
			int copy = num ;
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

}


	
	 		//Q.WAP to check if the number is palindrome or not.
     	

