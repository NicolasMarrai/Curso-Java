package application;

import java.util.Scanner;

import exceptions.BookingException;
import model.entities.Flight;
import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Flight code: ");
		String code = sc.next();
		System.out.print("Origin: ");
		sc.nextLine();
		String origin = sc.nextLine();
		System.out.print("Destination: : ");
		String destination = sc.nextLine();
		System.out.print("Available seats: ");
		int availableSeats = sc.nextInt();
		
		Flight flight = new Flight(code, origin, destination, availableSeats);
		
		System.out.print("Passenger name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("ID: ");
		String id = sc.next();
		System.out.print("Seats requested: ");
		int seats = sc.nextInt();
		
		Reservation reservation = new Reservation(name, id, seats);
		
		try {
			flight.book(reservation.getPassengerId(), reservation.getSeatsRequested());
			System.out.println("Booking confirmed! Remaining seats: " + flight.getAvailableSeats());
		} catch (BookingException e) {
			System.out.println("Booking error: " + e.getMessage());
		}

		sc.close();
	}

}
