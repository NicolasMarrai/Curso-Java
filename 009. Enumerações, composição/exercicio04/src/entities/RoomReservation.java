package entities;

public class RoomReservation {
	
	private Integer nights;
	private Double price;
	
	private Room room;
	
	public RoomReservation() {
	}

	public RoomReservation(Integer nights, Double price, Room room) {
		super();
		this.nights = nights;
		this.price = price;
		this.room = room;
	}

	public Integer getNights() {
		return nights;
	}

	public void setNights(Integer nights) {
		this.nights = nights;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public Double subTotal() {
		return price * nights;
	}

	@Override
	public String toString() {
		return room.getNumber()
				+ " ("
				+ room.getCategory()
				+ "), $"
				+ String.format("%.2f", price)
				+ "/night, Nights: "
				+ nights
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}