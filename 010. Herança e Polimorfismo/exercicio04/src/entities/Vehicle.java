package entities;

public abstract class Vehicle {
	
	private String model;
	private Integer year;
	private Double dailyRate;
	private Integer rentalDays;
	
	public Vehicle() {
	}

	public Vehicle(String model, Integer year, Double dailyRate, Integer rentalDays) {
		this.model = model;
		this.year = year;
		this.dailyRate = dailyRate;
		this.rentalDays = rentalDays;
	}

	public Integer getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(Integer rentalDays) {
		this.rentalDays = rentalDays;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(Double dailyRate) {
		this.dailyRate = dailyRate;
	}
	
	public abstract Double rentalCost();
	
}
