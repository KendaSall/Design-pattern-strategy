package com.kenda.designpatterns.strategy;

public class PaypalPayment implements PayStrategy {
	
	@Override
	public void Pay() {
		System.out.println("Paiement paypal reussi avec succes");
	}
}
