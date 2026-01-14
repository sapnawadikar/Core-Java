package com.methods;

public class Day8_Methods {

		//1.
			public void printpatterns()
			{
				for (int i = 1; i<=5; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(j + " ");
					}
		            System.out.println();
				}
				}
			
			//2. 
			public void pattern()
			{
				int num = 1;
				for (int i = 1; i<=4; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(num + " ");
						num++;
					}
		            System.out.println();
				}
				}
			
			//3.
			public void printchar()
			{
				for (int i = 1; i<=5; i++) {
					char ch = 'a';
					for(int j=1; j<=i; j++) {
						System.out.print(ch + " ");
					ch++;
					}
		            System.out.println();
				}
				}
			
			//4.
			public void patterns1()
			{
				char ch = 'a';
				for (int i = 1; i<=4; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(ch + " ");
						ch++;
					}
		            System.out.println();
				}
				}
			//5.
			 public  void printPattern() {
				 int rows = 5;
			        for (int i = rows; i >= 1; i--) {
			            for (int j = 1; j <= i; j++) {
			                System.out.print("*");
			            }
			            System.out.println(); 
			        }
			    }
	   ///6. count digits
			 public  int countDigits() {
	         int number = 88;
			        int count = 0;
			        if (number == 0) {
			            return 1;
			        }

			        while (number > 0) {
			            number = number / 10;
			            count++;
			        }

			        return count;
			    }
			 
			 
			 
			//7. WAM to print the unit place digits of all odd numbers between 1 to 25.
			 public  void printUnitDigits() {
			        System.out.println("Unit place digits of all odd numbers between 1 to 25 :");
			        for (int i = 1; i <= 25; i += 2) {
			            int unitDigit = i % 10;
			            System.out.println("numbers: " + i + ", unit place: " + unitDigit);
			        }
			 }
			        
			        
			        
			//8. WAM to print alternate digits of a number
			        public  void printAlternateDigits() {
			        	int number = 12345;
			            String numStr = String.valueOf(Math.abs(number));
			            System.out.println("alternate numbers:");
			            for (int i = 0; i < numStr.length(); i += 2) {
			                System.out.print(numStr.charAt(i) + " ");
			            }
			        }
			        
	       
			        
			 //9.WAM to return "Valid" if the number is even and between 35 to 65, else return "Invalid.
			        public  String validateNumber(int number1) {
			        	
			            if (number1 % 2 == 0 && number1 >= 35 && number1 <= 65) {
			                return "Valid";
			            } else {
			                return "Invalid";
			            }
			        }
			 

			 //10.WAM to simulates a basic ATM transaction.
			        
			        
			        
			 //11.WAM that checks whether a given year is a leap year or not.
			        public static boolean isLeapYear(int year) {
			            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			        }

					public static boolean ismethodcall(int year) {
						return false;
					}
			    
			    

			 //12.Design a method that calculates EMI based on principal, rate of interest, and time.
	public static double calculateEMI(double principal, double rate, int time) {
	    double monthlyRate = rate / (12 * 100);
	    int months = time * 12;
	    double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
	                 (Math.pow(1 + monthlyRate, months) - 1);
	    return emi;
	}
	

}
