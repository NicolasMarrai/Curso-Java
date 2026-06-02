package entities;

public class EnrollmentItem {
	
	private Double grade;
	private Subject subject;
	
	public EnrollmentItem() {
	}

	public EnrollmentItem(Double grade, Subject subject) {
		super();
		this.grade = grade;
		this.subject = subject;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Boolean passed() {
		return grade >= 60.0;
	}

	@Override
	public String toString() {
		return subject.getName()
				+ ", Credits: "
				+ subject.getCredits()
				+ ", Workload: "
				+ subject.getWorkload()
				+ "h, Grade: "
				+ String.format("%.2f", grade)
				+ " ("
				+ (passed() ? "PASSED" : "FAILED")
				+ ")";
	}
}
