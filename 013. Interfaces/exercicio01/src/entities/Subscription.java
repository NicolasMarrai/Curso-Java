package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Subscription {
	
	private Integer number;
	private LocalDate date;
	private Double monthlyValue;
	
	private List<Charge> charges = new ArrayList<>();

	public Subscription(Integer number, LocalDate date, Double monthlyValue) {
		this.number = number;
		this.date = date;
		this.monthlyValue = monthlyValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getMonthlyValue() {
		return monthlyValue;
	}

	public void setMonthlyValue(Double monthlyValue) {
		this.monthlyValue = monthlyValue;
	}

	public List<Charge> getCharges() {
		return charges;
	}
}