package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.ReservationStatus;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private ReservationStatus status;
	private Guest guest;
	private List<RoomReservation> rooms = new ArrayList<>();
	
	public Reservation() {
	}

	public Reservation(Date moment, ReservationStatus status, Guest guest) {
		super();
		this.moment = moment;
		this.status = status;
		this.guest = guest;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	
	public ReservationStatus getStatus() {
		return status;
	}
	
	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	
	public void addRoom(RoomReservation r) {
		rooms.add(r);
	}
	
	public void removeRoom(RoomReservation r) {
		rooms.remove(r);
	}
	
	public double total() {
		double sum = 0.0;
		for (RoomReservation rr : rooms) {
			sum += rr.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Reservation status: ");
		sb.append(status + "\n");
		sb.append("Gues: ");
		sb.append(guest + "\n");
		sb.append("Rooms:\n");
		for (RoomReservation room : rooms) {
			sb.append(room + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
