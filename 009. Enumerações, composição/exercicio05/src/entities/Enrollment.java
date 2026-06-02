package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.EnrollmentStatus;

public class Enrollment {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private EnrollmentStatus status;
	private Student student;
	private List<EnrollmentItem> items = new ArrayList<>();
	
	public Enrollment() {
	}

	public Enrollment(Date moment, EnrollmentStatus status, Student student) {
		super();
		this.moment = moment;
		this.status = status;
		this.student = student;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public EnrollmentStatus getStatus() {
		return status;
	}

	public void setStatus(EnrollmentStatus status) {
		this.status = status;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void addItem(EnrollmentItem i) {
		items.add(i);
	}
	
	public void removeItem(EnrollmentItem i) {
		items.remove(i);
	}

	public Integer totalCredits() {
		int sum = 0;
		for(EnrollmentItem ei : items) {
			sum += ei.getSubject().getCredits();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Enrollment moment: " + sdf.format(moment) + "\n");
		sb.append("Status: " + status + "\n");
		sb.append("Student: " + student + "\n");
		sb.append("Subjects:\n");
		for(EnrollmentItem ei : items) {
			sb.append(ei + "\n");
		}
		sb.append("Total credits: " + totalCredits());
		return sb.toString();
	}
}