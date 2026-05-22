package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Reservation hotel;
		
		System.out.println("Enter reservation data:");
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Guest name: ");
		String guestName = sc.nextLine();
		System.out.print("Nights: ");
		int nights = sc.nextInt();
		System.out.print("Price per night: ");
		double pricePerNight = sc.nextDouble();
		
		hotel = new Reservation(roomNumber, guestName, nights, pricePerNight);

		System.out.println();
		System.out.println("Reservation data:");
		System.out.println(hotel);
		
		System.out.println();
		
		System.out.print("How many nights to extend? ");
		int extraNights = sc.nextInt();
		hotel.extendStay(extraNights);
		
		System.out.println();
		
		System.out.println("Updated reservation: ");
		System.out.println(hotel);
		
		sc.close();
	}

}
