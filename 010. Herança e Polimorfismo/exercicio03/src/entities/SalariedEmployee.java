package entities;

public class SalariedEmployee extends Employee {

	private Double monthlyBonus;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String name, Double baseSalary, Double monthlyBonus) {
		super(name, baseSalary);
		this.monthlyBonus = monthlyBonus;
	}

	public Double getMonthlyBonus() {
		return monthlyBonus;
	}

	public void setMonthlyBonus(Double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	@Override
	public Double salary() {
		return monthlyBonus + getBaseSalary();
	}

	@Override
	public String toString() {
		return getName() + " (salaried): $ " + String.format("%.2f", salary());
	}
}
