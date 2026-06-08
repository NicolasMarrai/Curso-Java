package model.entities;

public class Sale {
	
	private String date;
	private String seller;
	private Double amount;
	
	public Sale(String date, String seller, Double amount) {
		this.date = date;
		this.seller = seller;
		this.amount = amount;
	}

	public String getSeller() {
		return seller;
	}

	public Double getAmount() {
		return amount;
	}

}
