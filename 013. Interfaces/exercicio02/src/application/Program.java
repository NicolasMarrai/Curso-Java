package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;
import services.BusinessReserve;
import services.ReservationService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados da reserva:");

        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Horas reservadas: ");
        int hours = sc.nextInt();

        System.out.print("Valor por hora: ");
        double hourValue = sc.nextDouble();

        Reservation reservation = new Reservation(number, date, hours, hourValue);

        ReservationService service = new ReservationService(new BusinessReserve());

        service.processReservation(reservation);

        System.out.println();
        System.out.println("RESUMO DA RESERVA");

        System.out.printf(
                "Valor base: %.2f%n",
                reservation.getInvoice()
                           .getBaseAmount());

        System.out.printf(
                "Taxa fixa: %.2f%n",
                reservation.getInvoice()
                           .getFixedFee());

        System.out.printf(
                "Adicional: %.2f%n",
                reservation.getInvoice()
                           .getExtraFee());

        System.out.printf(
                "Total: %.2f%n",
                reservation.getInvoice()
                           .getTotalAmount());

        sc.close();
    }
}