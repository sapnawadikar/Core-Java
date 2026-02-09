package com.interfaces;

public class CreditCardPayment implements PaymentGateway {
	public void processPayment(double amount) {
	System.out.println("Processing Credit Card Payment of Rs. " + amount);
	}
	public String generateReceipt(String transactionId) {
	return "Credit Card Receipt: Transaction ID " + transactionId;
	}
	}