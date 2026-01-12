

package com.conditionalstatements;

public class nested {
	public static void main(String[] args) {
		//1.WAP to check if the symbolis digit or not.
        char symbol = '7'; 
         if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " is a digit.");
        } else {
            System.out.println(symbol + " is not a digit.");
        }
         
         
         
         //2.WAP to check if the symbil is alphabet or not.
         char symbol1 = 'D'; 
         if (symbol1 >= 'A' && symbol1 <= 'Z') {
            System.out.println(symbol1 + " is a alphabet.");
        } else {
            System.out.println(symbol1 + " is not a alphabet.");
        }
         
         
         
         //3.WAP to check if the alphabet is vowel or not.
         char ch = 'b';
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
             || ch == 'u') {
             System.out.println(ch+" is a vowel");
         }else {
             System.out.println(ch+" is a consonant");
       }
         
         
         
         //4.WAP to check if the number is two digit or not.
         int number =55;
         if (number >= 10 && number <= 99) {
             System.out.println(number + " is a two-digit number.");
         } else {
             System.out.println(number + " is not a two-digit number.");
         }
         
         
         //5.WAP to check if the number is single digit or not.
         int g = 0;
         if (g >= 0 && g <= 9) {
             System.out.println(g + " is a single-digit number.");
         } else {
             System.out.println(g + " is not a single-digit number.");
         }
         
         //6.WAP to check if the symbol is alphabet, digit or special symbol.
         char sym = 8;
         if (sym >= 'A' && sym <= 'Z'){       
           System.out.println("It is a Alphabet ");
         }else if (sym >= 0 && sym <= 9) {
                 System.out.println("It is a  Digit ");
	    } else {
                 System.out.println("It is a Special Character ");
         }
         
         //7.WAP to print square if the number is odd and print cube if the number is even.
         int num = 7; 
         int cube;
         int square;
          if (num % 2 == 0) {
          cube =  num * num * num; 
             System.out.println("The number is even. Its cube is: " + cube);
         } else {
              square = num * num;
             System.out.println("The number is odd. Its square is: " + square);
         }

          
          //8.WAP to display maximum of 3 numbers.
          int num1 = 25;
          int num2 = 78;
          int num3 = 42;
          if (num1 >= num2) {
              if (num1 >= num3) {
                  System.out.println(num1 + " is the maximum number.");
              } else {
                  System.out.println(num3 + " is the maximum number.");
              }
              } else { 
              if (num2 >= num3) {
                  System.out.println(num2 + " is the maximum number.");
              } else {
                  System.out.println(num3 + " is the maximum number.");
              }
          }
          
          
          //9.WAP to display minimum of 3 numbers.
          int a = 25;
          int b = 78;
          int c = 42;
          if (a <= b) { 
              if (a <= c) { 
            	  System.out.println(a + " is the minimum number.");
              } else { 
            	  System.out.println(c + " is the minimum number."); 
              }
          } else { 
              if (b <= c) { 
            	  System.out.println(b + " is the minimum number.");
              } else { 
            	  System.out.println(c + " is the minimum number.");
              }
          }
          
          
          //10.WAP to decide if the number is valid ornot.The valid number is two digit even and greater than 50.
         int numb = 88;
         if (numb >= 10 && numb <= 99) {
             if (numb % 2 == 0) {
                 if (numb > 50) {
                     System.out.println(numb + " is a valid number.");
                 } else {
                     System.out.println(numb + " is a two-digit even number, but not greater than 50.");
                 }
             } else {
                 System.out.println(numb + " is a two-digit number, but not even.");
             }
         } else {
             System.out.println(numb + " is not a two-digit number.");
         }
  }
}


