package entities;

public class HourlyEmployee extends Employee {

	private Double hoursWorked;
	private Double valuePerHour;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String name, Double baseSalary, Double hoursWorked, Double valuePerHour) {
		super(name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.valuePerHour = valuePerHour;
	}

	public Double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(Double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	@Override
	public Double salary() {
		return hoursWorked * valuePerHour;
	}

	@Override
	public String toString() {
		return getName() + " (hourly): $ " + String.format("%.2f", salary());
	}
}
