package entities;

public class Product {
	
	private Integer id;
	private String name;
	private Integer stock;
	
	public Product() {
	}

	public Product(Integer id, String name, Integer stock) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getstock() {
		return stock;
	}
	
	public void addstock(int quantity) {
		stock += quantity;
	}

	@Override
    public String toString() {
        return id
                + ", "
                + name
                + ", "
                + stock;
	}
}
