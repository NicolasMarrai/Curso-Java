package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Maria", 2000.0));
		list.add(new Employee("Joao", 10000.0));
		list.add(new Employee("Jorge", 8000.0));
		list.add(new Employee("Felipe", 300.0));

		Comparator<Employee> emp = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());
		
		list.sort(emp);
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
	}

}
