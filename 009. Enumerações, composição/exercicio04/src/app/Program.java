package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Guest;
import entities.Reservation;
import entities.Room;
import entities.RoomReservation;
import entities.enums.ReservationStatus;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter guest data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Document: ");
		String document = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();

		Guest guest = new Guest(name, document, email);

		System.out.println("Enter reservation data:");
		System.out.print("Status: ");
		ReservationStatus status = ReservationStatus.valueOf(sc.next());

		Reservation reservation = new Reservation(new Date(), status, guest);

		System.out.print("How many rooms? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + "room data:");
			System.out.print("Room number: ");
			String number = sc.next();
			System.out.print("Category: ");
			String category = sc.next();
			System.out.print("Price per night: ");
			Double price = sc.nextDouble();
			System.out.print("Nights: ");
			int nights = sc.nextInt();

			Room room = new Room(number, category, price);
			RoomReservation roomReservation = new RoomReservation(nights, price, room);

			reservation.addRoom(roomReservation);
		}

		System.out.println();
		System.out.println("RESERVATION SUMMARY:");
		System.out.println(reservation);

		sc.close();

	}

}
