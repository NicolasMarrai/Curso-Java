package model.entities;

import java.util.ArrayList;
import java.util.List;

import exceptions.BookingException;

public class Flight {
	
	private String code;
	private String origin;
	private String destination;
	private Integer availableSeats;
	private List<String> bookedIds = new ArrayList<>();
	
	public Flight(String code, String origin, String destination, Integer availableSeats) {
		this.code = code;
		this.origin = origin;
		this.destination = destination;
		this.availableSeats = availableSeats;
	}

	public String getCode() {
		return code;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}
	
	public void book(String passengerId, Integer seats) {
		if(bookedIds.contains(passengerId)) {
			throw new BookingException("Passenger already booked on this flight");
		}
		if(seats > availableSeats) {
			throw new BookingException("Not enough available seats");
		}
		availableSeats -= seats;
		bookedIds.add(passengerId);
	}

}
