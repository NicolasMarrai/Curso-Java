package model.entities;

import exceptions.LowStockException;
import exceptions.StockException;

public class StockItem {

	private String name;
	private Integer quantity;
	private Integer minStock;
	private Double unitCost;

	public StockItem(String name, Integer quantity, Integer minStock, Double unitCost) {
		this.name = name;
		this.quantity = quantity;
		this.minStock = minStock;
		this.unitCost = unitCost;
	}

	public String getName() {
		return name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getMinStock() {
		return minStock;
	}

	public Double getUnitCost() {
		return unitCost;
	}

	public void addStock(Integer qty) {
		quantity += qty;
	}

	public void removeStock(Integer qty) {
		if (qty <= 0) {
			throw new StockException("Stock error: Amount must be positive");
		}
		if (qty > quantity) {
			throw new StockException(" Stock error: Removal exceeds available quantity");
		}
		if (quantity - qty < minStock) {
			throw new LowStockException("Stock warning: Quantity will fall below minimum stock");
		}
		quantity -= qty;
	}

	public Double totalValue() {
		return quantity * unitCost;
	}

	@Override
	public String toString() {
		return "New quantity: " + quantity + " | Total value: $ " + String.format("%.2f", totalValue());
	}

}
