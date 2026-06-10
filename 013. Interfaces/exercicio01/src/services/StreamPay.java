package services;

public class StreamPay implements BillingService {

	@Override
	public double fee(double amount) {
		return amount * 0.03;
	}

	@Override
	public double monthlyAdjustment(double amount, int month) {
		return amount * month * 0.015;
	}

}
