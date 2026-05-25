package entities;

public class Alturas {

	private String name;
	private Double heigth;
	
	public Alturas() {
	}
	
	public Alturas(String name, Double heigth) {
		super();
		this.name = name;
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
	
}
