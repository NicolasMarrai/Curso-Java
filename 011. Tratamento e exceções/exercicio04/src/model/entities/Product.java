package model.entities;

import exceptions.InvalidPriceException;
import exceptions.ProductException;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;

	public Product(String name, Double price, Integer quantity) {

		if (name == null || name.trim().isEmpty()) {
			throw new ProductException("Name cannot be empty");
		}
		if (price <= 0) {
			throw new InvalidPriceException("Price cannot be negative");
		}
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void adjustPrice(Double percent) {

		if (percent < -100 || percent > 100) {
			throw new ProductException("Percentage must be between -100 and 100");
		}
		price = price + price * percent / 100.0;
	}

}
