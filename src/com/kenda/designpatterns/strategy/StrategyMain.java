package com.kenda.designpatterns.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext(new PaypalPayment());
		context.executePayment();
		
		context = new PaymentContext(new CreditCardPayment());
		context.executePayment();

	}

}
