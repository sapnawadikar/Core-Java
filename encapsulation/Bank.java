package com.encapsulation;

public class Bank {
	public static void main(String[] args) {
        Account acc = new Account();

        acc.setPin(1234);  
        System.out.println("Your PIN is: " + acc.getPin());  
    }
}

