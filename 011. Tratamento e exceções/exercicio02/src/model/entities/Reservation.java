package model.entities;

public class Reservation {
	
	private String passaengerName;
	private String passengerId;
	private Integer seatsRequested;
	
	public Reservation(String passaengerName, String passengerId, Integer seatsRequested) {
		this.passaengerName = passaengerName;
		this.passengerId = passengerId;
		this.seatsRequested = seatsRequested;
	}

	public String getPassaengerName() {
		return passaengerName;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public Integer getSeatsRequested() {
		return seatsRequested;
	}

}