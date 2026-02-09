package com.interfaces;

public class UPIPayment implements PaymentGateway {
	public void processPayment(double amount) {
	System.out.println("Processing UPI Payment of Rs. " + amount);
	}
	public String generateReceipt(String transactionId) {
	return "UPI Receipt: Transaction ID " + transactionId;
	}
	}
