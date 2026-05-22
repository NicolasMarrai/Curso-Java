package entities;

public class Car {

	private String model;
	private Double fuel;
	private Double mileage;

	public Car(String model) {
		this.model = model;
		fuel = 0.0;
		mileage = 0.0;
	}

	public Car(String model, Double fuel) {
		this.model = model;
		this.fuel = fuel;
		mileage = 0.0;
	}

	public String getModel() {
		return model;
	}

	public Double getFuel() {
		return fuel;
	}

	public Double getMileage() {
		return mileage;
	}

	public void refuel(double liters) {

		if (liters > 0) {
			fuel += liters;
		} else {
			System.out.println("Invalid fuel amount!");
		}
	}

	public void drive(double km) {

		if (km <= 0) {
			System.out.println("Invalid distance!");
			return;
		}
		
		double fuelNeeded = km / 10.0;
		
		if (fuelNeeded > fuel) {
            System.out.println("Not enough fuel!");
            return;
        }
		
		fuel -= fuelNeeded;
        mileage += km;

	}

	public String toString() {
		return "Model: " + model + ", Fuel: " + fuel + "L, Mileage: " + mileage + "km";
	}

}
