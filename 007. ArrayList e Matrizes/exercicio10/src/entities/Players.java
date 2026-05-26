package entities;

public class Players {
	
	private String name;
	private Integer score;
	
	public Players() {
	}

	public Players(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public Integer getScore() {
		return score;
	}
	
}
