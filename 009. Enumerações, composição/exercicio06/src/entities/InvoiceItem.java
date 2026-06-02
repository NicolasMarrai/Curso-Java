package entities;

public class InvoiceItem {
	
	private Integer quantity;
	private Double unitPrice;
	private Product product;
	
	public InvoiceItem() {
	}

	public InvoiceItem(Integer quantity, Double unitPrice, Product product) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return unitPrice * quantity;
	}

	@Override
	public String toString() {
		return product.getCode()
				+ " - "
				+ product.getDescription()
				+ ", $"
				+ String.format("%.2f", unitPrice)
				+ ", Qty: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());		
	}
}
