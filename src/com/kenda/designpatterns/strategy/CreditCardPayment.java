package com.kenda.designpatterns.strategy;

public class CreditCardPayment implements PayStrategy {
	
	@Override
	public void Pay() {
		System.out.println("Paiement par carte de credit reussi avec succes");
	}

}
