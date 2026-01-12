package com.conditionalstatements;

public class SwitchCase {
	public static void main(String[] args) {

		// 3.WAP tocheck if the number is even or odd
		int num = 5;
		switch (num % 2) {
		case 0:
			System.out.println(num + " is an Even number.");
			break;
		default:
			System.out.println(num + " is an Odd number.");
			break;
		}

		// 4.WAP to check if the number is even odd or zero.
		int number = 8;
		if (number == 0) {
			System.out.println(number + " is zero.");
		} else {
			switch (number % 2) {
			case 0:
				System.out.println(number + " is an Even number.");
				break;
			default:
				System.out.println(number + " is an Odd number.");
				break;

			}
		}

		// 5.WAP to check if the number is zero or nonzero.
		int n = 0;
		switch (n) {
		case 0:
			System.out.println("The number is zero.");
			break;
		default:
			System.out.println("The number is non-zero.");
			break;

		}

		// 6.WAP to perform the selected operation on 2 numbers.The positive operations
		// are +-*/
		int a = 6;
		int b = 9;
		char operator = '+';

		switch (operator) {
		case '+':
			System.out.println("Result: " + (a + b));
			break;

		case '-':
			System.out.println("Result: " + (a - b));
			break;

		case '*':
			System.out.println("Result: " + (a * b));
			break;

		case '/':
			System.out.println("Result: " + (a / b));
			break;

		default:
			System.out.println("Invalid operator! ");

		}
		// 7.WAP to print Mr and Mrs as abbrevation for the same name depending on the
		// gender of the person

		String name = "Sapna";
		char gender = 'F';
		switch (gender) {
		case 'M':
			System.out.println("Mr. " + name);
			break;

		case 'F':
			System.out.println("Mrs. " + name);
			break;

		default:
			System.out.println("Invalid gender entered.");
		}

	}
}
