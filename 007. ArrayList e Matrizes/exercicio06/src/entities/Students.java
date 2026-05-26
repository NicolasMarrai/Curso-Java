package entities;

public class Students {
	
	private String name;
	private Double nota1;
	private Double nota2;
	
	public Students() {
	}

	public Students(String name, Double nota1, Double nota2) {
		super();
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}

}
