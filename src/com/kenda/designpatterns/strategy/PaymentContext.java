package com.kenda.designpatterns.strategy;

public class PaymentContext {
	private PayStrategy strategy;
	
	public PaymentContext(PayStrategy strategy) {
		this.strategy = strategy;
	}
	
	void executePayment() {
		if(strategy == null) {
			System.err.println("Aucun moyen de payement");
			return;
		}
		strategy.Pay();
	}

}
