package com.interfaces;

public class PaymentTest {
	/*
	 * 1. Payment Gateway Integration: Create an interface `PaymentGateway` with
	 * methods //`processPayment(double amount)` and `generateReceipt(String
	 * transactionId)`. Implement two //classes `CreditCardPayment` and `UPIPayment`
	 * that perform payment processing differently. Write //a driver class to
	 * simulate payment through both gateways and display the receipts.
	 */
	public static void main(String[] args) {
		PaymentGateway pg1 = new CreditCardPayment();
		pg1.processPayment(1200.50);
		System.out.println(pg1.generateReceipt("TXN12345"));

		PaymentGateway pg2 = new UPIPayment();
		pg2.processPayment(850.75);
		System.out.println(pg2.generateReceipt("TXN67890"));
	}
}