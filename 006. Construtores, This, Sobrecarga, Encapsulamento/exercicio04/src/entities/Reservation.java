package entities;

public class Reservation {

	private Integer roomNumber;
	private String guestName;
	private Integer nights;
	private Double pricePerNight;

	public Reservation(Integer roomNumber, String guestName, Integer nights, Double pricePerNight) {
		this.roomNumber = roomNumber;
		this.guestName = guestName;
		if (nights <= 0) {
			System.out.println("Nights must be greater than zero!");
			this.nights = 0;
		} else {
			this.nights = nights;
		}

		if (pricePerNight <= 0) {
			System.out.println("Price must be positive!");
			this.pricePerNight = 0.0;

		} else {
			this.pricePerNight = pricePerNight;
		}
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Integer getNights() {
		return nights;
	}

	public Double getPricePerNight() {
		return pricePerNight;
	}

	public Double totalPrice() {
		return nights * pricePerNight;
	}

	public void extendStay(Integer extraNight) {
		if (extraNight > 0) {
			nights += extraNight;
		} else {
			System.out.println("Invalid number of nights!");
		}
	}

	public String toString() {
		return "Room " + roomNumber + ", Guest: " + guestName + ", Nights: " + nights + ", Total: $ "
				+ String.format("%.2f", totalPrice());
	}
}