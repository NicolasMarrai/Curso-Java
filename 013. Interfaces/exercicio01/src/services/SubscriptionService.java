package services;

import java.time.LocalDate;

import entities.Charge;
import entities.Subscription;


public class SubscriptionService {
	
	private BillingService billingService;

	public SubscriptionService(BillingService billingService) {
		this.billingService = billingService;
	}
	
	public void processSubscription(Subscription subscription, int month) {
		
		double value = subscription.getMonthlyValue();
		
		for(int i = 1; i <= month; i++) {
			LocalDate dueDate = subscription.getDate().plusMonths(i);
			
			double readjustment = billingService.monthlyAdjustment(value, i);
			double fee = billingService.fee(value + readjustment);
			double quota = value + readjustment + fee;
			
			subscription.getCharges().add(new Charge(dueDate, quota));
			
		}
		
	}

}
