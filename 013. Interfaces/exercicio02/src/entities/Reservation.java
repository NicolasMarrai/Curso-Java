package entities;

import java.time.LocalDate;

public class Reservation {
	
	private Integer number;
	private LocalDate date;
	private Integer hours;
	private Double hourValue;
	
	private Invoice invoice;

	public Reservation(Integer number, LocalDate date, Integer hours, Double hourValue) {
		this.number = number;
		this.date = date;
		this.hours = hours;
		this.hourValue = hourValue;
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

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getHourValue() {
		return hourValue;
	}

	public void setHourValue(Double hourValue) {
		this.hourValue = hourValue;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}