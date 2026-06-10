package services;

public class BusinessReserve implements ReservationFeeService {
	
	private static final double FIXED_FEE = 50.0;
    private static final double EXTRA_PERCENTAGE = 0.05;

	@Override
	public double fixedFee() {
		return FIXED_FEE;
	}

	@Override
    public double additionalFee(double amount, int hours) {

        if (hours > 8) {
            return amount * EXTRA_PERCENTAGE;
        }

        return 0.0;
    }
}