package entities;

public class Product {
	
	private String code;
	private String description;
	private Double unitPrice;
	
	public Product() {
	}

	public Product(String code, String description, Double unitPrice) {
		super();
		this.code = code;
		this.description = description;
		this.unitPrice = unitPrice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
