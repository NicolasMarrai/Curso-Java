package services;

public interface ReservationFeeService {

    double fixedFee();

    double additionalFee(double amount, int hours);

}