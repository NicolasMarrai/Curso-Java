package services;

public interface BillingService {
	
	double fee(double amount);
	double monthlyAdjustment(double amount, int month);

}
