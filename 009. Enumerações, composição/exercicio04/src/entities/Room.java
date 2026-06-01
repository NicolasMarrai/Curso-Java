package entities;

public class Room {
	
	private String number;
	private String category;
	private Double price;
	
	public Room() {
	}

	public Room(String number, String category, Double price) {
		super();
		this.number = number;
		this.category = category;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}