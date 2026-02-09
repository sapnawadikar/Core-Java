package com.interfaces;

public interface PaymentGateway {
		void processPayment(double amount);
		String generateReceipt(String transactionId);
		}
		
		
		
		