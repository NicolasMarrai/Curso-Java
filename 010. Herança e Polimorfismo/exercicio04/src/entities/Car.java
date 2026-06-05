package entities;

public class Car extends Vehicle {

	private Integer numberOfSeats;
	private Boolean hasAirConditioning;
	
	public Car() {
		super();
	}

	public Car(String model, Integer number, Double dailyRate, Integer rentalDays, Integer numberOfSeats, Boolean hasAirConditioning) {
		super(model, number, dailyRate, rentalDays);
		this.numberOfSeats = numberOfSeats;
		this.hasAirConditioning = hasAirConditioning;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Boolean getHasAirConditioning() {
		return hasAirConditioning;
	}

	public void setHasAirConditioning(Boolean hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}

	@Override
	public Double rentalCost() {
		return getDailyRate() * getRentalDays() + (hasAirConditioning ? 50.00 : 0.0);
	}

	@Override
	public String toString() {
		return getModel() + " (Car, " + getYear() + "): " + getRentalDays() + " days → $ " + String.format("%.2f", rentalCost());
	}
	
}
