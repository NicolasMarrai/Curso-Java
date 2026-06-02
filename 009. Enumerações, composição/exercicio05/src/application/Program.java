package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Enrollment;
import entities.EnrollmentItem;
import entities.Student;
import entities.Subject;
import entities.enums.EnrollmentStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println("Enter student data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("ID: ");
		String id = sc.nextLine();
		System.out.print("Course: ");
		String course = sc.nextLine();
		
		Student student = new Student(name, id, course);
		
		System.out.println("Enter enrollment data:");
		System.out.print("Status: ");
		EnrollmentStatus status = EnrollmentStatus.valueOf(sc.next());
		
		Enrollment enrollment = new Enrollment(new Date(), status, student);
		
		System.out.print("How many subjects? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " subject data:");
			System.out.print("Name: ");
			sc.nextLine();
			String nameCourse = sc.nextLine();
			System.out.print("Credits: ");
			int creditsCourse = sc.nextInt();
			System.out.print("Workload: ");
			int workload = sc.nextInt();
			System.out.print("Grade: ");
			double gradeCourse = sc.nextDouble();
			
			Subject subject = new Subject(nameCourse, creditsCourse, workload);
			EnrollmentItem enrollmentItem = new EnrollmentItem(gradeCourse, subject);
			enrollment.addItem(enrollmentItem);
		}
		
		System.out.println();
		System.out.println("ENROLLMENT SUMMARY:");
		System.out.println(enrollment);
		
		sc.close();
	}

}
