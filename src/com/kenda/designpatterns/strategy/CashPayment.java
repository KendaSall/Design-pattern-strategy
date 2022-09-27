package com.kenda.designpatterns.strategy;

public class CashPayment implements PayStrategy {
	
	@Override
	public void Pay() {
		System.out.println("Paiement en espece reussi avec succes");
	}

}
