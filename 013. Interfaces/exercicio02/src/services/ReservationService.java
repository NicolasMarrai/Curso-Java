package services;

import entities.Invoice;
import entities.Reservation;

public class ReservationService {

    private ReservationFeeService feeService;

    public ReservationService(
            ReservationFeeService feeService) {

        this.feeService = feeService;
    }

    public void processReservation(
            Reservation reservation) {

        double baseAmount =
                reservation.getHours()
                * reservation.getHourValue();

        double extraFee =
                feeService.additionalFee(
                        baseAmount,
                        reservation.getHours());

        double fixedFee =
                feeService.fixedFee();

        double totalAmount =
                baseAmount
                + extraFee
                + fixedFee;

        Invoice invoice =
                new Invoice(
                        baseAmount,
                        extraFee,
                        fixedFee,
                        totalAmount);

        reservation.setInvoice(invoice);
    }
}