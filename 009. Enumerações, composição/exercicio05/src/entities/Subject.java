package entities;

public class Subject {
	
	private String name;
	private Integer credits;
	private Integer workload;
	
	public Subject() {
	}
	
	public Subject(String name, Integer credits, Integer workload) {
		super();
		this.name = name;
		this.credits = credits;
		this.workload = workload;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}
}
