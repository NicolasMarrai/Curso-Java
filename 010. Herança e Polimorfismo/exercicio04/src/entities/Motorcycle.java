package entities;

public class Motorcycle extends Vehicle {
	
	private Integer cylinderCapacity;

	public Motorcycle() {
		super();
	}

	public Motorcycle(String model, Integer number, Double dailyRate, Integer rentalDays, Integer cylinderCapacity) {
		super(model, number, dailyRate, rentalDays);
		this.cylinderCapacity = cylinderCapacity;
	}

	public Integer getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(Integer cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	@Override
	public Double rentalCost() {
		return getDailyRate() * getRentalDays();
	}
	
	@Override
	public String toString() {
		return getModel() + " (Motorcycle, " + getYear() + "): " + getRentalDays() + " days → $ " + String.format("%.2f", rentalCost());
	}

}
